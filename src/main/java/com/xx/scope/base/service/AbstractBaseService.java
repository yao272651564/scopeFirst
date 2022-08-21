/**
 *
 */
package com.xx.scope.base.service;

import com.xx.scope.base.domain.BaseDomain;
import com.xx.scope.common.exception.ServiceException;
import com.xx.scope.common.utils.DateUtils;
import com.xx.scope.page.BaseMapper;
import com.xx.scope.page.Page;
import com.xx.scope.page.SqlHelper;
import com.xx.scope.page.SystemContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import javax.sql.DataSource;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.sql.*;
import java.util.Date;
import java.util.*;

public abstract class AbstractBaseService implements BaseService {

    private final static Logger logger = LoggerFactory.getLogger(AbstractBaseService.class);
    
    @Autowired
    private DataSource dataSource;

    protected Map<Class<? extends BaseMapper>, BaseMapper> mapperMap = new HashMap<>();
    
    @Deprecated
    protected void setBaseMapper(){};
    
    @Deprecated
    protected <T extends BaseDomain> Page<T> selectPageInfo(Map<String, Object> map,
                                                            Class<? extends BaseMapper> mapperClazz, Class<T> cls) {
    	throw new ServiceException("接口失效，selectPageInfo(BaseMapper mapper, Map<String, Object> argsMap, Class<T> clazz,String mapperMathod) 方法");
    }
    
    /**
     * 根据查询总记录数的SQL获取总记录数
     * @param totalRecordSql 询总记录数的SQ
     * @param statement
     * @param resultSet
     * @return 总记录数
     * @throws SQLException
     */
    private int selectTotalRecord(String totalRecordSql, Statement statement, ResultSet resultSet) throws SQLException {
        resultSet = statement.executeQuery(totalRecordSql);
        if (resultSet.next()) {
            return resultSet.getInt("totalRecord");
        }
        throw new ServiceException("获取总记录数失败！");
    }

    /**
     * @param calzz
     * @param sql
     * @param statement
     * @return
     * @throws SQLException
     * @throws InstantiationException
     * @throws IllegalAccessException
     */
    private <T extends BaseDomain> List<T> selectPageInfo(Class<T> calzz, String sql, Statement statement, ResultSet resultSet)
            throws SQLException, InstantiationException, IllegalAccessException {
        String pageSql = createSelectPageSql(sql);
        logger.debug("sql = " + pageSql);
        resultSet = statement.executeQuery(pageSql);
        ResultSetMetaData rsmd = resultSet.getMetaData();
        int count = rsmd.getColumnCount();
        String[] colNames = new String[count];
        List<T> results = new ArrayList<T>();
        for (int i = 1; i <= count; i++) {
            colNames[i - 1] = rsmd.getColumnLabel(i);
        }
        
        while (resultSet.next()) {
            T t = calzz.newInstance();
            for (int i = 0; i < colNames.length; i++) {
                String colName = colNames[i];
                String methodName = "set" + colName;
                Method[] ms = calzz.getMethods();
                for (Method m : ms) {
                    methodName = methodName.replaceAll("_", "");
                    if (methodName.equals(m.getName().toLowerCase())) {
                        try {
                            Object object = resultSet.getObject(colName);
                            //判断object类型是否和方法的类型一致
                            if(m.getParameterTypes().length >= 1 && object != null && !m.getParameterTypes()[0].getTypeName().equals(object.getClass().getTypeName()) && "java.lang.Long".equals(m.getParameterTypes()[0].getTypeName())) {
                                object = Long.valueOf(String.valueOf(object));
                            }
                            if(m.getParameterTypes().length >= 1 && object != null && !m.getParameterTypes()[0].getTypeName().equals(object.getClass().getTypeName()) && "java.lang.Integer".equals(m.getParameterTypes()[0].getTypeName())) {
                                object = Integer.valueOf(String.valueOf(object));
                            }
                            if(m.getParameterTypes().length >= 1 && object != null && !m.getParameterTypes()[0].getTypeName().equals(object.getClass().getTypeName()) && "java.math.BigDecimal".equals(m.getParameterTypes()[0].getTypeName())) {
                                object = new BigDecimal(String.valueOf(object));
                            }
                            if(m.getParameterTypes().length >= 1 && object != null && "java.util.Date".equals(m.getParameterTypes()[0].getTypeName()) && "java.lang.String".equals(object.getClass().getTypeName()) ) {
                                Date yyyy_mm_dd_hh_mm_ssToDate = DateUtils.getYYYY_MM_dd_HH_mm_ssToDate(String.valueOf(object));
                                object = yyyy_mm_dd_hh_mm_ssToDate;
                            }
							m.invoke(t, object);
                        } catch (IllegalArgumentException | InvocationTargetException e) {
                            logger.error(m.getName() + "失败，请检查！", e);
                            throw new ServiceException("失败，请检查：" + m.getName());
                        }
                    }
                }
            }
            results.add(t);
        }
        return results;
    }

	private String createSelectPageSql(String sql) {
        return sql + " limit " + SystemContext.getOffset() + (",") + SystemContext.getPagesize();
    }

	/**
	 * 嵌套拼接查询总记录数的SQL
	 * @param sql
	 * @return
	 */
    private String createTotalRecordSql(String sql) {
//        int index = sql.indexOf("from") + 4;
//        int orderByIndex = sql.indexOf("order by");
//        int groupBy = sql.indexOf("group by");
//        if (orderByIndex != -1) {
//            sql = sql.substring(0, orderByIndex);
//        }
//        if (groupBy != -1) {
//            sql = sql.substring(0, groupBy);
//        }
        return "select count(*) as totalRecord from(" + sql + ") as temp";
//      throw new SystemException("无效的查询语句【 " + sql + "】");
    }
    
    /**
     * 获取分页信息
     * 总记录数是嵌套查询的, 如果数据量过大查询会很缓慢
     * @param mapper 调用方法的mapper
     * @param argsMap 参数
     * @param clazz 接收对象
     * @param mapperMathod 查询列表SQL对应的mapper方法名称
     * @return
     */
	protected <T extends BaseDomain> Page<T> selectPageInfo(BaseMapper mapper, Map<String, Object> argsMap, Class<T> clazz,
			String mapperMathod) {
        String sql = SqlHelper.getMapperSql(mapper, mapperMathod, argsMap);
//        DataSource dataSource = (DataSource) WebContext.getBean("dataSource");
        Page<T> page = null;
        ResultSet resultSet = null;
        Connection connection = null;
        Statement statement = null;
        try {
            connection = dataSource.getConnection();
            statement = connection.createStatement();
            List<T> results = selectPageInfo(clazz, sql, statement, resultSet);
            //嵌套拼接查询总记录数的SQL
            String totalRecordSql = createTotalRecordSql(sql);
            int totalRecord = selectTotalRecord(totalRecordSql, statement, resultSet);
            page = new Page<>();
            page.setResults(results);
            page.setTotalRecord(totalRecord);
        } catch (SQLException e) {
        	throw new ServiceException("SQL错误!", e);
        } catch (Exception e) {
        	throw new ServiceException("调用分页插件错误!", e);
        } finally {
            if (resultSet != null) {
                try {
                    resultSet.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
        return page;
	}
	
	/**
	 * 获取分页信息
	 * 总记录数是单独查询的(非嵌套), 针对查询数据过大的SQL
	 * @param mapper 调用方法的mapper
	 * @param argsMap 参数
	 * @param clazz 接收对象
	 * @param mapperMathod 查询列表SQL对应的mapper方法名称
	 * @param mapperTotalRecordMathod 查询总记录数SQL对应的mapper方法名称
	 * @return
	 */
	protected <T extends BaseDomain> Page<T> selectPageInfo(BaseMapper mapper, Map<String, Object> argsMap, Class<T> clazz, String mapperMathod, String mapperTotalRecordMathod) {
		Page<T> page = null;
		ResultSet resultSet = null;
		Connection connection = null;
		Statement statement = null;
		try {
			connection = dataSource.getConnection();
			statement = connection.createStatement();
			//获取查询列表的方法SQL
			String sql = SqlHelper.getMapperSql(mapper, mapperMathod, argsMap);
			List<T> results = selectPageInfo(clazz, sql, statement, resultSet);
			//获取查询总记录数的SQL
			String totalRecordsql = SqlHelper.getMapperSql(mapper, mapperTotalRecordMathod, argsMap);
			int totalRecord = selectTotalRecord(totalRecordsql, statement, resultSet);
			page = new Page<>();
			page.setResults(results);
			page.setTotalRecord(totalRecord);
		} catch (SQLException e) {
			throw new ServiceException("SQL错误!", e);
		} catch (Exception e) {
			throw new ServiceException("调用分页插件错误!", e);
		} finally {
			if (resultSet != null) {
				try {
					resultSet.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (statement != null) {
				try {
					statement.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (connection != null) {
				try {
					connection.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		return page;
	}

}

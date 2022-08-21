package com.xx.scope.page;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/** 
 * 对分页的基本数据进行一个简单的封装 
 */  
public class Page<T> {  
   
    private int totalRecord;//总记录数  
    private int totalPage;//总页数  
    private List<T> results;//对应的当前页记录  
    private Map<String, Object> params = new HashMap<String, Object>();//其他的参数我们把它分装成一个Map对象  

    //为datatable扩展的属性
    private Object data;
    private int iTotalRecords;
    private int iTotalDisplayRecords;
   
    public int getTotalRecord() {  
       return totalRecord;  
    }  
   


	public Object getData() {
		return data;
	}



	public void setData(Object data) {
		this.data = data;
	}



	public int getiTotalRecords() {
		return iTotalRecords;
	}



	public void setiTotalRecords(int iTotalRecords) {
		this.iTotalRecords = iTotalRecords;
	}



	public int getiTotalDisplayRecords() {
		return iTotalDisplayRecords;
	}



	public void setiTotalDisplayRecords(int iTotalDisplayRecords) {
		this.iTotalDisplayRecords = iTotalDisplayRecords;
	}


    /**
     * 根据分页总条数计算总页数并赋值
     * @param totalRecord
     */
	public void setTotalRecord(int totalRecord) {  
       this.totalRecord = totalRecord;  
       //在设置总页数的时候计算出对应的总页数，在下面的三目运算中加法拥有更高的优先级，所以最后可以不加括号。  
       int totalPage = totalRecord% SystemContext.getPagesize()==0 ? totalRecord/ SystemContext.getPagesize() : totalRecord/ SystemContext.getPagesize() + 1;
       this.setTotalPage(totalPage);
       this.iTotalRecords = totalRecord;
       this.iTotalDisplayRecords = totalRecord;
    }  
   
    public int getTotalPage() {  
       return totalPage;  
    }  
   
    public void setTotalPage(int totalPage) {  
       this.totalPage = totalPage;  
    }  
   
    public List<T> getResults() {  
       return results;  
    }  
   
    public void setResults(List<T> results) {  
       this.results = results;
       this.data = results;
    }  
     
    public Map<String, Object> getParams() {  
       return params;  
    }  
     
    public void setParams(Map<String, Object> params) {  
       this.params = params;  
    }

    @Override
    public String toString() {
        return "Page{" +
                "totalRecord=" + totalRecord +
                ", totalPage=" + totalPage +
                ", results=" + results +
                ", params=" + params +
                ", data=" + data +
                ", iTotalRecords=" + iTotalRecords +
                ", iTotalDisplayRecords=" + iTotalDisplayRecords +
                '}';
    }


}  
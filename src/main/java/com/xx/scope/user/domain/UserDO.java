package com.xx.scope.user.domain;


import java.util.Date;

public class UserDO {

    private Long userId;
    private String mapId;


    /**
     * 主键
     */
    private Long id;

    /**
     * 手机号
     */
    private String mobile;

    /**
     * 真实姓名
     */
    private String realName;

    /**
     * 身份证号码
     */
    private String identityCardNumber;

    /**
     * 员工编号, 如果是加油站员工，必填
     */
    private String employeeNo;

    /**
     * 隶属机构
     */
    private Long orgId;

    /**
     * 隶属机构路径
     */
    private String orgPath;

    /**
     * 昵称
     */
    private String petName;

    /**
     * 性别:1-男，2-女，9-未知
     */
    private String sex;

    /**
     * 登录的账户ID
     */
    private String account;

    /**
     * 密码MD5值 accont + password原始值的MD5
     */
    private String password;

    /**
     * from t_role.id  App的预留员工角色
     */
    private Long roleId;

    /**
     * token
     */
    private String token;

    /**
     * 注册时间
     */
    private Date createTime;

    /**
     * 上次登录时间
     */
    private Date lastLoginTime;

    /**
     * 修改时间
     */
    private Date modifyTime;

    /**
     * 1-app 9=管理平台注册
     */
    private String channel;

    /**
     * 状态：1-激活,2-锁定,3-禁用
     */
    private String status;

    /**
     * 审核状态：1-待审核，2-已审核,3-已拒绝
     */
    private String auditStatus;

    /**
     * 在职状态 0-未入职 1-在职 2-离职
     */
    private String workStatus;

    /**
     * 
     */
    private Long udid;

    /**
     * 员工身份来源 from t_employee_source.sn
     */
    private String sourceSn;

    /**
     * 冗余字段，员工身份来源名称 from t_employee_source.name
     */
    private String sourceName;

    /**
     * 员工为外包身份时，from t_employee_source_unit.id
     */
    private Long sourceUnitId;

    /**
     * 冗余字段，员工为外包身份时，from t_employee_source_unit.name
     */
    private String sourceUnitName;

    /**
     * 是否启用
     */
    private String available;

    /**
     * 主键
     * @return id 主键
     */
    public Long getId() {
        return id;
    }

    /**
     * 主键
     * @param id 主键
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 手机号
     * @return mobile 手机号
     */
    public String getMobile() {
        return mobile;
    }

    /**
     * 手机号
     * @param mobile 手机号
     */
    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    /**
     * 真实姓名
     * @return real_name 真实姓名
     */
    public String getRealName() {
        return realName;
    }

    /**
     * 真实姓名
     * @param realName 真实姓名
     */
    public void setRealName(String realName) {
        this.realName = realName == null ? null : realName.trim();
    }

    /**
     * 身份证号码
     * @return identity_card_number 身份证号码
     */
    public String getIdentityCardNumber() {
        return identityCardNumber;
    }

    /**
     * 身份证号码
     * @param identityCardNumber 身份证号码
     */
    public void setIdentityCardNumber(String identityCardNumber) {
        this.identityCardNumber = identityCardNumber == null ? null : identityCardNumber.trim();
    }

    /**
     * 员工编号, 如果是加油站员工，必填
     * @return employee_no 员工编号, 如果是加油站员工，必填
     */
    public String getEmployeeNo() {
        return employeeNo;
    }

    /**
     * 员工编号, 如果是加油站员工，必填
     * @param employeeNo 员工编号, 如果是加油站员工，必填
     */
    public void setEmployeeNo(String employeeNo) {
        this.employeeNo = employeeNo == null ? null : employeeNo.trim();
    }

    /**
     * 隶属机构
     * @return org_id 隶属机构
     */
    public Long getOrgId() {
        return orgId;
    }

    /**
     * 隶属机构
     * @param orgId 隶属机构
     */
    public void setOrgId(Long orgId) {
        this.orgId = orgId;
    }

    /**
     * 隶属机构路径
     * @return org_path 隶属机构路径
     */
    public String getOrgPath() {
        return orgPath;
    }

    /**
     * 隶属机构路径
     * @param orgPath 隶属机构路径
     */
    public void setOrgPath(String orgPath) {
        this.orgPath = orgPath == null ? null : orgPath.trim();
    }

    /**
     * 昵称
     * @return pet_name 昵称
     */
    public String getPetName() {
        return petName;
    }

    /**
     * 昵称
     * @param petName 昵称
     */
    public void setPetName(String petName) {
        this.petName = petName == null ? null : petName.trim();
    }

    /**
     * 性别:1-男，2-女，9-未知
     * @return sex 性别:1-男，2-女，9-未知
     */
    public String getSex() {
        return sex;
    }

    /**
     * 性别:1-男，2-女，9-未知
     * @param sex 性别:1-男，2-女，9-未知
     */
    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getMapId() {
        return mapId;
    }

    public void setMapId(String mapId) {
        this.mapId = mapId;
    }

    /**
     * 登录的账户ID
     * @return account 登录的账户ID
     */
    public String getAccount() {
        return account;
    }

    /**
     * 登录的账户ID
     * @param account 登录的账户ID
     */
    public void setAccount(String account) {
        this.account = account == null ? null : account.trim();
    }

    /**
     * 密码MD5值 accont + password原始值的MD5
     * @return password 密码MD5值 accont + password原始值的MD5
     */
    public String getPassword() {
        return password;
    }

    /**
     * 密码MD5值 accont + password原始值的MD5
     * @param password 密码MD5值 accont + password原始值的MD5
     */
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    /**
     * from t_role.id  App的预留员工角色
     * @return role_id from t_role.id  App的预留员工角色
     */
    public Long getRoleId() {
        return roleId;
    }

    /**
     * from t_role.id  App的预留员工角色
     * @param roleId from t_role.id  App的预留员工角色
     */
    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    /**
     * token
     * @return token token
     */
    public String getToken() {
        return token;
    }

    /**
     * token
     * @param token token
     */
    public void setToken(String token) {
        this.token = token == null ? null : token.trim();
    }

    /**
     * 注册时间
     * @return create_time 注册时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 注册时间
     * @param createTime 注册时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 上次登录时间
     * @return last_login_time 上次登录时间
     */
    public Date getLastLoginTime() {
        return lastLoginTime;
    }

    /**
     * 上次登录时间
     * @param lastLoginTime 上次登录时间
     */
    public void setLastLoginTime(Date lastLoginTime) {
        this.lastLoginTime = lastLoginTime;
    }

    /**
     * 修改时间
     * @return modify_time 修改时间
     */
    public Date getModifyTime() {
        return modifyTime;
    }

    /**
     * 修改时间
     * @param modifyTime 修改时间
     */
    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

    /**
     * 1-app 9=管理平台注册
     * @return channel 1-app 9=管理平台注册
     */
    public String getChannel() {
        return channel;
    }

    /**
     * 1-app 9=管理平台注册
     * @param channel 1-app 9=管理平台注册
     */
    public void setChannel(String channel) {
        this.channel = channel == null ? null : channel.trim();
    }

    /**
     * 状态：1-激活,2-锁定,3-禁用
     * @return status 状态：1-激活,2-锁定,3-禁用
     */
    public String getStatus() {
        return status;
    }

    /**
     * 状态：1-激活,2-锁定,3-禁用
     * @param status 状态：1-激活,2-锁定,3-禁用
     */
    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    /**
     * 审核状态：1-待审核，2-已审核,3-已拒绝
     * @return audit_status 审核状态：1-待审核，2-已审核,3-已拒绝
     */
    public String getAuditStatus() {
        return auditStatus;
    }

    /**
     * 审核状态：1-待审核，2-已审核,3-已拒绝
     * @param auditStatus 审核状态：1-待审核，2-已审核,3-已拒绝
     */
    public void setAuditStatus(String auditStatus) {
        this.auditStatus = auditStatus == null ? null : auditStatus.trim();
    }

    /**
     * 在职状态 0-未入职 1-在职 2-离职
     * @return work_status 在职状态 0-未入职 1-在职 2-离职
     */
    public String getWorkStatus() {
        return workStatus;
    }

    /**
     * 在职状态 0-未入职 1-在职 2-离职
     * @param workStatus 在职状态 0-未入职 1-在职 2-离职
     */
    public void setWorkStatus(String workStatus) {
        this.workStatus = workStatus == null ? null : workStatus.trim();
    }

    /**
     * 
     * @return udid 
     */
    public Long getUdid() {
        return udid;
    }

    /**
     * 
     * @param udid 
     */
    public void setUdid(Long udid) {
        this.udid = udid;
    }

    /**
     * 员工身份来源 from t_employee_source.sn
     * @return source_sn 员工身份来源 from t_employee_source.sn
     */
    public String getSourceSn() {
        return sourceSn;
    }

    /**
     * 员工身份来源 from t_employee_source.sn
     * @param sourceSn 员工身份来源 from t_employee_source.sn
     */
    public void setSourceSn(String sourceSn) {
        this.sourceSn = sourceSn == null ? null : sourceSn.trim();
    }

    /**
     * 冗余字段，员工身份来源名称 from t_employee_source.name
     * @return source_name 冗余字段，员工身份来源名称 from t_employee_source.name
     */
    public String getSourceName() {
        return sourceName;
    }

    /**
     * 冗余字段，员工身份来源名称 from t_employee_source.name
     * @param sourceName 冗余字段，员工身份来源名称 from t_employee_source.name
     */
    public void setSourceName(String sourceName) {
        this.sourceName = sourceName == null ? null : sourceName.trim();
    }

    /**
     * 员工为外包身份时，from t_employee_source_unit.id
     * @return source_unit_id 员工为外包身份时，from t_employee_source_unit.id
     */
    public Long getSourceUnitId() {
        return sourceUnitId;
    }

    /**
     * 员工为外包身份时，from t_employee_source_unit.id
     * @param sourceUnitId 员工为外包身份时，from t_employee_source_unit.id
     */
    public void setSourceUnitId(Long sourceUnitId) {
        this.sourceUnitId = sourceUnitId;
    }

    /**
     * 冗余字段，员工为外包身份时，from t_employee_source_unit.name
     * @return source_unit_name 冗余字段，员工为外包身份时，from t_employee_source_unit.name
     */
    public String getSourceUnitName() {
        return sourceUnitName;
    }

    /**
     * 冗余字段，员工为外包身份时，from t_employee_source_unit.name
     * @param sourceUnitName 冗余字段，员工为外包身份时，from t_employee_source_unit.name
     */
    public void setSourceUnitName(String sourceUnitName) {
        this.sourceUnitName = sourceUnitName == null ? null : sourceUnitName.trim();
    }

    /**
     * 是否启用
     * @return available 是否启用
     */
    public String getAvailable() {
        return available;
    }

    /**
     * 是否启用
     * @param available 是否启用
     */
    public void setAvailable(String available) {
        this.available = available == null ? null : available.trim();
    }

    /**
     *
     * @mbggenerated 2019-11-04
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", mobile=").append(mobile);
        sb.append(", realName=").append(realName);
        sb.append(", identityCardNumber=").append(identityCardNumber);
        sb.append(", employeeNo=").append(employeeNo);
        sb.append(", orgId=").append(orgId);
        sb.append(", orgPath=").append(orgPath);
        sb.append(", petName=").append(petName);
        sb.append(", sex=").append(sex);
        sb.append(", account=").append(account);
        sb.append(", password=").append(password);
        sb.append(", roleId=").append(roleId);
        sb.append(", token=").append(token);
        sb.append(", createTime=").append(createTime);
        sb.append(", lastLoginTime=").append(lastLoginTime);
        sb.append(", modifyTime=").append(modifyTime);
        sb.append(", channel=").append(channel);
        sb.append(", status=").append(status);
        sb.append(", auditStatus=").append(auditStatus);
        sb.append(", workStatus=").append(workStatus);
        sb.append(", udid=").append(udid);
        sb.append(", sourceSn=").append(sourceSn);
        sb.append(", sourceName=").append(sourceName);
        sb.append(", sourceUnitId=").append(sourceUnitId);
        sb.append(", sourceUnitName=").append(sourceUnitName);
        sb.append(", available=").append(available);
        sb.append("]");
        return sb.toString();
    }
}
package com.seentao.mall;


import javax.persistence.*;

@Table(name = "oa_table")
public class Test {
    /**
     * 主键ID
     */
    @Id
    @Column(name = "oa_table_id")
    private Long oaTableId;

    /**
     * 表单名称
     */
    @Column(name = "table_name")
    private String tableName;

    /**
     * 表单编号
     */
    @Column(name = "table_code")
    private String tableCode;

    /**
     * 表单页面地址
     */
    @Column(name = "table_url")
    private String tableUrl;

    /**
     * 创建人
     */
    @Column(name = "create_member_id")
    private Long createMemberId;

    /**
     * 创建时间
     */
    @Column(name = "create_time")
    private Long createTime;

    /**
     * 表单描述
     */
    @Column(name = "table_describe")
    private String tableDescribe;


    @Column(name = "table_type")
    private Long tableType;



    /**
     * 表单类型
     * @return
     */
    public Long getTableType() {
        return tableType;
    }

    public void setTableType(Long tableType) {
        this.tableType = tableType;
    }

    /**
     * 获取主键ID
     *
     * @return oa_table_id - 主键ID
     */
    public Long getOaTableId() {
        return oaTableId;
    }

    /**
     * 设置主键ID
     *
     * @param oaTableId 主键ID
     */
    public void setOaTableId(Long oaTableId) {
        this.oaTableId = oaTableId;
    }

    /**
     * 获取表单名称
     *
     * @return table_name - 表单名称
     */
    public String getTableName() {
        return tableName;
    }

    /**
     * 设置表单名称
     *
     * @param tableName 表单名称
     */
    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    /**
     * 获取表单编号
     *
     * @return table_code - 表单编号
     */
    public String getTableCode() {
        return tableCode;
    }

    /**
     * 设置表单编号
     *
     * @param tableCode 表单编号
     */
    public void setTableCode(String tableCode) {
        this.tableCode = tableCode;
    }

    /**
     * 获取表单页面地址
     *
     * @return table_url - 表单页面地址
     */
    public String getTableUrl() {
        return tableUrl;
    }

    /**
     * 设置表单页面地址
     *
     * @param tableUrl 表单页面地址
     */
    public void setTableUrl(String tableUrl) {
        this.tableUrl = tableUrl;
    }

    /**
     * 获取创建人
     *
     * @return create_member_id - 创建人
     */
    public Long getCreateMemberId() {
        return createMemberId;
    }

    /**
     * 设置创建人
     *
     * @param createMemberId 创建人
     */
    public void setCreateMemberId(Long createMemberId) {
        this.createMemberId = createMemberId;
    }

    /**
     * 获取创建时间
     *
     * @return create_time - 创建时间
     */
    public Long getCreateTime() {
        return createTime;
    }

    /**
     * 设置创建时间
     *
     * @param createTime 创建时间
     */
    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取表单描述
     *
     * @return table_describe - 表单描述
     */
    public String getTableDescribe() {
        return tableDescribe;
    }

    /**
     * 设置表单描述
     *
     * @param tableDescribe 表单描述
     */
    public void setTableDescribe(String tableDescribe) {
        this.tableDescribe = tableDescribe;
    }

}
package com.app.model;

import java.util.Date;
import java.util.List;

/**
* @Description:    部门实体类
* @Author:         qsy
* @CreateDate:     2019/9/26 23:02
* @UpdateRemark:   修改内容
* @Version:        1.0
*/
public class Dept {
    private Integer id;
    /**
     *部门编号
     */
    private String code;
    /**
     *父部门编号
     */
    private String parentCode;
    /**
     *部门名称
     */
    private String name;
    /**
     *备注
     */
    private String remark;
    /**
     *创建人
     */
    private String createPerson;
    /**
     *创建时间
     */
    private Date createDate;


    private List depats;

    public List getDepats() {
        return depats;
    }

    public void setDepats(List depats) {
        this.depats = depats;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    public String getParentCode() {
        return parentCode;
    }

    public void setParentCode(String parentCode) {
        this.parentCode = parentCode == null ? null : parentCode.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public String getCreatePerson() {
        return createPerson;
    }

    public void setCreatePerson(String createPerson) {
        this.createPerson = createPerson == null ? null : createPerson.trim();
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    @Override
    public String toString() {
        return "Dept{" +
                "id=" + id +
                ", code='" + code + '\'' +
                ", parentCode='" + parentCode + '\'' +
                ", name='" + name + '\'' +
                ", remark='" + remark + '\'' +
                ", createPerson='" + createPerson + '\'' +
                ", createDate=" + createDate +
                ", depats=" + depats +
                '}';
    }
}
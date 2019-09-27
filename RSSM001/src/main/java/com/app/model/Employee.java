package com.app.model;
/**
* @Description:    员工实体类
* @Author:         qsy
* @CreateDate:     2019/9/26 23:02
* @UpdateRemark:   修改内容
* @Version:        1.0
*/
public class Employee {
    private Long id;
    /**
     *姓名
     */
    private String name;
    /**
     *年龄
     */
    private Integer age;
    /**
     *手机号
     */
    private String phone;
    /**
     *部门编号
     */
    private String deptCode;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getDeptCode() {
        return deptCode;
    }

    public void setDeptCode(String deptCode) {
        this.deptCode = deptCode == null ? null : deptCode.trim();
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", phone='" + phone + '\'' +
                ", deptCode='" + deptCode + '\'' +
                '}';
    }
}
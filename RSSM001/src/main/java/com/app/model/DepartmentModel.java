package com.app;

import java.util.List;

public class DepartmentModel {

    private Integer id;

    private String name;

    private List<DepartmentModel> childs;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<DepartmentModel> getChilds() {
        return childs;
    }

    public void setChilds(List<DepartmentModel> childs) {
        this.childs = childs;
    }
}

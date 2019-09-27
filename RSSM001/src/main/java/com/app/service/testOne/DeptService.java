package com.app.service.testOne;

import com.app.model.Dept;

import java.util.List;

public interface DeptService {
    List<Dept> queryDepts(String parentCode);
}

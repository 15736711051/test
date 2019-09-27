package com.app.service.testOne.impl;

import com.app.mapper.EmployeeMapper;
import com.app.model.Employee;
import com.app.service.testOne.EmpolyeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
* @Description:    员工相关业务操作
* @Author:         qsy
* @CreateDate:     2019/9/26 23:03
* @UpdateRemark:   修改内容
* @Version:        1.0
*/
@Service(value = "employeeService")
public class EmpolyeeServiceImpl implements EmpolyeeService {
    @Autowired
    private EmployeeMapper employeeMapper;


    @Override
    public String addEmployee(Employee employee) {
        String addResult=null;
        int result=employeeMapper.insertSelective(employee);
        if (result>0){
            addResult="添加成功";
        }else {
            addResult="添加失败";
        }
        return addResult;
    }
}

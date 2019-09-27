package com.app;

import com.alibaba.fastjson.JSON;
import com.app.mapper.DepartmentMapper;
import com.app.mapper.DeptMapper;
import com.app.model.Department;
import com.app.model.DepartmentModel;
import com.app.model.Dept;
import com.app.model.Employee;
import com.app.service.testOne.DeptService;
import com.app.service.testOne.EmpolyeeService;
import com.app.service.testTwo.DepartmentService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AppApplicationTests {
    @Autowired
    private EmpolyeeService empolyeeService;
    @Autowired
    private DeptService deptService;
    @Autowired
    private DepartmentService departmentService;
    @Autowired
    private DepartmentMapper departmentMapper;

    @Test
    public void testAdd() {
        //1.测试添加
        Employee employee=new Employee();
        employee.setName("lisi");
        employee.setAge(20);
        employee.setPhone("15762512651");
        employee.setDeptCode("00101");
        String addResult=empolyeeService.addEmployee(employee);
        System.out.println(addResult);
    }


    /**
    * @Description: 测试方法一
    * @author:      qsy
    * @param:
    * @return:
    * @exception:
    * @date:        2019/9/27 14:09
    */
    @Test
    public void testQueryDeptsOne(){
       List<Dept> list=deptService.queryDepts(null);
        for (Dept d:
             list) {
            System.out.println(d);
        }

    }


    /**
    * @Description: 方法二
    * @author:      qsy
    * @param:
    * @return:
    * @exception:
    * @date:        2019/9/27 21:34
    */

    @Test
    public void testQueryDeptsTwo(){
        List<Department> departments = departmentMapper.selectTopLevel();
        List<DepartmentModel> models = departmentService.process(departments);
        System.out.println(JSON.toJSONString(models));
    }









}

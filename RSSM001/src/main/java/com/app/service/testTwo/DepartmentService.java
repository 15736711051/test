package com.app.service.testTwo;

import com.alibaba.fastjson.JSON;
import com.app.mapper.DepartmentMapper;
import com.app.model.Department;
import com.app.model.DepartmentModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.List;
@Service(value = "DepartmentService")
public class DepartmentService {

    @Autowired
    private DepartmentMapper departmentMapper;

    /**
    * @Description: 递归调用
    * @author:      qsy
    * @param:
    * @return:
    * @exception:
    * @date:        2019/9/27 21:41
    */
    public List<DepartmentModel> process(List<Department> departments){
        List<DepartmentModel> modelList = new ArrayList<>();

        for (Department department : departments) {
            DepartmentModel model = new DepartmentModel();

            model.setId(department.getId());
            model.setName(department.getName());
            //查询当前id部门下的二级,结果是List,如果List为空，则返回
            List<Department> departmentList = departmentMapper.selectByParentId(department.getId());
            if (CollectionUtils.isEmpty(departments)){
                return null;
            }
            model.setChilds(process(departmentList));
            modelList.add(model);
        }
        return modelList;
    }








}

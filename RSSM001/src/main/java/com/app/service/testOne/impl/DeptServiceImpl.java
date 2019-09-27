package com.app.service.testOne.impl;

import com.app.mapper.DeptMapper;
import com.app.model.Dept;
import com.app.service.testOne.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
/**
* @Description:    部门业务类
* @Author:         qsy
* @CreateDate:     2019/9/27 13:10
* @UpdateRemark:   修改内容
* @Version:        1.0
*/
@Service(value = "DeptService")
public class DeptServiceImpl implements DeptService {
    @Autowired
    private DeptMapper deptMapper;

    /**
     * @Description: 方法一   以下代码以三层示意
     * @author:      qsy
     * @param:       parentCode
     * @return:      List
     * @exception:
     * @date:        2019/9/27 13:11
     */

    @Override
    public List<Dept> queryDepts(String parentCode) {
        List<Dept> firstDepts=deptMapper.selectDepts("0");
        for (Dept fd: firstDepts) {
            String firstCode=fd.getCode();
            List<Dept> secondDepts=deptMapper.selectDepts(firstCode);
            for (Dept sd:secondDepts){
                String secondCode=sd.getCode();
                List<Dept> thirdDepts=deptMapper.selectDepts(secondCode);
                sd.setDepats(thirdDepts);
            }
            fd.setDepats(secondDepts);
        }
        return firstDepts;
    }





}

package com.app.mapper;

import com.app.model.Cemployee;

public interface CemployeeMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Cemployee record);

    int insertSelective(Cemployee record);

    Cemployee selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Cemployee record);

    int updateByPrimaryKey(Cemployee record);


}
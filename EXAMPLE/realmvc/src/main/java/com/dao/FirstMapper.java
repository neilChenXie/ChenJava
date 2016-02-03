package com.dao;

import com.model.First;

public interface FirstMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(First record);

    int insertSelective(First record);

    First selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(First record);

    int updateByPrimaryKey(First record);
}
package com.system.service;

import com.system.domain.TypeInfo;

import java.util.List;
import java.util.Map;

public interface TypeInfoService {

    int deleteByPrimaryKey(Integer id);

    int insertSelective(TypeInfo record);

    TypeInfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TypeInfo record);

    List<TypeInfo> list(Map<String,Object> map);

    int count(Map<String,Object> map);
}

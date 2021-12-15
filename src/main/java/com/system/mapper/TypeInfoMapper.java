package com.system.mapper;

import com.system.domain.TypeInfo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface TypeInfoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TypeInfo record);

    int insertSelective(TypeInfo record);

    TypeInfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TypeInfo record);

    int updateByPrimaryKey(TypeInfo record);

    List<TypeInfo> list(Map<String,Object> map);

    int count(Map<String,Object> map);
}
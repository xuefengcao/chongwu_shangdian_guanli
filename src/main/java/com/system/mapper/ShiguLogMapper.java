package com.system.mapper;

import com.system.domain.ShiguLog;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface ShiguLogMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ShiguLog record);

    int insertSelective(ShiguLog record);

    ShiguLog selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ShiguLog record);

    int updateByPrimaryKey(ShiguLog record);

    List<ShiguLog> list(Map<String,Object> map);

    int count(Map<String,Object> map);
}
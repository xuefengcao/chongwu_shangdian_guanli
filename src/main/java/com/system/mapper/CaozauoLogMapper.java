package com.system.mapper;

import com.system.domain.CaozauoLog;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface CaozauoLogMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(CaozauoLog record);

    int insertSelective(CaozauoLog record);

    CaozauoLog selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(CaozauoLog record);

    int updateByPrimaryKey(CaozauoLog record);

    List<CaozauoLog> list(Map<String,Object> map);

    int count(Map<String,Object> map);
}
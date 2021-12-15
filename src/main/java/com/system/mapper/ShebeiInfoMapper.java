package com.system.mapper;

import com.system.domain.ShebeiInfo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface ShebeiInfoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ShebeiInfo record);

    int insertSelective(ShebeiInfo record);

    ShebeiInfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ShebeiInfo record);

    int updateByPrimaryKey(ShebeiInfo record);

    List<ShebeiInfo> list(Map<String,Object> map);

    int count(Map<String,Object> map);
}
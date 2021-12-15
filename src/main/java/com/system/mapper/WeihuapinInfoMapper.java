package com.system.mapper;

import com.system.domain.WeihuapinInfo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface WeihuapinInfoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(WeihuapinInfo record);

    int insertSelective(WeihuapinInfo record);

    WeihuapinInfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(WeihuapinInfo record);

    int updateByPrimaryKey(WeihuapinInfo record);

    List<WeihuapinInfo> list(Map<String,Object> map);

    int count(Map<String,Object> map);
}
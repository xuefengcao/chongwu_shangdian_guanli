package com.system.mapper;

import com.system.domain.JiaoyuInfo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface JiaoyuInfoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(JiaoyuInfo record);

    int insertSelective(JiaoyuInfo record);

    JiaoyuInfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(JiaoyuInfo record);

    int updateByPrimaryKey(JiaoyuInfo record);

    List<JiaoyuInfo> list(Map<String,Object> map);

    List<JiaoyuInfo> fenxilist(Map<String,Object> map);

    int count(Map<String,Object> map);
}
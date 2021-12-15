package com.system.mapper;

import com.system.domain.GongshangInfo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface GongshangInfoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(GongshangInfo record);

    int insertSelective(GongshangInfo record);

    GongshangInfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(GongshangInfo record);

    int updateByPrimaryKey(GongshangInfo record);

    List<GongshangInfo> list(Map<String,Object> map);

    int count(Map<String,Object> map);
}
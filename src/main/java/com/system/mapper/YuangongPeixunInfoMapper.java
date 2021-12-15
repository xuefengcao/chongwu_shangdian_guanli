package com.system.mapper;

import com.system.domain.YuangongPeixunInfo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface YuangongPeixunInfoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(YuangongPeixunInfo record);

    int insertSelective(YuangongPeixunInfo record);

    YuangongPeixunInfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(YuangongPeixunInfo record);

    int updateByPrimaryKey(YuangongPeixunInfo record);

    List<YuangongPeixunInfo> list(Map<String,Object> map);

    int count(Map<String,Object> map);
}
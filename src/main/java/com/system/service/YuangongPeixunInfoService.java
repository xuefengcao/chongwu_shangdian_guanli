package com.system.service;

import com.system.domain.YuangongPeixunInfo;

import java.util.List;
import java.util.Map;

public interface YuangongPeixunInfoService {

    int deleteByPrimaryKey(Integer id);

    int insertSelective(YuangongPeixunInfo record);

    YuangongPeixunInfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(YuangongPeixunInfo record);

    List<YuangongPeixunInfo> list(Map<String,Object> map);

    int count(Map<String,Object> map);
}

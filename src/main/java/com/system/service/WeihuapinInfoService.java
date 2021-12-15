package com.system.service;

import com.system.domain.WeihuapinInfo;

import java.util.List;
import java.util.Map;

public interface WeihuapinInfoService {

    int deleteByPrimaryKey(Integer id);

    int insertSelective(WeihuapinInfo record);

    WeihuapinInfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(WeihuapinInfo record);

    List<WeihuapinInfo> list(Map<String,Object> map);

    int count(Map<String,Object> map);
}

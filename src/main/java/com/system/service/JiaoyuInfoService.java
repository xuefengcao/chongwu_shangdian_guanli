package com.system.service;

import com.system.domain. JiaoyuInfo;

import java.util.List;
import java.util.Map;

public interface JiaoyuInfoService {

    int deleteByPrimaryKey(Integer id);

    int insertSelective( JiaoyuInfo record);

    JiaoyuInfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective( JiaoyuInfo record);

    List< JiaoyuInfo> list(Map<String,Object> map);

    List< JiaoyuInfo> fenxilist(Map<String,Object> map);

    int count(Map<String,Object> map);
}

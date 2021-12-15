package com.system.service;

import com.system.domain.GongshangInfo;

import java.util.List;
import java.util.Map;

public interface GongshangInfoService {

    int deleteByPrimaryKey(Integer id);

    int insertSelective(GongshangInfo record);

    GongshangInfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(GongshangInfo record);

    List<GongshangInfo> list(Map<String,Object> map);

    int count(Map<String,Object> map);
}

package com.system.service;

import com.system.domain.ShebeiInfo;

import java.util.List;
import java.util.Map;

public interface ShebeiInfoService {

    int deleteByPrimaryKey(Integer id);

    int insertSelective(ShebeiInfo record);

    ShebeiInfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ShebeiInfo record);

    List<ShebeiInfo> list(Map<String,Object> map);

    int count(Map<String,Object> map);
}

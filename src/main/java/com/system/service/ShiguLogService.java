package com.system.service;

import com.system.domain.ShiguLog;

import java.util.List;
import java.util.Map;

public interface ShiguLogService {

    int deleteByPrimaryKey(Integer id);

    int insertSelective(ShiguLog record);

    ShiguLog selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ShiguLog record);

    List<ShiguLog> list(Map<String,Object> map);

    int count(Map<String,Object> map);
}

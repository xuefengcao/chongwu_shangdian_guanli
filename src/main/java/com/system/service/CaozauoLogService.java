package com.system.service;

import com.system.domain.CaozauoLog;

import java.util.List;
import java.util.Map;

public interface CaozauoLogService {

    int deleteByPrimaryKey(Integer id);

    int insertSelective(CaozauoLog record);

    CaozauoLog selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(CaozauoLog record);

    List<CaozauoLog> list(Map<String,Object> map);

    int count(Map<String,Object> map);
}

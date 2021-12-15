package com.system.service.impl;

import com.system.domain.CaozauoLog;
import com.system.mapper.CaozauoLogMapper;
import com.system.service.CaozauoLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

@Transactional
@Service
public class CaozauoLogServiceImpl implements CaozauoLogService {
    @Autowired
    CaozauoLogMapper recordMapper;
    @Override
    public int deleteByPrimaryKey(Integer id) {
        return recordMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insertSelective(CaozauoLog record) {
        return recordMapper.insertSelective(record);
    }

    @Override
    public CaozauoLog selectByPrimaryKey(Integer id) {
        return recordMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(CaozauoLog record) {
        return recordMapper.updateByPrimaryKeySelective(record);
    }


    @Override
    public List<CaozauoLog> list(Map<String, Object> map) {
        return recordMapper.list(map);
    }

    @Override
    public int count(Map<String, Object> map) {
        return recordMapper.count(map);
    }
}

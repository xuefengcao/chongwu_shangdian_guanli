package com.system.service.impl;

import com.system.domain.ShiguLog;
import com.system.mapper.ShiguLogMapper;
import com.system.service.ShiguLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

@Transactional
@Service
public class ShiguLogServiceImpl implements ShiguLogService {
    @Autowired
    ShiguLogMapper recordMapper;
    @Override
    public int deleteByPrimaryKey(Integer id) {
        return recordMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insertSelective(ShiguLog record) {
        return recordMapper.insertSelective(record);
    }

    @Override
    public ShiguLog selectByPrimaryKey(Integer id) {
        return recordMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(ShiguLog record) {
        return recordMapper.updateByPrimaryKeySelective(record);
    }


    @Override
    public List<ShiguLog> list(Map<String, Object> map) {
        return recordMapper.list(map);
    }

    @Override
    public int count(Map<String, Object> map) {
        return recordMapper.count(map);
    }
}

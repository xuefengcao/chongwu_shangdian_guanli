package com.system.service.impl;

import com.system.domain.ShebeiInfo;
import com.system.mapper.ShebeiInfoMapper;
import com.system.service.ShebeiInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

@Transactional
@Service
public class ShebeiInfoServiceImpl implements ShebeiInfoService {
    @Autowired
    ShebeiInfoMapper recordMapper;
    @Override
    public int deleteByPrimaryKey(Integer id) {
        return recordMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insertSelective(ShebeiInfo record) {
        return recordMapper.insertSelective(record);
    }

    @Override
    public ShebeiInfo selectByPrimaryKey(Integer id) {
        return recordMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(ShebeiInfo record) {
        return recordMapper.updateByPrimaryKeySelective(record);
    }


    @Override
    public List<ShebeiInfo> list(Map<String, Object> map) {
        return recordMapper.list(map);
    }

    @Override
    public int count(Map<String, Object> map) {
        return recordMapper.count(map);
    }
}

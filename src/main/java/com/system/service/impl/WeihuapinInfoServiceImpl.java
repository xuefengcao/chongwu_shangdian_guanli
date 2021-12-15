package com.system.service.impl;

import com.system.domain.WeihuapinInfo;
import com.system.mapper.WeihuapinInfoMapper;
import com.system.service.WeihuapinInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

@Transactional
@Service
public class WeihuapinInfoServiceImpl implements WeihuapinInfoService {
    @Autowired
    WeihuapinInfoMapper recordMapper;
    @Override
    public int deleteByPrimaryKey(Integer id) {
        return recordMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insertSelective(WeihuapinInfo record) {
        return recordMapper.insertSelective(record);
    }

    @Override
    public WeihuapinInfo selectByPrimaryKey(Integer id) {
        return recordMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(WeihuapinInfo record) {
        return recordMapper.updateByPrimaryKeySelective(record);
    }


    @Override
    public List<WeihuapinInfo> list(Map<String, Object> map) {
        return recordMapper.list(map);
    }

    @Override
    public int count(Map<String, Object> map) {
        return recordMapper.count(map);
    }
}

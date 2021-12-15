package com.system.service.impl;

import com.system.domain.GongshangInfo;
import com.system.mapper.GongshangInfoMapper;
import com.system.service.GongshangInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

@Transactional
@Service
public class GongshangInfoServiceImpl implements GongshangInfoService {
    @Autowired
    GongshangInfoMapper recordMapper;
    @Override
    public int deleteByPrimaryKey(Integer id) {
        return recordMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insertSelective(GongshangInfo record) {
        return recordMapper.insertSelective(record);
    }

    @Override
    public GongshangInfo selectByPrimaryKey(Integer id) {
        return recordMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(GongshangInfo record) {
        return recordMapper.updateByPrimaryKeySelective(record);
    }


    @Override
    public List<GongshangInfo> list(Map<String, Object> map) {
        return recordMapper.list(map);
    }

    @Override
    public int count(Map<String, Object> map) {
        return recordMapper.count(map);
    }
}

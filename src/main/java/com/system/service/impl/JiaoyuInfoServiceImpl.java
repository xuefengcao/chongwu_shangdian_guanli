package com.system.service.impl;

import com.system.domain.JiaoyuInfo;
import com.system.mapper.JiaoyuInfoMapper;
import com.system.service.JiaoyuInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

@Transactional
@Service
public class JiaoyuInfoServiceImpl implements JiaoyuInfoService {
    @Autowired
    JiaoyuInfoMapper recordMapper;
    @Override
    public int deleteByPrimaryKey(Integer id) {
        return recordMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insertSelective(JiaoyuInfo record) {
        return recordMapper.insertSelective(record);
    }

    @Override
    public JiaoyuInfo selectByPrimaryKey(Integer id) {
        return recordMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(JiaoyuInfo record) {
        return recordMapper.updateByPrimaryKeySelective(record);
    }


    @Override
    public List<JiaoyuInfo> list(Map<String, Object> map) {
        return recordMapper.list(map);
    }

    @Override
    public List<JiaoyuInfo> fenxilist(Map<String, Object> map) {
        return recordMapper.fenxilist(map);
    }

    @Override
    public int count(Map<String, Object> map) {
        return recordMapper.count(map);
    }
}

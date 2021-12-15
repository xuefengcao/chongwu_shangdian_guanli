package com.system.service.impl;

import com.system.domain.YuangongPeixunInfo;
import com.system.mapper.YuangongPeixunInfoMapper;
import com.system.service.YuangongPeixunInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

@Transactional
@Service
public class YuangongPeixunInfoServiceImpl implements YuangongPeixunInfoService {
    @Autowired
    YuangongPeixunInfoMapper recordMapper;
    @Override
    public int deleteByPrimaryKey(Integer id) {
        return recordMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insertSelective(YuangongPeixunInfo record) {
        return recordMapper.insertSelective(record);
    }

    @Override
    public YuangongPeixunInfo selectByPrimaryKey(Integer id) {
        return recordMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(YuangongPeixunInfo record) {
        return recordMapper.updateByPrimaryKeySelective(record);
    }


    @Override
    public List<YuangongPeixunInfo> list(Map<String, Object> map) {
        return recordMapper.list(map);
    }

    @Override
    public int count(Map<String, Object> map) {
        return recordMapper.count(map);
    }
}

package com.system.service.impl;

import com.system.domain.TypeInfo;
import com.system.mapper.TypeInfoMapper;
import com.system.service.TypeInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

@Transactional
@Service
public class TypeInfoServiceImpl implements TypeInfoService {
    @Autowired
    TypeInfoMapper recordMapper;
    @Override
    public int deleteByPrimaryKey(Integer id) {
        return recordMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insertSelective(TypeInfo record) {
        return recordMapper.insertSelective(record);
    }

    @Override
    public TypeInfo selectByPrimaryKey(Integer id) {
        return recordMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(TypeInfo record) {
        return recordMapper.updateByPrimaryKeySelective(record);
    }


    @Override
    public List<TypeInfo> list(Map<String, Object> map) {
        return recordMapper.list(map);
    }

    @Override
    public int count(Map<String, Object> map) {
        return recordMapper.count(map);
    }
}

package com.system.service.impl;

import com.system.domain.ShiguInfo;
import com.system.mapper.ShiguInfoMapper;
import com.system.service.ShiguInfoService;
import com.system.vo.PubOutVo;
import com.system.vo.PubOutVo1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

@Transactional
@Service
public class ShiguInfoServiceImpl implements ShiguInfoService {
    @Autowired
    ShiguInfoMapper recordMapper;
    @Override
    public int deleteByPrimaryKey(Integer id) {
        return recordMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insertSelective(ShiguInfo record) {
        return recordMapper.insertSelective(record);
    }

    @Override
    public ShiguInfo selectByPrimaryKey(Integer id) {
        return recordMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(ShiguInfo record) {
        return recordMapper.updateByPrimaryKeySelective(record);
    }


    @Override
    public List<ShiguInfo> list(Map<String, Object> map) {
        return recordMapper.list(map);
    }

    @Override
    public int count(Map<String, Object> map) {
        return recordMapper.count(map);
    }

    @Override
    public List<PubOutVo1> findTypeShigu() {
        return recordMapper.findTypeShigu();
    }

    @Override
    public List<PubOutVo> findMonthShigus() {
        return recordMapper.findMonthShigus();
    }
}

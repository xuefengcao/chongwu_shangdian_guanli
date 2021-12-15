package com.system.service.impl;

import com.system.domain.JiaoyuPeixunInfo;
import com.system.mapper.JiaoyuPeixunInfoMapper;
import com.system.service.JiaoyuPeixunInfoService;
import com.system.vo.PubOutVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

@Transactional
@Service
public class JiaoyuPeixunInfoServiceImpl implements JiaoyuPeixunInfoService {
    @Autowired
    JiaoyuPeixunInfoMapper recordMapper;
    @Override
    public int deleteByPrimaryKey(Integer id) {
        return recordMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insertSelective(JiaoyuPeixunInfo record) {
        return recordMapper.insertSelective(record);
    }

    @Override
    public JiaoyuPeixunInfo selectByPrimaryKey(Integer id) {
        return recordMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(JiaoyuPeixunInfo record) {
        return recordMapper.updateByPrimaryKeySelective(record);
    }


    @Override
    public List<JiaoyuPeixunInfo> list(Map<String, Object> map) {
        return recordMapper.list(map);
    }

    @Override
    public int count(Map<String, Object> map) {
        return recordMapper.count(map);
    }

    @Override
    public List<PubOutVo> findMonthJiaoyuPeixun() {
        return recordMapper.findMonthJiaoyuPeixun();
    }
}

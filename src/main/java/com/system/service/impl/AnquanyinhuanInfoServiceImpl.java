package com.system.service.impl;

import com.system.domain.AnquanyinhuanInfo;
import com.system.mapper.AnquanyinhuanInfoMapper;
import com.system.service.AnquanyinhuanInfoService;
import com.system.vo.PubOutVo1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

@Transactional
@Service
public class AnquanyinhuanInfoServiceImpl implements AnquanyinhuanInfoService {
    @Autowired
    AnquanyinhuanInfoMapper recordMapper;
    @Override
    public int deleteByPrimaryKey(Integer id) {
        return recordMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insertSelective(AnquanyinhuanInfo record) {
        return recordMapper.insertSelective(record);
    }

    @Override
    public AnquanyinhuanInfo selectByPrimaryKey(Integer id) {
        return recordMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(AnquanyinhuanInfo record) {
        return recordMapper.updateByPrimaryKeySelective(record);
    }


    @Override
    public List<AnquanyinhuanInfo> list(Map<String, Object> map) {
        return recordMapper.list(map);
    }

    @Override
    public int count(Map<String, Object> map) {
        return recordMapper.count(map);
    }

    @Override
    public List<PubOutVo1> findTypeAnquanyinhuan() {
        return recordMapper.findTypeAnquanyinhuan();
    }
}

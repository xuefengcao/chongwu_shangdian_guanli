package com.system.service;

import com.system.domain.ShiguInfo;
import com.system.vo.PubOutVo;
import com.system.vo.PubOutVo1;

import java.util.List;
import java.util.Map;

public interface ShiguInfoService {

    int deleteByPrimaryKey(Integer id);

    int insertSelective(ShiguInfo record);

    ShiguInfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ShiguInfo record);

    List<ShiguInfo> list(Map<String,Object> map);

    int count(Map<String,Object> map);

    List<PubOutVo1> findTypeShigu();

    List<PubOutVo> findMonthShigus();
}

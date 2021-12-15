package com.system.service;

import com.system.domain.JiaoyuPeixunInfo;
import com.system.vo.PubOutVo;

import java.util.List;
import java.util.Map;

public interface JiaoyuPeixunInfoService {

    int deleteByPrimaryKey(Integer id);

    int insertSelective(JiaoyuPeixunInfo record);

    JiaoyuPeixunInfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(JiaoyuPeixunInfo record);

    List<JiaoyuPeixunInfo> list(Map<String,Object> map);

    int count(Map<String,Object> map);

    List<PubOutVo> findMonthJiaoyuPeixun();

}

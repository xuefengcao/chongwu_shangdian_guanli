package com.system.service;

import com.system.domain.AnquanyinhuanInfo;
import com.system.vo.PubOutVo1;

import java.util.List;
import java.util.Map;

public interface AnquanyinhuanInfoService {

    int deleteByPrimaryKey(Integer id);

    int insertSelective(AnquanyinhuanInfo record);

    AnquanyinhuanInfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(AnquanyinhuanInfo record);

    List<AnquanyinhuanInfo> list(Map<String,Object> map);

    int count(Map<String,Object> map);

    List<PubOutVo1> findTypeAnquanyinhuan();


}

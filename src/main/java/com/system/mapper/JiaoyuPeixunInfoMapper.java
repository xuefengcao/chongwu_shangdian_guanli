package com.system.mapper;

import com.system.domain.JiaoyuPeixunInfo;
import com.system.vo.PubOutVo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface JiaoyuPeixunInfoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(JiaoyuPeixunInfo record);

    int insertSelective(JiaoyuPeixunInfo record);

    JiaoyuPeixunInfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(JiaoyuPeixunInfo record);

    int updateByPrimaryKey(JiaoyuPeixunInfo record);

    List<JiaoyuPeixunInfo> list(Map<String,Object> map);

    int count(Map<String,Object> map);

    List<PubOutVo> findMonthJiaoyuPeixun();

}
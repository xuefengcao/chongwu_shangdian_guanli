package com.system.mapper;

import com.system.domain.ShiguInfo;
import com.system.vo.PubOutVo;
import com.system.vo.PubOutVo1;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface ShiguInfoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ShiguInfo record);

    int insertSelective(ShiguInfo record);

    ShiguInfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ShiguInfo record);

    int updateByPrimaryKey(ShiguInfo record);

    List<ShiguInfo> list(Map<String,Object> map);

    int count(Map<String,Object> map);

    List<PubOutVo1> findTypeShigu();

    List<PubOutVo> findMonthShigus();
}
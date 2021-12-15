package com.system.mapper;

import com.system.domain.AnquanyinhuanInfo;
import com.system.vo.PubOutVo1;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface AnquanyinhuanInfoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(AnquanyinhuanInfo record);

    int insertSelective(AnquanyinhuanInfo record);

    AnquanyinhuanInfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(AnquanyinhuanInfo record);

    int updateByPrimaryKey(AnquanyinhuanInfo record);

    List<AnquanyinhuanInfo> list(Map<String,Object> map);

    int count(Map<String,Object> map);

    List<PubOutVo1> findTypeAnquanyinhuan();

}
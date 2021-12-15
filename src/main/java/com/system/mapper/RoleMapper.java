package com.system.mapper;


import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import com.system.domain.RoleDO;


/**
 * 角色
 * @author chglee
 * @email
 * @date 2017-10-02 20:24:47
 */
@Mapper
public interface RoleMapper {

	RoleDO get(Long roleId);
	
	List<RoleDO> list(Map<String,Object> map);
	
	int count(Map<String,Object> map);
	
	int save(RoleDO role);
	
	int update(RoleDO role);
	
	int remove(Long roleId);
	
	int batchRemove(Long[] roleIds);
}

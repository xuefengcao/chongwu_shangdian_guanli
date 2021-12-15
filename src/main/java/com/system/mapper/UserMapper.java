package com.system.mapper;


import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import com.system.domain.UserDO;


/**
 * 
 * @author chglee
 * @email
 * @date  09:45:11
 */
@Mapper
public interface UserMapper {

	UserDO get(Long userId);
	
	List<UserDO> list(Map<String,Object> map);
	
	int count(Map<String,Object> map);
	
	int save(UserDO user);
	
	int update(UserDO user);
	
	int remove(Long userId);
	
	int batchRemove(Long[] userIds);
	
	Long[] listAllDept();
}

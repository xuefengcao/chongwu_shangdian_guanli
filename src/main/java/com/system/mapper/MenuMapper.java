package com.system.mapper;


import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import com.system.domain.MenuDO;


/**
 * 菜单管理
 * @author chglee
 * @email
 * @date  09:45:09
 */
@Mapper

public interface MenuMapper {

	MenuDO get(Long menuId);
	
	List<MenuDO> list(Map<String,Object> map);
	
	int count(Map<String,Object> map);
	
	int save(MenuDO menu);
	
	int update(MenuDO menu);
	
	int remove(Long menuId);
	
	int batchRemove(Long[] menuIds);
	
	List<MenuDO> listMenuByUserId(Long id);
	
	List<String> listUserPerms(Long id);
}

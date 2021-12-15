package com.system.contrller;

import com.system.common.utils.PageUtils;
import com.system.common.utils.Query;
import com.system.common.utils.R;
import com.system.domain.GongshangInfo;
import com.system.domain.ShiguInfo;
import com.system.domain.TypeInfo;
import com.system.domain.UserDO;
import com.system.service.GongshangInfoService;
import com.system.service.ShiguInfoService;
import com.system.service.TypeInfoService;
import com.system.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RequestMapping("/sys/gongshang")
@Controller
public class GongshangInfoController extends BaseController {
	private String prefix="system/gongshang"  ;
	@Autowired
	GongshangInfoService gongshanginfoservice;
	@Autowired
	ShiguInfoService shiguinfoservice;
	@Autowired
	TypeInfoService typeinfoservice;
	@Autowired
	UserService userService;

	@GetMapping("")
	String list(Model model) {
		return prefix + "/list";
	}

	@GetMapping("/list")
	@ResponseBody
	PageUtils list(@RequestParam Map<String, Object> params) {
		// 查询列表数据
		Query query = new Query(params);
		List<GongshangInfo> list = gongshanginfoservice.list(query);
		int total = gongshanginfoservice.count(query);
		PageUtils pageUtil = new PageUtils(list, total);
		System.out.println(pageUtil.getRows());
		return pageUtil;
	}


	@GetMapping("/add")
	String add(Model model) {

		Map<String,Object> map = new HashMap<String,Object>();
		map = new HashMap<String,Object>();
		map.put("status","1");
		List<UserDO> userdo = userService.list(map);
		model.addAttribute("userdo", userdo);

		List<ShiguInfo> list = shiguinfoservice.list(map);
		model.addAttribute("shiguinfo", list);

		map = new HashMap<String,Object>();
		map.put("flag","2");
		map.put("status","1");
		List<TypeInfo> list1 = typeinfoservice.list(map);
		model.addAttribute("shigutype", list1);

		map = new HashMap<String,Object>();
		map.put("flag","3");
		map.put("status","1");
		list1 = typeinfoservice.list(map);
		model.addAttribute("canjitype", list1);
		return prefix + "/add";
	}


	@GetMapping("/edit/{id}")
	String edit(Model model, @PathVariable("id") Integer id) {
		GongshangInfo gongshanginfo = gongshanginfoservice.selectByPrimaryKey(id);
		model.addAttribute("gongshanginfo", gongshanginfo);

		Map<String,Object> map = new HashMap<String,Object>();
		map = new HashMap<String,Object>();
		map.put("status","1");
		List<UserDO> userdo = userService.list(map);
		model.addAttribute("userdo", userdo);

		List<ShiguInfo> list = shiguinfoservice.list(map);
		model.addAttribute("shiguinfo", list);

		map = new HashMap<String,Object>();
		map.put("flag","2");
		map.put("status","1");
		List<TypeInfo> list1 = typeinfoservice.list(map);
		model.addAttribute("shigutype", list1);

		map = new HashMap<String,Object>();
		map.put("flag","3");
		map.put("status","1");
		list1 = typeinfoservice.list(map);
		model.addAttribute("canjitype", list1);
		return prefix+"/edit";
	}


	@PostMapping("/save")
	@ResponseBody
	R save(GongshangInfo record) {

		if (gongshanginfoservice.insertSelective(record) > 0) {
			return R.ok();
		}
		return R.error();
	}


	@PostMapping("/update")
	@ResponseBody
	R update(GongshangInfo record) {

		if (gongshanginfoservice.updateByPrimaryKeySelective(record) > 0) {
			return R.ok();
		}
		return R.error();
	}

	@PostMapping("/remove")
	@ResponseBody
	R remove(Integer id) {
		GongshangInfo record = new GongshangInfo();
		record.setId(id);
		record.setStatus("0");
		if (gongshanginfoservice.updateByPrimaryKeySelective(record) > 0) {
			return R.ok();
		}
		return R.error();
	}


}

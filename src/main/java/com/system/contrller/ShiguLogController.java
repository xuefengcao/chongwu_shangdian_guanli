package com.system.contrller;

import com.system.common.utils.PageUtils;
import com.system.common.utils.Query;
import com.system.common.utils.R;
import com.system.domain.ShiguInfo;
import com.system.domain.ShiguLog;
import com.system.domain.TypeInfo;
import com.system.domain.UserDO;
import com.system.service.ShiguInfoService;
import com.system.service.ShiguLogService;
import com.system.service.TypeInfoService;
import com.system.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 事故会议记录
 */
@RequestMapping("/sys/shigulog")
@Controller
public class ShiguLogController extends BaseController {
	private String prefix="system/shigulog"  ;
	@Autowired
	ShiguLogService shigulogservice;
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
		List<ShiguLog> list = shigulogservice.list(query);
		int total = shigulogservice.count(query);
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
		return prefix + "/add";
	}


	@GetMapping("/edit/{id}")
	String edit(Model model, @PathVariable("id") Integer id) {
		ShiguLog shiguinfo = shigulogservice.selectByPrimaryKey(id);
		model.addAttribute("shiguinfo", shiguinfo);
		Map<String,Object> map = new HashMap<String,Object>();
		map = new HashMap<String,Object>();
		map.put("status","1");
		List<UserDO> userdo = userService.list(map);
		model.addAttribute("userdo", userdo);

		List<ShiguInfo> list = shiguinfoservice.list(map);
		model.addAttribute("shiguinfo", list);

		return prefix+"/edit";
	}


	@PostMapping("/save")
	@ResponseBody
	R save(ShiguLog record) {
		record.setCreateTime(new Date());
		if (shigulogservice.insertSelective(record) > 0) {
			return R.ok();
		}
		return R.error();
	}


	@PostMapping("/update")
	@ResponseBody
	R update(ShiguLog record) {

		if (shigulogservice.updateByPrimaryKeySelective(record) > 0) {
			return R.ok();
		}
		return R.error();
	}

	@PostMapping("/remove")
	@ResponseBody
	R remove(Integer id) {
		ShiguLog record = new ShiguLog();
		record.setId(id);
		record.setStatus("0");
		if (shigulogservice.updateByPrimaryKeySelective(record) > 0) {
			return R.ok();
		}
		return R.error();
	}


}

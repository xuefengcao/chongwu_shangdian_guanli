package com.system.contrller;

import com.system.common.utils.PageUtils;
import com.system.common.utils.Query;
import com.system.common.utils.R;
import com.system.domain.UserDO;
import com.system.domain.WeihuapinInfo;
import com.system.service.UserService;
import com.system.service.WeihuapinInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RequestMapping("/sys/weihuapin")
@Controller
public class WeihuapinInfoController extends BaseController {
	private String prefix="system/weihuapin"  ;
	@Autowired
	WeihuapinInfoService weihuapininfoservice;
	@Autowired
	UserService userService;

	@GetMapping("")
	String list(Model model) {
		return prefix + "/list";
	}
	@GetMapping("/jiankonglist")
	String jiankonglist(Model model) {
		return prefix + "/jiankonglist";
	}
	@GetMapping("/list")
	@ResponseBody
	PageUtils list(@RequestParam Map<String, Object> params) {
		// 查询列表数据
		Query query = new Query(params);
		List<WeihuapinInfo> list = weihuapininfoservice.list(query);
		int total = weihuapininfoservice.count(query);
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
		return prefix + "/add";
	}


	@GetMapping("/edit/{id}")
	String edit(Model model, @PathVariable("id") Integer id) {
		WeihuapinInfo weihuapininfo = weihuapininfoservice.selectByPrimaryKey(id);
		model.addAttribute("weihuapininfo", weihuapininfo);
		Map<String,Object> map = new HashMap<String,Object>();
		map = new HashMap<String,Object>();
		map.put("status","1");
		List<UserDO> userdo = userService.list(map);
		model.addAttribute("userdo", userdo);

		return prefix+"/edit";
	}

	private SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
	@PostMapping("/save")
	@ResponseBody
	R save(WeihuapinInfo record) throws ParseException {
		if(record.getStartTimeStr()!=null && !"".equals(record.getStartTimeStr())){
			Date date = sdf.parse(record.getStartTimeStr());
			record.setComInTime(date);
		}

		record.setCreateTime(new Date());
		if (weihuapininfoservice.insertSelective(record) > 0) {
			return R.ok();
		}
		return R.error();
	}


	@PostMapping("/update")
	@ResponseBody
	R update(WeihuapinInfo record) throws ParseException {
		if(record.getStartTimeStr()!=null && !"".equals(record.getStartTimeStr())){
			Date date = sdf.parse(record.getStartTimeStr());
			record.setComInTime(date);
		}
		if (weihuapininfoservice.updateByPrimaryKeySelective(record) > 0) {
			return R.ok();
		}
		return R.error();
	}

	@PostMapping("/remove")
	@ResponseBody
	R remove(Integer id) {
		WeihuapinInfo record = new WeihuapinInfo();
		record.setId(id);
		record.setStatus("0");
		if (weihuapininfoservice.updateByPrimaryKeySelective(record) > 0) {
			return R.ok();
		}
		return R.error();
	}


}

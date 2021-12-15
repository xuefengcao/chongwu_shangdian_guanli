package com.system.contrller;

import com.system.common.utils.PageUtils;
import com.system.common.utils.Query;
import com.system.common.utils.R;
import com.system.domain.JiaoyuInfo;
import com.system.domain.JiaoyuPeixunInfo;
import com.system.domain.TypeInfo;
import com.system.service.JiaoyuInfoService;
import com.system.service.JiaoyuPeixunInfoService;
import com.system.service.TypeInfoService;
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

@RequestMapping("/sys/jiaoyu")
@Controller
public class JiaoyuInfoController extends BaseController {
	private String prefix="system/jiaoyu"  ;
	@Autowired
	JiaoyuInfoService jiaoyuinfoservice;
	@Autowired
	TypeInfoService typeinfoservice;
	@Autowired
	JiaoyuPeixunInfoService jiaoyupeixuninfoservice;
	@GetMapping("")
	String list(Model model) {
		return prefix + "/list";
	}

	@GetMapping("fenxi")
	String fenxi(Model model) {
		return prefix + "/fenxilist";
	}


	@GetMapping("/list")
	@ResponseBody
	PageUtils list(@RequestParam Map<String, Object> params) {
		// 查询列表数据
		Query query = new Query(params);
		List<JiaoyuInfo> list = jiaoyuinfoservice.list(query);
		int total = jiaoyuinfoservice.count(query);
		PageUtils pageUtil = new PageUtils(list, total);
		System.out.println(pageUtil.getRows());
		return pageUtil;
	}

	@GetMapping("/fenxilist")
	@ResponseBody
	PageUtils fenxilist(@RequestParam Map<String, Object> params) {
		// 查询列表数据
		Query query = new Query(params);
		List<JiaoyuInfo> list = jiaoyuinfoservice.fenxilist(query);
		int total = jiaoyuinfoservice.count(query);
		PageUtils pageUtil = new PageUtils(list, total);
		System.out.println(pageUtil.getRows());
		return pageUtil;
	}

	@GetMapping("/add")
	String add(Model model) {

		Map<String,Object> map = new HashMap<String,Object>();
		map.put("flag","5");
		map.put("status","1");
		List<TypeInfo> list = typeinfoservice.list(map);
		model.addAttribute("jiaoyutype", list);
		return prefix + "/add";
	}


	@GetMapping("/edit/{id}")
	String edit(Model model, @PathVariable("id") Integer id) {
		JiaoyuInfo jiaoyuinfo = jiaoyuinfoservice.selectByPrimaryKey(id);
		model.addAttribute("jiaoyuinfo", jiaoyuinfo);
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("flag","5");
		map.put("status","1");
		List<TypeInfo> list = typeinfoservice.list(map);
		model.addAttribute("jiaoyutype", list);
		return prefix+"/edit";
	}


	@GetMapping("/fenxiadd")
	String fenxiadd(Model model) {

		Map<String,Object> map = new HashMap<String,Object>();
		map.put("status","1");
		List<JiaoyuPeixunInfo> list = jiaoyupeixuninfoservice.list(map);
		model.addAttribute("peixunlist", list);
		return prefix + "/fenxiadd";
	}


	@GetMapping("/fenxiedit/{id}")
	String fenxiedit(Model model, @PathVariable("id") Integer id) {
		JiaoyuInfo jiaoyuinfo = jiaoyuinfoservice.selectByPrimaryKey(id);
		model.addAttribute("jiaoyuinfo", jiaoyuinfo);
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("status","1");
		List<JiaoyuPeixunInfo> list = jiaoyupeixuninfoservice.list(map);
		model.addAttribute("peixunlist", list);
		return prefix+"/fenxiedit";
	}

	private SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式

	@PostMapping("/save")
	@ResponseBody
	R save(JiaoyuInfo record) throws ParseException {
		if(record.getStartTimeStr()!=null && !"".equals(record.getStartTimeStr())){
			Date date = sdf.parse(record.getStartTimeStr());
			record.setJaoyuTime(date);
		}
		record.setCreateTime(new Date());
		if (jiaoyuinfoservice.insertSelective(record) > 0) {
			return R.ok();
		}
		return R.error();
	}


	@PostMapping("/update")
	@ResponseBody
	R update(JiaoyuInfo record) throws ParseException {
		if(record.getStartTimeStr()!=null && !"".equals(record.getStartTimeStr())){
			Date date = sdf.parse(record.getStartTimeStr());
			record.setJaoyuTime(date);
		}
		if (jiaoyuinfoservice.updateByPrimaryKeySelective(record) > 0) {
			return R.ok();
		}
		return R.error();
	}

	@PostMapping("/remove")
	@ResponseBody
	R remove(Integer id) {
		JiaoyuInfo record = new JiaoyuInfo();
		record.setId(id);
		record.setStatus("0");
		if (jiaoyuinfoservice.updateByPrimaryKeySelective(record) > 0) {
			return R.ok();
		}
		return R.error();
	}


}

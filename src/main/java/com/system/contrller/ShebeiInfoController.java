package com.system.contrller;

import com.system.common.utils.PageUtils;
import com.system.common.utils.Query;
import com.system.common.utils.R;
import com.system.domain.ShebeiInfo;
import com.system.domain.TypeInfo;
import com.system.domain.UserDO;
import com.system.service.ShebeiInfoService;
import com.system.service.TypeInfoService;
import com.system.service.UserService;
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

@RequestMapping("/sys/shebei")
@Controller
public class ShebeiInfoController extends BaseController {
	private String prefix="system/shebei"  ;
	private String prefix1="system/shebeijianxiu"  ;
	private String prefix2="system/shebeisydj"  ;
	@Autowired
	ShebeiInfoService shebeiinfoservice;
	@Autowired
	TypeInfoService typeinfoservice;
	@Autowired
	UserService userService;
	@GetMapping("")
	String list(Model model) {
		return prefix + "/list";
	}

	@GetMapping("/shebeijianxiu")
	String shebeijianxiu(Model model) {
		return prefix1 + "/list";
	}

	@GetMapping("/shebeishiyongdengji")
	String shebeishiyongdengji(Model model) {
		return prefix2 + "/list";
	}


	@GetMapping("/list")
	@ResponseBody
	PageUtils list(@RequestParam Map<String, Object> params) {
		// 查询列表数据
		Query query = new Query(params);
		List<ShebeiInfo> list = shebeiinfoservice.list(query);
		int total = shebeiinfoservice.count(query);
		PageUtils pageUtil = new PageUtils(list, total);
		System.out.println(pageUtil.getRows());
		return pageUtil;
	}


	@GetMapping("/add")
	String add(Model model) {

		Map<String,Object> map = new HashMap<String,Object>();
		map.put("flag","1");
		map.put("status","1");
		List<TypeInfo> list = typeinfoservice.list(map);
		model.addAttribute("shebeitype", list);
		map = new HashMap<String,Object>();
		map.put("status","1");
		List<UserDO> userdo = userService.list(map);
		model.addAttribute("userdo", userdo);
		return prefix + "/add";
	}

	@GetMapping("/jianxiuadd")
	String jianxiuadd(Model model) {

		Map<String,Object> map = new HashMap<String,Object>();
		map.put("flag","1");
		map.put("status","1");
		List<TypeInfo> list = typeinfoservice.list(map);
		model.addAttribute("shebeitype", list);
		map = new HashMap<String,Object>();
		map.put("status","1");
		List<UserDO> userdo = userService.list(map);
		model.addAttribute("userdo", userdo);
		map = new HashMap<String,Object>();
		map.put("status","1");
		map.put("type","1");

		List<ShebeiInfo> shebeiInfos = shebeiinfoservice.list(map);
		model.addAttribute("shebeiInfos", shebeiInfos);

		return prefix1 + "/add";
	}

	@GetMapping("/shiyongadd")
	String shiyongadd(Model model) {

		Map<String,Object> map = new HashMap<String,Object>();
		map.put("flag","1");
		map.put("status","1");
		List<TypeInfo> list = typeinfoservice.list(map);
		model.addAttribute("shebeitype", list);
		map = new HashMap<String,Object>();
		map.put("status","1");
		List<UserDO> userdo = userService.list(map);
		model.addAttribute("userdo", userdo);
		map = new HashMap<String,Object>();
		map.put("status","1");
		map.put("type","1");

		List<ShebeiInfo> shebeiInfos = shebeiinfoservice.list(map);
		model.addAttribute("shebeiInfos", shebeiInfos);

		return prefix2 + "/add";
	}

	@GetMapping("/edit/{id}")
	String edit(Model model, @PathVariable("id") Integer id) {
		ShebeiInfo shebeiinfo = shebeiinfoservice.selectByPrimaryKey(id);
		model.addAttribute("shebeiinfo", shebeiinfo);
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("flag","1");
		map.put("status","1");
		List<TypeInfo> list = typeinfoservice.list(map);
		model.addAttribute("shebeitype", list);
		map = new HashMap<String,Object>();
		map.put("status","1");
		List<UserDO> userdo = userService.list(map);
		model.addAttribute("userdo", userdo);
		return prefix+"/edit";
	}

	@GetMapping("/jianxiuedit/{id}")
	String jianxiuedit(Model model, @PathVariable("id") Integer id) {
		ShebeiInfo shebeiinfo = shebeiinfoservice.selectByPrimaryKey(id);
		model.addAttribute("shebeiinfo", shebeiinfo);
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("flag","1");
		map.put("status","1");
		List<TypeInfo> list = typeinfoservice.list(map);
		model.addAttribute("shebeitype", list);
		map = new HashMap<String,Object>();
		map.put("status","1");
		List<UserDO> userdo = userService.list(map);
		model.addAttribute("userdo", userdo);

		map = new HashMap<String,Object>();
		map.put("status","1");
		map.put("type","1");

		List<ShebeiInfo> shebeiInfos = shebeiinfoservice.list(map);
		model.addAttribute("shebeiInfos", shebeiInfos);


		return prefix1+"/edit";
	}

	@GetMapping("/shiyongedit/{id}")
	String shiyongedit(Model model, @PathVariable("id") Integer id) {
		ShebeiInfo shebeiinfo = shebeiinfoservice.selectByPrimaryKey(id);
		model.addAttribute("shebeiinfo", shebeiinfo);
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("flag","1");
		map.put("status","1");
		List<TypeInfo> list = typeinfoservice.list(map);
		model.addAttribute("shebeitype", list);
		map = new HashMap<String,Object>();
		map.put("status","1");
		List<UserDO> userdo = userService.list(map);
		model.addAttribute("userdo", userdo);

		map = new HashMap<String,Object>();
		map.put("status","1");
		map.put("type","1");

		List<ShebeiInfo> shebeiInfos = shebeiinfoservice.list(map);
		model.addAttribute("shebeiInfos", shebeiInfos);


		return prefix2+"/edit";
	}

	private SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式


	@PostMapping("/save")
	@ResponseBody
	R save(ShebeiInfo record) throws ParseException {
		if(record.getStartTimeStr()!=null && !"".equals(record.getStartTimeStr())){
			Date date = sdf.parse(record.getStartTimeStr());
			record.setGoumaiTime(date);
		}
		if(record.getEndTimeStr()!=null && !"".equals(record.getEndTimeStr())){
			Date date = sdf.parse(record.getEndTimeStr());
			record.setEndTime(date);
		}
		record.setCreateTime(new Date());
		if (shebeiinfoservice.insertSelective(record) > 0) {
			return R.ok();
		}
		return R.error();
	}


	@PostMapping("/update")
	@ResponseBody
	R update(ShebeiInfo record) throws ParseException{
		if(record.getStartTimeStr()!=null && !"".equals(record.getStartTimeStr())){
			Date date = sdf.parse(record.getStartTimeStr());
			record.setGoumaiTime(date);
		}
		if(record.getEndTimeStr()!=null && !"".equals(record.getEndTimeStr())){
			Date date = sdf.parse(record.getEndTimeStr());
			record.setEndTime(date);
		}
		if (shebeiinfoservice.updateByPrimaryKeySelective(record) > 0) {
			return R.ok();
		}
		return R.error();
	}

	@PostMapping("/remove")
	@ResponseBody
	R remove(Integer id) {
		ShebeiInfo record = new ShebeiInfo();
		record.setId(id);
		record.setStatus("0");
		if (shebeiinfoservice.updateByPrimaryKeySelective(record) > 0) {
			return R.ok();
		}
		return R.error();
	}


}

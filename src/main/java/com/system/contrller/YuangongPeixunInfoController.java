package com.system.contrller;

import com.system.common.utils.PageUtils;
import com.system.common.utils.Query;
import com.system.common.utils.R;
import com.system.domain.ShiguInfo;
import com.system.domain.TypeInfo;
import com.system.domain.UserDO;
import com.system.domain.YuangongPeixunInfo;
import com.system.service.TypeInfoService;
import com.system.service.UserService;
import com.system.service.YuangongPeixunInfoService;
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

@RequestMapping("/sys/yuangongjiaoyupeixun")
@Controller
public class YuangongPeixunInfoController extends BaseController {
	private String prefix="system/yuangongjiaoyupeixun"  ;
	@Autowired
	YuangongPeixunInfoService yuangongpeixuninfoservice;
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
		List<YuangongPeixunInfo> list = yuangongpeixuninfoservice.list(query);
		int total = yuangongpeixuninfoservice.count(query);
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

		map = new HashMap<String,Object>();
		map.put("flag","6");
		map.put("status","1");
		List<TypeInfo> list = typeinfoservice.list(map);
		model.addAttribute("peixuntype", list);
		return prefix + "/add";
	}


	@GetMapping("/edit/{id}")
	String edit(Model model, @PathVariable("id") Integer id) {
		YuangongPeixunInfo yuangongpeixuninfo = yuangongpeixuninfoservice.selectByPrimaryKey(id);
		model.addAttribute("yuangongpeixuninfo", yuangongpeixuninfo);
		Map<String,Object> map = new HashMap<String,Object>();
		map = new HashMap<String,Object>();
		map.put("status","1");
		List<UserDO> userdo = userService.list(map);
		model.addAttribute("userdo", userdo);

		map = new HashMap<String,Object>();
		map.put("flag","6");
		map.put("status","1");
		List<TypeInfo> list = typeinfoservice.list(map);
		model.addAttribute("peixuntype", list);
		return prefix+"/edit";
	}

	private SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
	@PostMapping("/save")
	@ResponseBody
	R save(YuangongPeixunInfo record) throws ParseException {
		if(record.getStartTimeStr()!=null && !"".equals(record.getStartTimeStr())){
			Date date = sdf.parse(record.getStartTimeStr());
			record.setPeixunTime(date);
		}

		record.setCreateTime(new Date());
		if (yuangongpeixuninfoservice.insertSelective(record) > 0) {
			return R.ok();
		}
		return R.error();
	}


	@PostMapping("/update")
	@ResponseBody
	R update(YuangongPeixunInfo record) throws ParseException{
		if(record.getStartTimeStr()!=null && !"".equals(record.getStartTimeStr())){
			Date date = sdf.parse(record.getStartTimeStr());
			record.setPeixunTime(date);
		}
		if (yuangongpeixuninfoservice.updateByPrimaryKeySelective(record) > 0) {
			return R.ok();
		}
		return R.error();
	}

	@PostMapping("/remove")
	@ResponseBody
	R remove(Integer id) {
		YuangongPeixunInfo record = new YuangongPeixunInfo();
		record.setId(id);
		record.setStatus("0");
		if (yuangongpeixuninfoservice.updateByPrimaryKeySelective(record) > 0) {
			return R.ok();
		}
		return R.error();
	}


}

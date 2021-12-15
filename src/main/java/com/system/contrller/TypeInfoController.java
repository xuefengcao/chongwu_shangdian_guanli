package com.system.contrller;

import com.system.common.utils.PageUtils;
import com.system.common.utils.Query;
import com.system.common.utils.R;
import com.system.domain.TypeInfo;
import com.system.service.TypeInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;
import java.util.Map;

@RequestMapping("/sys/typeinfo")
@Controller
public class TypeInfoController extends BaseController {
	private String prefix="system/typeinfo"  ;
	@Autowired
	TypeInfoService typeinfoservice;


	@GetMapping("")
	String list(Model model) {
		return prefix + "/list";
	}

	@GetMapping("/shebeilist")
	String shebeilist(Model model) {
		return prefix + "/shebeilist";
	}
	@GetMapping("/shigulist")
	String shigulist(Model model) {
		return prefix + "/shigulist";
	}
	@GetMapping("/canjilist")
	String canjilist(Model model) {
		return prefix + "/canjilist";
	}

	@GetMapping("/yinhuanlist")
	String yinhuanlist(Model model) {
		return prefix + "/yinhuanlist";
	}

	@GetMapping("/jiaoyulist")
	String jiaoyulist(Model model) {
		return prefix + "/jiaoyulist";
	}

	@GetMapping("/peixunlist")
	String peixunlist(Model model) {
		return prefix + "/peixunlist";
	}
	@GetMapping("/list")
	@ResponseBody
	PageUtils list(@RequestParam Map<String, Object> params) {
		// 查询列表数据
		Query query = new Query(params);
		List<TypeInfo> list = typeinfoservice.list(query);
		int total = typeinfoservice.count(query);
		PageUtils pageUtil = new PageUtils(list, total);
		System.out.println(pageUtil.getRows());
		return pageUtil;
	}


	@GetMapping("/add")
	String add(Model model) {

		model.addAttribute("roles", "");
		return prefix + "/add";
	}

	@GetMapping("/shiguadd")
	String shiguadd(Model model) {

		model.addAttribute("roles", "");
		return prefix + "/shiguadd";
	}

	@GetMapping("/canjiadd")
	String canjiadd(Model model) {

		model.addAttribute("roles", "");
		return prefix + "/canjiadd";
	}

	@GetMapping("/yinhuanadd")
	String yinhuanadd(Model model) {

		model.addAttribute("roles", "");
		return prefix + "/yinhuanadd";
	}

	@GetMapping("/jiaoyuadd")
	String jiaoyuadd(Model model) {

		model.addAttribute("roles", "");
		return prefix + "/jiaoyuadd";
	}
	@GetMapping("/peixunadd")
	String peixunadd(Model model) {

		model.addAttribute("roles", "");
		return prefix + "/peixunadd";
	}
	@GetMapping("/edit/{id}")
	String edit(Model model, @PathVariable("id") Integer id) {
		TypeInfo anquanyinhuaninfo = typeinfoservice.selectByPrimaryKey(id);
		model.addAttribute("anquanyinhuaninfo", anquanyinhuaninfo);
		return prefix+"/edit";
	}


	@PostMapping("/save")
	@ResponseBody
	R save(TypeInfo record) {
		record.setCreateTime(new Date());
		if (typeinfoservice.insertSelective(record) > 0) {
			return R.ok();
		}
		return R.error();
	}


	@PostMapping("/update")
	@ResponseBody
	R update(TypeInfo record) {

		if (typeinfoservice.updateByPrimaryKeySelective(record) > 0) {
			return R.ok();
		}
		return R.error();
	}

	@PostMapping("/remove")
	@ResponseBody
	R remove(Integer id) {
		TypeInfo record = new TypeInfo();
		record.setId(id);
		record.setStatus("0");
		if (typeinfoservice.updateByPrimaryKeySelective(record) > 0) {
			return R.ok();
		}
		return R.error();
	}


}

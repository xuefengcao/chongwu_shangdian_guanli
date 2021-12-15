package com.system.contrller;

import com.system.common.utils.PageUtils;
import com.system.common.utils.Query;
import com.system.common.utils.R;
import com.system.domain.CaozauoLog;
import com.system.service.CaozauoLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RequestMapping("/sys/caozauolog")
@Controller
public class CaozauoLogServiceController extends BaseController {
	private String prefix="system/caozauolog"  ;
	@Autowired
	CaozauoLogService caozauologservice;


	@GetMapping("")
	String list(Model model) {
		return prefix + "/list";
	}

	@GetMapping("/list")
	@ResponseBody
	PageUtils list(@RequestParam Map<String, Object> params) {
		// 查询列表数据
		Query query = new Query(params);
		List<CaozauoLog> list = caozauologservice.list(query);
		int total = caozauologservice.count(query);
		PageUtils pageUtil = new PageUtils(list, total);
		System.out.println(pageUtil.getRows());
		return pageUtil;
	}


	@GetMapping("/add")
	String add(Model model) {

		model.addAttribute("roles", "");
		return prefix + "/add";
	}


	@GetMapping("/edit/{id}")
	String edit(Model model, @PathVariable("id") Integer id) {
		CaozauoLog caozauolog = caozauologservice.selectByPrimaryKey(id);
		model.addAttribute("caozauolog", caozauolog);
		return prefix+"/edit";
	}


	@PostMapping("/save")
	@ResponseBody
	R save(CaozauoLog record) {

		if (caozauologservice.insertSelective(record) > 0) {
			return R.ok();
		}
		return R.error();
	}


	@PostMapping("/update")
	@ResponseBody
	R update(CaozauoLog record) {

		if (caozauologservice.updateByPrimaryKeySelective(record) > 0) {
			return R.ok();
		}
		return R.error();
	}

	@PostMapping("/remove")
	@ResponseBody
	R remove(Integer id) {
		CaozauoLog record = new CaozauoLog();
		record.setId(id);
		record.setStatus("0");
		if (caozauologservice.updateByPrimaryKeySelective(record) > 0) {
			return R.ok();
		}
		return R.error();
	}


}

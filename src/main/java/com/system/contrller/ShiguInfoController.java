package com.system.contrller;

import com.system.common.utils.PageUtils;
import com.system.common.utils.Query;
import com.system.common.utils.R;
import com.system.domain.ShiguInfo;
import com.system.domain.TypeInfo;
import com.system.domain.UserDO;
import com.system.service.ShiguInfoService;
import com.system.service.TypeInfoService;
import com.system.service.UserService;
import com.system.vo.PubOutVo;
import com.system.vo.PubOutVo1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RequestMapping("/sys/shigu")
@Controller
public class ShiguInfoController extends BaseController {
	private String prefix="system/shigu"  ;
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
		List<ShiguInfo> list = shiguinfoservice.list(query);
		int total = shiguinfoservice.count(query);
		PageUtils pageUtil = new PageUtils(list, total);
		System.out.println(pageUtil.getRows());
		return pageUtil;
	}


	@GetMapping("/add")
	String add(Model model) {
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("flag","2");
		map.put("status","1");
		List<TypeInfo> list = typeinfoservice.list(map);
		model.addAttribute("shigutype", list);

		map = new HashMap<String,Object>();
		map.put("status","1");
		List<UserDO> sysUserList = userService.list(map);
		model.addAttribute("userdo", sysUserList);
		return prefix + "/add";
	}


	@GetMapping("/edit/{id}")
	String edit(Model model, @PathVariable("id") Integer id) {
		ShiguInfo shiguinfo = shiguinfoservice.selectByPrimaryKey(id);
		model.addAttribute("shiguinfo", shiguinfo);
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("flag","2");
		List<TypeInfo> list = typeinfoservice.list(map);
		model.addAttribute("shigutype", list);

		map = new HashMap<String,Object>();
		map.put("status","1");
		List<UserDO> sysUserList = userService.list(map);
		model.addAttribute("userdo", sysUserList);

		return prefix+"/edit";
	}


	@PostMapping("/save")
	@ResponseBody
	R save(ShiguInfo record) {
		record.setCreateTime(new Date());
		if (shiguinfoservice.insertSelective(record) > 0) {
			return R.ok();
		}
		return R.error();
	}


	@PostMapping("/update")
	@ResponseBody
	R update(ShiguInfo record) {

		if (shiguinfoservice.updateByPrimaryKeySelective(record) > 0) {
			return R.ok();
		}
		return R.error();
	}

	@PostMapping("/remove")
	@ResponseBody
	R remove(Integer id) {
		ShiguInfo record = new ShiguInfo();
		record.setId(id);
		record.setStatus("0");
		if (shiguinfoservice.updateByPrimaryKeySelective(record) > 0) {
			return R.ok();
		}
		return R.error();
	}
	@GetMapping("/findTypeNum")
	public String typeNum(Model model){
		//查询想法评论消息

		return prefix + "/typeNum";
	}


	/**
	 * 类别 数量占比
	 * @return
	 */
	@GetMapping("/ajaxTypeShugus")
	@ResponseBody
	public Map<String,Object> ajaxTypeShugus() {
		Map<String,Object> map=new HashMap<String,Object>();
		List<PubOutVo1> list = shiguinfoservice.findTypeShigu();
		List<String> name = new ArrayList<String>();
		Map<String,Object> mapval=new HashMap<String,Object>();
		for(PubOutVo1 vo : list){
			name.add(vo.getName());
		}
		map.put("name",name);
		map.put("list",list);
		return map;
	}


	@GetMapping("/findMonthShigus")
	public String findMonthShigus(Model model){
		//查询想法评论消息

		return prefix + "/month";
	}
	/**
	 * 获取上月 事故数量
	 * @return
	 */
	@GetMapping("/ajaxMonthShigus")
	@ResponseBody
	public Map<String,Object> ajaxMonthGoods() {
		Map<String,Object> map=new HashMap<String,Object>();
		List<PubOutVo> list = shiguinfoservice.findMonthShigus();
		List<String> createTimeStr = new ArrayList<String>();
		List<Integer> num = new ArrayList<Integer>();
		Map<String,Object> mapval=new HashMap<String,Object>();
		for(PubOutVo vo : list){
			createTimeStr.add(vo.getCreateTimeStr());
			num.add(vo.getNum());
		}
		map.put("createTimeStr",createTimeStr);
		map.put("num",num);
		return map;
	}

}

package com.system.contrller;

import com.system.common.utils.PageUtils;
import com.system.common.utils.Query;
import com.system.common.utils.R;
import com.system.domain.AnquanyinhuanInfo;
import com.system.domain.TypeInfo;
import com.system.domain.UserDO;
import com.system.service.AnquanyinhuanInfoService;
import com.system.service.TypeInfoService;
import com.system.service.UserService;
import com.system.vo.PubOutVo1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

@RequestMapping("/sys/anquanyinhuan")
@Controller
public class AnquanyinhuanInfoController extends BaseController {
	private String prefix="system/anquanyinhuan"  ;
	@Autowired
	AnquanyinhuanInfoService anquanyinhuanInfoService;
	@Autowired
	TypeInfoService typeinfoservice;
	@Autowired
	UserService userService;

	private SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式

	@GetMapping("")
	String list(Model model) {
		return prefix + "/list";
	}

	@GetMapping("/list")
	@ResponseBody
	PageUtils list(@RequestParam Map<String, Object> params) {
		// 查询列表数据
		Query query = new Query(params);
		List<AnquanyinhuanInfo> list = anquanyinhuanInfoService.list(query);
		int total = anquanyinhuanInfoService.count(query);
		PageUtils pageUtil = new PageUtils(list, total);
		System.out.println(pageUtil.getRows());
		return pageUtil;
	}


	@GetMapping("/add")
	String add(Model model) {

		Map<String,Object> map = new HashMap<String,Object>();
		map.put("flag","4");
		map.put("status","1");
		List<TypeInfo> list = typeinfoservice.list(map);
		model.addAttribute("yinhuantype", list);

		map = new HashMap<String,Object>();
		map.put("status","1");
		List<UserDO> userdo = userService.list(map);
		model.addAttribute("userdo", userdo);
		return prefix + "/add";
	}


	@GetMapping("/edit/{id}")
	String edit(Model model, @PathVariable("id") Integer id) {
		AnquanyinhuanInfo anquanyinhuaninfo = anquanyinhuanInfoService.selectByPrimaryKey(id);
		model.addAttribute("anquanyinhuaninfo", anquanyinhuaninfo);

		Map<String,Object> map = new HashMap<String,Object>();
		map.put("flag","4");
		map.put("status","1");
		List<TypeInfo> list = typeinfoservice.list(map);
		model.addAttribute("yinhuantype", list);

		map = new HashMap<String,Object>();
		map.put("status","1");
		List<UserDO> userdo = userService.list(map);
		model.addAttribute("userdo", userdo);
		return prefix+"/edit";
	}


	@PostMapping("/save")
	@ResponseBody
	R save(AnquanyinhuanInfo record) throws ParseException {
		if(record.getStartTimeStr()!=null && !"".equals(record.getStartTimeStr())){
			Date date = sdf.parse(record.getStartTimeStr());
			record.setJianchaStartTime(date);
		}
		if(record.getEndTimeStr()!=null && !"".equals(record.getEndTimeStr())){
			Date date = sdf.parse(record.getEndTimeStr());
			record.setJianchaEndTime(date);
		}
		record.setCreateTime(new Date());
		if (anquanyinhuanInfoService.insertSelective(record) > 0) {
			return R.ok();
		}
		return R.error();
	}


	@PostMapping("/update")
	@ResponseBody
	R update(AnquanyinhuanInfo record) throws ParseException{
		if(record.getStartTimeStr()!=null && !"".equals(record.getStartTimeStr())){
			Date date = sdf.parse(record.getStartTimeStr());
			record.setJianchaStartTime(date);
		}
		if(record.getEndTimeStr()!=null && !"".equals(record.getEndTimeStr())){
			Date date = sdf.parse(record.getEndTimeStr());
			record.setJianchaEndTime(date);
		}
		if (anquanyinhuanInfoService.updateByPrimaryKeySelective(record) > 0) {
			return R.ok();
		}
		return R.error();
	}

	@PostMapping("/remove")
	@ResponseBody
	R remove(Integer id) {
		AnquanyinhuanInfo record = new AnquanyinhuanInfo();
		record.setId(id);
		record.setStatus("0");
		if (anquanyinhuanInfoService.updateByPrimaryKeySelective(record) > 0) {
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
	@GetMapping("/ajaxTypeAnquanyinhuans")
	@ResponseBody
	public Map<String,Object> ajaxCategoryGoods() {
		Map<String,Object> map=new HashMap<String,Object>();
		List<PubOutVo1> list = anquanyinhuanInfoService.findTypeAnquanyinhuan();
		List<String> name = new ArrayList<String>();
		Map<String,Object> mapval=new HashMap<String,Object>();
		for(PubOutVo1 vo : list){
			name.add(vo.getName());
		}
		map.put("name",name);
		map.put("list",list);
		return map;
	}


}

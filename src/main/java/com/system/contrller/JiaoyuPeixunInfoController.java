package com.system.contrller;

import com.system.common.utils.PageUtils;
import com.system.common.utils.Query;
import com.system.common.utils.R;
import com.system.domain.JiaoyuPeixunInfo;
import com.system.domain.TypeInfo;
import com.system.service.JiaoyuPeixunInfoService;
import com.system.service.TypeInfoService;
import com.system.vo.PubOutVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

@RequestMapping("/sys/jiaoyupeixun")
@Controller
public class JiaoyuPeixunInfoController extends BaseController {
	private String prefix="system/jiaoyupeixun"  ;
	@Autowired
	JiaoyuPeixunInfoService jiaoyupeixuninfoservice;
	@Autowired
	TypeInfoService typeinfoservice;

	@GetMapping("")
	String list(Model model) {
		return prefix + "/list";
	}

	@GetMapping("/list")
	@ResponseBody
	PageUtils list(@RequestParam Map<String, Object> params) {
		// 查询列表数据
		Query query = new Query(params);
		List<JiaoyuPeixunInfo> list = jiaoyupeixuninfoservice.list(query);
		int total = jiaoyupeixuninfoservice.count(query);
		PageUtils pageUtil = new PageUtils(list, total);
		System.out.println(pageUtil.getRows());
		return pageUtil;
	}


	@GetMapping("/add")
	String add(Model model) {

		Map<String,Object> map = new HashMap<String,Object>();
		map.put("flag","6");
		map.put("status","1");
		List<TypeInfo> list = typeinfoservice.list(map);
		model.addAttribute("peixuntype", list);
		return prefix + "/add";
	}


	@GetMapping("/edit/{id}")
	String edit(Model model, @PathVariable("id") Integer id) {
		JiaoyuPeixunInfo jiaoyupeixuninfo = jiaoyupeixuninfoservice.selectByPrimaryKey(id);
		model.addAttribute("jiaoyupeixuninfo", jiaoyupeixuninfo);
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("flag","6");
		map.put("status","1");
		List<TypeInfo> list = typeinfoservice.list(map);
		model.addAttribute("peixuntype", list);

		return prefix+"/edit";
	}

	private SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
	@PostMapping("/save")
	@ResponseBody
	R save(JiaoyuPeixunInfo record) throws ParseException {
		if(record.getStartTimeStr()!=null && !"".equals(record.getStartTimeStr())){
			Date date = sdf.parse(record.getStartTimeStr());
			record.setPeixunTime(date);
		}
		record.setCreateTime(new Date());
		if (jiaoyupeixuninfoservice.insertSelective(record) > 0) {
			return R.ok();
		}
		return R.error();
	}


	@PostMapping("/update")
	@ResponseBody
	R update(JiaoyuPeixunInfo record) throws ParseException {
		if(record.getStartTimeStr()!=null && !"".equals(record.getStartTimeStr())){
			Date date = sdf.parse(record.getStartTimeStr());
			record.setPeixunTime(date);
		}
		if (jiaoyupeixuninfoservice.updateByPrimaryKeySelective(record) > 0) {
			return R.ok();
		}
		return R.error();
	}

	@PostMapping("/remove")
	@ResponseBody
	R remove(Integer id) {
		JiaoyuPeixunInfo record = new JiaoyuPeixunInfo();
		record.setId(id);
		record.setStatus("0");
		if (jiaoyupeixuninfoservice.updateByPrimaryKeySelective(record) > 0) {
			return R.ok();
		}
		return R.error();
	}

	@GetMapping("/findMonthJiaoyuPeixuns")
	public String findMonthJiaoyuPeixuns(Model model){
		//查询想法评论消息

		return   "/system/jiaoyu/month";
	}
	/**
	 * 获取上月 事故数量
	 * @return
	 */
	@GetMapping("/ajaxMonthJiaoyuPeixun")
	@ResponseBody
	public Map<String,Object> ajaxMonthJiaoyuPeixun() {
		Map<String,Object> map=new HashMap<String,Object>();
		List<PubOutVo> list = jiaoyupeixuninfoservice.findMonthJiaoyuPeixun();
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

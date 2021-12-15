package com.system.common.utils;


public class ResultDataUtil {

	private Integer code;
	private String msg;
	private Long count;
	private Object data;
	
	public ResultDataUtil() {
		super();
	}

	public ResultDataUtil(Integer code) {
		super();
		this.code = code;
	}

	public ResultDataUtil(Integer code, String msg) {
		super();
		this.code = code;
		this.msg = msg;
	}
	
	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}


	public Long getCount() {
		return count;
	}

	public void setCount(Long count) {
		this.count = count;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

	public static ResultDataUtil ok(){
		return new ResultDataUtil(0);
	}
	
	public static ResultDataUtil ok(Object list){
		ResultDataUtil result = new ResultDataUtil();
		result.setCode(0);
		result.setData(list);;
		return result;
	}
	public static ResultDataUtil ok(String msg){
		ResultDataUtil result = new ResultDataUtil();
		result.setCode(0);
		result.setMsg(msg);
		return result;
	}
	
	public static ResultDataUtil error(){
		return new ResultDataUtil(500,"没有此权限，请联系超管！");
	}
	public static ResultDataUtil error(String str){
		return new ResultDataUtil(500,str);
	}
}

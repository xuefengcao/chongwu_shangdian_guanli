package com.system.contrller;

import org.springframework.stereotype.Controller;

import com.system.common.utils.ShiroUtils;
import com.system.domain.UserDO;

import java.text.SimpleDateFormat;


@Controller
public class BaseController {
	public UserDO getUser() {
		return ShiroUtils.getUser();
	}

	public Long getUserId() {
		return getUser().getUserId();
	}

	public String getUsername() {
		return getUser().getUsername();
	}
}
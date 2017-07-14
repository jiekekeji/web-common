package com.jk.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "/qrcode")
public class QrCode {

	@RequestMapping(value = "/register", method = RequestMethod.POST)
	@ResponseBody
	public Object findUserById() {

		return "register";
	}
}

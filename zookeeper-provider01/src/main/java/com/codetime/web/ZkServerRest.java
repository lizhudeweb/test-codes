package com.codetime.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/api")
public class ZkServerRest {

	@RequestMapping(value = "/ip", method = { RequestMethod.GET })
	public String getIp(HttpServletRequest request) {
		return "request:"+ IPUtil.getIpAddr(request) + " ip:"+IPUtil.localIp();
	}
}
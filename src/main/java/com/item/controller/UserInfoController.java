package com.item.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.item.entity.UserInfo;
import com.item.service.UserInfoService;
import com.item.tool.Result;

@Controller
@RequestMapping("/userinfo")
public class UserInfoController {

	@Autowired
	private UserInfoService userInfoService;

	/**
	 * 注册用户
	 * 
	 * @param userInfo
	 * @return
	 */
	@RequestMapping(value = "/regist")
	@ResponseBody
	public Result<?> userLogin(UserInfo userInfo) {
		int row = userInfoService.insertUserInfo(userInfo);
		return Result.success(row);
	}

	/**
	 * 登录验证
	 * 
	 * @param userInfo
	 * @return
	 */
	@RequestMapping(value = "/login")
	@ResponseBody
	public Result<?> queryUserInfo(UserInfo userInfo, HttpServletRequest request, HttpServletResponse response) {
		return userInfoService.queryUserInfo(userInfo, request, response);
	}

	/**
	 * 获取信息
	 * 
	 * @return
	 */
	@RequestMapping(value = "/message")
	@ResponseBody
	public Result<?> getmessage() {
		return Result.success();
	}

}

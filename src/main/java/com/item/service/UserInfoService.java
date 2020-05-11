package com.item.service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.item.entity.UserInfo;
import com.item.tool.Result;

public interface UserInfoService {

	/**
	 * 注册用户
	 * 
	 * @param userInfo
	 * @return
	 */
	int insertUserInfo(UserInfo userInfo);

	/**
	 * 查询用户是否存在
	 * 
	 * @param userInfo
	 * @return
	 */
	Result<?> queryUserInfo(UserInfo userInfo, HttpServletRequest request, HttpServletResponse response);
}

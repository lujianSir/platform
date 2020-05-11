package com.item.service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.item.entity.UserInfo;
import com.item.mapper.UserInfoMapper;
import com.item.tool.Result;
import com.item.tool.TokenUtil;
import com.item.tool.Utils;

@Service
public class UserInfoServiceImpl implements UserInfoService {

	@Autowired
	private UserInfoMapper userInfoMapper;

	@Override
	public int insertUserInfo(UserInfo userInfo) {
		// TODO Auto-generated method stub
		String starttime = Utils.getCurrent();
		String endtime = Utils.getThreeOldTime();
		userInfo.setStarttime(starttime);
		userInfo.setEndtime(endtime);
		int row = userInfoMapper.insertUserInfo(userInfo);
		return row;
	}

	@Override
	public Result<?> queryUserInfo(UserInfo userInfo, HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		UserInfo user = userInfoMapper.queryUserInfo(userInfo);
		if (user == null) {
			return Result.error(500, "账号或者密码错误");
		} else {
			if (user.getStatus() == 2) {
				return Result.error(501, "账号已经到期");
			} else {
				String token = TokenUtil.sign(user);
				// 将token放在密码带出去
				user.setPassword(token);
				return Result.success(user);
			}
		}
	}

}

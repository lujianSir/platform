package com.item.mapper;

import org.springframework.stereotype.Repository;

import com.item.entity.UserInfo;

@Repository
public interface UserInfoMapper {
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
	UserInfo queryUserInfo(UserInfo userInfo);
}

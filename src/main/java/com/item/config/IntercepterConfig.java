package com.item.config;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class IntercepterConfig implements WebMvcConfigurer {

	private TokenInterceptor tokenInterceptor;

	// 构造方法
	public IntercepterConfig(TokenInterceptor tokenInterceptor) {
		this.tokenInterceptor = tokenInterceptor;
	}

	@Override
	public void addInterceptors(InterceptorRegistry registry) {

		// 拦截
		List<String> pathPatterns = new ArrayList<String>();
		pathPatterns.add("/userinfo/**");

		// 过滤
		List<String> excludePath = new ArrayList<String>();
		excludePath.add("/userinfo/login"); // 登录
		excludePath.add("/userinfo/regist"); // 注册

		registry.addInterceptor(tokenInterceptor).addPathPatterns(pathPatterns).excludePathPatterns(excludePath);
	}
}

package com.item.controller;

import java.io.InputStream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.item.entity.Bridge;
import com.item.entity.BridgeMessage;
import com.item.service.BridgeService;
import com.item.tool.Result;

/**
 * 桥梁的控制层
 * 
 * @author Administrator
 *
 */
@Controller
@RequestMapping("/bridge")
public class BridgeController {

	@Autowired
	private BridgeService bridgeService;

	@RequestMapping("/test2")
	public String multiFile() {
		return "/file";
	}

	/**
	 * 导入excel
	 * 
	 * @param in
	 * @param file
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value = "/importExcelInfo")
	@ResponseBody
	public Result<?> importExcelInfo(InputStream in, MultipartFile file) throws Exception {

		return bridgeService.importExcelInfo(in, file);
	}

	/**
	 * 添加信息
	 * 
	 * @param bridgeMessage
	 * @return
	 */
	@RequestMapping(value = "/insertBridgeMessage")
	@ResponseBody
	public Result<?> insertBridgeMessage(BridgeMessage bridgeMessage) {

		return bridgeService.insertBridgeMessage(bridgeMessage);
	}

	/**
	 * 查询信息
	 * 
	 * @param bridge
	 * @return
	 */
	@RequestMapping(value = "/queryBridgeList")
	@ResponseBody
	public Result<?> queryBridgeList(Bridge bridge) {

		return bridgeService.queryBridgeList(bridge);
	}
}

package com.item.service;

import java.io.InputStream;

import org.springframework.web.multipart.MultipartFile;

import com.item.entity.Bridge;
import com.item.entity.BridgeMessage;
import com.item.tool.Result;

public interface BridgeService {

	/**
	 * 上传excel
	 */
	Result<?> importExcelInfo(InputStream in, MultipartFile file) throws Exception;

	/**
	 * 添加模型信息
	 * 
	 * @return
	 */
	Result<?> insertBridgeMessage(BridgeMessage bridgeMessage);

	/**
	 * 通过ID查询信息
	 * 
	 * @return
	 */
	Result<?> queryBridgeList(Bridge bridge);
	
	

}

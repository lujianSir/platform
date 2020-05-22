package com.item.mapper;

import java.util.List;

import com.item.entity.Bridge;
import com.item.entity.BridgeMessage;

public interface BridgeMapper {

	/**
	 * 批量添加
	 * 
	 * @param list
	 */
	void insertBridges(List<Bridge> list);

	/**
	 * 添加信息
	 * 
	 * @param bridgeMessage
	 * @return
	 */
	int insertBridgeMessage(BridgeMessage bridgeMessage);

	/**
	 * 通过查询条件查询
	 * 
	 * @param bridge
	 * @return
	 */
	List<Bridge> queryBridgeList(Bridge bridge);
}

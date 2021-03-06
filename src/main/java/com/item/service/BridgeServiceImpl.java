package com.item.service;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.item.entity.Bridge;
import com.item.entity.BridgeMessage;
import com.item.mapper.BridgeMapper;
import com.item.tool.ExcelUtil;
import com.item.tool.Result;

@Service
public class BridgeServiceImpl implements BridgeService {

	@Autowired
	private BridgeMapper bridgeMapper;

	@Override
	public Result<?> importExcelInfo(InputStream in, MultipartFile file) throws Exception {
		// TODO Auto-generated method stub
		if (!file.isEmpty()) {
			List<List<Object>> listob = ExcelUtil.getBankListByExcel(file);
			System.out.println(listob);
			List<Bridge> list = new ArrayList<Bridge>();
			for (int i = 0; i < listob.size(); i++) {
				List<Object> ob = listob.get(i);
				Bridge bridge = new Bridge();
				if (ob.get(0) != null && !String.valueOf(ob.get(0)).equals("")) {
					bridge.setId(String.valueOf(ob.get(0)));
				}
				if (ob.get(1) != null && !String.valueOf(ob.get(1)).equals("")) {
					bridge.setCategory(String.valueOf(ob.get(1)));
				}
				if (ob.get(2) != null && !String.valueOf(ob.get(2)).equals("")) {
					bridge.setName(String.valueOf(ob.get(2)));
				}
				if (ob.get(3) != null && !String.valueOf(ob.get(3)).equals("")) {
					bridge.setArea(String.valueOf(ob.get(3)));
				}
				if (ob.get(4) != null && !String.valueOf(ob.get(4)).equals("")) {
					bridge.setHeight(String.valueOf(ob.get(4)));
				}
				if (ob.get(5) != null && !String.valueOf(ob.get(5)).equals("")) {
					bridge.setRealheight(String.valueOf(ob.get(5)));
				}
				if (ob.get(6) != null && !String.valueOf(ob.get(6)).equals("")) {
					bridge.setDiameter(String.valueOf(ob.get(6)));
				}
				if (ob.get(7) != null && !String.valueOf(ob.get(7)).equals("")) {
					bridge.setTextures(String.valueOf(ob.get(7)));
				}
				if (ob.get(8) != null && !String.valueOf(ob.get(8)).equals("")) {
					bridge.setLongs(String.valueOf(ob.get(8)));
				}
				if (ob.get(9) != null && !String.valueOf(ob.get(9)).equals("")) {
					bridge.setWidths(String.valueOf(ob.get(9)));
				}
				if (ob.get(10) != null && !String.valueOf(ob.get(10)).equals("")) {
					bridge.setWeight(String.valueOf(ob.get(10)));
				}
				list.add(bridge);
			}
			bridgeMapper.insertBridges(list);
			return Result.success();
		} else {
			return Result.error(500, "文件不存在");
		}

	}

	@Override
	public Result<?> insertBridgeMessage(BridgeMessage bridgeMessage) {
		// TODO Auto-generated method stub
		int num = bridgeMapper.insertBridgeMessage(bridgeMessage);
		if (num > 0) {
			return Result.success();
		} else {
			return Result.error(500, "添加失败");
		}
	}

	@Override
	public Result<?> queryBridgeList(Bridge bridge) {
		// TODO Auto-generated method stub
		return Result.success(bridgeMapper.queryBridgeList(bridge));
	}

	@Override
	public Result<?> insertOrDelete(BridgeMessage bridgeMessage, int style) {
		// TODO Auto-generated method stub
		if (style == 1) {// 正常变异常
			bridgeMapper.insertBridgeMessage(bridgeMessage);
			return Result.success(1);
		} else {// 异常变正常
			bridgeMapper.deleteBridgeMessage(bridgeMessage);
			return Result.success(0);
		}

	}

}

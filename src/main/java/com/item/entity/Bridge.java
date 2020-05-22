package com.item.entity;

import java.util.List;

/**
 * 桥的实体
 * 
 * @author Administrator
 *
 */
public class Bridge {

	private String bridge_id;// ID

	private String bridge_category;// 常规模型

	private String bridge_name;// 模型名称

	private String bridge_area;// 面积

	private String bridge_height;// 高度

	private String bridge_realheight;// 真是高度

	private String bridge_diameter;// 直径

	private String bridge_textures;// 纹理

	private String bridge_longs;// 长度

	private String bridge_widths;// 宽度

	private String bridge_weight;// 重量

	private int bridge_style;// 状态

	private List<BridgeMessage> messages;// 备注信息

	public String getBridge_id() {
		return bridge_id;
	}

	public void setBridge_id(String bridge_id) {
		this.bridge_id = bridge_id;
	}

	public String getBridge_category() {
		return bridge_category;
	}

	public void setBridge_category(String bridge_category) {
		this.bridge_category = bridge_category;
	}

	public String getBridge_name() {
		return bridge_name;
	}

	public void setBridge_name(String bridge_name) {
		this.bridge_name = bridge_name;
	}

	public String getBridge_area() {
		return bridge_area;
	}

	public void setBridge_area(String bridge_area) {
		this.bridge_area = bridge_area;
	}

	public String getBridge_height() {
		return bridge_height;
	}

	public void setBridge_height(String bridge_height) {
		this.bridge_height = bridge_height;
	}

	public String getBridge_realheight() {
		return bridge_realheight;
	}

	public void setBridge_realheight(String bridge_realheight) {
		this.bridge_realheight = bridge_realheight;
	}

	public String getBridge_diameter() {
		return bridge_diameter;
	}

	public void setBridge_diameter(String bridge_diameter) {
		this.bridge_diameter = bridge_diameter;
	}

	public String getBridge_textures() {
		return bridge_textures;
	}

	public void setBridge_textures(String bridge_textures) {
		this.bridge_textures = bridge_textures;
	}

	public String getBridge_longs() {
		return bridge_longs;
	}

	public void setBridge_longs(String bridge_longs) {
		this.bridge_longs = bridge_longs;
	}

	public String getBridge_widths() {
		return bridge_widths;
	}

	public void setBridge_widths(String bridge_widths) {
		this.bridge_widths = bridge_widths;
	}

	public String getBridge_weight() {
		return bridge_weight;
	}

	public void setBridge_weight(String bridge_weight) {
		this.bridge_weight = bridge_weight;
	}

	public int getBridge_style() {
		return bridge_style;
	}

	public void setBridge_style(int bridge_style) {
		this.bridge_style = bridge_style;
	}

	public List<BridgeMessage> getMessages() {
		return messages;
	}

	public void setMessages(List<BridgeMessage> messages) {
		this.messages = messages;
	}

}

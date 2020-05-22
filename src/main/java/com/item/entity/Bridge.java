package com.item.entity;

import java.util.List;

/**
 * 桥的实体
 * 
 * @author Administrator
 *
 */
public class Bridge {

	private String id;// ID

	private String category;// 常规模型

	private String name;// 模型名称

	private String area;// 面积

	private String height;// 高度

	private String realheight;// 真是高度

	private String diameter;// 直径

	private String textures;// 纹理

	private String longs;// 长度

	private String widths;// 宽度

	private String weight;// 重量

	private int style;// 状态

	private List<BridgeMessage> messages;// 备注信息

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getHeight() {
		return height;
	}

	public void setHeight(String height) {
		this.height = height;
	}

	public String getRealheight() {
		return realheight;
	}

	public void setRealheight(String realheight) {
		this.realheight = realheight;
	}

	public String getDiameter() {
		return diameter;
	}

	public void setDiameter(String diameter) {
		this.diameter = diameter;
	}

	public String getTextures() {
		return textures;
	}

	public void setTextures(String textures) {
		this.textures = textures;
	}

	public String getLongs() {
		return longs;
	}

	public void setLongs(String longs) {
		this.longs = longs;
	}

	public String getWidths() {
		return widths;
	}

	public void setWidths(String widths) {
		this.widths = widths;
	}

	public String getWeight() {
		return weight;
	}

	public void setWeight(String weight) {
		this.weight = weight;
	}

	public int getStyle() {
		return style;
	}

	public void setStyle(int style) {
		this.style = style;
	}

	public List<BridgeMessage> getMessages() {
		return messages;
	}

	public void setMessages(List<BridgeMessage> messages) {
		this.messages = messages;
	}

}

package com.item.tool;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Utils {

	// 获取当前的时间(年月日，时分)
	public static String getCurrent() {
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");// 设置日期格式
		String currentTime = df.format(new Date());// new Date()为获取当前系统时间
		return currentTime;
	}

	public static String getThreeOldTime() {
		Calendar calendar2 = Calendar.getInstance();
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		calendar2.add(Calendar.DATE, 3);
		String three_days_after = sdf2.format(calendar2.getTime());
		return three_days_after;
	}

	public static void main(String[] args) {
		System.out.println(getThreeOldTime());
	}
}

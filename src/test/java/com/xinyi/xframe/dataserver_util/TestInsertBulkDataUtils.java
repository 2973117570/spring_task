/**
*	Copyright © 1997 - 2015 Xinyi Tech. All Rights Reserved 
*/
package com.xinyi.xframe.dataserver_util;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;

/**
 * 功能说明：
 * 
 * TestInsertBulkDataUtils.java
 * 
 * Original Author: Administrator,2015年12月29日下午7:20:56
 * 
 * Copyright (C)1997-2015 深圳信义科技 All rights reserved.
 */
public class TestInsertBulkDataUtils {
	//批量插入数据记录测试
	public static void main(String[] args) {
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		//String url = "http://localhost:8072/insertBulk";
		//String url = "http://10.235.156.138:8082/insertBulk";
		String url = "http://10.235.156.148:8072/insertBulk";
		List<Map<String,Object>> lists = new ArrayList<Map<String,Object>>();
		Map<String, Object> paramsMap = new IdentityHashMap<String, Object>();
		//鉴权内容
		String accessKey = "JIAYI";
		String accessSecurity = "85919273-96D0-45B8-9005-40DD1BC1C6F1";
		
		//数据库、表名，记录信息
		String databaseName = "XINYIDB";
		String tableName = "VEHICLE";
		for(int i=0;i<5;i++){//6609
		//记录1 信息
		Map<String,Object> paramsMap1 = new IdentityHashMap<String, Object>();
		paramsMap1.put("car_id", "粤B12345");
		paramsMap1.put("xh", "1620715740135");
		paramsMap1.put("passing_time",sdf.format(new Date()));  //日期类型，需要格式化
		paramsMap1.put("create_time", sdf.format(new Date()));	//日期类型，需要格式化
		paramsMap1.put("record_from", 1);
		
		lists.add(paramsMap1);
		}
		
		System.out.println("------------");
		
/*		//记录2 信息
		Map<String,Object> paramsMap2 = new IdentityHashMap<String, Object>();
		paramsMap2.put("car_id", "粤B54321");
		paramsMap2.put("xh", "1620715740137");
		paramsMap2.put("passing_time",sdf.format(new Date()) ); 	//日期类型，需要格式化
		paramsMap2.put("create_time", sdf.format(new Date()));	//日期类型，需要格式化
		paramsMap2.put("record_from", 1);
		lists.add(paramsMap2);*/
		//System.out.println(JSON.toJSONString(lists));
		long s = System.currentTimeMillis();
		String resultJson = InsertBulkDataUtil.insertBulkData(url, accessKey, accessSecurity, databaseName, tableName, lists);
		System.out.println(System.currentTimeMillis()-s);
	    System.out.println("the result is :" + resultJson);
	}
}

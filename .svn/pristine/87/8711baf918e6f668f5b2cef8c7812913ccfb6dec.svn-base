/**
*	Copyright © 1997 - 2016 Xinyi Tech. All Rights Reserved 
*/
package com.xinyi.xframe.test.xcloud;

import java.io.UnsupportedEncodingException;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;

import com.alibaba.fastjson.JSON;
import com.xinyi.xframe.dataserver_util.common.HttpHelper;
import com.xinyi.xframe.dataserver_util.common.ResponseContent;

/**
 * 功能说明：
 * 
 * TestPostLogServerData.java
 * 
 * Original Author: liangliangl.jia,2016年3月24日下午5:42:50
 * 
 * Copyright (C)1997-2016 深圳信义科技 All rights reserved.
 */
public class TestQueryDataServer {
	
	public static void testQueryData() throws UnsupportedEncodingException{
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Map<String, Object> paramsMap = new IdentityHashMap<String, Object>();
		System.out.println("start update data");
		String url =  "http://10.235.156.147:8002/xcloud/query";
		String storeName ="dbmycat1";
		String sql =" SELECT INCNO,CREATIONTIME,ALARMER,ALARMTIME from 110JQ110 "
				+ "where ALARMER =? and ALARMTIME >=? and ALARMTIME <=?";
        
		Map<String,Object> map = new HashMap<String, Object>();
		map.put("1", "一先生");
		map.put("2", "2016-06-30 12:00:00");
		map.put("3", "2016-07-01 12:00:00");
		
		paramsMap.put("accessUser", "XINYI");
		paramsMap.put("accessKey", "1A9AD595-B415-4529-A41C-4E5C2071430C");
		paramsMap.put("storeName", storeName);
		paramsMap.put("sql", sql);
		paramsMap.put("sqlParam", JSON.toJSONString(map));
		
		paramsMap.put("pageIndex", 1);
		paramsMap.put("pageSize", 10);
		
		ResponseContent ret=null;
		try {
			ret = HttpHelper.postEntity(url, paramsMap);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(ret.getContent().toString());
	}
	
	public static void testCountData() throws UnsupportedEncodingException{
		Map<String, Object> paramsMap = new IdentityHashMap<String, Object>();
		System.out.println("start count data");
		String url =  "http://10.235.156.179:8072/execute/countQuery";
		String storeName ="dbmycat1";
		String sql ="SELECT COUNT(1) from JZ_ASJ_B_ASJ_JQ t1 ";
		
		paramsMap.put("storeName", storeName);
		paramsMap.put("sql", sql);
		
		ResponseContent ret=null;
		try {
			ret = HttpHelper.postEntity(url, paramsMap);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(ret.getContent().toString());
	}
	
	
	public static List<Map> testSelectData(int index,int pageSize) throws UnsupportedEncodingException{
		int start = index * pageSize ;
		int end = pageSize;
		Map<String, Object> paramsMap = new IdentityHashMap<String, Object>();
		System.out.println("start select data");
		String url =  "http://10.235.156.179:8072/execute/selectQuery";
		String storeName ="dbmycat1";
		String sql ="select t1.ajbh,t1.fadd,t1.px,t1.py,t1.xyflag from JZ_ASJ_B_ASJ_JQ t1  order by t1.ajbh asc limit "+start+","+end;
		
		paramsMap.put("storeName", storeName);
		paramsMap.put("sql", sql);
		
		ResponseContent ret=null;
		try {
			ret = HttpHelper.postEntity(url, paramsMap);
		} catch (Exception e) {
			e.printStackTrace();
		}
		List<Map> list = JSON.parseArray(ret.getContent().toString(), Map.class);
		System.out.println(list.toString());
		return list;
	}

	public static void main(String[] args) throws UnsupportedEncodingException {
		testQueryData();
		 //testCountData();
		// testSelectData(0,10);
	}
}

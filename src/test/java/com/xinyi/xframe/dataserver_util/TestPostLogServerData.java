/**
*	Copyright © 1997 - 2016 Xinyi Tech. All Rights Reserved 
*/
package com.xinyi.xframe.dataserver_util;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
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
public class TestPostLogServerData {
	
	public static void testPutLogData() throws UnsupportedEncodingException{
		Map<String, Object> paramsMap = new IdentityHashMap<String, Object>();

		String url =  "http://10.235.156.180:8090/log/put";
		
		String tableName = "user_operate";
		String columnNames ="type;operation;user_id;user_name;record_from;remark;xdata_rksj;user_ip";
		String record_from ="8888";
		Map<String,Object> record = new HashMap<String, Object>();
		record.put("type", "01");
		record.put("operation", "{\"from\" : 0,\"size\" : 10,\"query\" : {\"bool\" : {\"must\" : {  \"wildcard\" : {\"car_id\" : {\"wildcard\" : \"粤B11122\"}} }}}}");
		record.put("user_id", "8896000110");
		record.put("user_name", "贾亮亮");
		record.put("user_ip", "10.42.62.140");
		
		record.put("record_from", "xdata_server_provider");
		record.put("remark", "query for data");
		record.put("xdata_rksj", "2016-03-21 15:48:23");
		
		List<Map<String, Object>> records = new ArrayList<Map<String,Object>>();
		records.add(record);
		paramsMap.put("tableName", tableName);
		paramsMap.put("columnNames", columnNames);
		paramsMap.put("record_from_id", record_from);
		paramsMap.put("records", JSON.toJSONString(records));
		
		ResponseContent ret=null;
		try {
			ret = HttpHelper.postEntity(url, paramsMap);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(ret.getContent().toString());
	}

	public static void main(String[] args) throws UnsupportedEncodingException {
		testPutLogData();
	}
}

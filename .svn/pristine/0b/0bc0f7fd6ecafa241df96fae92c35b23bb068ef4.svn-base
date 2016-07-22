/**
*	Copyright © 1997 - 2016 Xinyi Tech. All Rights Reserved 
*/
package com.xinyi.xframe.dataserver_util;

import java.io.UnsupportedEncodingException;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.alibaba.fastjson.JSON;
import com.xinyi.xframe.dataserver_util.common.HttpHelper;
import com.xinyi.xframe.dataserver_util.common.LoggerConstant;
import com.xinyi.xframe.dataserver_util.common.ResponseContent;
import com.xinyi.xframe.dataserver_util.mode.TBData;

/**
 * 功能说明：
 * 
 * TestGetLogInfoDataUtil.java
 * 
 * Original Author: liangliangl.jia,2016年3月18日上午8:53:31
 * 
 * Copyright (C)1997-2016 深圳信义科技 All rights reserved.
 */
public class TestGetLogInfoDataUtil {
	
	public static void testQueryByName(){
		Map<String, Object> paramsMap = new IdentityHashMap<String, Object>();

		String url =  "http://10.235.156.180:8090/log/query";
		paramsMap.put("tableName", "user_operate");
		paramsMap.put("columnName", "user_name");
		paramsMap.put("queryName", "gaoxi");
		String result=null;
		try {
			ResponseContent ret = HttpHelper.postEntity(url, paramsMap);
			result = ret.getContent();
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(result);
		List<Map> jsonList =JSON.parseArray(result, Map.class);
		for(Map<String,Object> map  :jsonList){
			Set<String> keys = map.keySet();
			for(String key : keys){
				System.out.println( key + "  ： " + map.get(key) );
			}
		}
		
	}
	
	public static void testQueryByUserId(){
		Map<String, Object> paramsMap = new IdentityHashMap<String, Object>();

		String url =  "http://10.235.156.180:8090/log/query";
		paramsMap.put("tableName", "user_operate");
		paramsMap.put("columnName", "user_id");
		paramsMap.put("queryName", "ADMIN_2125520131");
		
		
		String result=null;
		try {
			ResponseContent ret = HttpHelper.postEntity(url, paramsMap);
			result = ret.getContent();
		} catch (Exception e) {
			e.printStackTrace();
		}
		String resultJson  = null;
		resultJson = new String(result.getBytes());
		System.out.println(resultJson);
		List<Map> jsonList =JSON.parseArray(resultJson, Map.class);
		for(Map<String,Object> map  :jsonList){
			Set<String> keys = map.keySet();
			for(String key : keys){
				System.out.println( key + "  : " + map.get(key) );
			}
		}
		
	}
	
	public static void testFilter(){
		Map<String, Object> paramsMap = new IdentityHashMap<String, Object>();

		String url =  "http://10.235.156.180:8090/log/filter";
		paramsMap.put("tableName", "user_operate");
		
		
		Map<String, Object> subParamsMap = new IdentityHashMap<String, Object>();
		//subParamsMap.put(LoggerConstant.LOGGER_PARAM_USER_IP, "172.18.225.56");
		subParamsMap.put(LoggerConstant.LOGGER_PARAM_START_TIME, "2016-05-04 11:45:00");
		subParamsMap.put(LoggerConstant.LOGGER_PARAM_END_TIME, "2016-05-04 18:50:00");
		
		paramsMap.put("paramMap", JSON.toJSONString(subParamsMap));
		
		//paramsMap.put("paramMap", value)
		
		String result=null;
		try {
			ResponseContent ret = HttpHelper.postEntity(url, paramsMap);
			result = ret.getContent();
		} catch (Exception e) {
			e.printStackTrace();
		}
		String resultJson  = null;
		try {
			resultJson = new String(result.getBytes(),"UTF-8");
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		System.out.println(resultJson);
		List<Map> jsonList =JSON.parseArray(resultJson, Map.class);
		for(Map<String,Object> map  :jsonList){
			Set<String> keys = map.keySet();
			for(String key : keys){
				System.out.println( key + "  : " + map.get(key) );
			}
		}
		
	}
	
	public static void testFilterPage(){
		Map<String, Object> paramsMap = new IdentityHashMap<String, Object>();

		String url =  "http://10.235.156.180:8090/log/filter/page";
		paramsMap.put("tableName", "user_operate");
		
		
		Map<String, Object> subParamsMap = new IdentityHashMap<String, Object>();
		subParamsMap.put(LoggerConstant.LOGGER_PARAM_USER_IP, "10.235.156.115");
//		subParamsMap.put(LoggerConstant.LOGGER_PARAM_USER_IP, "172.18.225.56");
//		subParamsMap.put(LoggerConstant.LOGGER_PARAM_START_TIME, "2016-03-01 11:45:00");
//		subParamsMap.put(LoggerConstant.LOGGER_PARAM_END_TIME, "2016-03-30 11:50:00");
		
		paramsMap.put("paramMap", JSON.toJSONString(subParamsMap));
		
		paramsMap.put("currentPage", 5);
		paramsMap.put("pageSize", 5);
		//paramsMap.put("paramMap", value)
		
		String result=null;
		try {
			ResponseContent ret = HttpHelper.postEntity(url, paramsMap);
			result = ret.getContent();
		} catch (Exception e) {
			e.printStackTrace();
		}
		String resultJson  = null;
		try {
			resultJson = new String(result.getBytes(),"UTF-8");
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		System.out.println(resultJson);
		
		TBData tbData =JSON.parseObject(resultJson,TBData.class);
		System.out.println(tbData.getCurrentPage());
		System.out.println(tbData.getPageSize());
		System.out.println(tbData.getTotalCount());
		
		System.out.println(tbData.getTotalPage());
		System.out.println(tbData.getResultList().toString());
		
	}
	
	public static void testGet(){
		Map<String, Object> paramsMap = new IdentityHashMap<String, Object>();
		String url =  "http://10.235.156.180:8090/log/rowkey";
		paramsMap.put("tableName", "user_operate");
		Map<String, Object> subParamsMap = new IdentityHashMap<String, Object>();
		subParamsMap.put("rowKey", "xinfo-systetm-web1458907137338355");
		paramsMap.put("paramMap", JSON.toJSONString(subParamsMap));
		//paramsMap.put("paramMap", value)
		
		String result=null;
		try {
			ResponseContent ret = HttpHelper.postEntity(url, paramsMap);
			result = ret.getContent();
		} catch (Exception e) {
			e.printStackTrace();
		}
		String resultJson  = null;
		try {
			resultJson = new String(result.getBytes(),"UTF-8");
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		System.out.println(resultJson);
		List<Map> jsonList =JSON.parseArray(resultJson, Map.class);
		for(Map<String,Object> map  :jsonList){
			Set<String> keys = map.keySet();
			for(String key : keys){
				System.out.println( key + "  : " + map.get(key) );
			}
		}
		
	}
	//批量插入数据记录测试
		public static void main(String[] args) {
			//testQueryByName();	//根据用户名进行查询
			//testQueryByUserId(); //根据用户ID进行查询
			 testFilter();
			 //testGet();
			//testFilterPage();
		}
}

/**
*	Copyright © 1997 - 2016 Xinyi Tech. All Rights Reserved 
*/
package com.xinyi.xframe.test.update;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
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
public class TestDataSynServer {
	
	public static void testHaikangDataSynData() throws UnsupportedEncodingException{
		Map<String, Object> paramsMap = new IdentityHashMap<String, Object>();
		System.out.println("start update data");
		String url =  "http://10.235.156.179:8072/monitor/haikang";
		List<Object[]> params = new ArrayList<Object[]>();
		ResponseContent ret=null;
		try {
			ret = HttpHelper.postEntity(url, paramsMap);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(ret.getContent().toString());
	}
	
	public static void testGaoqingDataSynData() throws UnsupportedEncodingException{
		Map<String, Object> paramsMap = new IdentityHashMap<String, Object>();
		System.out.println("start update data");
		String url =  "http://10.235.156.179:8072/monitor/gaoqing";
		List<Object[]> params = new ArrayList<Object[]>();
		ResponseContent ret=null;
		try {
			ret = HttpHelper.postEntity(url, paramsMap);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(ret.getContent().toString());
	}
	
	public static void testYtlfDataSynData() throws UnsupportedEncodingException{
		Map<String, Object> paramsMap = new IdentityHashMap<String, Object>();
		System.out.println("start update data");
		String url =  "http://10.235.156.179:8072/monitor/ytlf";
		List<Object[]> params = new ArrayList<Object[]>();
		ResponseContent ret=null;
		try {
			ret = HttpHelper.postEntity(url, paramsMap);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(ret.getContent().toString());
	}
	
	public static void testJiayiDataSynData() throws UnsupportedEncodingException{
		Map<String, Object> paramsMap = new IdentityHashMap<String, Object>();
		System.out.println("start update data");
		String url =  "http://10.235.156.179:8072/monitor/jiayi";
		List<Object[]> params = new ArrayList<Object[]>();
		ResponseContent ret=null;
		try {
			ret = HttpHelper.postEntity(url, paramsMap);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(ret.getContent().toString());
	}
	


	public static void main(String[] args) throws UnsupportedEncodingException {
//		testHaikangDataSynData();
//		testGaoqingDataSynData();
//		testYtlfDataSynData();
//		 testJiayiDataSynData(); 
		ResponseContent ret = HttpHelper
				.getUrlRespContent("http://10.235.156.226:8084/cad/pub/dataList/2015-04-01 00:00:00/2015-04-01 23:59:59/2");
		System.out.println(ret.getContent().toString());
	}
}

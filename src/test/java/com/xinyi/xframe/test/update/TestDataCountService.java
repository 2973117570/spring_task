/**
*	Copyright © 1997 - 2016 Xinyi Tech. All Rights Reserved 
*/
package com.xinyi.xframe.test.update;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;

import com.xinyi.xframe.dataserver_util.common.HttpHelper;
import com.xinyi.xframe.dataserver_util.common.ResponseContent;

/**
 * 功能说明：
 * 
 * TestDataCountService.java
 * 
 * Original Author: liangliangl.jia-贾亮亮,2016年4月7日下午7:19:52
 * 
 * Copyright (C)1997-2016 深圳信义科技 All rights reserved.
 */
public class TestDataCountService {
	public static void testYesCountAndCountData() throws UnsupportedEncodingException{
		Map<String, Object> paramsMap = new IdentityHashMap<String, Object>();
		System.out.println("start update data");
		String url =  "http://10.235.156.179:8072/yesCountAndCount/datainfo";
		List<Object[]> params = new ArrayList<Object[]>();
		ResponseContent ret=null;
		try {
			ret = HttpHelper.postEntity(url, paramsMap);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(ret.getContent().toString());
	}
	
	
	public static void testYtlfTodayData() throws UnsupportedEncodingException{
		Map<String, Object> paramsMap = new IdentityHashMap<String, Object>();
		System.out.println("start update data");
		String url =  "http://10.235.156.179:8072/now_Count/YUNTIANLIFEIDB/YTLF_T_FACE_INFO_C";
		List<Object[]> params = new ArrayList<Object[]>();
		ResponseContent ret=null;
		try {
			ret = HttpHelper.postEntity(url, paramsMap);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(ret.getContent().toString());
	}
	
	public static void testKakouTodayData() throws UnsupportedEncodingException{
		Map<String, Object> paramsMap = new IdentityHashMap<String, Object>();
		System.out.println("start update data");
		String url =  "http://10.235.156.179:8072/now_Count/HAIKANGDB/HK_BMS_VEHICLE_PASS-KAKOU";
		List<Object[]> params = new ArrayList<Object[]>();
		ResponseContent ret=null;
		try {
			ret = HttpHelper.postEntity(url, paramsMap);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(ret.getContent().toString());
	}
	
	public static void testStationTodayData() throws UnsupportedEncodingException{
		Map<String, Object> paramsMap = new IdentityHashMap<String, Object>();
		System.out.println("start update data");
		String url =  "http://10.235.156.179:8072/now_Count/HAIKANGDB/HK_BMS_VEHICLE_PASS-STATION";
		List<Object[]> params = new ArrayList<Object[]>();
		ResponseContent ret=null;
		try {
			ret = HttpHelper.postEntity(url, paramsMap);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(ret.getContent().toString());
	}
	
	public static void testWifiTodayData() throws UnsupportedEncodingException{
		Map<String, Object> paramsMap = new IdentityHashMap<String, Object>();
		System.out.println("start update data");
		String url =  "http://10.235.156.179:8072/now_Count/JIAYIDB/JY_WIFI_AP_ENTER";
		List<Object[]> params = new ArrayList<Object[]>();
		ResponseContent ret=null;
		try {
			ret = HttpHelper.postEntity(url, paramsMap);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(ret.getContent().toString());
	}
	
	public static void testGaoqingTodayData() throws UnsupportedEncodingException{
		Map<String, Object> paramsMap = new IdentityHashMap<String, Object>();
		System.out.println("start update data");
		String url =  "http://10.235.156.179:8072/now_Count/XINYIDB/XY_VEHICLE_PASS";
		List<Object[]> params = new ArrayList<Object[]>();
		ResponseContent ret=null;
		try {
			ret = HttpHelper.postEntity(url, paramsMap);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(ret.getContent().toString());
	}
	
	public static void main(String[] args) {
		try {
			testYesCountAndCountData();  //数据总量
			testYtlfTodayData();           //人脸今日增量
			testKakouTodayData();			//卡口今日增量
			testStationTodayData();			//油站今日增量
			testGaoqingTodayData();			//高清今日增量
			testWifiTodayData();			//wifi今日增量
			
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

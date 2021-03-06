/**
 *	Copyright © 1997 - 2015 Xinyi Tech. All Rights Reserved 
 */
package com.xinyi.xframe.dataserver_util;

import java.io.UnsupportedEncodingException;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.HttpStatus;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.mime.HttpMultipartMode;
import org.apache.http.entity.mime.MultipartEntityBuilder;
import org.apache.http.entity.mime.content.StringBody;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.CharsetUtils;
import org.apache.http.util.EntityUtils;

import com.alibaba.fastjson.JSON;
import com.xinyi.xframe.dataserver_util.common.Constant;
import com.xinyi.xframe.dataserver_util.common.HttpHelper;
import com.xinyi.xframe.dataserver_util.common.ResponseContent;

/**
 * 功能说明：批量插入数据功能实现类
 * 
 * InsertBulkDataUtil.java
 * 
 * Original Author: Administrator,2015年12月29日下午6:43:34
 * 
 * Copyright (C)1997-2015 深圳信义科技 All rights reserved.
 */
public class InsertBulkDataUtil {
	
	@SuppressWarnings("deprecation")
	public static final  HttpClient httpclient = new DefaultHttpClient();
	
	/**
	 * 批量插入数据信息，为封装，不推荐使用
	 * @param postURL
	 * @param accessKey
	 * @param accessSecurity
	 * @param databaseName
	 * @param tableName
	 * @param paramMaps
	 * @return
	 */
	@Deprecated
	public static int insertBulkDatas(String postURL, String accessKey, String accessSecurity,
			String databaseName, String tableName, List<Map<String,Object>> paramMaps) {
		int resultInt = 0;
		HttpPost httppost = new HttpPost(postURL);
		MultipartEntityBuilder entityBuilder = MultipartEntityBuilder.create();
		entityBuilder.setMode(HttpMultipartMode.BROWSER_COMPATIBLE);
		
		//传入用户名和密码信息
		entityBuilder.addPart(Constant.DATA_SERVER_POST_ACCESS_KEY, 
				new StringBody(accessKey, ContentType.create(Constant.CONTENT_TYPE_TEXT_PLAIN, Constant.CONTENT_TYPE_TEXT_CHARSET)));
		entityBuilder.addPart(Constant.DATA_SERVER_POST_ACCESS_SECURITY,
				new StringBody(accessSecurity, ContentType.create(Constant.CONTENT_TYPE_TEXT_PLAIN, Constant.CONTENT_TYPE_TEXT_CHARSET)));
		
		//传入数据库、表名称、数据信息到数据库	
		entityBuilder.addPart(Constant.DATA_SERVER_POST_DATABASE_NAME,
				new StringBody(databaseName, ContentType.create(Constant.CONTENT_TYPE_TEXT_PLAIN, Constant.CONTENT_TYPE_TEXT_CHARSET)));
	
		entityBuilder.addPart(Constant.DATA_SERVER_POST_TABLE_NAME,
					new StringBody(tableName, ContentType.create(Constant.CONTENT_TYPE_TEXT_PLAIN, Constant.CONTENT_TYPE_TEXT_CHARSET)));
		
		entityBuilder.addPart(Constant.DATA_SERVER_POST_PARAMS_JSON,
				new StringBody(JSON.toJSONString(paramMaps),ContentType.create(Constant.CONTENT_TYPE_TEXT_PLAIN, Constant.CONTENT_TYPE_TEXT_CHARSET)));

		try {
			entityBuilder.setCharset(CharsetUtils.get(Constant.CONTENT_TYPE_TEXT_CHARSET));
			httppost.setEntity(entityBuilder.build());
			//执行数据上传操作
			HttpResponse response = httpclient.execute(httppost);
			int statusCode = response.getStatusLine().getStatusCode();
			if (statusCode == HttpStatus.SC_OK) {
				HttpEntity resEntity = response.getEntity();
				resultInt = Integer.parseInt(resEntity.getContent().toString());
				EntityUtils.consume(resEntity);
			}
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		} catch (Exception e){
			e.printStackTrace();
		}
		return resultInt;
	}
	
	/**
	 * 批量插入数据记录信息，已封装 推荐使用
	 * @param postURL
	 * @param accessKey
	 * @param accessSecurity
	 * @param databaseName
	 * @param tableName
	 * @param paramMaps
	 * @return
	 */
	public static String insertBulkData(String postURL, String accessKey, String accessSecurity,
			String databaseName, String tableName, List<Map<String,Object>> paramMaps) {
		String url = postURL;
		Map<String, Object> paramsMap = new IdentityHashMap<String, Object>();
		
		//用户名和密码验证
		paramsMap.put(Constant.DATA_SERVER_POST_ACCESS_KEY, accessKey);
		paramsMap.put(Constant.DATA_SERVER_POST_ACCESS_SECURITY, accessSecurity);
		
		//将需要传递的数据信息到Map对象中
		paramsMap.put(Constant.DATA_SERVER_POST_DATABASE_NAME, databaseName);
		paramsMap.put(Constant.DATA_SERVER_POST_TABLE_NAME, tableName);
		paramsMap.put(Constant.DATA_SERVER_POST_PARAMS_JSON,JSON.toJSONString(paramMaps));
		
		
		String result=null;
		try {
			ResponseContent ret = HttpHelper.postEntity(url, paramsMap);
			result = ret.getContent();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}
}

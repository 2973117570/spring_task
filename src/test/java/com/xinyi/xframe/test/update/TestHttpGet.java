/**
*	Copyright © 1997 - 2016 Xinyi Tech. All Rights Reserved 
*/
package com.xinyi.xframe.test.update;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import java.util.Map;

/**
 * 功能说明：发送HTTP的GET请求和POST请求
 * 
 * TestHttpGet.java
 * 
 * Original Author: liangliangl.jia-贾亮亮,2016年4月22日上午7:46:09
 * 
 * Copyright (C)1997-2016 深圳信义科技 All rights reserved.
 */
public class TestHttpGet {

	
	/**
	 * @param URLConnection
	 * 设置通用的请求属性
	 **/
	private static URLConnection addConnProperty(URLConnection conn){
		
		conn.setRequestProperty("accept", "*/*");
		conn.setRequestProperty("connection", "Keep-Alive");
		conn.setRequestProperty("user-agent", "Mozilla/4.0 (compatible; MSIE 6.0; Window NT 5.1;SV1)");
		return conn;
	}
	/**
	 * 向指定URL发送GET方法的请求
	 * 
	 * @param url
	 * 			发送请求的URL
	 * @param params
	 * 			请求参数，请求参数应该是 name1=value1&name2=value2的形势
	 * @return URL 
	 * 			所代表远资源的响应结果
	 **/
	public static String sendHttpGET(String url,String params){
		String result = "";
		BufferedReader in = null;
		try {
			String urlNameString = url ;
			URL realURL =new URL(urlNameString);
			//打开和URL之间的连接
			URLConnection connection = realURL.openConnection();
			//设置通用的请求属性
			addConnProperty(connection);
			
			//建立实际的连接
			connection.connect();
			//获取所有响应头字段
			Map<String, List<String>> map = connection.getHeaderFields();
			//遍历所有的响应头字段
			for(String key : map.keySet()){
				System.out.println(key + "---->" + map.get(key));
			}
			//定义 BufferReader 输入流来读取URL的响应
			in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
			
			String line;
			while((line = in.readLine()) != null){
				result += line;
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("发送GET请求异常！" + e.getMessage());
			e.printStackTrace();
		} finally{	//使用finally 块来关闭输入流
			try {
				if(in != null){
					in.close();
				}
			} catch (Exception e2) {
				// TODO: handle exception
				e2.printStackTrace();
			}
		}
		return result;
	}
	
	/**
	 * 向指定 URL 发送POST方法的请求
	 * @param url
	 * 			发送请求的URL
	 * @param params
	 * 			请求参数，请求参数应该是 name1=value1&name2=value2
	 * @return 所代表远程资源的响应结果
	 * */
	public static String sendHttpPOST(String url,String params){
		PrintWriter out = null;
		BufferedReader in = null;
		String result = "";
		try {
			URL realURL = new URL(url);
			//打开和URL之间的连接
			URLConnection conn = realURL.openConnection();
			//设置通用的请求属性
			addConnProperty(conn);
			//发送POST请求必须设置如下两行
			conn.setDoOutput(true);
			conn.setDoInput(true);
			//获取URLConnection对象对应的输出流
			out = new PrintWriter(conn.getOutputStream());
			//发送请求参数
			out.print(params);
			out.flush();
			//定义BufferedReader数据流来读取URL的响应
			in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
			String line;
			while((line = in.readLine()) != null){
				result += line;
			}
		} catch (Exception e) {
			System.out.println("发送POST请求异常！" + e.getMessage());
			e.printStackTrace();
		} finally{  //使用finally 块来关闭数据流和数据流
			try {
				if(out != null){
					out.close();
				}
				if(in != null){
					in.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		return result;
	}
	
	public static void main(String[] args) {
		//reload red User info
		String getResult = sendHttpGET("http://10.235.156.181:8084/main/status",null);
		System.out.println(getResult);
//		String postResult = sendHttpPOST("http://10.235.156.181:8084/main/reloadRed",null);
//		System.out.println(postResult);

	}
}

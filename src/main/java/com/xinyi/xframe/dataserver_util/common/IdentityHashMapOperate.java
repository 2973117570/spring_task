/**
 *	Copyright © 1997 - 2015 Xinyi Tech. All Rights Reserved 
 */
package com.xinyi.xframe.dataserver_util.common;

import java.util.ArrayList;
import java.util.IdentityHashMap;

/**
 * 功能说明：对IdentityHashMap 进行处理，对重复的key ，进行排序操作。
 * 
 * IdentityHashMapOperate.java
 * 
 * Original Author: liangliang.jia,2015年9月23日下午2:50:14
 * 
 * Copyright (C)1997-2015 深圳信义科技 All rights reserved.
 */
public class IdentityHashMapOperate {

	public static String[] zimu = { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t",
			"u", "v", "w", "x", "y", "z", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S",
			"T", "U", "V", "W", "X", "Y", "Z", "aa", "bb", "cc", "dd", "ee", "ff", "gg", "hh", "ii", "jj", "kk", "ll", "mm", "nn", "oo",
			"pp", "qq", "rr", "ss", "tt", "uu", "vv", "ww", "xx", "yy", "zz", "AA", "BB", "CC", "DD", "EE", "FF", "GG", "HH", "II", "JJ",
			"KK", "LL", "MM", "NN", "OO", "PP", "QQ", "RR", "SS", "TT", "UU", "VV", "WW", "XX", "YY", "ZZ" };

	public static IdentityHashMap<String, Object> addValue(IdentityHashMap<String, Object> map, String key, Object value) {
		if (map.get("sort") == null)// 没有顺序控制key
		{
			map.put("sort", key);// 直接增加顺序控制key
			map.put(key, value);
		} else {
			String sort = map.get("sort").toString();// 取出顺序控制key
			sort += "^" + key;// 需要控制顺序的key
			map.put("sort", sort);// 回写到map
			map.put(key, value);
		}

		return map;
	}

	@SuppressWarnings("unchecked")
	public static ArrayList<IdentityHashMap<String, Object>> getValues(IdentityHashMap<String, Object> map) {
		String sort = map.get("sort").toString();
		ArrayList<IdentityHashMap<String, Object>> values = new ArrayList<IdentityHashMap<String, Object>>();

		if (sort != null) {
			String[] sortKeys = sort.split("\\^");

			for (int i = 0; i < sortKeys.length; i++) {
				String key = sortKeys[i];
				Object value = map.get(key.intern());
				values.add((IdentityHashMap<String, Object>) value);
			}
		}
		return values;
	}
	
}

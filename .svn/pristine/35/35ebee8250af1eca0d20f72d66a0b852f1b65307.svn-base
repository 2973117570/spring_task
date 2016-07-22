/*
 * Copyright 2014-2015 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.shengkai.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.xinyi.xframe.dataserver_util.common;

import java.io.UnsupportedEncodingException;

/**
 * 功能说明：
 * 
 * ResponseContent.java
 * 
 * Original Author: liangliang.jia,2015年9月14日下午8:18:51
 * 
 * Copyright (C)1997-2015 深圳信义科技 All rights reserved.
 */

public class ResponseContent {

	private String encoding;

	private byte[] contentBytes;

	private int statusCode;

	private String contentType;

	private String contentTypeString;

	public String getEncoding() {
		return encoding;
	}

	public void setEncoding(String encoding) {
		this.encoding = encoding;
	}

	public String getContentType() {
		return this.contentType;
	}

	public void setContentType(String contentType) {
		this.contentType = contentType;
	}

	public String getContentTypeString() {
		return this.contentTypeString;
	}

	public void setContentTypeString(String contenttypeString) {
		this.contentTypeString = contenttypeString;
	}

	public String getContent() throws UnsupportedEncodingException {
		return this.getContent(this.encoding);
	}

	public String getContent(String encoding) throws UnsupportedEncodingException {
		if (encoding == null) {
			return new String(contentBytes);
		}
		return new String(contentBytes, encoding);
	}

	public String getUTFContent() throws UnsupportedEncodingException {
		return this.getContent("UTF-8");
	}

	public byte[] getContentBytes() {
		return contentBytes;
	}

	public void setContentBytes(byte[] contentBytes) {
		this.contentBytes = contentBytes;
	}

	public int getStatusCode() {
		return statusCode;
	}

	public void setStatusCode(int statusCode) {
		this.statusCode = statusCode;
	}

}

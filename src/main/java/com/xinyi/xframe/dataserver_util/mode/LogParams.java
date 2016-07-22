package com.xinyi.xframe.dataserver_util.mode;

import java.io.Serializable;
import java.util.Date;

/**
 * 功能说明：LogParams 日志的model类
 * 
 * LogParams.java
 * 
 * Original Author: liangliangl.jia,2016年3月23日下午2:15:52
 * 
 * Copyright (C)1997-2016 深圳信义科技 All rights reserved.
 */
public class LogParams implements Serializable {

	/**
	 * 序列化
	 */
	private static final long serialVersionUID = 1L;

	private String rowkey;

	private String type;

	private String operation;

	private String user_id;

	private String user_name;

	private String record_from;

	private String remark;

	private Date startDate;
	
	private Date endDate;

	/**
	 * @return the rowkey
	 */
	public String getRowkey() {
		return rowkey;
	}

	/**
	 * @param rowkey the rowkey to set
	 */
	public void setRowkey(String rowkey) {
		this.rowkey = rowkey;
	}

	/**
	 * @return the type
	 */
	public String getType() {
		return type;
	}

	/**
	 * @param type
	 *            the type to set
	 */
	public void setType(String type) {
		this.type = type;
	}

	/**
	 * @return the operation
	 */
	public String getOperation() {
		return operation;
	}

	/**
	 * @param operation
	 *            the operation to set
	 */
	public void setOperation(String operation) {
		this.operation = operation;
	}

	/**
	 * @return the user_id
	 */
	public String getUser_id() {
		return user_id;
	}

	/**
	 * @param user_id
	 *            the user_id to set
	 */
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}

	/**
	 * @return the user_name
	 */
	public String getUser_name() {
		return user_name;
	}

	/**
	 * @param user_name
	 *            the user_name to set
	 */
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}

	/**
	 * @return the record_from
	 */
	public String getRecord_from() {
		return record_from;
	}

	/**
	 * @param record_from
	 *            the record_from to set
	 */
	public void setRecord_from(String record_from) {
		this.record_from = record_from;
	}

	/**
	 * @return the remark
	 */
	public String getRemark() {
		return remark;
	}

	/**
	 * @param remark
	 *            the remark to set
	 */
	public void setRemark(String remark) {
		this.remark = remark;
	}

	/**
	 * @return the startDate
	 */
	public Date getStartDate() {
		return startDate;
	}

	/**
	 * @param startDate the startDate to set
	 */
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	/**
	 * @return the endDate
	 */
	public Date getEndDate() {
		return endDate;
	}

	/**
	 * @param endDate the endDate to set
	 */
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

}

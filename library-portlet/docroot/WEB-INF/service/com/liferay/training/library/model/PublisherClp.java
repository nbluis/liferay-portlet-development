/**
 * Copyright (c) 2000-2011 Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.training.library.model;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.impl.BaseModelImpl;

import java.io.Serializable;

import java.lang.reflect.Proxy;

/**
 * @author Eduardo Bohrer
 */
public class PublisherClp extends BaseModelImpl<Publisher> implements Publisher {
	public PublisherClp() {
	}

	public long getPrimaryKey() {
		return _publisherId;
	}

	public void setPrimaryKey(long pk) {
		setPublisherId(pk);
	}

	public Serializable getPrimaryKeyObj() {
		return new Long(_publisherId);
	}

	public long getPublisherId() {
		return _publisherId;
	}

	public void setPublisherId(long publisherId) {
		_publisherId = publisherId;
	}

	public long getCompanyId() {
		return _companyId;
	}

	public void setCompanyId(long companyId) {
		_companyId = companyId;
	}

	public long getGroupId() {
		return _groupId;
	}

	public void setGroupId(long groupId) {
		_groupId = groupId;
	}

	public String getName() {
		return _name;
	}

	public void setName(String name) {
		_name = name;
	}

	public String getEmailAddress() {
		return _emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		_emailAddress = emailAddress;
	}

	public String getWebsite() {
		return _website;
	}

	public void setWebsite(String website) {
		_website = website;
	}

	public String getPhoneNumber() {
		return _phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		_phoneNumber = phoneNumber;
	}

	public Publisher toEscapedModel() {
		if (isEscapedModel()) {
			return this;
		}
		else {
			return (Publisher)Proxy.newProxyInstance(Publisher.class.getClassLoader(),
				new Class[] { Publisher.class }, new AutoEscapeBeanHandler(this));
		}
	}

	public Object clone() {
		PublisherClp clone = new PublisherClp();

		clone.setPublisherId(getPublisherId());
		clone.setCompanyId(getCompanyId());
		clone.setGroupId(getGroupId());
		clone.setName(getName());
		clone.setEmailAddress(getEmailAddress());
		clone.setWebsite(getWebsite());
		clone.setPhoneNumber(getPhoneNumber());

		return clone;
	}

	public int compareTo(Publisher publisher) {
		int value = 0;

		value = getName().compareTo(publisher.getName());

		if (value != 0) {
			return value;
		}

		return 0;
	}

	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}

		PublisherClp publisher = null;

		try {
			publisher = (PublisherClp)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		long pk = publisher.getPrimaryKey();

		if (getPrimaryKey() == pk) {
			return true;
		}
		else {
			return false;
		}
	}

	public int hashCode() {
		return (int)getPrimaryKey();
	}

	public String toString() {
		StringBundler sb = new StringBundler(15);

		sb.append("{publisherId=");
		sb.append(getPublisherId());
		sb.append(", companyId=");
		sb.append(getCompanyId());
		sb.append(", groupId=");
		sb.append(getGroupId());
		sb.append(", name=");
		sb.append(getName());
		sb.append(", emailAddress=");
		sb.append(getEmailAddress());
		sb.append(", website=");
		sb.append(getWebsite());
		sb.append(", phoneNumber=");
		sb.append(getPhoneNumber());
		sb.append("}");

		return sb.toString();
	}

	public String toXmlString() {
		StringBundler sb = new StringBundler(25);

		sb.append("<model><model-name>");
		sb.append("com.liferay.training.library.model.Publisher");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>publisherId</column-name><column-value><![CDATA[");
		sb.append(getPublisherId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>companyId</column-name><column-value><![CDATA[");
		sb.append(getCompanyId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>groupId</column-name><column-value><![CDATA[");
		sb.append(getGroupId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>name</column-name><column-value><![CDATA[");
		sb.append(getName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>emailAddress</column-name><column-value><![CDATA[");
		sb.append(getEmailAddress());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>website</column-name><column-value><![CDATA[");
		sb.append(getWebsite());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>phoneNumber</column-name><column-value><![CDATA[");
		sb.append(getPhoneNumber());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _publisherId;
	private long _companyId;
	private long _groupId;
	private String _name;
	private String _emailAddress;
	private String _website;
	private String _phoneNumber;
}
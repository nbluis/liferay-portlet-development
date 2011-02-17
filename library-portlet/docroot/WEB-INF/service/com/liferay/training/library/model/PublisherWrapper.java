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

/**
 * <p>
 * This class is a wrapper for {@link Publisher}.
 * </p>
 *
 * @author    Eduardo Bohrer
 * @see       Publisher
 * @generated
 */
public class PublisherWrapper implements Publisher {
	public PublisherWrapper(Publisher publisher) {
		_publisher = publisher;
	}

	/**
	* Gets the primary key of this publisher.
	*
	* @return the primary key of this publisher
	*/
	public long getPrimaryKey() {
		return _publisher.getPrimaryKey();
	}

	/**
	* Sets the primary key of this publisher
	*
	* @param pk the primary key of this publisher
	*/
	public void setPrimaryKey(long pk) {
		_publisher.setPrimaryKey(pk);
	}

	/**
	* Gets the publisher id of this publisher.
	*
	* @return the publisher id of this publisher
	*/
	public long getPublisherId() {
		return _publisher.getPublisherId();
	}

	/**
	* Sets the publisher id of this publisher.
	*
	* @param publisherId the publisher id of this publisher
	*/
	public void setPublisherId(long publisherId) {
		_publisher.setPublisherId(publisherId);
	}

	/**
	* Gets the company id of this publisher.
	*
	* @return the company id of this publisher
	*/
	public long getCompanyId() {
		return _publisher.getCompanyId();
	}

	/**
	* Sets the company id of this publisher.
	*
	* @param companyId the company id of this publisher
	*/
	public void setCompanyId(long companyId) {
		_publisher.setCompanyId(companyId);
	}

	/**
	* Gets the group id of this publisher.
	*
	* @return the group id of this publisher
	*/
	public long getGroupId() {
		return _publisher.getGroupId();
	}

	/**
	* Sets the group id of this publisher.
	*
	* @param groupId the group id of this publisher
	*/
	public void setGroupId(long groupId) {
		_publisher.setGroupId(groupId);
	}

	/**
	* Gets the name of this publisher.
	*
	* @return the name of this publisher
	*/
	public java.lang.String getName() {
		return _publisher.getName();
	}

	/**
	* Sets the name of this publisher.
	*
	* @param name the name of this publisher
	*/
	public void setName(java.lang.String name) {
		_publisher.setName(name);
	}

	/**
	* Gets the email address of this publisher.
	*
	* @return the email address of this publisher
	*/
	public java.lang.String getEmailAddress() {
		return _publisher.getEmailAddress();
	}

	/**
	* Sets the email address of this publisher.
	*
	* @param emailAddress the email address of this publisher
	*/
	public void setEmailAddress(java.lang.String emailAddress) {
		_publisher.setEmailAddress(emailAddress);
	}

	/**
	* Gets the website of this publisher.
	*
	* @return the website of this publisher
	*/
	public java.lang.String getWebsite() {
		return _publisher.getWebsite();
	}

	/**
	* Sets the website of this publisher.
	*
	* @param website the website of this publisher
	*/
	public void setWebsite(java.lang.String website) {
		_publisher.setWebsite(website);
	}

	/**
	* Gets the phone number of this publisher.
	*
	* @return the phone number of this publisher
	*/
	public java.lang.String getPhoneNumber() {
		return _publisher.getPhoneNumber();
	}

	/**
	* Sets the phone number of this publisher.
	*
	* @param phoneNumber the phone number of this publisher
	*/
	public void setPhoneNumber(java.lang.String phoneNumber) {
		_publisher.setPhoneNumber(phoneNumber);
	}

	public boolean isNew() {
		return _publisher.isNew();
	}

	public void setNew(boolean n) {
		_publisher.setNew(n);
	}

	public boolean isCachedModel() {
		return _publisher.isCachedModel();
	}

	public void setCachedModel(boolean cachedModel) {
		_publisher.setCachedModel(cachedModel);
	}

	public boolean isEscapedModel() {
		return _publisher.isEscapedModel();
	}

	public void setEscapedModel(boolean escapedModel) {
		_publisher.setEscapedModel(escapedModel);
	}

	public java.io.Serializable getPrimaryKeyObj() {
		return _publisher.getPrimaryKeyObj();
	}

	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _publisher.getExpandoBridge();
	}

	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_publisher.setExpandoBridgeAttributes(serviceContext);
	}

	public java.lang.Object clone() {
		return new PublisherWrapper((Publisher)_publisher.clone());
	}

	public int compareTo(com.liferay.training.library.model.Publisher publisher) {
		return _publisher.compareTo(publisher);
	}

	public int hashCode() {
		return _publisher.hashCode();
	}

	public com.liferay.training.library.model.Publisher toEscapedModel() {
		return new PublisherWrapper(_publisher.toEscapedModel());
	}

	public java.lang.String toString() {
		return _publisher.toString();
	}

	public java.lang.String toXmlString() {
		return _publisher.toXmlString();
	}

	public Publisher getWrappedPublisher() {
		return _publisher;
	}

	private Publisher _publisher;
}
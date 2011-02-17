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

package com.liferay.training.library.service.impl;

import com.liferay.counter.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.model.ResourceConstants;
import com.liferay.training.library.model.Publisher;
import com.liferay.training.library.service.base.PublisherLocalServiceBaseImpl;

import java.util.List;

/**
 * The implementation of the publisher local service.
 * 
 * <p>
 * All custom service methods should be put in this class. Whenever methods are
 * added, rerun ServiceBuilder to copy their definitions into the
 * {@link com.liferay.training.library.service.PublisherLocalService} interface.
 * 
 * <p>
 * This is a local service. Methods of this service will not have security
 * checks based on the propagated JAAS credentials because this service can only
 * be accessed from within the same VM.
 * </p>
 * 
 * @author Eduardo Bohrer
 * @see com.liferay.training.library.service.base.PublisherLocalServiceBaseImpl
 * @see com.liferay.training.library.service.PublisherLocalServiceUtil
 */
public class PublisherLocalServiceImpl extends PublisherLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 * 
	 * Never reference this interface directly. Always use {@link
	 * com.liferay.training.library.service.PublisherLocalServiceUtil} to access
	 * the publisher local service.
	 */

	/**
	 * Adds the Publisher to the database incrementing the primary key
	 * 
	 * @throws PortalException
	 * 
	 */
	public Publisher addPublisher(Publisher newPublisher, long userId) throws SystemException, PortalException {

		long publisherId = CounterLocalServiceUtil.increment(Publisher.class.getName());

		Publisher publisher = publisherPersistence.create(publisherId);
		publisher.setCompanyId(newPublisher.getCompanyId());
		publisher.setEmailAddress(newPublisher.getEmailAddress());
		publisher.setGroupId(newPublisher.getGroupId());
		publisher.setName(newPublisher.getName());
		publisher.setPhoneNumber(newPublisher.getPhoneNumber());
		publisher.setWebsite(newPublisher.getWebsite());

		publisherPersistence.update(publisher, false);

		resourceLocalService.addResources(publisher.getCompanyId(), publisher.getGroupId(), userId, Publisher.class.getName(), publisherId, false, true, true);

		return publisher;
	}

	/**
	 * Deletes a publisher from the database using the Publisher object.
	 */
	public void deletePublisher(Publisher publisher) throws PortalException, SystemException {

		resourceLocalService.deleteResource(publisher.getCompanyId(), Publisher.class.getName(), ResourceConstants.SCOPE_INDIVIDUAL, publisher.getPrimaryKey());

		super.deletePublisher(publisher);
	}

	/**
	 * Deletes a publisher from the database using a publisher ID.
	 */
	public void deletePublisher(long publisherId) throws PortalException, SystemException {

		Publisher publisher = getPublisher(publisherId);

		deletePublisher(publisher);
	}

	/**
	 * Gets a list with all the Publishers in a group
	 * 
	 */
	public List<Publisher> getPublishersByGroupId(long groupId) throws SystemException {
		return publisherPersistence.findByGroupId(groupId);
	}

	/**
	 * Gets a list with a range of Publishers from a group
	 * 
	 */
	public List<Publisher> getPublishersByGroupId(long groupId, int start, int end) throws SystemException {
		return publisherPersistence.findByGroupId(groupId, start, end);
	}

	/**
	 * Gets the number of Publishers in a group
	 * 
	 */
	public int getPublishersCountByGroupId(long groupId) throws SystemException {
		return publisherPersistence.countByGroupId(groupId);
	}
}
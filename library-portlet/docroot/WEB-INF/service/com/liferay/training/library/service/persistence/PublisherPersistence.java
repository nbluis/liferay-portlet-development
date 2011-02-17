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

package com.liferay.training.library.service.persistence;

import com.liferay.portal.service.persistence.BasePersistence;

import com.liferay.training.library.model.Publisher;

/**
 * The persistence interface for the publisher service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Eduardo Bohrer
 * @see PublisherPersistenceImpl
 * @see PublisherUtil
 * @generated
 */
public interface PublisherPersistence extends BasePersistence<Publisher> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link PublisherUtil} to access the publisher persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the publisher in the entity cache if it is enabled.
	*
	* @param publisher the publisher to cache
	*/
	public void cacheResult(
		com.liferay.training.library.model.Publisher publisher);

	/**
	* Caches the publishers in the entity cache if it is enabled.
	*
	* @param publishers the publishers to cache
	*/
	public void cacheResult(
		java.util.List<com.liferay.training.library.model.Publisher> publishers);

	/**
	* Creates a new publisher with the primary key. Does not add the publisher to the database.
	*
	* @param publisherId the primary key for the new publisher
	* @return the new publisher
	*/
	public com.liferay.training.library.model.Publisher create(long publisherId);

	/**
	* Removes the publisher with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param publisherId the primary key of the publisher to remove
	* @return the publisher that was removed
	* @throws com.liferay.training.library.NoSuchPublisherException if a publisher with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.training.library.model.Publisher remove(long publisherId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.liferay.training.library.NoSuchPublisherException;

	public com.liferay.training.library.model.Publisher updateImpl(
		com.liferay.training.library.model.Publisher publisher, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds the publisher with the primary key or throws a {@link com.liferay.training.library.NoSuchPublisherException} if it could not be found.
	*
	* @param publisherId the primary key of the publisher to find
	* @return the publisher
	* @throws com.liferay.training.library.NoSuchPublisherException if a publisher with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.training.library.model.Publisher findByPrimaryKey(
		long publisherId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.liferay.training.library.NoSuchPublisherException;

	/**
	* Finds the publisher with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param publisherId the primary key of the publisher to find
	* @return the publisher, or <code>null</code> if a publisher with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.training.library.model.Publisher fetchByPrimaryKey(
		long publisherId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds all the publishers where groupId = &#63;.
	*
	* @param groupId the group id to search with
	* @return the matching publishers
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.liferay.training.library.model.Publisher> findByGroupId(
		long groupId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds a range of all the publishers where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param groupId the group id to search with
	* @param start the lower bound of the range of publishers to return
	* @param end the upper bound of the range of publishers to return (not inclusive)
	* @return the range of matching publishers
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.liferay.training.library.model.Publisher> findByGroupId(
		long groupId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds an ordered range of all the publishers where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param groupId the group id to search with
	* @param start the lower bound of the range of publishers to return
	* @param end the upper bound of the range of publishers to return (not inclusive)
	* @param orderByComparator the comparator to order the results by
	* @return the ordered range of matching publishers
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.liferay.training.library.model.Publisher> findByGroupId(
		long groupId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds the first publisher in the ordered set where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param groupId the group id to search with
	* @param orderByComparator the comparator to order the set by
	* @return the first matching publisher
	* @throws com.liferay.training.library.NoSuchPublisherException if a matching publisher could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.training.library.model.Publisher findByGroupId_First(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.liferay.training.library.NoSuchPublisherException;

	/**
	* Finds the last publisher in the ordered set where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param groupId the group id to search with
	* @param orderByComparator the comparator to order the set by
	* @return the last matching publisher
	* @throws com.liferay.training.library.NoSuchPublisherException if a matching publisher could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.training.library.model.Publisher findByGroupId_Last(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.liferay.training.library.NoSuchPublisherException;

	/**
	* Finds the publishers before and after the current publisher in the ordered set where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param publisherId the primary key of the current publisher
	* @param groupId the group id to search with
	* @param orderByComparator the comparator to order the set by
	* @return the previous, current, and next publisher
	* @throws com.liferay.training.library.NoSuchPublisherException if a publisher with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.training.library.model.Publisher[] findByGroupId_PrevAndNext(
		long publisherId, long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.liferay.training.library.NoSuchPublisherException;

	/**
	* Filters by the user's permissions and finds all the publishers where groupId = &#63;.
	*
	* @param groupId the group id to search with
	* @return the matching publishers that the user has permission to view
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.liferay.training.library.model.Publisher> filterFindByGroupId(
		long groupId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Filters by the user's permissions and finds a range of all the publishers where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param groupId the group id to search with
	* @param start the lower bound of the range of publishers to return
	* @param end the upper bound of the range of publishers to return (not inclusive)
	* @return the range of matching publishers that the user has permission to view
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.liferay.training.library.model.Publisher> filterFindByGroupId(
		long groupId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Filters by the user's permissions and finds an ordered range of all the publishers where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param groupId the group id to search with
	* @param start the lower bound of the range of publishers to return
	* @param end the upper bound of the range of publishers to return (not inclusive)
	* @param orderByComparator the comparator to order the results by
	* @return the ordered range of matching publishers that the user has permission to view
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.liferay.training.library.model.Publisher> filterFindByGroupId(
		long groupId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds all the publishers.
	*
	* @return the publishers
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.liferay.training.library.model.Publisher> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds a range of all the publishers.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of publishers to return
	* @param end the upper bound of the range of publishers to return (not inclusive)
	* @return the range of publishers
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.liferay.training.library.model.Publisher> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds an ordered range of all the publishers.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of publishers to return
	* @param end the upper bound of the range of publishers to return (not inclusive)
	* @param orderByComparator the comparator to order the results by
	* @return the ordered range of publishers
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.liferay.training.library.model.Publisher> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the publishers where groupId = &#63; from the database.
	*
	* @param groupId the group id to search with
	* @throws SystemException if a system exception occurred
	*/
	public void removeByGroupId(long groupId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the publishers from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Counts all the publishers where groupId = &#63;.
	*
	* @param groupId the group id to search with
	* @return the number of matching publishers
	* @throws SystemException if a system exception occurred
	*/
	public int countByGroupId(long groupId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Filters by the user's permissions and counts all the publishers where groupId = &#63;.
	*
	* @param groupId the group id to search with
	* @return the number of matching publishers that the user has permission to view
	* @throws SystemException if a system exception occurred
	*/
	public int filterCountByGroupId(long groupId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Counts all the publishers.
	*
	* @return the number of publishers
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}
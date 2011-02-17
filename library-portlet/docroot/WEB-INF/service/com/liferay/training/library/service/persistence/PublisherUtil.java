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

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import com.liferay.training.library.model.Publisher;

import java.util.List;

/**
 * The persistence utility for the publisher service. This utility wraps {@link PublisherPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Eduardo Bohrer
 * @see PublisherPersistence
 * @see PublisherPersistenceImpl
 * @generated
 */
public class PublisherUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache(com.liferay.portal.model.BaseModel)
	 */
	public static void clearCache(Publisher publisher) {
		getPersistence().clearCache(publisher);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public long countWithDynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<Publisher> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<Publisher> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<Publisher> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#remove(com.liferay.portal.model.BaseModel)
	 */
	public static Publisher remove(Publisher publisher)
		throws SystemException {
		return getPersistence().remove(publisher);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean)
	 */
	public static Publisher update(Publisher publisher, boolean merge)
		throws SystemException {
		return getPersistence().update(publisher, merge);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean, ServiceContext)
	 */
	public static Publisher update(Publisher publisher, boolean merge,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(publisher, merge, serviceContext);
	}

	/**
	* Caches the publisher in the entity cache if it is enabled.
	*
	* @param publisher the publisher to cache
	*/
	public static void cacheResult(
		com.liferay.training.library.model.Publisher publisher) {
		getPersistence().cacheResult(publisher);
	}

	/**
	* Caches the publishers in the entity cache if it is enabled.
	*
	* @param publishers the publishers to cache
	*/
	public static void cacheResult(
		java.util.List<com.liferay.training.library.model.Publisher> publishers) {
		getPersistence().cacheResult(publishers);
	}

	/**
	* Creates a new publisher with the primary key. Does not add the publisher to the database.
	*
	* @param publisherId the primary key for the new publisher
	* @return the new publisher
	*/
	public static com.liferay.training.library.model.Publisher create(
		long publisherId) {
		return getPersistence().create(publisherId);
	}

	/**
	* Removes the publisher with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param publisherId the primary key of the publisher to remove
	* @return the publisher that was removed
	* @throws com.liferay.training.library.NoSuchPublisherException if a publisher with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.training.library.model.Publisher remove(
		long publisherId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.liferay.training.library.NoSuchPublisherException {
		return getPersistence().remove(publisherId);
	}

	public static com.liferay.training.library.model.Publisher updateImpl(
		com.liferay.training.library.model.Publisher publisher, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(publisher, merge);
	}

	/**
	* Finds the publisher with the primary key or throws a {@link com.liferay.training.library.NoSuchPublisherException} if it could not be found.
	*
	* @param publisherId the primary key of the publisher to find
	* @return the publisher
	* @throws com.liferay.training.library.NoSuchPublisherException if a publisher with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.training.library.model.Publisher findByPrimaryKey(
		long publisherId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.liferay.training.library.NoSuchPublisherException {
		return getPersistence().findByPrimaryKey(publisherId);
	}

	/**
	* Finds the publisher with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param publisherId the primary key of the publisher to find
	* @return the publisher, or <code>null</code> if a publisher with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.training.library.model.Publisher fetchByPrimaryKey(
		long publisherId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(publisherId);
	}

	/**
	* Finds all the publishers where groupId = &#63;.
	*
	* @param groupId the group id to search with
	* @return the matching publishers
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.liferay.training.library.model.Publisher> findByGroupId(
		long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByGroupId(groupId);
	}

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
	public static java.util.List<com.liferay.training.library.model.Publisher> findByGroupId(
		long groupId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByGroupId(groupId, start, end);
	}

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
	public static java.util.List<com.liferay.training.library.model.Publisher> findByGroupId(
		long groupId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByGroupId(groupId, start, end, orderByComparator);
	}

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
	public static com.liferay.training.library.model.Publisher findByGroupId_First(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.liferay.training.library.NoSuchPublisherException {
		return getPersistence().findByGroupId_First(groupId, orderByComparator);
	}

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
	public static com.liferay.training.library.model.Publisher findByGroupId_Last(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.liferay.training.library.NoSuchPublisherException {
		return getPersistence().findByGroupId_Last(groupId, orderByComparator);
	}

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
	public static com.liferay.training.library.model.Publisher[] findByGroupId_PrevAndNext(
		long publisherId, long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.liferay.training.library.NoSuchPublisherException {
		return getPersistence()
				   .findByGroupId_PrevAndNext(publisherId, groupId,
			orderByComparator);
	}

	/**
	* Filters by the user's permissions and finds all the publishers where groupId = &#63;.
	*
	* @param groupId the group id to search with
	* @return the matching publishers that the user has permission to view
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.liferay.training.library.model.Publisher> filterFindByGroupId(
		long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().filterFindByGroupId(groupId);
	}

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
	public static java.util.List<com.liferay.training.library.model.Publisher> filterFindByGroupId(
		long groupId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().filterFindByGroupId(groupId, start, end);
	}

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
	public static java.util.List<com.liferay.training.library.model.Publisher> filterFindByGroupId(
		long groupId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .filterFindByGroupId(groupId, start, end, orderByComparator);
	}

	/**
	* Finds all the publishers.
	*
	* @return the publishers
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.liferay.training.library.model.Publisher> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

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
	public static java.util.List<com.liferay.training.library.model.Publisher> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

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
	public static java.util.List<com.liferay.training.library.model.Publisher> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the publishers where groupId = &#63; from the database.
	*
	* @param groupId the group id to search with
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByGroupId(long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByGroupId(groupId);
	}

	/**
	* Removes all the publishers from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Counts all the publishers where groupId = &#63;.
	*
	* @param groupId the group id to search with
	* @return the number of matching publishers
	* @throws SystemException if a system exception occurred
	*/
	public static int countByGroupId(long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByGroupId(groupId);
	}

	/**
	* Filters by the user's permissions and counts all the publishers where groupId = &#63;.
	*
	* @param groupId the group id to search with
	* @return the number of matching publishers that the user has permission to view
	* @throws SystemException if a system exception occurred
	*/
	public static int filterCountByGroupId(long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().filterCountByGroupId(groupId);
	}

	/**
	* Counts all the publishers.
	*
	* @return the number of publishers
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static PublisherPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (PublisherPersistence)PortletBeanLocatorUtil.locate(com.liferay.training.library.service.ClpSerializer.SERVLET_CONTEXT_NAME,
					PublisherPersistence.class.getName());

			ReferenceRegistry.registerReference(PublisherUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	public void setPersistence(PublisherPersistence persistence) {
		_persistence = persistence;

		ReferenceRegistry.registerReference(PublisherUtil.class, "_persistence");
	}

	private static PublisherPersistence _persistence;
}
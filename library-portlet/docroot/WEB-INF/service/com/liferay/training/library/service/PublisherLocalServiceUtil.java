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

package com.liferay.training.library.service;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ClassLoaderProxy;
import com.liferay.portal.kernel.util.MethodCache;
import com.liferay.portal.kernel.util.ReferenceRegistry;

/**
 * The utility for the publisher local service. This utility wraps {@link com.liferay.training.library.service.impl.PublisherLocalServiceImpl} and is the primary access point for service operations in application layer code running on the local server.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Eduardo Bohrer
 * @see PublisherLocalService
 * @see com.liferay.training.library.service.base.PublisherLocalServiceBaseImpl
 * @see com.liferay.training.library.service.impl.PublisherLocalServiceImpl
 * @generated
 */
public class PublisherLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link com.liferay.training.library.service.impl.PublisherLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the publisher to the database. Also notifies the appropriate model listeners.
	*
	* @param publisher the publisher to add
	* @return the publisher that was added
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.training.library.model.Publisher addPublisher(
		com.liferay.training.library.model.Publisher publisher)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().addPublisher(publisher);
	}

	/**
	* Creates a new publisher with the primary key. Does not add the publisher to the database.
	*
	* @param publisherId the primary key for the new publisher
	* @return the new publisher
	*/
	public static com.liferay.training.library.model.Publisher createPublisher(
		long publisherId) {
		return getService().createPublisher(publisherId);
	}

	/**
	* Deletes the publisher with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param publisherId the primary key of the publisher to delete
	* @throws PortalException if a publisher with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static void deletePublisher(long publisherId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		getService().deletePublisher(publisherId);
	}

	/**
	* Deletes the publisher from the database. Also notifies the appropriate model listeners.
	*
	* @param publisher the publisher to delete
	* @throws SystemException if a system exception occurred
	*/
	public static void deletePublisher(
		com.liferay.training.library.model.Publisher publisher)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService().deletePublisher(publisher);
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query to search with
	* @return the matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param dynamicQuery the dynamic query to search with
	* @param start the lower bound of the range of model instances to return
	* @param end the upper bound of the range of model instances to return (not inclusive)
	* @return the range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param dynamicQuery the dynamic query to search with
	* @param start the lower bound of the range of model instances to return
	* @param end the upper bound of the range of model instances to return (not inclusive)
	* @param orderByComparator the comparator to order the results by
	* @return the ordered range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .dynamicQuery(dynamicQuery, start, end, orderByComparator);
	}

	/**
	* Counts the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query to search with
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQueryCount(dynamicQuery);
	}

	/**
	* Gets the publisher with the primary key.
	*
	* @param publisherId the primary key of the publisher to get
	* @return the publisher
	* @throws PortalException if a publisher with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.training.library.model.Publisher getPublisher(
		long publisherId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getPublisher(publisherId);
	}

	/**
	* Gets a range of all the publishers.
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
	public static java.util.List<com.liferay.training.library.model.Publisher> getPublishers(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getPublishers(start, end);
	}

	/**
	* Gets the number of publishers.
	*
	* @return the number of publishers
	* @throws SystemException if a system exception occurred
	*/
	public static int getPublishersCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getPublishersCount();
	}

	/**
	* Updates the publisher in the database. Also notifies the appropriate model listeners.
	*
	* @param publisher the publisher to update
	* @return the publisher that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.training.library.model.Publisher updatePublisher(
		com.liferay.training.library.model.Publisher publisher)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updatePublisher(publisher);
	}

	/**
	* Updates the publisher in the database. Also notifies the appropriate model listeners.
	*
	* @param publisher the publisher to update
	* @param merge whether to merge the publisher with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	* @return the publisher that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.training.library.model.Publisher updatePublisher(
		com.liferay.training.library.model.Publisher publisher, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updatePublisher(publisher, merge);
	}

	/**
	* Gets a list with all the Publishers in a group
	*/
	public static java.util.List<com.liferay.training.library.model.Publisher> getPublishersByGroupId(
		long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getPublishersByGroupId(groupId);
	}

	/**
	* Gets a list with a range of Publishers from a group
	*/
	public static java.util.List<com.liferay.training.library.model.Publisher> getPublishersByGroupId(
		long groupId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getPublishersByGroupId(groupId, start, end);
	}

	/**
	* Gets the number of Publishers in a group
	*/
	public static int getPublishersCountByGroupId(long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getPublishersCountByGroupId(groupId);
	}

	public static void clearService() {
		_service = null;
	}

	public static PublisherLocalService getService() {
		if (_service == null) {
			Object object = PortletBeanLocatorUtil.locate(ClpSerializer.SERVLET_CONTEXT_NAME,
					PublisherLocalService.class.getName());
			ClassLoader portletClassLoader = (ClassLoader)PortletBeanLocatorUtil.locate(ClpSerializer.SERVLET_CONTEXT_NAME,
					"portletClassLoader");

			ClassLoaderProxy classLoaderProxy = new ClassLoaderProxy(object,
					PublisherLocalService.class.getName(), portletClassLoader);

			_service = new PublisherLocalServiceClp(classLoaderProxy);

			ClpSerializer.setClassLoader(portletClassLoader);

			ReferenceRegistry.registerReference(PublisherLocalServiceUtil.class,
				"_service");
			MethodCache.remove(PublisherLocalService.class);
		}

		return _service;
	}

	public void setService(PublisherLocalService service) {
		MethodCache.remove(PublisherLocalService.class);

		_service = service;

		ReferenceRegistry.registerReference(PublisherLocalServiceUtil.class,
			"_service");
		MethodCache.remove(PublisherLocalService.class);
	}

	private static PublisherLocalService _service;
}
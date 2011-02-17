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
 * The utility for the book local service. This utility wraps {@link com.liferay.training.library.service.impl.BookLocalServiceImpl} and is the primary access point for service operations in application layer code running on the local server.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Eduardo Bohrer
 * @see BookLocalService
 * @see com.liferay.training.library.service.base.BookLocalServiceBaseImpl
 * @see com.liferay.training.library.service.impl.BookLocalServiceImpl
 * @generated
 */
public class BookLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link com.liferay.training.library.service.impl.BookLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the book to the database. Also notifies the appropriate model listeners.
	*
	* @param book the book to add
	* @return the book that was added
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.training.library.model.Book addBook(
		com.liferay.training.library.model.Book book)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().addBook(book);
	}

	/**
	* Creates a new book with the primary key. Does not add the book to the database.
	*
	* @param bookId the primary key for the new book
	* @return the new book
	*/
	public static com.liferay.training.library.model.Book createBook(
		long bookId) {
		return getService().createBook(bookId);
	}

	/**
	* Deletes the book with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param bookId the primary key of the book to delete
	* @throws PortalException if a book with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static void deleteBook(long bookId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		getService().deleteBook(bookId);
	}

	/**
	* Deletes the book from the database. Also notifies the appropriate model listeners.
	*
	* @param book the book to delete
	* @throws PortalException
	* @throws SystemException if a system exception occurred
	*/
	public static void deleteBook(com.liferay.training.library.model.Book book)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		getService().deleteBook(book);
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
	* Gets the book with the primary key.
	*
	* @param bookId the primary key of the book to get
	* @return the book
	* @throws PortalException if a book with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.training.library.model.Book getBook(long bookId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getBook(bookId);
	}

	/**
	* Gets a range of all the books.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of books to return
	* @param end the upper bound of the range of books to return (not inclusive)
	* @return the range of books
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.liferay.training.library.model.Book> getBooks(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getBooks(start, end);
	}

	/**
	* Gets the number of books.
	*
	* @return the number of books
	* @throws SystemException if a system exception occurred
	*/
	public static int getBooksCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getBooksCount();
	}

	/**
	* Updates the book in the database. Also notifies the appropriate model listeners.
	*
	* @param book the book to update
	* @return the book that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.training.library.model.Book updateBook(
		com.liferay.training.library.model.Book book)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateBook(book);
	}

	/**
	* Updates the book in the database. Also notifies the appropriate model listeners.
	*
	* @param book the book to update
	* @param merge whether to merge the book with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	* @return the book that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.training.library.model.Book updateBook(
		com.liferay.training.library.model.Book book, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateBook(book, merge);
	}

	/**
	* Adds the Book to the database incrementing the primary key
	*
	* @throws PortalException
	*/
	public static com.liferay.training.library.model.Book addBook(
		com.liferay.training.library.model.Book newBook, long userId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().addBook(newBook, userId);
	}

	/**
	* Gets a list with all the Books in a group
	*/
	public static java.util.List<com.liferay.training.library.model.Book> getBooksByGroupId(
		long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getBooksByGroupId(groupId);
	}

	/**
	* Gets a list with a range of Books from a group
	*/
	public static java.util.List<com.liferay.training.library.model.Book> getBooksByGroupId(
		long groupId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getBooksByGroupId(groupId, start, end);
	}

	/**
	* Gets the number of Books in a group
	*/
	public static int getBooksCountByGroupId(long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getBooksCountByGroupId(groupId);
	}

	/**
	* Gets a list of Books from a Publisher
	*/
	public static java.util.List<com.liferay.training.library.model.Book> getBooksbyPublisher(
		long publisherId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getBooksbyPublisher(publisherId);
	}

	public static void clearService() {
		_service = null;
	}

	public static BookLocalService getService() {
		if (_service == null) {
			Object object = PortletBeanLocatorUtil.locate(ClpSerializer.SERVLET_CONTEXT_NAME,
					BookLocalService.class.getName());
			ClassLoader portletClassLoader = (ClassLoader)PortletBeanLocatorUtil.locate(ClpSerializer.SERVLET_CONTEXT_NAME,
					"portletClassLoader");

			ClassLoaderProxy classLoaderProxy = new ClassLoaderProxy(object,
					BookLocalService.class.getName(), portletClassLoader);

			_service = new BookLocalServiceClp(classLoaderProxy);

			ClpSerializer.setClassLoader(portletClassLoader);

			ReferenceRegistry.registerReference(BookLocalServiceUtil.class,
				"_service");
			MethodCache.remove(BookLocalService.class);
		}

		return _service;
	}

	public void setService(BookLocalService service) {
		MethodCache.remove(BookLocalService.class);

		_service = service;

		ReferenceRegistry.registerReference(BookLocalServiceUtil.class,
			"_service");
		MethodCache.remove(BookLocalService.class);
	}

	private static BookLocalService _service;
}
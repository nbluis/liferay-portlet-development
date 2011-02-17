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

import com.liferay.training.library.model.Book;

import java.util.List;

/**
 * The persistence utility for the book service. This utility wraps {@link BookPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Eduardo Bohrer
 * @see BookPersistence
 * @see BookPersistenceImpl
 * @generated
 */
public class BookUtil {
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
	public static void clearCache(Book book) {
		getPersistence().clearCache(book);
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
	public static List<Book> findWithDynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<Book> findWithDynamicQuery(DynamicQuery dynamicQuery,
		int start, int end) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<Book> findWithDynamicQuery(DynamicQuery dynamicQuery,
		int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#remove(com.liferay.portal.model.BaseModel)
	 */
	public static Book remove(Book book) throws SystemException {
		return getPersistence().remove(book);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean)
	 */
	public static Book update(Book book, boolean merge)
		throws SystemException {
		return getPersistence().update(book, merge);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean, ServiceContext)
	 */
	public static Book update(Book book, boolean merge,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(book, merge, serviceContext);
	}

	/**
	* Caches the book in the entity cache if it is enabled.
	*
	* @param book the book to cache
	*/
	public static void cacheResult(com.liferay.training.library.model.Book book) {
		getPersistence().cacheResult(book);
	}

	/**
	* Caches the books in the entity cache if it is enabled.
	*
	* @param books the books to cache
	*/
	public static void cacheResult(
		java.util.List<com.liferay.training.library.model.Book> books) {
		getPersistence().cacheResult(books);
	}

	/**
	* Creates a new book with the primary key. Does not add the book to the database.
	*
	* @param bookId the primary key for the new book
	* @return the new book
	*/
	public static com.liferay.training.library.model.Book create(long bookId) {
		return getPersistence().create(bookId);
	}

	/**
	* Removes the book with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param bookId the primary key of the book to remove
	* @return the book that was removed
	* @throws com.liferay.training.library.NoSuchBookException if a book with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.training.library.model.Book remove(long bookId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.liferay.training.library.NoSuchBookException {
		return getPersistence().remove(bookId);
	}

	public static com.liferay.training.library.model.Book updateImpl(
		com.liferay.training.library.model.Book book, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(book, merge);
	}

	/**
	* Finds the book with the primary key or throws a {@link com.liferay.training.library.NoSuchBookException} if it could not be found.
	*
	* @param bookId the primary key of the book to find
	* @return the book
	* @throws com.liferay.training.library.NoSuchBookException if a book with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.training.library.model.Book findByPrimaryKey(
		long bookId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.liferay.training.library.NoSuchBookException {
		return getPersistence().findByPrimaryKey(bookId);
	}

	/**
	* Finds the book with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param bookId the primary key of the book to find
	* @return the book, or <code>null</code> if a book with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.training.library.model.Book fetchByPrimaryKey(
		long bookId) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(bookId);
	}

	/**
	* Finds all the books where groupId = &#63;.
	*
	* @param groupId the group id to search with
	* @return the matching books
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.liferay.training.library.model.Book> findByGroupId(
		long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByGroupId(groupId);
	}

	/**
	* Finds a range of all the books where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param groupId the group id to search with
	* @param start the lower bound of the range of books to return
	* @param end the upper bound of the range of books to return (not inclusive)
	* @return the range of matching books
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.liferay.training.library.model.Book> findByGroupId(
		long groupId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByGroupId(groupId, start, end);
	}

	/**
	* Finds an ordered range of all the books where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param groupId the group id to search with
	* @param start the lower bound of the range of books to return
	* @param end the upper bound of the range of books to return (not inclusive)
	* @param orderByComparator the comparator to order the results by
	* @return the ordered range of matching books
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.liferay.training.library.model.Book> findByGroupId(
		long groupId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByGroupId(groupId, start, end, orderByComparator);
	}

	/**
	* Finds the first book in the ordered set where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param groupId the group id to search with
	* @param orderByComparator the comparator to order the set by
	* @return the first matching book
	* @throws com.liferay.training.library.NoSuchBookException if a matching book could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.training.library.model.Book findByGroupId_First(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.liferay.training.library.NoSuchBookException {
		return getPersistence().findByGroupId_First(groupId, orderByComparator);
	}

	/**
	* Finds the last book in the ordered set where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param groupId the group id to search with
	* @param orderByComparator the comparator to order the set by
	* @return the last matching book
	* @throws com.liferay.training.library.NoSuchBookException if a matching book could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.training.library.model.Book findByGroupId_Last(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.liferay.training.library.NoSuchBookException {
		return getPersistence().findByGroupId_Last(groupId, orderByComparator);
	}

	/**
	* Finds the books before and after the current book in the ordered set where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param bookId the primary key of the current book
	* @param groupId the group id to search with
	* @param orderByComparator the comparator to order the set by
	* @return the previous, current, and next book
	* @throws com.liferay.training.library.NoSuchBookException if a book with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.training.library.model.Book[] findByGroupId_PrevAndNext(
		long bookId, long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.liferay.training.library.NoSuchBookException {
		return getPersistence()
				   .findByGroupId_PrevAndNext(bookId, groupId, orderByComparator);
	}

	/**
	* Filters by the user's permissions and finds all the books where groupId = &#63;.
	*
	* @param groupId the group id to search with
	* @return the matching books that the user has permission to view
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.liferay.training.library.model.Book> filterFindByGroupId(
		long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().filterFindByGroupId(groupId);
	}

	/**
	* Filters by the user's permissions and finds a range of all the books where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param groupId the group id to search with
	* @param start the lower bound of the range of books to return
	* @param end the upper bound of the range of books to return (not inclusive)
	* @return the range of matching books that the user has permission to view
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.liferay.training.library.model.Book> filterFindByGroupId(
		long groupId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().filterFindByGroupId(groupId, start, end);
	}

	/**
	* Filters by the user's permissions and finds an ordered range of all the books where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param groupId the group id to search with
	* @param start the lower bound of the range of books to return
	* @param end the upper bound of the range of books to return (not inclusive)
	* @param orderByComparator the comparator to order the results by
	* @return the ordered range of matching books that the user has permission to view
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.liferay.training.library.model.Book> filterFindByGroupId(
		long groupId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .filterFindByGroupId(groupId, start, end, orderByComparator);
	}

	/**
	* Finds all the books where publisherId = &#63;.
	*
	* @param publisherId the publisher id to search with
	* @return the matching books
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.liferay.training.library.model.Book> findByPublisher(
		long publisherId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByPublisher(publisherId);
	}

	/**
	* Finds a range of all the books where publisherId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param publisherId the publisher id to search with
	* @param start the lower bound of the range of books to return
	* @param end the upper bound of the range of books to return (not inclusive)
	* @return the range of matching books
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.liferay.training.library.model.Book> findByPublisher(
		long publisherId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByPublisher(publisherId, start, end);
	}

	/**
	* Finds an ordered range of all the books where publisherId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param publisherId the publisher id to search with
	* @param start the lower bound of the range of books to return
	* @param end the upper bound of the range of books to return (not inclusive)
	* @param orderByComparator the comparator to order the results by
	* @return the ordered range of matching books
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.liferay.training.library.model.Book> findByPublisher(
		long publisherId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByPublisher(publisherId, start, end, orderByComparator);
	}

	/**
	* Finds the first book in the ordered set where publisherId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param publisherId the publisher id to search with
	* @param orderByComparator the comparator to order the set by
	* @return the first matching book
	* @throws com.liferay.training.library.NoSuchBookException if a matching book could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.training.library.model.Book findByPublisher_First(
		long publisherId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.liferay.training.library.NoSuchBookException {
		return getPersistence()
				   .findByPublisher_First(publisherId, orderByComparator);
	}

	/**
	* Finds the last book in the ordered set where publisherId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param publisherId the publisher id to search with
	* @param orderByComparator the comparator to order the set by
	* @return the last matching book
	* @throws com.liferay.training.library.NoSuchBookException if a matching book could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.training.library.model.Book findByPublisher_Last(
		long publisherId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.liferay.training.library.NoSuchBookException {
		return getPersistence()
				   .findByPublisher_Last(publisherId, orderByComparator);
	}

	/**
	* Finds the books before and after the current book in the ordered set where publisherId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param bookId the primary key of the current book
	* @param publisherId the publisher id to search with
	* @param orderByComparator the comparator to order the set by
	* @return the previous, current, and next book
	* @throws com.liferay.training.library.NoSuchBookException if a book with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.training.library.model.Book[] findByPublisher_PrevAndNext(
		long bookId, long publisherId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.liferay.training.library.NoSuchBookException {
		return getPersistence()
				   .findByPublisher_PrevAndNext(bookId, publisherId,
			orderByComparator);
	}

	/**
	* Finds all the books.
	*
	* @return the books
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.liferay.training.library.model.Book> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Finds a range of all the books.
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
	public static java.util.List<com.liferay.training.library.model.Book> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Finds an ordered range of all the books.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of books to return
	* @param end the upper bound of the range of books to return (not inclusive)
	* @param orderByComparator the comparator to order the results by
	* @return the ordered range of books
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.liferay.training.library.model.Book> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the books where groupId = &#63; from the database.
	*
	* @param groupId the group id to search with
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByGroupId(long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByGroupId(groupId);
	}

	/**
	* Removes all the books where publisherId = &#63; from the database.
	*
	* @param publisherId the publisher id to search with
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByPublisher(long publisherId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByPublisher(publisherId);
	}

	/**
	* Removes all the books from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Counts all the books where groupId = &#63;.
	*
	* @param groupId the group id to search with
	* @return the number of matching books
	* @throws SystemException if a system exception occurred
	*/
	public static int countByGroupId(long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByGroupId(groupId);
	}

	/**
	* Filters by the user's permissions and counts all the books where groupId = &#63;.
	*
	* @param groupId the group id to search with
	* @return the number of matching books that the user has permission to view
	* @throws SystemException if a system exception occurred
	*/
	public static int filterCountByGroupId(long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().filterCountByGroupId(groupId);
	}

	/**
	* Counts all the books where publisherId = &#63;.
	*
	* @param publisherId the publisher id to search with
	* @return the number of matching books
	* @throws SystemException if a system exception occurred
	*/
	public static int countByPublisher(long publisherId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByPublisher(publisherId);
	}

	/**
	* Counts all the books.
	*
	* @return the number of books
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static BookPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (BookPersistence)PortletBeanLocatorUtil.locate(com.liferay.training.library.service.ClpSerializer.SERVLET_CONTEXT_NAME,
					BookPersistence.class.getName());

			ReferenceRegistry.registerReference(BookUtil.class, "_persistence");
		}

		return _persistence;
	}

	public void setPersistence(BookPersistence persistence) {
		_persistence = persistence;

		ReferenceRegistry.registerReference(BookUtil.class, "_persistence");
	}

	private static BookPersistence _persistence;
}
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

import com.liferay.training.library.model.Book;

/**
 * The persistence interface for the book service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Eduardo Bohrer
 * @see BookPersistenceImpl
 * @see BookUtil
 * @generated
 */
public interface BookPersistence extends BasePersistence<Book> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link BookUtil} to access the book persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the book in the entity cache if it is enabled.
	*
	* @param book the book to cache
	*/
	public void cacheResult(com.liferay.training.library.model.Book book);

	/**
	* Caches the books in the entity cache if it is enabled.
	*
	* @param books the books to cache
	*/
	public void cacheResult(
		java.util.List<com.liferay.training.library.model.Book> books);

	/**
	* Creates a new book with the primary key. Does not add the book to the database.
	*
	* @param bookId the primary key for the new book
	* @return the new book
	*/
	public com.liferay.training.library.model.Book create(long bookId);

	/**
	* Removes the book with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param bookId the primary key of the book to remove
	* @return the book that was removed
	* @throws com.liferay.training.library.NoSuchBookException if a book with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.training.library.model.Book remove(long bookId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.liferay.training.library.NoSuchBookException;

	public com.liferay.training.library.model.Book updateImpl(
		com.liferay.training.library.model.Book book, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds the book with the primary key or throws a {@link com.liferay.training.library.NoSuchBookException} if it could not be found.
	*
	* @param bookId the primary key of the book to find
	* @return the book
	* @throws com.liferay.training.library.NoSuchBookException if a book with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.training.library.model.Book findByPrimaryKey(long bookId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.liferay.training.library.NoSuchBookException;

	/**
	* Finds the book with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param bookId the primary key of the book to find
	* @return the book, or <code>null</code> if a book with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.training.library.model.Book fetchByPrimaryKey(
		long bookId) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds all the books where groupId = &#63;.
	*
	* @param groupId the group id to search with
	* @return the matching books
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.liferay.training.library.model.Book> findByGroupId(
		long groupId)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.liferay.training.library.model.Book> findByGroupId(
		long groupId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.liferay.training.library.model.Book> findByGroupId(
		long groupId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public com.liferay.training.library.model.Book findByGroupId_First(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.liferay.training.library.NoSuchBookException;

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
	public com.liferay.training.library.model.Book findByGroupId_Last(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.liferay.training.library.NoSuchBookException;

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
	public com.liferay.training.library.model.Book[] findByGroupId_PrevAndNext(
		long bookId, long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.liferay.training.library.NoSuchBookException;

	/**
	* Finds all the books where publisherId = &#63;.
	*
	* @param publisherId the publisher id to search with
	* @return the matching books
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.liferay.training.library.model.Book> findByPublisher(
		long publisherId)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.liferay.training.library.model.Book> findByPublisher(
		long publisherId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.liferay.training.library.model.Book> findByPublisher(
		long publisherId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public com.liferay.training.library.model.Book findByPublisher_First(
		long publisherId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.liferay.training.library.NoSuchBookException;

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
	public com.liferay.training.library.model.Book findByPublisher_Last(
		long publisherId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.liferay.training.library.NoSuchBookException;

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
	public com.liferay.training.library.model.Book[] findByPublisher_PrevAndNext(
		long bookId, long publisherId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.liferay.training.library.NoSuchBookException;

	/**
	* Finds all the books.
	*
	* @return the books
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.liferay.training.library.model.Book> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.liferay.training.library.model.Book> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.liferay.training.library.model.Book> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the books where groupId = &#63; from the database.
	*
	* @param groupId the group id to search with
	* @throws SystemException if a system exception occurred
	*/
	public void removeByGroupId(long groupId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the books where publisherId = &#63; from the database.
	*
	* @param publisherId the publisher id to search with
	* @throws SystemException if a system exception occurred
	*/
	public void removeByPublisher(long publisherId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the books from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Counts all the books where groupId = &#63;.
	*
	* @param groupId the group id to search with
	* @return the number of matching books
	* @throws SystemException if a system exception occurred
	*/
	public int countByGroupId(long groupId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Counts all the books where publisherId = &#63;.
	*
	* @param publisherId the publisher id to search with
	* @return the number of matching books
	* @throws SystemException if a system exception occurred
	*/
	public int countByPublisher(long publisherId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Counts all the books.
	*
	* @return the number of books
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}
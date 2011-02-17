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

/**
 * <p>
 * This class is a wrapper for {@link BookLocalService}.
 * </p>
 *
 * @author    Eduardo Bohrer
 * @see       BookLocalService
 * @generated
 */
public class BookLocalServiceWrapper implements BookLocalService {
	public BookLocalServiceWrapper(BookLocalService bookLocalService) {
		_bookLocalService = bookLocalService;
	}

	/**
	* Adds the book to the database. Also notifies the appropriate model listeners.
	*
	* @param book the book to add
	* @return the book that was added
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.training.library.model.Book addBook(
		com.liferay.training.library.model.Book book)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _bookLocalService.addBook(book);
	}

	/**
	* Creates a new book with the primary key. Does not add the book to the database.
	*
	* @param bookId the primary key for the new book
	* @return the new book
	*/
	public com.liferay.training.library.model.Book createBook(long bookId) {
		return _bookLocalService.createBook(bookId);
	}

	/**
	* Deletes the book with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param bookId the primary key of the book to delete
	* @throws PortalException if a book with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public void deleteBook(long bookId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		_bookLocalService.deleteBook(bookId);
	}

	/**
	* Deletes the book from the database. Also notifies the appropriate model listeners.
	*
	* @param book the book to delete
	* @throws SystemException if a system exception occurred
	*/
	public void deleteBook(com.liferay.training.library.model.Book book)
		throws com.liferay.portal.kernel.exception.SystemException {
		_bookLocalService.deleteBook(book);
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query to search with
	* @return the matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _bookLocalService.dynamicQuery(dynamicQuery);
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
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return _bookLocalService.dynamicQuery(dynamicQuery, start, end);
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
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _bookLocalService.dynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	* Counts the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query to search with
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _bookLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	* Gets the book with the primary key.
	*
	* @param bookId the primary key of the book to get
	* @return the book
	* @throws PortalException if a book with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.training.library.model.Book getBook(long bookId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _bookLocalService.getBook(bookId);
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
	public java.util.List<com.liferay.training.library.model.Book> getBooks(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _bookLocalService.getBooks(start, end);
	}

	/**
	* Gets the number of books.
	*
	* @return the number of books
	* @throws SystemException if a system exception occurred
	*/
	public int getBooksCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _bookLocalService.getBooksCount();
	}

	/**
	* Updates the book in the database. Also notifies the appropriate model listeners.
	*
	* @param book the book to update
	* @return the book that was updated
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.training.library.model.Book updateBook(
		com.liferay.training.library.model.Book book)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _bookLocalService.updateBook(book);
	}

	/**
	* Updates the book in the database. Also notifies the appropriate model listeners.
	*
	* @param book the book to update
	* @param merge whether to merge the book with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	* @return the book that was updated
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.training.library.model.Book updateBook(
		com.liferay.training.library.model.Book book, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _bookLocalService.updateBook(book, merge);
	}

	public BookLocalService getWrappedBookLocalService() {
		return _bookLocalService;
	}

	public void setWrappedBookLocalService(BookLocalService bookLocalService) {
		_bookLocalService = bookLocalService;
	}

	private BookLocalService _bookLocalService;
}
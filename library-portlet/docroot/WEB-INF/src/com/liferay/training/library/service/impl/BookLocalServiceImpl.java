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
import com.liferay.training.library.model.Book;
import com.liferay.training.library.service.base.BookLocalServiceBaseImpl;

import java.util.List;

/**
 * The implementation of the book local service.
 * 
 * <p>
 * All custom service methods should be put in this class. Whenever methods are
 * added, rerun ServiceBuilder to copy their definitions into the
 * {@link com.liferay.training.library.service.BookLocalService} interface.
 * 
 * <p>
 * This is a local service. Methods of this service will not have security
 * checks based on the propagated JAAS credentials because this service can only
 * be accessed from within the same VM.
 * </p>
 * 
 * @author Eduardo Bohrer
 * @see com.liferay.training.library.service.base.BookLocalServiceBaseImpl
 * @see com.liferay.training.library.service.BookLocalServiceUtil
 */
public class BookLocalServiceImpl extends BookLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 * 
	 * Never reference this interface directly. Always use {@link
	 * com.liferay.training.library.service.BookLocalServiceUtil} to access the
	 * book local service.
	 */

	/**
	 * Adds the Book to the database incrementing the primary key
	 * 
	 * @throws PortalException
	 * 
	 */
	public Book addBook(Book newBook, long userId) throws SystemException, PortalException {
		long bookId = CounterLocalServiceUtil.increment(Book.class.getName());

		Book book = bookPersistence.create(bookId);
		book.setAuthorName(newBook.getAuthorName());
		book.setCompanyId(newBook.getCompanyId());
		book.setGroupId(newBook.getGroupId());
		book.setPublicationDate(newBook.getPublicationDate());
		book.setPublisherId(newBook.getPublisherId());
		book.setTitle(newBook.getTitle());

		bookPersistence.update(book, false);

		resourceLocalService.addResources(book.getCompanyId(), book.getGroupId(), userId, Book.class.getName(), bookId, false, true, true);

		return book;

	}

	public void deleteBook(Book book) throws PortalException, SystemException {

		resourceLocalService.deleteResource(book.getCompanyId(), Book.class.getName(), ResourceConstants.SCOPE_INDIVIDUAL, book.getPrimaryKey());

		super.deleteBook(book);

	}

	public void deleteBook(long bookId) throws PortalException, SystemException {

		Book book = bookLocalService.getBook(bookId);

		deleteBook(book);
	}

	/**
	 * Gets a list with all the Books in a group
	 * 
	 */
	public List<Book> getBooksByGroupId(long groupId) throws SystemException {
		return bookPersistence.findByGroupId(groupId);
	}

	/**
	 * Gets a list with a range of Books from a group
	 * 
	 */
	public List<Book> getBooksByGroupId(long groupId, int start, int end) throws SystemException {
		return bookPersistence.findByGroupId(groupId, start, end);
	}

	/**
	 * Gets the number of Books in a group
	 * 
	 */
	public int getBooksCountByGroupId(long groupId) throws SystemException {
		return bookPersistence.countByGroupId(groupId);
	}

	/**
	 * Gets a list of Books from a Publisher
	 * 
	 */
	public List<Book> getBooksbyPublisher(long publisherId) throws SystemException {
		return bookPersistence.findByPublisher(publisherId);
	}

}
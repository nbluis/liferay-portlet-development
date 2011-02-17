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

package com.liferay.training.library.service.base;

import com.liferay.counter.service.CounterLocalService;

import com.liferay.portal.kernel.bean.BeanReference;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdate;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdateFactoryUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.service.ResourceLocalService;
import com.liferay.portal.service.ResourceService;
import com.liferay.portal.service.UserLocalService;
import com.liferay.portal.service.UserService;
import com.liferay.portal.service.persistence.ResourcePersistence;
import com.liferay.portal.service.persistence.UserPersistence;

import com.liferay.training.library.model.Book;
import com.liferay.training.library.service.BookLocalService;
import com.liferay.training.library.service.PublisherLocalService;
import com.liferay.training.library.service.persistence.BookPersistence;
import com.liferay.training.library.service.persistence.PublisherPersistence;

import java.util.List;

import javax.sql.DataSource;

/**
 * The base implementation of the book local service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link com.liferay.training.library.service.impl.BookLocalServiceImpl}.
 * </p>
 *
 * @author Eduardo Bohrer
 * @see com.liferay.training.library.service.impl.BookLocalServiceImpl
 * @see com.liferay.training.library.service.BookLocalServiceUtil
 * @generated
 */
public abstract class BookLocalServiceBaseImpl implements BookLocalService {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link com.liferay.training.library.service.BookLocalServiceUtil} to access the book local service.
	 */

	/**
	 * Adds the book to the database. Also notifies the appropriate model listeners.
	 *
	 * @param book the book to add
	 * @return the book that was added
	 * @throws SystemException if a system exception occurred
	 */
	public Book addBook(Book book) throws SystemException {
		book.setNew(true);

		return bookPersistence.update(book, false);
	}

	/**
	 * Creates a new book with the primary key. Does not add the book to the database.
	 *
	 * @param bookId the primary key for the new book
	 * @return the new book
	 */
	public Book createBook(long bookId) {
		return bookPersistence.create(bookId);
	}

	/**
	 * Deletes the book with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param bookId the primary key of the book to delete
	 * @throws PortalException if a book with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public void deleteBook(long bookId) throws PortalException, SystemException {
		bookPersistence.remove(bookId);
	}

	/**
	 * Deletes the book from the database. Also notifies the appropriate model listeners.
	 *
	 * @param book the book to delete
	 * @throws SystemException if a system exception occurred
	 */
	public void deleteBook(Book book) throws SystemException {
		bookPersistence.remove(book);
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query to search with
	 * @return the matching rows
	 * @throws SystemException if a system exception occurred
	 */
	@SuppressWarnings("rawtypes")
	public List dynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return bookPersistence.findWithDynamicQuery(dynamicQuery);
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
	public List dynamicQuery(DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return bookPersistence.findWithDynamicQuery(dynamicQuery, start, end);
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
	public List dynamicQuery(DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return bookPersistence.findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * Counts the number of rows that match the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query to search with
	 * @return the number of rows that match the dynamic query
	 * @throws SystemException if a system exception occurred
	 */
	public long dynamicQueryCount(DynamicQuery dynamicQuery)
		throws SystemException {
		return bookPersistence.countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * Gets the book with the primary key.
	 *
	 * @param bookId the primary key of the book to get
	 * @return the book
	 * @throws PortalException if a book with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public Book getBook(long bookId) throws PortalException, SystemException {
		return bookPersistence.findByPrimaryKey(bookId);
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
	public List<Book> getBooks(int start, int end) throws SystemException {
		return bookPersistence.findAll(start, end);
	}

	/**
	 * Gets the number of books.
	 *
	 * @return the number of books
	 * @throws SystemException if a system exception occurred
	 */
	public int getBooksCount() throws SystemException {
		return bookPersistence.countAll();
	}

	/**
	 * Updates the book in the database. Also notifies the appropriate model listeners.
	 *
	 * @param book the book to update
	 * @return the book that was updated
	 * @throws SystemException if a system exception occurred
	 */
	public Book updateBook(Book book) throws SystemException {
		book.setNew(false);

		return bookPersistence.update(book, true);
	}

	/**
	 * Updates the book in the database. Also notifies the appropriate model listeners.
	 *
	 * @param book the book to update
	 * @param merge whether to merge the book with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	 * @return the book that was updated
	 * @throws SystemException if a system exception occurred
	 */
	public Book updateBook(Book book, boolean merge) throws SystemException {
		book.setNew(false);

		return bookPersistence.update(book, merge);
	}

	/**
	 * Gets the publisher local service.
	 *
	 * @return the publisher local service
	 */
	public PublisherLocalService getPublisherLocalService() {
		return publisherLocalService;
	}

	/**
	 * Sets the publisher local service.
	 *
	 * @param publisherLocalService the publisher local service
	 */
	public void setPublisherLocalService(
		PublisherLocalService publisherLocalService) {
		this.publisherLocalService = publisherLocalService;
	}

	/**
	 * Gets the publisher persistence.
	 *
	 * @return the publisher persistence
	 */
	public PublisherPersistence getPublisherPersistence() {
		return publisherPersistence;
	}

	/**
	 * Sets the publisher persistence.
	 *
	 * @param publisherPersistence the publisher persistence
	 */
	public void setPublisherPersistence(
		PublisherPersistence publisherPersistence) {
		this.publisherPersistence = publisherPersistence;
	}

	/**
	 * Gets the book local service.
	 *
	 * @return the book local service
	 */
	public BookLocalService getBookLocalService() {
		return bookLocalService;
	}

	/**
	 * Sets the book local service.
	 *
	 * @param bookLocalService the book local service
	 */
	public void setBookLocalService(BookLocalService bookLocalService) {
		this.bookLocalService = bookLocalService;
	}

	/**
	 * Gets the book persistence.
	 *
	 * @return the book persistence
	 */
	public BookPersistence getBookPersistence() {
		return bookPersistence;
	}

	/**
	 * Sets the book persistence.
	 *
	 * @param bookPersistence the book persistence
	 */
	public void setBookPersistence(BookPersistence bookPersistence) {
		this.bookPersistence = bookPersistence;
	}

	/**
	 * Gets the counter local service.
	 *
	 * @return the counter local service
	 */
	public CounterLocalService getCounterLocalService() {
		return counterLocalService;
	}

	/**
	 * Sets the counter local service.
	 *
	 * @param counterLocalService the counter local service
	 */
	public void setCounterLocalService(CounterLocalService counterLocalService) {
		this.counterLocalService = counterLocalService;
	}

	/**
	 * Gets the resource local service.
	 *
	 * @return the resource local service
	 */
	public ResourceLocalService getResourceLocalService() {
		return resourceLocalService;
	}

	/**
	 * Sets the resource local service.
	 *
	 * @param resourceLocalService the resource local service
	 */
	public void setResourceLocalService(
		ResourceLocalService resourceLocalService) {
		this.resourceLocalService = resourceLocalService;
	}

	/**
	 * Gets the resource remote service.
	 *
	 * @return the resource remote service
	 */
	public ResourceService getResourceService() {
		return resourceService;
	}

	/**
	 * Sets the resource remote service.
	 *
	 * @param resourceService the resource remote service
	 */
	public void setResourceService(ResourceService resourceService) {
		this.resourceService = resourceService;
	}

	/**
	 * Gets the resource persistence.
	 *
	 * @return the resource persistence
	 */
	public ResourcePersistence getResourcePersistence() {
		return resourcePersistence;
	}

	/**
	 * Sets the resource persistence.
	 *
	 * @param resourcePersistence the resource persistence
	 */
	public void setResourcePersistence(ResourcePersistence resourcePersistence) {
		this.resourcePersistence = resourcePersistence;
	}

	/**
	 * Gets the user local service.
	 *
	 * @return the user local service
	 */
	public UserLocalService getUserLocalService() {
		return userLocalService;
	}

	/**
	 * Sets the user local service.
	 *
	 * @param userLocalService the user local service
	 */
	public void setUserLocalService(UserLocalService userLocalService) {
		this.userLocalService = userLocalService;
	}

	/**
	 * Gets the user remote service.
	 *
	 * @return the user remote service
	 */
	public UserService getUserService() {
		return userService;
	}

	/**
	 * Sets the user remote service.
	 *
	 * @param userService the user remote service
	 */
	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	/**
	 * Gets the user persistence.
	 *
	 * @return the user persistence
	 */
	public UserPersistence getUserPersistence() {
		return userPersistence;
	}

	/**
	 * Sets the user persistence.
	 *
	 * @param userPersistence the user persistence
	 */
	public void setUserPersistence(UserPersistence userPersistence) {
		this.userPersistence = userPersistence;
	}

	/**
	 * Performs an SQL query.
	 *
	 * @param sql the sql query to perform
	 */
	protected void runSQL(String sql) throws SystemException {
		try {
			DataSource dataSource = bookPersistence.getDataSource();

			SqlUpdate sqlUpdate = SqlUpdateFactoryUtil.getSqlUpdate(dataSource,
					sql, new int[0]);

			sqlUpdate.update();
		}
		catch (Exception e) {
			throw new SystemException(e);
		}
	}

	@BeanReference(type = PublisherLocalService.class)
	protected PublisherLocalService publisherLocalService;
	@BeanReference(type = PublisherPersistence.class)
	protected PublisherPersistence publisherPersistence;
	@BeanReference(type = BookLocalService.class)
	protected BookLocalService bookLocalService;
	@BeanReference(type = BookPersistence.class)
	protected BookPersistence bookPersistence;
	@BeanReference(type = CounterLocalService.class)
	protected CounterLocalService counterLocalService;
	@BeanReference(type = ResourceLocalService.class)
	protected ResourceLocalService resourceLocalService;
	@BeanReference(type = ResourceService.class)
	protected ResourceService resourceService;
	@BeanReference(type = ResourcePersistence.class)
	protected ResourcePersistence resourcePersistence;
	@BeanReference(type = UserLocalService.class)
	protected UserLocalService userLocalService;
	@BeanReference(type = UserService.class)
	protected UserService userService;
	@BeanReference(type = UserPersistence.class)
	protected UserPersistence userPersistence;
}
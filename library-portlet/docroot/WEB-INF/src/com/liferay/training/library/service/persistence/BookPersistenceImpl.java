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

import com.liferay.portal.NoSuchModelException;
import com.liferay.portal.kernel.bean.BeanReference;
import com.liferay.portal.kernel.cache.CacheRegistryUtil;
import com.liferay.portal.kernel.dao.orm.EntityCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.SQLQuery;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.InstanceFactory;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.model.ModelListener;
import com.liferay.portal.security.permission.InlineSQLHelperUtil;
import com.liferay.portal.service.persistence.BatchSessionUtil;
import com.liferay.portal.service.persistence.ResourcePersistence;
import com.liferay.portal.service.persistence.UserPersistence;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

import com.liferay.training.library.NoSuchBookException;
import com.liferay.training.library.model.Book;
import com.liferay.training.library.model.impl.BookImpl;
import com.liferay.training.library.model.impl.BookModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the book service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Eduardo Bohrer
 * @see BookPersistence
 * @see BookUtil
 * @generated
 */
public class BookPersistenceImpl extends BasePersistenceImpl<Book>
	implements BookPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link BookUtil} to access the book persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = BookImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST = FINDER_CLASS_NAME_ENTITY +
		".List";
	public static final FinderPath FINDER_PATH_FIND_BY_GROUPID = new FinderPath(BookModelImpl.ENTITY_CACHE_ENABLED,
			BookModelImpl.FINDER_CACHE_ENABLED, FINDER_CLASS_NAME_LIST,
			"findByGroupId",
			new String[] {
				Long.class.getName(),
				
			"java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});
	public static final FinderPath FINDER_PATH_COUNT_BY_GROUPID = new FinderPath(BookModelImpl.ENTITY_CACHE_ENABLED,
			BookModelImpl.FINDER_CACHE_ENABLED, FINDER_CLASS_NAME_LIST,
			"countByGroupId", new String[] { Long.class.getName() });
	public static final FinderPath FINDER_PATH_FIND_BY_PUBLISHER = new FinderPath(BookModelImpl.ENTITY_CACHE_ENABLED,
			BookModelImpl.FINDER_CACHE_ENABLED, FINDER_CLASS_NAME_LIST,
			"findByPublisher",
			new String[] {
				Long.class.getName(),
				
			"java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});
	public static final FinderPath FINDER_PATH_COUNT_BY_PUBLISHER = new FinderPath(BookModelImpl.ENTITY_CACHE_ENABLED,
			BookModelImpl.FINDER_CACHE_ENABLED, FINDER_CLASS_NAME_LIST,
			"countByPublisher", new String[] { Long.class.getName() });
	public static final FinderPath FINDER_PATH_FIND_ALL = new FinderPath(BookModelImpl.ENTITY_CACHE_ENABLED,
			BookModelImpl.FINDER_CACHE_ENABLED, FINDER_CLASS_NAME_LIST,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(BookModelImpl.ENTITY_CACHE_ENABLED,
			BookModelImpl.FINDER_CACHE_ENABLED, FINDER_CLASS_NAME_LIST,
			"countAll", new String[0]);

	/**
	 * Caches the book in the entity cache if it is enabled.
	 *
	 * @param book the book to cache
	 */
	public void cacheResult(Book book) {
		EntityCacheUtil.putResult(BookModelImpl.ENTITY_CACHE_ENABLED,
			BookImpl.class, book.getPrimaryKey(), book);
	}

	/**
	 * Caches the books in the entity cache if it is enabled.
	 *
	 * @param books the books to cache
	 */
	public void cacheResult(List<Book> books) {
		for (Book book : books) {
			if (EntityCacheUtil.getResult(BookModelImpl.ENTITY_CACHE_ENABLED,
						BookImpl.class, book.getPrimaryKey(), this) == null) {
				cacheResult(book);
			}
		}
	}

	/**
	 * Clears the cache for all books.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	public void clearCache() {
		CacheRegistryUtil.clear(BookImpl.class.getName());
		EntityCacheUtil.clearCache(BookImpl.class.getName());
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST);
	}

	/**
	 * Clears the cache for the book.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	public void clearCache(Book book) {
		EntityCacheUtil.removeResult(BookModelImpl.ENTITY_CACHE_ENABLED,
			BookImpl.class, book.getPrimaryKey());
	}

	/**
	 * Creates a new book with the primary key. Does not add the book to the database.
	 *
	 * @param bookId the primary key for the new book
	 * @return the new book
	 */
	public Book create(long bookId) {
		Book book = new BookImpl();

		book.setNew(true);
		book.setPrimaryKey(bookId);

		return book;
	}

	/**
	 * Removes the book with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the book to remove
	 * @return the book that was removed
	 * @throws com.liferay.portal.NoSuchModelException if a book with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public Book remove(Serializable primaryKey)
		throws NoSuchModelException, SystemException {
		return remove(((Long)primaryKey).longValue());
	}

	/**
	 * Removes the book with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param bookId the primary key of the book to remove
	 * @return the book that was removed
	 * @throws com.liferay.training.library.NoSuchBookException if a book with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public Book remove(long bookId) throws NoSuchBookException, SystemException {
		Session session = null;

		try {
			session = openSession();

			Book book = (Book)session.get(BookImpl.class, new Long(bookId));

			if (book == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + bookId);
				}

				throw new NoSuchBookException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					bookId);
			}

			return remove(book);
		}
		catch (NoSuchBookException nsee) {
			throw nsee;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected Book removeImpl(Book book) throws SystemException {
		book = toUnwrappedModel(book);

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.delete(session, book);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST);

		EntityCacheUtil.removeResult(BookModelImpl.ENTITY_CACHE_ENABLED,
			BookImpl.class, book.getPrimaryKey());

		return book;
	}

	public Book updateImpl(com.liferay.training.library.model.Book book,
		boolean merge) throws SystemException {
		book = toUnwrappedModel(book);

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.update(session, book, merge);

			book.setNew(false);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST);

		EntityCacheUtil.putResult(BookModelImpl.ENTITY_CACHE_ENABLED,
			BookImpl.class, book.getPrimaryKey(), book);

		return book;
	}

	protected Book toUnwrappedModel(Book book) {
		if (book instanceof BookImpl) {
			return book;
		}

		BookImpl bookImpl = new BookImpl();

		bookImpl.setNew(book.isNew());
		bookImpl.setPrimaryKey(book.getPrimaryKey());

		bookImpl.setBookId(book.getBookId());
		bookImpl.setCompanyId(book.getCompanyId());
		bookImpl.setGroupId(book.getGroupId());
		bookImpl.setPublisherId(book.getPublisherId());
		bookImpl.setTitle(book.getTitle());
		bookImpl.setAuthorName(book.getAuthorName());
		bookImpl.setPublicationDate(book.getPublicationDate());

		return bookImpl;
	}

	/**
	 * Finds the book with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the book to find
	 * @return the book
	 * @throws com.liferay.portal.NoSuchModelException if a book with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public Book findByPrimaryKey(Serializable primaryKey)
		throws NoSuchModelException, SystemException {
		return findByPrimaryKey(((Long)primaryKey).longValue());
	}

	/**
	 * Finds the book with the primary key or throws a {@link com.liferay.training.library.NoSuchBookException} if it could not be found.
	 *
	 * @param bookId the primary key of the book to find
	 * @return the book
	 * @throws com.liferay.training.library.NoSuchBookException if a book with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public Book findByPrimaryKey(long bookId)
		throws NoSuchBookException, SystemException {
		Book book = fetchByPrimaryKey(bookId);

		if (book == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + bookId);
			}

			throw new NoSuchBookException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				bookId);
		}

		return book;
	}

	/**
	 * Finds the book with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the book to find
	 * @return the book, or <code>null</code> if a book with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public Book fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		return fetchByPrimaryKey(((Long)primaryKey).longValue());
	}

	/**
	 * Finds the book with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param bookId the primary key of the book to find
	 * @return the book, or <code>null</code> if a book with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public Book fetchByPrimaryKey(long bookId) throws SystemException {
		Book book = (Book)EntityCacheUtil.getResult(BookModelImpl.ENTITY_CACHE_ENABLED,
				BookImpl.class, bookId, this);

		if (book == null) {
			Session session = null;

			try {
				session = openSession();

				book = (Book)session.get(BookImpl.class, new Long(bookId));
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (book != null) {
					cacheResult(book);
				}

				closeSession(session);
			}
		}

		return book;
	}

	/**
	 * Finds all the books where groupId = &#63;.
	 *
	 * @param groupId the group id to search with
	 * @return the matching books
	 * @throws SystemException if a system exception occurred
	 */
	public List<Book> findByGroupId(long groupId) throws SystemException {
		return findByGroupId(groupId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	public List<Book> findByGroupId(long groupId, int start, int end)
		throws SystemException {
		return findByGroupId(groupId, start, end, null);
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
	public List<Book> findByGroupId(long groupId, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		Object[] finderArgs = new Object[] {
				groupId,
				
				String.valueOf(start), String.valueOf(end),
				String.valueOf(orderByComparator)
			};

		List<Book> list = (List<Book>)FinderCacheUtil.getResult(FINDER_PATH_FIND_BY_GROUPID,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(3 +
						(orderByComparator.getOrderByFields().length * 3));
			}
			else {
				query = new StringBundler(3);
			}

			query.append(_SQL_SELECT_BOOK_WHERE);

			query.append(_FINDER_COLUMN_GROUPID_GROUPID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}

			else {
				query.append(BookModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(groupId);

				list = (List<Book>)QueryUtil.list(q, getDialect(), start, end);
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (list == null) {
					FinderCacheUtil.removeResult(FINDER_PATH_FIND_BY_GROUPID,
						finderArgs);
				}
				else {
					cacheResult(list);

					FinderCacheUtil.putResult(FINDER_PATH_FIND_BY_GROUPID,
						finderArgs, list);
				}

				closeSession(session);
			}
		}

		return list;
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
	public Book findByGroupId_First(long groupId,
		OrderByComparator orderByComparator)
		throws NoSuchBookException, SystemException {
		List<Book> list = findByGroupId(groupId, 0, 1, orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("groupId=");
			msg.append(groupId);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchBookException(msg.toString());
		}
		else {
			return list.get(0);
		}
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
	public Book findByGroupId_Last(long groupId,
		OrderByComparator orderByComparator)
		throws NoSuchBookException, SystemException {
		int count = countByGroupId(groupId);

		List<Book> list = findByGroupId(groupId, count - 1, count,
				orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("groupId=");
			msg.append(groupId);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchBookException(msg.toString());
		}
		else {
			return list.get(0);
		}
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
	public Book[] findByGroupId_PrevAndNext(long bookId, long groupId,
		OrderByComparator orderByComparator)
		throws NoSuchBookException, SystemException {
		Book book = findByPrimaryKey(bookId);

		Session session = null;

		try {
			session = openSession();

			Book[] array = new BookImpl[3];

			array[0] = getByGroupId_PrevAndNext(session, book, groupId,
					orderByComparator, true);

			array[1] = book;

			array[2] = getByGroupId_PrevAndNext(session, book, groupId,
					orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected Book getByGroupId_PrevAndNext(Session session, Book book,
		long groupId, OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_BOOK_WHERE);

		query.append(_FINDER_COLUMN_GROUPID_GROUPID_2);

		if (orderByComparator != null) {
			String[] orderByFields = orderByComparator.getOrderByFields();

			if (orderByFields.length > 0) {
				query.append(WHERE_AND);
			}

			for (int i = 0; i < orderByFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						query.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN);
					}
					else {
						query.append(WHERE_LESSER_THAN);
					}
				}
			}

			query.append(ORDER_BY_CLAUSE);

			for (int i = 0; i < orderByFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						query.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC);
					}
					else {
						query.append(ORDER_BY_DESC);
					}
				}
			}
		}

		else {
			query.append(BookModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(groupId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByValues(book);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<Book> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Filters by the user's permissions and finds all the books where groupId = &#63;.
	 *
	 * @param groupId the group id to search with
	 * @return the matching books that the user has permission to view
	 * @throws SystemException if a system exception occurred
	 */
	public List<Book> filterFindByGroupId(long groupId)
		throws SystemException {
		return filterFindByGroupId(groupId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
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
	public List<Book> filterFindByGroupId(long groupId, int start, int end)
		throws SystemException {
		return filterFindByGroupId(groupId, start, end, null);
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
	public List<Book> filterFindByGroupId(long groupId, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		if (!InlineSQLHelperUtil.isEnabled(groupId)) {
			return findByGroupId(groupId, start, end, orderByComparator);
		}

		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(3 +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(3);
		}

		if (getDB().isSupportsInlineDistinct()) {
			query.append(_FILTER_SQL_SELECT_BOOK_WHERE);
		}
		else {
			query.append(_FILTER_SQL_SELECT_BOOK_NO_INLINE_DISTINCT_WHERE_1);
		}

		query.append(_FINDER_COLUMN_GROUPID_GROUPID_2);

		if (!getDB().isSupportsInlineDistinct()) {
			query.append(_FILTER_SQL_SELECT_BOOK_NO_INLINE_DISTINCT_WHERE_2);
		}

		if (orderByComparator != null) {
			if (getDB().isSupportsInlineDistinct()) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_TABLE,
					orderByComparator);
			}
		}

		else {
			if (getDB().isSupportsInlineDistinct()) {
				query.append(BookModelImpl.ORDER_BY_JPQL);
			}
			else {
				query.append(BookModelImpl.ORDER_BY_SQL);
			}
		}

		String sql = InlineSQLHelperUtil.replacePermissionCheck(query.toString(),
				Book.class.getName(), _FILTER_COLUMN_PK, _FILTER_COLUMN_USERID,
				groupId);

		Session session = null;

		try {
			session = openSession();

			SQLQuery q = session.createSQLQuery(sql);

			if (getDB().isSupportsInlineDistinct()) {
				q.addEntity(_FILTER_ENTITY_ALIAS, BookImpl.class);
			}
			else {
				q.addEntity(_FILTER_ENTITY_TABLE, BookImpl.class);
			}

			QueryPos qPos = QueryPos.getInstance(q);

			qPos.add(groupId);

			return (List<Book>)QueryUtil.list(q, getDialect(), start, end);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	/**
	 * Finds all the books where publisherId = &#63;.
	 *
	 * @param publisherId the publisher id to search with
	 * @return the matching books
	 * @throws SystemException if a system exception occurred
	 */
	public List<Book> findByPublisher(long publisherId)
		throws SystemException {
		return findByPublisher(publisherId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
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
	public List<Book> findByPublisher(long publisherId, int start, int end)
		throws SystemException {
		return findByPublisher(publisherId, start, end, null);
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
	public List<Book> findByPublisher(long publisherId, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		Object[] finderArgs = new Object[] {
				publisherId,
				
				String.valueOf(start), String.valueOf(end),
				String.valueOf(orderByComparator)
			};

		List<Book> list = (List<Book>)FinderCacheUtil.getResult(FINDER_PATH_FIND_BY_PUBLISHER,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(3 +
						(orderByComparator.getOrderByFields().length * 3));
			}
			else {
				query = new StringBundler(3);
			}

			query.append(_SQL_SELECT_BOOK_WHERE);

			query.append(_FINDER_COLUMN_PUBLISHER_PUBLISHERID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}

			else {
				query.append(BookModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(publisherId);

				list = (List<Book>)QueryUtil.list(q, getDialect(), start, end);
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (list == null) {
					FinderCacheUtil.removeResult(FINDER_PATH_FIND_BY_PUBLISHER,
						finderArgs);
				}
				else {
					cacheResult(list);

					FinderCacheUtil.putResult(FINDER_PATH_FIND_BY_PUBLISHER,
						finderArgs, list);
				}

				closeSession(session);
			}
		}

		return list;
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
	public Book findByPublisher_First(long publisherId,
		OrderByComparator orderByComparator)
		throws NoSuchBookException, SystemException {
		List<Book> list = findByPublisher(publisherId, 0, 1, orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("publisherId=");
			msg.append(publisherId);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchBookException(msg.toString());
		}
		else {
			return list.get(0);
		}
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
	public Book findByPublisher_Last(long publisherId,
		OrderByComparator orderByComparator)
		throws NoSuchBookException, SystemException {
		int count = countByPublisher(publisherId);

		List<Book> list = findByPublisher(publisherId, count - 1, count,
				orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("publisherId=");
			msg.append(publisherId);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchBookException(msg.toString());
		}
		else {
			return list.get(0);
		}
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
	public Book[] findByPublisher_PrevAndNext(long bookId, long publisherId,
		OrderByComparator orderByComparator)
		throws NoSuchBookException, SystemException {
		Book book = findByPrimaryKey(bookId);

		Session session = null;

		try {
			session = openSession();

			Book[] array = new BookImpl[3];

			array[0] = getByPublisher_PrevAndNext(session, book, publisherId,
					orderByComparator, true);

			array[1] = book;

			array[2] = getByPublisher_PrevAndNext(session, book, publisherId,
					orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected Book getByPublisher_PrevAndNext(Session session, Book book,
		long publisherId, OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_BOOK_WHERE);

		query.append(_FINDER_COLUMN_PUBLISHER_PUBLISHERID_2);

		if (orderByComparator != null) {
			String[] orderByFields = orderByComparator.getOrderByFields();

			if (orderByFields.length > 0) {
				query.append(WHERE_AND);
			}

			for (int i = 0; i < orderByFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						query.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN);
					}
					else {
						query.append(WHERE_LESSER_THAN);
					}
				}
			}

			query.append(ORDER_BY_CLAUSE);

			for (int i = 0; i < orderByFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						query.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC);
					}
					else {
						query.append(ORDER_BY_DESC);
					}
				}
			}
		}

		else {
			query.append(BookModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(publisherId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByValues(book);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<Book> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Finds all the books.
	 *
	 * @return the books
	 * @throws SystemException if a system exception occurred
	 */
	public List<Book> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	public List<Book> findAll(int start, int end) throws SystemException {
		return findAll(start, end, null);
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
	public List<Book> findAll(int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		Object[] finderArgs = new Object[] {
				String.valueOf(start), String.valueOf(end),
				String.valueOf(orderByComparator)
			};

		List<Book> list = (List<Book>)FinderCacheUtil.getResult(FINDER_PATH_FIND_ALL,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_BOOK);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_BOOK.concat(BookModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (orderByComparator == null) {
					list = (List<Book>)QueryUtil.list(q, getDialect(), start,
							end, false);

					Collections.sort(list);
				}
				else {
					list = (List<Book>)QueryUtil.list(q, getDialect(), start,
							end);
				}
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (list == null) {
					FinderCacheUtil.removeResult(FINDER_PATH_FIND_ALL,
						finderArgs);
				}
				else {
					cacheResult(list);

					FinderCacheUtil.putResult(FINDER_PATH_FIND_ALL, finderArgs,
						list);
				}

				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Removes all the books where groupId = &#63; from the database.
	 *
	 * @param groupId the group id to search with
	 * @throws SystemException if a system exception occurred
	 */
	public void removeByGroupId(long groupId) throws SystemException {
		for (Book book : findByGroupId(groupId)) {
			remove(book);
		}
	}

	/**
	 * Removes all the books where publisherId = &#63; from the database.
	 *
	 * @param publisherId the publisher id to search with
	 * @throws SystemException if a system exception occurred
	 */
	public void removeByPublisher(long publisherId) throws SystemException {
		for (Book book : findByPublisher(publisherId)) {
			remove(book);
		}
	}

	/**
	 * Removes all the books from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	public void removeAll() throws SystemException {
		for (Book book : findAll()) {
			remove(book);
		}
	}

	/**
	 * Counts all the books where groupId = &#63;.
	 *
	 * @param groupId the group id to search with
	 * @return the number of matching books
	 * @throws SystemException if a system exception occurred
	 */
	public int countByGroupId(long groupId) throws SystemException {
		Object[] finderArgs = new Object[] { groupId };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_GROUPID,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_BOOK_WHERE);

			query.append(_FINDER_COLUMN_GROUPID_GROUPID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(groupId);

				count = (Long)q.uniqueResult();
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (count == null) {
					count = Long.valueOf(0);
				}

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_GROUPID,
					finderArgs, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Filters by the user's permissions and counts all the books where groupId = &#63;.
	 *
	 * @param groupId the group id to search with
	 * @return the number of matching books that the user has permission to view
	 * @throws SystemException if a system exception occurred
	 */
	public int filterCountByGroupId(long groupId) throws SystemException {
		if (!InlineSQLHelperUtil.isEnabled(groupId)) {
			return countByGroupId(groupId);
		}

		StringBundler query = new StringBundler(2);

		query.append(_FILTER_SQL_COUNT_BOOK_WHERE);

		query.append(_FINDER_COLUMN_GROUPID_GROUPID_2);

		String sql = InlineSQLHelperUtil.replacePermissionCheck(query.toString(),
				Book.class.getName(), _FILTER_COLUMN_PK, _FILTER_COLUMN_USERID,
				groupId);

		Session session = null;

		try {
			session = openSession();

			SQLQuery q = session.createSQLQuery(sql);

			q.addScalar(COUNT_COLUMN_NAME,
				com.liferay.portal.kernel.dao.orm.Type.LONG);

			QueryPos qPos = QueryPos.getInstance(q);

			qPos.add(groupId);

			Long count = (Long)q.uniqueResult();

			return count.intValue();
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	/**
	 * Counts all the books where publisherId = &#63;.
	 *
	 * @param publisherId the publisher id to search with
	 * @return the number of matching books
	 * @throws SystemException if a system exception occurred
	 */
	public int countByPublisher(long publisherId) throws SystemException {
		Object[] finderArgs = new Object[] { publisherId };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_PUBLISHER,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_BOOK_WHERE);

			query.append(_FINDER_COLUMN_PUBLISHER_PUBLISHERID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(publisherId);

				count = (Long)q.uniqueResult();
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (count == null) {
					count = Long.valueOf(0);
				}

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_PUBLISHER,
					finderArgs, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Counts all the books.
	 *
	 * @return the number of books
	 * @throws SystemException if a system exception occurred
	 */
	public int countAll() throws SystemException {
		Object[] finderArgs = new Object[0];

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_ALL,
				finderArgs, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_BOOK);

				count = (Long)q.uniqueResult();
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (count == null) {
					count = Long.valueOf(0);
				}

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_ALL, finderArgs,
					count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Initializes the book persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.liferay.training.library.model.Book")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<Book>> listenersList = new ArrayList<ModelListener<Book>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<Book>)InstanceFactory.newInstance(
							listenerClassName));
				}

				listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
			}
			catch (Exception e) {
				_log.error(e);
			}
		}
	}

	public void destroy() {
		EntityCacheUtil.removeCache(BookImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST);
	}

	@BeanReference(type = PublisherPersistence.class)
	protected PublisherPersistence publisherPersistence;
	@BeanReference(type = BookPersistence.class)
	protected BookPersistence bookPersistence;
	@BeanReference(type = ResourcePersistence.class)
	protected ResourcePersistence resourcePersistence;
	@BeanReference(type = UserPersistence.class)
	protected UserPersistence userPersistence;
	private static final String _SQL_SELECT_BOOK = "SELECT book FROM Book book";
	private static final String _SQL_SELECT_BOOK_WHERE = "SELECT book FROM Book book WHERE ";
	private static final String _SQL_COUNT_BOOK = "SELECT COUNT(book) FROM Book book";
	private static final String _SQL_COUNT_BOOK_WHERE = "SELECT COUNT(book) FROM Book book WHERE ";
	private static final String _FINDER_COLUMN_GROUPID_GROUPID_2 = "book.groupId = ?";
	private static final String _FINDER_COLUMN_PUBLISHER_PUBLISHERID_2 = "book.publisherId = ?";
	private static final String _FILTER_SQL_SELECT_BOOK_WHERE = "SELECT DISTINCT {book.*} FROM Library_Book book WHERE ";
	private static final String _FILTER_SQL_SELECT_BOOK_NO_INLINE_DISTINCT_WHERE_1 =
		"SELECT {Library_Book.*} FROM (SELECT DISTINCT book.bookId FROM Library_Book book WHERE ";
	private static final String _FILTER_SQL_SELECT_BOOK_NO_INLINE_DISTINCT_WHERE_2 =
		") TEMP_TABLE INNER JOIN Library_Book ON TEMP_TABLE.bookId = Library_Book.bookId";
	private static final String _FILTER_SQL_COUNT_BOOK_WHERE = "SELECT COUNT(DISTINCT book.bookId) AS COUNT_VALUE FROM Library_Book book WHERE ";
	private static final String _FILTER_COLUMN_PK = "book.bookId";
	private static final String _FILTER_COLUMN_USERID = null;
	private static final String _FILTER_ENTITY_ALIAS = "book";
	private static final String _FILTER_ENTITY_TABLE = "Library_Book";
	private static final String _ORDER_BY_ENTITY_ALIAS = "book.";
	private static final String _ORDER_BY_ENTITY_TABLE = "Library_Book.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No Book exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No Book exists with the key {";
	private static Log _log = LogFactoryUtil.getLog(BookPersistenceImpl.class);
}
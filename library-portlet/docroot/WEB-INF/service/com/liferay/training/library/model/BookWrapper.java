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

package com.liferay.training.library.model;

/**
 * <p>
 * This class is a wrapper for {@link Book}.
 * </p>
 *
 * @author    Eduardo Bohrer
 * @see       Book
 * @generated
 */
public class BookWrapper implements Book {
	public BookWrapper(Book book) {
		_book = book;
	}

	/**
	* Gets the primary key of this book.
	*
	* @return the primary key of this book
	*/
	public long getPrimaryKey() {
		return _book.getPrimaryKey();
	}

	/**
	* Sets the primary key of this book
	*
	* @param pk the primary key of this book
	*/
	public void setPrimaryKey(long pk) {
		_book.setPrimaryKey(pk);
	}

	/**
	* Gets the book id of this book.
	*
	* @return the book id of this book
	*/
	public long getBookId() {
		return _book.getBookId();
	}

	/**
	* Sets the book id of this book.
	*
	* @param bookId the book id of this book
	*/
	public void setBookId(long bookId) {
		_book.setBookId(bookId);
	}

	/**
	* Gets the company id of this book.
	*
	* @return the company id of this book
	*/
	public long getCompanyId() {
		return _book.getCompanyId();
	}

	/**
	* Sets the company id of this book.
	*
	* @param companyId the company id of this book
	*/
	public void setCompanyId(long companyId) {
		_book.setCompanyId(companyId);
	}

	/**
	* Gets the group id of this book.
	*
	* @return the group id of this book
	*/
	public long getGroupId() {
		return _book.getGroupId();
	}

	/**
	* Sets the group id of this book.
	*
	* @param groupId the group id of this book
	*/
	public void setGroupId(long groupId) {
		_book.setGroupId(groupId);
	}

	/**
	* Gets the publisher id of this book.
	*
	* @return the publisher id of this book
	*/
	public long getPublisherId() {
		return _book.getPublisherId();
	}

	/**
	* Sets the publisher id of this book.
	*
	* @param publisherId the publisher id of this book
	*/
	public void setPublisherId(long publisherId) {
		_book.setPublisherId(publisherId);
	}

	/**
	* Gets the title of this book.
	*
	* @return the title of this book
	*/
	public java.lang.String getTitle() {
		return _book.getTitle();
	}

	/**
	* Gets the localized title of this book. Uses the default language if no localization exists for the requested language.
	*
	* @param locale the locale to get the localized title for
	* @return the localized title of this book
	*/
	public java.lang.String getTitle(java.util.Locale locale) {
		return _book.getTitle(locale);
	}

	/**
	* Gets the localized title of this book, optionally using the default language if no localization exists for the requested language.
	*
	* @param locale the local to get the localized title for
	* @param useDefault whether to use the default language if no localization exists for the requested language
	* @return the localized title of this book. If <code>useDefault</code> is <code>false</code> and no localization exists for the requested language, an empty string will be returned.
	*/
	public java.lang.String getTitle(java.util.Locale locale, boolean useDefault) {
		return _book.getTitle(locale, useDefault);
	}

	/**
	* Gets the localized title of this book. Uses the default language if no localization exists for the requested language.
	*
	* @param languageId the id of the language to get the localized title for
	* @return the localized title of this book
	*/
	public java.lang.String getTitle(java.lang.String languageId) {
		return _book.getTitle(languageId);
	}

	/**
	* Gets the localized title of this book, optionally using the default language if no localization exists for the requested language.
	*
	* @param languageId the id of the language to get the localized title for
	* @param useDefault whether to use the default language if no localization exists for the requested language
	* @return the localized title of this book
	*/
	public java.lang.String getTitle(java.lang.String languageId,
		boolean useDefault) {
		return _book.getTitle(languageId, useDefault);
	}

	/**
	* Gets a map of the locales and localized title of this book.
	*
	* @return the locales and localized title
	*/
	public java.util.Map<java.util.Locale, java.lang.String> getTitleMap() {
		return _book.getTitleMap();
	}

	/**
	* Sets the title of this book.
	*
	* @param title the title of this book
	*/
	public void setTitle(java.lang.String title) {
		_book.setTitle(title);
	}

	/**
	* Sets the localized title of this book.
	*
	* @param locale the locale to set the localized title for
	* @param title the localized title of this book
	*/
	public void setTitle(java.util.Locale locale, java.lang.String title) {
		_book.setTitle(locale, title);
	}

	/**
	* Sets the localized titles of this book from the map of locales and localized titles.
	*
	* @param titleMap the locales and localized titles of this book
	*/
	public void setTitleMap(
		java.util.Map<java.util.Locale, java.lang.String> titleMap) {
		_book.setTitleMap(titleMap);
	}

	/**
	* Gets the author name of this book.
	*
	* @return the author name of this book
	*/
	public java.lang.String getAuthorName() {
		return _book.getAuthorName();
	}

	/**
	* Sets the author name of this book.
	*
	* @param authorName the author name of this book
	*/
	public void setAuthorName(java.lang.String authorName) {
		_book.setAuthorName(authorName);
	}

	/**
	* Gets the publication date of this book.
	*
	* @return the publication date of this book
	*/
	public java.util.Date getPublicationDate() {
		return _book.getPublicationDate();
	}

	/**
	* Sets the publication date of this book.
	*
	* @param publicationDate the publication date of this book
	*/
	public void setPublicationDate(java.util.Date publicationDate) {
		_book.setPublicationDate(publicationDate);
	}

	public boolean isNew() {
		return _book.isNew();
	}

	public void setNew(boolean n) {
		_book.setNew(n);
	}

	public boolean isCachedModel() {
		return _book.isCachedModel();
	}

	public void setCachedModel(boolean cachedModel) {
		_book.setCachedModel(cachedModel);
	}

	public boolean isEscapedModel() {
		return _book.isEscapedModel();
	}

	public void setEscapedModel(boolean escapedModel) {
		_book.setEscapedModel(escapedModel);
	}

	public java.io.Serializable getPrimaryKeyObj() {
		return _book.getPrimaryKeyObj();
	}

	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _book.getExpandoBridge();
	}

	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_book.setExpandoBridgeAttributes(serviceContext);
	}

	public java.lang.Object clone() {
		return new BookWrapper((Book)_book.clone());
	}

	public int compareTo(com.liferay.training.library.model.Book book) {
		return _book.compareTo(book);
	}

	public int hashCode() {
		return _book.hashCode();
	}

	public com.liferay.training.library.model.Book toEscapedModel() {
		return new BookWrapper(_book.toEscapedModel());
	}

	public java.lang.String toString() {
		return _book.toString();
	}

	public java.lang.String toXmlString() {
		return _book.toXmlString();
	}

	public Book getWrappedBook() {
		return _book;
	}

	private Book _book;
}
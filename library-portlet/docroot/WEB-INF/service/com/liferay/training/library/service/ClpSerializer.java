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

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.model.BaseModel;

import com.liferay.training.library.model.BookClp;
import com.liferay.training.library.model.PublisherClp;

import java.lang.reflect.Method;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author Brian Wing Shun Chan
 */
public class ClpSerializer {
	public static final String SERVLET_CONTEXT_NAME = "library-portlet";

	public static void setClassLoader(ClassLoader classLoader) {
		_classLoader = classLoader;
	}

	public static Object translateInput(BaseModel<?> oldModel) {
		Class<?> oldModelClass = oldModel.getClass();

		String oldModelClassName = oldModelClass.getName();

		if (oldModelClassName.equals(PublisherClp.class.getName())) {
			PublisherClp oldCplModel = (PublisherClp)oldModel;

			ClassLoader contextClassLoader = Thread.currentThread()
												   .getContextClassLoader();

			try {
				Thread.currentThread().setContextClassLoader(_classLoader);

				try {
					Class<?> newModelClass = Class.forName("com.liferay.training.library.model.impl.PublisherImpl",
							true, _classLoader);

					Object newModel = newModelClass.newInstance();

					Method method0 = newModelClass.getMethod("setPublisherId",
							new Class[] { Long.TYPE });

					Long value0 = new Long(oldCplModel.getPublisherId());

					method0.invoke(newModel, value0);

					Method method1 = newModelClass.getMethod("setCompanyId",
							new Class[] { Long.TYPE });

					Long value1 = new Long(oldCplModel.getCompanyId());

					method1.invoke(newModel, value1);

					Method method2 = newModelClass.getMethod("setGroupId",
							new Class[] { Long.TYPE });

					Long value2 = new Long(oldCplModel.getGroupId());

					method2.invoke(newModel, value2);

					Method method3 = newModelClass.getMethod("setName",
							new Class[] { String.class });

					String value3 = oldCplModel.getName();

					method3.invoke(newModel, value3);

					Method method4 = newModelClass.getMethod("setEmailAddress",
							new Class[] { String.class });

					String value4 = oldCplModel.getEmailAddress();

					method4.invoke(newModel, value4);

					Method method5 = newModelClass.getMethod("setWebsite",
							new Class[] { String.class });

					String value5 = oldCplModel.getWebsite();

					method5.invoke(newModel, value5);

					Method method6 = newModelClass.getMethod("setPhoneNumber",
							new Class[] { String.class });

					String value6 = oldCplModel.getPhoneNumber();

					method6.invoke(newModel, value6);

					return newModel;
				}
				catch (Exception e) {
					_log.error(e, e);
				}
			}
			finally {
				Thread.currentThread().setContextClassLoader(contextClassLoader);
			}
		}

		if (oldModelClassName.equals(BookClp.class.getName())) {
			BookClp oldCplModel = (BookClp)oldModel;

			ClassLoader contextClassLoader = Thread.currentThread()
												   .getContextClassLoader();

			try {
				Thread.currentThread().setContextClassLoader(_classLoader);

				try {
					Class<?> newModelClass = Class.forName("com.liferay.training.library.model.impl.BookImpl",
							true, _classLoader);

					Object newModel = newModelClass.newInstance();

					Method method0 = newModelClass.getMethod("setBookId",
							new Class[] { Long.TYPE });

					Long value0 = new Long(oldCplModel.getBookId());

					method0.invoke(newModel, value0);

					Method method1 = newModelClass.getMethod("setCompanyId",
							new Class[] { Long.TYPE });

					Long value1 = new Long(oldCplModel.getCompanyId());

					method1.invoke(newModel, value1);

					Method method2 = newModelClass.getMethod("setGroupId",
							new Class[] { Long.TYPE });

					Long value2 = new Long(oldCplModel.getGroupId());

					method2.invoke(newModel, value2);

					Method method3 = newModelClass.getMethod("setPublisherId",
							new Class[] { Long.TYPE });

					Long value3 = new Long(oldCplModel.getPublisherId());

					method3.invoke(newModel, value3);

					Method method4 = newModelClass.getMethod("setTitle",
							new Class[] { String.class });

					String value4 = oldCplModel.getTitle();

					method4.invoke(newModel, value4);

					Method method5 = newModelClass.getMethod("setAuthorName",
							new Class[] { String.class });

					String value5 = oldCplModel.getAuthorName();

					method5.invoke(newModel, value5);

					Method method6 = newModelClass.getMethod("setPublicationDate",
							new Class[] { Date.class });

					Date value6 = oldCplModel.getPublicationDate();

					method6.invoke(newModel, value6);

					return newModel;
				}
				catch (Exception e) {
					_log.error(e, e);
				}
			}
			finally {
				Thread.currentThread().setContextClassLoader(contextClassLoader);
			}
		}

		return oldModel;
	}

	public static Object translateInput(List<Object> oldList) {
		List<Object> newList = new ArrayList<Object>(oldList.size());

		for (int i = 0; i < oldList.size(); i++) {
			Object curObj = oldList.get(i);

			newList.add(translateInput(curObj));
		}

		return newList;
	}

	public static Object translateInput(Object obj) {
		if (obj instanceof BaseModel<?>) {
			return translateInput((BaseModel<?>)obj);
		}
		else if (obj instanceof List<?>) {
			return translateInput((List<Object>)obj);
		}
		else {
			return obj;
		}
	}

	public static Object translateOutput(BaseModel<?> oldModel) {
		Class<?> oldModelClass = oldModel.getClass();

		String oldModelClassName = oldModelClass.getName();

		if (oldModelClassName.equals(
					"com.liferay.training.library.model.impl.PublisherImpl")) {
			ClassLoader contextClassLoader = Thread.currentThread()
												   .getContextClassLoader();

			try {
				Thread.currentThread().setContextClassLoader(_classLoader);

				try {
					PublisherClp newModel = new PublisherClp();

					Method method0 = oldModelClass.getMethod("getPublisherId");

					Long value0 = (Long)method0.invoke(oldModel, (Object[])null);

					newModel.setPublisherId(value0);

					Method method1 = oldModelClass.getMethod("getCompanyId");

					Long value1 = (Long)method1.invoke(oldModel, (Object[])null);

					newModel.setCompanyId(value1);

					Method method2 = oldModelClass.getMethod("getGroupId");

					Long value2 = (Long)method2.invoke(oldModel, (Object[])null);

					newModel.setGroupId(value2);

					Method method3 = oldModelClass.getMethod("getName");

					String value3 = (String)method3.invoke(oldModel,
							(Object[])null);

					newModel.setName(value3);

					Method method4 = oldModelClass.getMethod("getEmailAddress");

					String value4 = (String)method4.invoke(oldModel,
							(Object[])null);

					newModel.setEmailAddress(value4);

					Method method5 = oldModelClass.getMethod("getWebsite");

					String value5 = (String)method5.invoke(oldModel,
							(Object[])null);

					newModel.setWebsite(value5);

					Method method6 = oldModelClass.getMethod("getPhoneNumber");

					String value6 = (String)method6.invoke(oldModel,
							(Object[])null);

					newModel.setPhoneNumber(value6);

					return newModel;
				}
				catch (Exception e) {
					_log.error(e, e);
				}
			}
			finally {
				Thread.currentThread().setContextClassLoader(contextClassLoader);
			}
		}

		if (oldModelClassName.equals(
					"com.liferay.training.library.model.impl.BookImpl")) {
			ClassLoader contextClassLoader = Thread.currentThread()
												   .getContextClassLoader();

			try {
				Thread.currentThread().setContextClassLoader(_classLoader);

				try {
					BookClp newModel = new BookClp();

					Method method0 = oldModelClass.getMethod("getBookId");

					Long value0 = (Long)method0.invoke(oldModel, (Object[])null);

					newModel.setBookId(value0);

					Method method1 = oldModelClass.getMethod("getCompanyId");

					Long value1 = (Long)method1.invoke(oldModel, (Object[])null);

					newModel.setCompanyId(value1);

					Method method2 = oldModelClass.getMethod("getGroupId");

					Long value2 = (Long)method2.invoke(oldModel, (Object[])null);

					newModel.setGroupId(value2);

					Method method3 = oldModelClass.getMethod("getPublisherId");

					Long value3 = (Long)method3.invoke(oldModel, (Object[])null);

					newModel.setPublisherId(value3);

					Method method4 = oldModelClass.getMethod("getTitle");

					String value4 = (String)method4.invoke(oldModel,
							(Object[])null);

					newModel.setTitle(value4);

					Method method5 = oldModelClass.getMethod("getAuthorName");

					String value5 = (String)method5.invoke(oldModel,
							(Object[])null);

					newModel.setAuthorName(value5);

					Method method6 = oldModelClass.getMethod(
							"getPublicationDate");

					Date value6 = (Date)method6.invoke(oldModel, (Object[])null);

					newModel.setPublicationDate(value6);

					return newModel;
				}
				catch (Exception e) {
					_log.error(e, e);
				}
			}
			finally {
				Thread.currentThread().setContextClassLoader(contextClassLoader);
			}
		}

		return oldModel;
	}

	public static Object translateOutput(List<Object> oldList) {
		List<Object> newList = new ArrayList<Object>(oldList.size());

		for (int i = 0; i < oldList.size(); i++) {
			Object curObj = oldList.get(i);

			newList.add(translateOutput(curObj));
		}

		return newList;
	}

	public static Object translateOutput(Object obj) {
		if (obj instanceof BaseModel<?>) {
			return translateOutput((BaseModel<?>)obj);
		}
		else if (obj instanceof List<?>) {
			return translateOutput((List<Object>)obj);
		}
		else {
			return obj;
		}
	}

	private static Log _log = LogFactoryUtil.getLog(ClpSerializer.class);
	private static ClassLoader _classLoader;
}
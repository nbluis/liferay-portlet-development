/**
 * Copyright (c) 2000-2010 Liferay, Inc. All rights reserved.
 *
 * The contents of this file are subject to the terms of the Liferay Enterprise
 * Subscription License ("License"). You may not use this file except in
 * compliance with the License. You can obtain a copy of the License by
 * contacting Liferay, Inc. See the License for the specific language governing
 * permissions and limitations under the License, including but not limited to
 * distribution rights of the Software.
 *
 *
 *
 */

package com.liferay.training.library;

import com.liferay.portal.NoSuchModelException;

/**
 * @author Eduardo Bohrer
 */
public class NoSuchPublisherException extends NoSuchModelException {

	public NoSuchPublisherException() {
		super();
	}

	public NoSuchPublisherException(String msg) {
		super(msg);
	}

	public NoSuchPublisherException(String msg, Throwable cause) {
		super(msg, cause);
	}

	public NoSuchPublisherException(Throwable cause) {
		super(cause);
	}

}
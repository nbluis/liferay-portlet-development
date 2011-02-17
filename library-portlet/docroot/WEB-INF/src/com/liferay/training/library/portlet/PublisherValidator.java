package com.liferay.training.library.portlet;

import java.util.List;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.training.library.model.Publisher;

public class PublisherValidator {
	/**
	 * Verify publisher
	 * 
	 * @param publisher
	 *            to be validated
	 * @param errors
	 *            to populate with any errors
	 */
	public static boolean validatePublisher(Publisher publisher, List<String> errors) {
		boolean valid = true;

		if (Validator.isNull(publisher.getName())) {
			errors.add("publishername-required");
			valid = false;
		}

		if (Validator.isNull(publisher.getEmailAddress())) {
			errors.add("publisheremail-required");
			valid = false;
		}

		if (!Validator.isEmailAddress(publisher.getEmailAddress())) {
			errors.add("publisheremail-format-error");
			valid = false;
		}

		if (Validator.isNull(publisher.getPhoneNumber())) {
			errors.add("publisherphonenumber-required");
			valid = false;
		}

		if (!Validator.isPhoneNumber(publisher.getPhoneNumber())) {
			errors.add("publisherphonenumber-format-error");
			valid = false;
		}

		return valid;
	}

}
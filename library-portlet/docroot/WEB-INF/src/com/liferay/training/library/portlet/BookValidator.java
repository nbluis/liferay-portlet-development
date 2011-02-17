package com.liferay.training.library.portlet;

import java.text.SimpleDateFormat;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.training.library.model.Book;
import java.util.List;

public class BookValidator {

	/**
	 * Validate book
	 * 
	 * @param book
	 *            to be validated
	 * @param errors
	 *            to populate with any errors
	 */

	public static boolean validateBook(Book book, List<String> errors) {
		boolean valid = true;

		if (Validator.isNull(book.getTitle())) {
			errors.add("booktitle-required");
			valid = false;
		}

		if (Validator.isNull(book.getAuthorName())) {
			errors.add("bookauthorname-required");
			valid = false;
		}

		if (Validator.isNull(book.getPublicationDate())) {
			errors.add("bookpublicationdate-required");
			valid = false;
		}

		if (Validator.isNull(book.getPublisherId())) {
			errors.add("publisher-required");
			valid = false;
		}

		return valid;
	}

	public static boolean validatePreferences(String rowsPerPage, String dateFormat, List<String> errors) {

		boolean valid = true;

		if (Validator.isNull(rowsPerPage)) {
			errors.add("rowsperpage-required");
			valid = false;
		} else if (!Validator.isNumber(rowsPerPage)) {
			errors.add("rowsperpage-invalid");
			valid = false;
		}

		if (Validator.isNull(dateFormat)) {
			errors.add("dateformat-required");
			valid = false;
		} else {
			try {
				new SimpleDateFormat(dateFormat);
			} catch (Exception e) {
				errors.add("dateformat-invalid");
				valid = false;
			}
		}

		return valid;
	}

}

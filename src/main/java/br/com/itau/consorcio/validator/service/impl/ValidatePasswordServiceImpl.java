package br.com.itau.consorcio.validator.service.impl;

import org.springframework.stereotype.Service;

import br.com.itau.consorcio.validator.service.ValidatePasswordService;

@Service
public class ValidatePasswordServiceImpl implements ValidatePasswordService {

	public boolean validation(String password) {
		boolean result = false;
		try {
			if (password != null) {
				final String MIN_LENGHT = "8";
				final String MAX_LENGHT = "";

				final String ONE_DIGIT = "(?=.*[0-9])"; // (?=.*[0-9]) a digit must occur at least once
				final String LOWER_CASE = "(?=.*[a-z])"; // (?=.*[a-z]) a lower case letter must occur at least once
				final String UPPER_CASE = "(?=.*[A-Z])"; // (?=.*[A-Z]) an upper case letter must occur at least once
				final String NO_SPACE = "(?=\\S+$)"; // (?=\\S+$) no whitespace allowed in the entire string
				final String MIN_MAX_CHAR = ".{" + MIN_LENGHT + "," + MAX_LENGHT + "}"; // .{5,10} represents minimum of
														
				final String SPECIAL_CHAR = "(?=.*[!@#$%^&*()-+])";
				final String PATTERN = ONE_DIGIT + LOWER_CASE + UPPER_CASE + SPECIAL_CHAR + NO_SPACE + MIN_MAX_CHAR;

				result = password.matches(PATTERN);

			}

		} catch (Exception ex) {
			result = false;
		}

		return result;
	}

}

package br.com.itau.consorcio.validatepassword;

import org.junit.jupiter.api.Test;

import br.com.itau.consorcio.validator.service.impl.ValidatePasswordServiceImpl;
import junit.framework.TestCase;

public class ValidatorPasswordTest extends TestCase {


	private ValidatePasswordServiceImpl validateService;
	
	@Test
	public void teste() {
		/**
		 * IsValid("") // false IsValid("aa") // false IsValid("ab") // false
		 * IsValid("AAAbbbCc") // false IsValid("AbTp9!foo") // false
		 * IsValid("AbTp9!foA") // false IsValid("AbTp9 fok") // false
		 * IsValid("AbTp9!fok") // true
		 * 
		 * 
		 */
		
		validateService = new ValidatePasswordServiceImpl();

		final String PASSWORD = "AbTp9!fok";

		boolean retornoEsperado = true;

		boolean retornoValidado = validateService.validation(PASSWORD);

		assertEquals(retornoEsperado, retornoValidado);
	}
}

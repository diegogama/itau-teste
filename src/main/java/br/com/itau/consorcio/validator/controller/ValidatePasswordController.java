package br.com.itau.consorcio.validator.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.itau.consorcio.validator.service.ValidatePasswordService;

@RestController
@RequestMapping("/validate")
public class ValidatePasswordController {
	
	@Autowired
	private ValidatePasswordService validateService;
	
	@GetMapping("/{password}")
	public boolean validate(@PathVariable String password) {
		return validateService.validation(password);
	}
	

}

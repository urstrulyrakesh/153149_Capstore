package com.capgemini.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.capgemini.service.PromoValidation;

@RestController
public class PromoValidationController {

	@Autowired
	private PromoValidation promovalidation;
	
	@RequestMapping(value="/validatePromo")
	public String validatePromo( int id, String code)
	{
		return promovalidation.validatingPromo(id,code);
	}
	@RequestMapping(value="/removePromo")
	public String removePromo( int id, String code)
	{
		return promovalidation.removePromo(id, code);
	}
}

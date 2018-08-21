package com.capgemini.service;


public interface PromoValidation {

	public String validatingPromo(int orderId,String promoname);
	public String removePromo(int orderId, String promoname);
}

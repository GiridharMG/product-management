package com.tyss.productmanagement.controller;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.tyss.productmanagement.beans.ProductResponce;

@RestControllerAdvice
public class ProductControllerAdvice {
	@ExceptionHandler(Exception.class)
	public ProductResponce getResponce() {
		ProductResponce responce = new ProductResponce();
		responce.setStatusCode(501);
		responce.setMessage("Exception");
		responce.setDescription("Something went wrong");
		return responce;
	}
}

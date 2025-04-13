package com.shihri.springRest.exception;

import com.shihri.springRest.exception.controller.ProductExceptionController;

public class ProductNotFoundException extends RuntimeException {
    private static final long serialVersionUID = 1L;


    public ProductNotFoundException(String message){
        super(message);
    }
}

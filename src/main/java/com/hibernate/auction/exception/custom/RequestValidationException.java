package com.hibernate.auction.exception.custom;

/**
 * @author Alber Rashad
 * @created 12/09/2023
 * @description
 */
public class RequestValidationException extends RuntimeException{
    public RequestValidationException(String message){super(message);}
}

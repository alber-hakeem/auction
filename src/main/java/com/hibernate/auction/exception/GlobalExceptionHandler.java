package com.hibernate.auction.exception;

import com.hibernate.auction.exception.custom.RequestValidationException;
import com.hibernate.auction.helper.ApiResponse;
import com.hibernate.auction.helper.ApiResponseBuilder;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import javax.persistence.EntityNotFoundException;

/**
 * @author Alber Rashad
 * @created 11/09/2023
 * @description
 */

@ControllerAdvice
@AllArgsConstructor
public class GlobalExceptionHandler extends ResponseEntityExceptionHandler {

    private final ApiResponseBuilder apiResponseBuilder;

    @ExceptionHandler(EntityNotFoundException.class)
    protected ResponseEntity handleEntityNotFoundException(EntityNotFoundException exception){

        ApiResponse apiResponse=apiResponseBuilder.buildFailureResponse(exception.getMessage());
        return new ResponseEntity<>(apiResponse, HttpStatus.NOT_FOUND);

    }

    @ExceptionHandler(RequestValidationException.class)
    protected ResponseEntity handleBusinessException(RequestValidationException ex){
        ApiResponse apiResponse= apiResponseBuilder.buildFailureResponse(ex.getMessage());
        return new ResponseEntity(apiResponse,HttpStatus.BAD_REQUEST);
    }
}

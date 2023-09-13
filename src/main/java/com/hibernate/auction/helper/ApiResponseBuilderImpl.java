package com.hibernate.auction.helper;

import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author Alber Rashad
 * @created 11/09/2023
 * @description
 */
@Component
public class ApiResponseBuilderImpl<T> implements ApiResponseBuilder<T>{
    @Override
    public ApiResponse<T> buildApiResponse(String message, T t) {
        return  ApiResponse.<T>builder().response(t).message(message).build();
    }

    @Override
    public ApiResponse<List<T>> buildApiResponse(String message, List<T> t) {
        return ApiResponse.<List<T>>builder().message(message).response(t).build();
    }

    @Override
    public ApiResponse<T> buildFailureResponse(String message) {
        return ApiResponse.<T>builder().message(message).build();
    }


}

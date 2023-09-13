package com.hibernate.auction.helper;

import java.util.List;

/**
 * @author Alber Rashad
 * @created 11/09/2023
 * @description
 */
public interface ApiResponseBuilder<T> {

     ApiResponse<T>  buildApiResponse(String Message,T t);

     ApiResponse<List<T>>  buildApiResponse(String Message, List<T> t);

     ApiResponse<T> buildFailureResponse(String Message);


}

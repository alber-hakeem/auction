package com.hibernate.auction.helper;

import lombok.Builder;
import lombok.Data;

import java.util.Map;
import java.util.Set;

/**
 * @author Alber Rashad
 * @created 11/09/2023
 * @description
 */
@Builder
@Data
public class ApiResponse<T> {
    private String message;
    private String detailedMessage;
    private Map<String, Set<String>> errors;
    T response;

}

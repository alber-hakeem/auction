package com.hibernate.auction.dto;

import lombok.Data;

/**
 * @author Alber Rashad
 * @created 15/09/2023
 * @description
 */

@Data
public class UserDto extends BaseDto{

    private Long id;
    private String userName;
}

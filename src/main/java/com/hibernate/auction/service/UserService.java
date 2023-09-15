package com.hibernate.auction.service;

import com.hibernate.auction.model.User;

/**
 * @author Alber Rashad
 * @created 15/09/2023
 * @description
 */
public interface UserService {

    User findById(Long id);
}

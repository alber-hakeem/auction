package com.hibernate.auction.repository;

import com.hibernate.auction.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Alber Rashad
 * @created 15/09/2023
 * @description
 */
public interface UserRepo extends JpaRepository<User,Long> {
}

package com.hibernate.auction.service;

import com.hibernate.auction.model.User;
import com.hibernate.auction.repository.UserRepo;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;

/**
 * @author Alber Rashad
 * @created 15/09/2023
 * @description
 */
@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepo userRepo;

    @Override
    public User findById(Long id) {
        return userRepo.findById(id).orElseThrow(() -> new EntityNotFoundException("User Is Not Exist"));
    }
}

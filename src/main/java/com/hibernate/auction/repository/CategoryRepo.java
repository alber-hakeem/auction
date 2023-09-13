package com.hibernate.auction.repository;

import com.hibernate.auction.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Alber Rashad
 * @created 11/09/2023
 * @description
 */
public interface CategoryRepo extends JpaRepository<Category,Long> {

}

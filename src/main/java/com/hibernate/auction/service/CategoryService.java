package com.hibernate.auction.service;

import com.hibernate.auction.dto.CategoryDto;
import com.hibernate.auction.model.Category;

import java.util.List;

/**
 * @author Alber Rashad
 * @created 11/09/2023
 * @description
 */
public interface CategoryService {

    Category create(Category category);
    List<Category> findAll();

    Category findById(Long id);

    CategoryDto findCategoryDtoById(Long id);

}


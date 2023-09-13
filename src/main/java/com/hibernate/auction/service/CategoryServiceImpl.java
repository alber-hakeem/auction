package com.hibernate.auction.service;

import com.hibernate.auction.model.Category;
import com.hibernate.auction.repository.CategoryRepo;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.HttpRequestMethodNotSupportedException;

import javax.persistence.EntityNotFoundException;
import java.util.List;
import java.util.Optional;
import java.util.Set;

/**
 * @author Alber Rashad
 * @created 11/09/2023
 * @description
 */
@Service
@AllArgsConstructor
public class CategoryServiceImpl implements CategoryService{
    private final CategoryRepo categoryRepo;

    @Override
    public Category create(Category category) {
        return categoryRepo.save(category);
    }

    @Override
    public List<Category> findAll() {
        return categoryRepo.findAll();
    }

    @Override
    public Category findById(Long id)  {

        Optional<Category> category= categoryRepo.findById(id);
        if(!category.isPresent())
            throw new EntityNotFoundException("This Category Is Not Exist");
        return category.get();

    }
}

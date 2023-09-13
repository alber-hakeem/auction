package com.hibernate.auction.service;

import com.hibernate.auction.exception.custom.RequestValidationException;
import com.hibernate.auction.model.Category;
import com.hibernate.auction.model.Item;
import com.hibernate.auction.repository.ItemRepo;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

/**
 * @author Alber Rashad
 * @created 12/09/2023
 * @description
 */

@Service
@AllArgsConstructor
public class ItemServiceImpl implements ItemService{

    private final ItemRepo itemRepo;
    private final CategoryService categoryService;
    @Override
    public Item create(Item item) {
        if(item.getCategory()==null)
            throw new RequestValidationException("Category Shouldn't be null");
        setCategory(item);
        return itemRepo.save(item);
    }

    private void setCategory(Item item) {
        Category category=categoryService.findById(item.getCategory().getId());
        item.setCategory(category);
    }

    @Override
    public Item findById(Long id) {
        return itemRepo.findById(id).
                orElseThrow(()->new EntityNotFoundException("This Item Is Not Exist"));
    }
    @Override
    public List<Item> findAll() {
        return itemRepo.findAll();
    }

    @Override
    @Transactional
    public void delete(Long id) {

        Item item=itemRepo.findById(id).
                orElseThrow(()->new EntityNotFoundException("This Item Is Not Exist"));

       itemRepo.delete(item);
    }
}

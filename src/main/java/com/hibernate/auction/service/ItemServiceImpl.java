package com.hibernate.auction.service;

import com.hibernate.auction.exception.custom.RequestValidationException;
import com.hibernate.auction.model.Bid;
import com.hibernate.auction.model.Category;
import com.hibernate.auction.model.Item;
import com.hibernate.auction.model.User;
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
public class ItemServiceImpl implements ItemService {

    private final ItemRepo itemRepo;
    private final CategoryService categoryService;
    private final UserService userService;

    @Override
    public Item create(Item item) {
        if (item.getCategory() == null)
            throw new RequestValidationException("Category Shouldn't be null");
        setCategory(item);
        return itemRepo.save(item);
    }

    private void setCategory(Item item) {
        Category category = categoryService.findById(item.getCategory().getId());
        item.setCategory(category);
    }

    @Override
    public Item findById(Long id) {
        return itemRepo.findById(id).
                orElseThrow(() -> new EntityNotFoundException("This Item Is Not Exist"));
    }

    @Override
    public List<Item> findAll() {
        return itemRepo.findAll();
    }

    @Override
    @Transactional
    public void delete(Long id) {
        Item item = findById(id);
        itemRepo.delete(item);
    }

    @Override
    @Transactional
    public Item addBid(Long itemId,Bid bid) {
        Item item = findById(itemId);
        User user= userService.findById(bid.getUser().getId());
        bid.setUser(user);
        item.addBid(bid);
        itemRepo.save(item);
        return item;
    }

    @Override
    public Item removeBid(Long itemId,Bid bid) {
        return null;
    }
}

package com.hibernate.auction.service;

import com.hibernate.auction.model.Item;

import java.util.List;

/**
 * @author Alber Rashad
 * @created 12/09/2023
 * @description
 */
public interface ItemService {

    Item create(Item item);

    Item findById(Long id);

    List<Item> findAll();

    void delete(Long id);


}

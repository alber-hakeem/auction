package com.hibernate.auction.repository;

import com.hibernate.auction.model.Item;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Alber Rashad
 * @created 12/09/2023
 * @description
 */
public interface ItemRepo extends JpaRepository<Item,Long> {
}

package com.hibernate.auction.dto;

import com.hibernate.auction.model.Item;
import com.hibernate.auction.model.User;
import lombok.Data;

import java.math.BigDecimal;

/**
 * @author Alber Rashad
 * @created 15/09/2023
 * @description
 */
@Data
public class BidDto extends BaseDto{

    private long id;
    private Item item;
    private BigDecimal value;
    private User user;

}

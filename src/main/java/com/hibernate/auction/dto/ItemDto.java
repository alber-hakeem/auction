package com.hibernate.auction.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.hibernate.auction.model.Bid;
import com.hibernate.auction.model.Category;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

/**
 * @author Alber Rashad
 * @created 15/09/2023
 * @description
 */
public class ItemDto extends BaseDto{

    private Long id;

    private String name;

    private CategoryDto category;
}


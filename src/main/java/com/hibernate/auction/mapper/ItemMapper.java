package com.hibernate.auction.mapper;

import com.hibernate.auction.dto.ItemDto;
import com.hibernate.auction.model.Item;
import org.mapstruct.Mapper;

/**
 * @author Alber Rashad
 * @created 15/09/2023
 * @description
 */
@Mapper(componentModel = "spring")
public interface ItemMapper extends BaseMapper<Item, ItemDto> {
}

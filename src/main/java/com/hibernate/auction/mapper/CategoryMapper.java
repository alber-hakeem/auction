package com.hibernate.auction.mapper;

import com.hibernate.auction.dto.CategoryDto;
import com.hibernate.auction.model.Category;
import org.mapstruct.Mapper;

/**
 * @author Alber Rashad
 * @created 15/09/2023
 * @description
 */
@Mapper(componentModel = "spring")
public interface CategoryMapper extends BaseMapper<Category,CategoryDto> {

}

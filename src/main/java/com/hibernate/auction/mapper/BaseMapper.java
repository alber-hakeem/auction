package com.hibernate.auction.mapper;

import com.hibernate.auction.dto.BaseDto;
import com.hibernate.auction.model.BaseEntity;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Alber Rashad
 * @created 15/09/2023
 * @description
 */


public interface BaseMapper<Entity extends BaseEntity,Dto extends BaseDto> {

    Entity dtoToEntity(Dto dto);

    Dto entityToDto(Entity entity);


    default List<Entity> DtoToEntity(List<Dto> dtos){
        return dtos.stream().map(dto->dtoToEntity(dto)).collect(Collectors.toList());
    }

    default List<Dto> entityToDto(List<Entity> entities){
        return entities.stream().map(entity -> entityToDto(entity)).collect(Collectors.toList());
    }
}

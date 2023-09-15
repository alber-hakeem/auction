package com.hibernate.auction.mapper;

import com.hibernate.auction.dto.UserDto;
import com.hibernate.auction.model.User;
import org.mapstruct.Mapper;
import org.springframework.boot.autoconfigure.security.SecurityProperties;

/**
 * @author Alber Rashad
 * @created 15/09/2023
 * @description
 */

@Mapper(componentModel = "spring")
public interface UserMapper extends BaseMapper<User, UserDto> {
}

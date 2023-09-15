package com.hibernate.auction.mapper;

import com.hibernate.auction.dto.BidDto;
import com.hibernate.auction.model.Bid;
import org.mapstruct.Mapper;

/**
 * @author Alber Rashad
 * @created 15/09/2023
 * @description
 */
@Mapper(componentModel = "spring")
public interface BidMapper extends BaseMapper<Bid, BidDto> {
}

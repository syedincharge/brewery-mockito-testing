package com.rizvi.mockito.brewery.web.mappers;

import com.rizvi.mockito.brewery.domain.Beer;
import com.rizvi.mockito.brewery.domain.BeerOrder;
import com.rizvi.mockito.brewery.domain.BeerOrderLine;
import com.rizvi.mockito.brewery.web.model.BeerOrderDto;
import com.rizvi.mockito.brewery.web.model.BeerOrderLineDto;
import org.mapstruct.Mapper;

@Mapper(uses = DateMapper.class)
public interface BeerOrderMapper {

    BeerOrderDto beerOrderToDto(BeerOrder beerOrder);

    BeerOrder dtoToBeerOrder(BeerOrderDto dto);

    BeerOrderLineDto beerOrderLineToDto(BeerOrderLine line);

    default BeerOrderLine dtoToBeerOrder(BeerOrderLineDto dto){
        return BeerOrderLine.builder()
                .orderQuantity(dto.getOrderQuantity())
                .beer(Beer.builder().id(dto.getBeerId()).build())
                .build();
    }
}

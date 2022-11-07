package com.rizvi.mockito.brewery.web.mappers;


import com.rizvi.mockito.brewery.domain.Beer;
import com.rizvi.mockito.brewery.web.model.BeerDto;
import org.mapstruct.Mapper;

@Mapper(uses = DateMapper.class)
public interface BeerMapper {

    BeerDto beerToBeerDto(Beer beer);

    Beer beerDtoToBeer(BeerDto beerDto);
}

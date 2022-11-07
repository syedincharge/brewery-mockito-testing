package com.rizvi.mockito.brewery.services;


import com.rizvi.mockito.brewery.web.model.BeerDto;
import com.rizvi.mockito.brewery.web.model.BeerPagedList;
import com.rizvi.mockito.brewery.web.model.BeerStyleEnum;
import org.springframework.data.domain.PageRequest;

import java.util.UUID;

public interface BeerService {
    BeerPagedList listBeers(String beerName, BeerStyleEnum beerStyle, PageRequest pageRequest);

    BeerDto findBeerById(UUID beerId);
}

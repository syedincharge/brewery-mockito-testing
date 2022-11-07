package com.rizvi.mockito.brewery.repositories;


import com.rizvi.mockito.brewery.domain.Beer;
import com.rizvi.mockito.brewery.domain.BeerInventory;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.UUID;

public interface BeerInventoryRepository extends JpaRepository<BeerInventory, UUID> {

    List<BeerInventory> findAllByBeer(Beer beer);
}

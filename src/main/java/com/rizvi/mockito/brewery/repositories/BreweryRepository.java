package com.rizvi.mockito.brewery.repositories;

import com.rizvi.mockito.brewery.domain.Brewery;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface BreweryRepository extends JpaRepository<Brewery, UUID> {
}

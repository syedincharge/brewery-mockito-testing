package com.rizvi.mockito.brewery.web.controllers;

import com.rizvi.mockito.brewery.domain.Customer;
import com.rizvi.mockito.brewery.repositories.CustomerRepository;
import com.rizvi.mockito.brewery.web.model.BeerOrderPagedList;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;

import static org.assertj.core.api.Java6Assertions.assertThat;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class BeerOrderControllerIT {

    @Autowired
    private TestRestTemplate testRestTemplate;

    @Autowired
    CustomerRepository customerRepository;

    Customer customer;

    @BeforeEach
    void setUp() {
        customer = customerRepository.findAll().get(0);
    }

    @Test
    void testListOrders() {
        String url = "/api/v1/customers/" + customer.getId().toString() + " /orders";

        BeerOrderPagedList pagedList = testRestTemplate.getForObject(url, BeerOrderPagedList.class);

        assertThat(pagedList.getContent()).hasSize(1);
    }
}


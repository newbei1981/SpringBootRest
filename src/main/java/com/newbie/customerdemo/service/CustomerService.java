package com.newbie.customerdemo.service;

import com.newbie.customerdemo.model.Customer;

import java.util.List;

/**
 * Service interface for {@link Customer} class.
 */

public interface CustomerService {

    Customer getById(Long id);

    void save(Customer customer);

    void delete(Long id);

    List<Customer> getAll();
}

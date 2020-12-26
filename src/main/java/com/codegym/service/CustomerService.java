package com.codegym.service;

import com.codegym.model.Customer;

public interface CustomerService {
    public Customer save(Customer entity);

    public Customer findOne(Long id);

    public boolean exists(Long id);

    public Iterable<Customer> findAll();

    public long count();

    public void delete(Long id);

    public void delete(Customer entity);
}

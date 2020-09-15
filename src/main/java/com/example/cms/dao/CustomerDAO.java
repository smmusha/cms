package com.example.cms.dao;

import com.example.cms.model.Customer;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CustomerDAO extends CrudRepository<Customer, Integer> {
    @Override
    List<Customer> findAll();
}

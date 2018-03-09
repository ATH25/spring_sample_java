package com.thomas.repository;

import java.util.List;

import com.thomas.model.Customer;

public interface CustomerRepository {

	List<Customer> findAll();

}
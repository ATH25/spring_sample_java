package com.thomas.repository;

import java.util.ArrayList;
import java.util.List;

import com.thomas.model.Customer;

public class HibernateCustomerRepositoryImpl implements CustomerRepository {
	
	/* (non-Javadoc)
	 * @see com.thomas.repository.CustomerRepository#findAll()
	 */
	@Override
	public List<Customer> findAll(){
		
		List<Customer> customers = new ArrayList<>();
		Customer customer = new Customer();
		customer.setFirstName("Aju");
		customer.setLastName("Thomas");
		customers.add(customer);
		return customers; 
	}

}

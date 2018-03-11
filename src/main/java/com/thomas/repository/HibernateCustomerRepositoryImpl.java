package com.thomas.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

import com.thomas.model.Customer;

@Repository("customerRepository")
public class HibernateCustomerRepositoryImpl implements CustomerRepository {

	@Value("${dbUsername}")
	String dbUsername;
	
	/* (non-Javadoc)
	 * @see com.thomas.repository.CustomerRepository#findAll()
	 */
	@Override
	public List<Customer> findAll(){
		
		System.out.println("dbUsername ::" + dbUsername);
		List<Customer> customers = new ArrayList<>();
		Customer customer = new Customer();
		customer.setFirstName("Aju");
		customer.setLastName("Thomas");
		customers.add(customer);
		return customers; 
	}

}

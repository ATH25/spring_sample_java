package com.thomas.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.thomas.model.Customer;
import com.thomas.repository.CustomerRepository;

@Service("customerService")
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class CustomerServiceImpl implements CustomerService {
	
	

	public CustomerServiceImpl() {
		System.out.println("We are using constructor injection. Inside CustomerServiceImpl ::");
	}
	
	//@Autowired
	private CustomerRepository customerRepository;

	public CustomerServiceImpl(CustomerRepository customerRepository) {
		System.out.println("We are using constructor injection. Inside CustomerServiceImpl(CustomerRepository customerRepository) ::");
		this.customerRepository = customerRepository;
	}
	
	@Autowired
	public void setCustomerRepository(CustomerRepository customerRepository) {
		System.out.println("We are using setter injection. Inside setCustomerRepository ::");
		this.customerRepository = customerRepository;
	}

	/* (non-Javadoc)
	 * @see com.thomas.service.CustomerService#findAll()
	 */
	@Override
	public List<Customer> findAll() {
		return customerRepository.findAll();
	}

}

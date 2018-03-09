import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.thomas.repository.CustomerRepository;
import com.thomas.repository.HibernateCustomerRepositoryImpl;
import com.thomas.service.CustomerService;
import com.thomas.service.CustomerServiceImpl;

@Configuration
public class AppConfig {
	
	@Bean(name="customerService")
	public CustomerService getCustomerService(){
		CustomerServiceImpl service = new CustomerServiceImpl(getCustomerRepository());
		//service.setCustomerRepository(getCustomerRepository() );
		return service;
	}
	
	@Bean(name="customerRepository")
	public CustomerRepository getCustomerRepository(){
		return new HibernateCustomerRepositoryImpl();
	}

}

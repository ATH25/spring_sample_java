import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

import com.thomas.repository.CustomerRepository;
import com.thomas.repository.HibernateCustomerRepositoryImpl;
import com.thomas.service.CustomerService;
import com.thomas.service.CustomerServiceImpl;

@Configuration
@ComponentScan({ "com.thomas" })
@PropertySource("app.properties")
public class AppConfig {

	@Bean
	public static PropertySourcesPlaceholderConfigurer getPropertySourcesPlaceholderConfigurer() {
		return new PropertySourcesPlaceholderConfigurer();
	}
	
	/*
	@Bean(name="customerService")
	public CustomerService getCustomerService(){
		System.out.println("### Inside AppConfig.getCustomerService ###");
		//CustomerServiceImpl service = new CustomerServiceImpl(getCustomerRepository());
		CustomerServiceImpl service = new CustomerServiceImpl();
		//service.setCustomerRepository(getCustomerRepository() );
		return service;
	}
	*/
	
	/*	@Bean(name="customerRepository")
	public CustomerRepository getCustomerRepository(){
		System.out.println("### Inside AppConfig.getCustomerRepository ###");
		return new HibernateCustomerRepositoryImpl();
	}*/

}

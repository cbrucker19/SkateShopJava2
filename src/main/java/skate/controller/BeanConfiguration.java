package skate.controller;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import skate.beans.Customer;
import skate.beans.Inventory;
import skate.beans.Item;
import skate.beans.Order;

@Configuration
public class BeanConfiguration {
	
	@Bean
	public Customer customer() {
		Customer bean = new Customer();
		return bean;
	}

	@Bean
	public Inventory inventory() {
		Inventory bean = new Inventory();
		return bean;
	}
	
	@Bean
	public Item item() {
		Item bean = new Item();
		return bean;
	}
	
	@Bean
	public Order order() {
		Order bean = new Order();
		return bean;
	}
	@Bean
	public DataSource dataSource() {
	    DriverManagerDataSource dataSource = new DriverManagerDataSource();

	    dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
	    dataSource.setUsername("root");
	    dataSource.setPassword("password");
	    dataSource.setUrl(
	      "jdbc:mysql://localhost:3306/skate?createDatabaseIfNotExist=true"); 
	    
	    return dataSource;
	}
}

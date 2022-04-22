package skate.controller;

<<<<<<< HEAD
import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import skate.beans.Customer;
import skate.beans.Inventory;
import skate.beans.Item;
=======
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import skate.beans.Address;
import skate.beans.Customer;
import skate.beans.Inventory;
import skate.beans.Items;
>>>>>>> 1653ea3 (commit)
import skate.beans.Order;

@Configuration
public class BeanConfiguration {
<<<<<<< HEAD
	
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
=======

	@Bean
	public Customer customer() {
		Customer bean = new Customer();
		bean.setOrganization("none");
		return bean;
	}
	
	@Bean 
	public Address address() {
		Address bean = new Address();
		return bean;
	}
	
	@Bean 
	public Items items () {
		Items bean = new Items();
		return bean;
	}
	
	@Bean 
>>>>>>> 1653ea3 (commit)
	public Order order() {
		Order bean = new Order();
		return bean;
	}
<<<<<<< HEAD
	@Bean
	public DataSource dataSource() {
	    DriverManagerDataSource dataSource = new DriverManagerDataSource();

	    dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
	    dataSource.setUsername("root");
	    dataSource.setPassword("password");
	    dataSource.setUrl(
	      "jdbc:mysql://localhost:3306/skate?createDatabaseIfNotExist=true"); 
	    
	    return dataSource;
=======
	
	@Bean 
	public Inventory inventory() {
		Inventory bean = new Inventory();
		return bean;
>>>>>>> 1653ea3 (commit)
	}
}

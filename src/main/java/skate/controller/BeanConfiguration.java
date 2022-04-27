package skate.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import skate.beans.Customer;
import skate.beans.Inventory;
import skate.beans.Item;
import skate.beans.Order;

@Configuration
public class BeanConfiguration {

	@Bean
	public Customer customer() {
		Customer bean = new Customer();
		bean.setOrganization("none");
		return bean;
	}
	
	@Bean 
	public Item items () {
		Item bean = new Item();
		return bean;
	}
	
	@Bean 
	public Order order() {
		Order bean = new Order();
		return bean;
	}
	
	@Bean 
	public Inventory inventory() {
		Inventory bean = new Inventory();
		return bean;
	}
}

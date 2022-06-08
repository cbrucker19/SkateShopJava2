package skate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import skate.controller.BeanConfiguration;
import skate.repository.CustomerRepository;
import skate.repository.InventoryRepository;

@SpringBootApplication

public class SkateShopJ2Application {

	public static void main(String[] args) {
		SpringApplication.run(SkateShopJ2Application.class, args);
	}

	@Autowired
	CustomerRepository custRepo;
	@Autowired
	InventoryRepository invRepo;
	
	public void run(String...args)throws Exception {
		ApplicationContext appContext = new AnnotationConfigApplicationContext(BeanConfiguration.class);

		((AbstractApplicationContext) appContext).close();
	}
	
}

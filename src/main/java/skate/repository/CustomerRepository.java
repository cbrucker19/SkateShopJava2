package skate.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import skate.beans.Customer;

@Repository 
public interface CustomerRepository extends JpaRepository<Customer, Long>{
	
}
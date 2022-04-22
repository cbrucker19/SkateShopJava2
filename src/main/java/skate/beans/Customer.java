package skate.beans;
import javax.annotation.ManagedBean;
import javax.persistence.Entity;
import javax.persistence.Id;


import javax.persistence.CascadeType;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.ManyToMany;

import org.springframework.beans.factory.annotation.Autowired;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@AllArgsConstructor
public class Customer {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long customerId;
	private String firstName;
	private String lastName;
	private String organization;
	private String email;
	@Autowired
	@ManyToMany(cascade=CascadeType.ALL, fetch=FetchType.EAGER)
	private Address address;


	public Customer(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	public Customer(long customerId, String organization) {
		super();
		this.customerId = customerId;
		this.organization = organization;
	}
	
	public Customer(long customerId, String firstName, String lastName, String organization) {
		super();
		this.customerId = customerId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.organization = organization;
	}
}


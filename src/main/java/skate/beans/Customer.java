package skate.beans;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import org.springframework.beans.factory.annotation.Autowired;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
public class Customer {
	@Id
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


package skate.beans;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@AllArgsConstructor
@Table(name = "CUSTOMER")
public class Customer {
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private long customerId;
	
	private String firstName;
	private String lastName;
	private String organization;
	private String email;
	private String orgAddress;

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

}


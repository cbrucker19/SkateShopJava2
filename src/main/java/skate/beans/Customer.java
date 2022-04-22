package skate.beans;
import javax.annotation.ManagedBean;
import javax.persistence.Entity;
import javax.persistence.Id;

//Manuel Corral Ledezma
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

//CYRUS BRUCKER
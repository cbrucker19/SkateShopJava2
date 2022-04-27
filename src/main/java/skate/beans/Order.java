package skate.beans;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
public class Order {
	//primary key
	@Id
	//many orders one customer
	@ManyToOne
	private long customerId;
	//cant have 2 primary keys
	@GeneratedValue(strategy= GenerationType.AUTO)
	private long orderId;
	private Double subtotal;
	private Double taxes;
	private Double finalTotal;
	//TODO fill this in type that mysql accepts - hibernate error on type
	private List<Items> orderItems;
	
	public Order(long customerId, long orderId, List<Items> orderItems) {
		super();
		this.customerId = customerId;
		this.orderId = orderId;
		this.orderItems = orderItems;
	}
}
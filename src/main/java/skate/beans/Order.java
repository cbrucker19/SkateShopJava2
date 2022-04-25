package skate.beans;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.GeneratedValue;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
public class Order {
	//primary key
	@Id
	@GeneratedValue
	private long customerId;
	@Id
	@GeneratedValue
	private long orderId;
	private Double subtotal;
	private Double taxes;
	private Double finalTotal;
	private Double discount;
	@Autowired
	private List<Items> orderItems;
	
	public Order(long customerId, long orderId, List<Items> orderItems) {
		super();
		this.customerId = customerId;
		this.orderId = orderId;
		this.orderItems = orderItems;
	}
}

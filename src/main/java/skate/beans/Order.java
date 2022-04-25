package skate.beans;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.CascadeType;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.ManyToMany;

import org.springframework.beans.factory.annotation.Autowired;

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
	@Autowired
	@ManyToMany(cascade=CascadeType.ALL, fetch=FetchType.EAGER)
	private Double subtotal;
	private Double taxes;
	private Double finalTotal;
	private Double discount;
	private List<Items> orderContents;
	
	
	
	public Order() {
		super();
	}


	public Order(long customerId, long orderId, List<Items> orderItem) {
		super();
		this.customerId = customerId;
		this.orderId = orderId;
		this.orderContents = orderItem;
	}
}

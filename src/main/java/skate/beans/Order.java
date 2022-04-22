package skate.beans;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
public class Order {
	//primary key
	private long customerId;
	@Id
	private long orderId;
	private ArrayList<Item> orderContents = new ArrayList<Item>();
	
	public Order(long customerId, long orderId, ArrayList<Item> orderItem) {
		super();
		this.customerId = customerId;
		this.orderId = orderId;
		this.orderContents = orderItem;
	}
}

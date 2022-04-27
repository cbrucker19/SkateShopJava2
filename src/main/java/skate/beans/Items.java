package skate.beans;

import javax.persistence.GeneratedValue;
import javax.persistence.Table;

import org.springframework.data.annotation.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "ITEM")
//item quantity would be defined in inventory
public class Items {
	@Id
	@GeneratedValue
	private long itemId;
	private String itemName;
	private String itemDescription;
	private Double itemPrice;
	private String itemLocation;
	



	public Items(long itemId, String itemName, Double itemPrice ) {
		super();
		this.itemId = itemId;
		this.itemName = itemName;
		this.itemPrice = itemPrice;
	}
}

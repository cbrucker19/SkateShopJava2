package skate.beans;
import javax.persistence.Entity;
import javax.persistence.Id;

//Manuel Corral Ledezma
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
public class Inventory {
	@Id
	private long itemId;
	private String itemName;
	private String itemLocation;
	private String itemDescription;
	
	public Inventory(long itemId, String itemName) {
		super();
		this.itemId = itemId;
		this.itemName = itemName;
	}
	
	public Inventory(long itemId, String itemName, String itemLocation, String itemDescription) {
		super();
		this.itemId = itemId;
		this.itemName = itemName;
		this.itemLocation = itemLocation;
		this.itemDescription = itemDescription;
	}
}

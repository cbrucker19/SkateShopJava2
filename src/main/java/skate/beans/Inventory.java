package skate.beans;

import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//need to merge so item description is displayed next to stock value
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "INVENTORY")
public class Inventory {
	@Id
	private long itemId;
	private int stock;
}

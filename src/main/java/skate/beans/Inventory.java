package skate.beans;

import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//need to merge so item description is displayed next to stock value
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Inventory {
	@Id
	private long itemId;
	private int stock;
}

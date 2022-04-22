/**
 * @author Chase Van Blair - crvanblair
 * CIS175 - Fall 2021
 * Apr 18, 2022
 */
package skate.beans;


import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
public class Item {
	@Id
	private int itemID;
	private double itemPrice;
	private String itemName;
	
}

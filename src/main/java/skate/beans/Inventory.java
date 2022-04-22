package skate.beans;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@AllArgsConstructor
public class Inventory {
	@Id
	@javax.persistence.GeneratedValue
	private long itemId;
}

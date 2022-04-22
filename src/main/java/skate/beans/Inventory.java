package skate.beans;
<<<<<<< HEAD
import javax.persistence.Entity;
import javax.persistence.Id;

//Manuel Corral Ledezma
=======

import org.springframework.data.annotation.Id;

import jakarta.persistence.GeneratedValue;
import lombok.AllArgsConstructor;
>>>>>>> 1653ea3 (commit)
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
<<<<<<< HEAD
@Entity
public class Inventory {
	@Id
=======
@AllArgsConstructor
public class Inventory {
	@Id
	@GeneratedValue
>>>>>>> 1653ea3 (commit)
	private long itemId;
}

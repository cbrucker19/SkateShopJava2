package skate.beans;
<<<<<<< HEAD
import javax.persistence.Entity;
import javax.persistence.Id;

=======

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
>>>>>>> b2364f8e7dc2fcb15174558d969969948c7f829d
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
<<<<<<< HEAD
@Entity
=======
>>>>>>> b2364f8e7dc2fcb15174558d969969948c7f829d
@AllArgsConstructor

public class Inventory {
	@Id
<<<<<<< HEAD
	@javax.persistence.GeneratedValue
=======
	@GeneratedValue
>>>>>>> b2364f8e7dc2fcb15174558d969969948c7f829d
	private long itemId;
}

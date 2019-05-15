package jpa.test.model.configcopy;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("orderer")
public class OrdererNodeConfigCopy extends NodeConfigCopy{

	
	
	public OrdererNodeConfigCopy() {

	}

	public OrdererNodeConfigCopy(String name) {
		super(name);
	}

}

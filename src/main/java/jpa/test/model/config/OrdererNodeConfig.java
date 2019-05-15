package jpa.test.model.config;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("orderer")
public class OrdererNodeConfig extends NodeConfig{

	
	
	public OrdererNodeConfig() {

	}

	public OrdererNodeConfig(String name) {
		super(name);
	}

}

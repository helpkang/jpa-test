package jpa.test.model.config;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("orderer")
public class OrdererNodeConfig extends NodeConfig{

	private static final long serialVersionUID = 1L;
	
	public OrdererNodeConfig() {

	}

	public OrdererNodeConfig(String name) {
		super(name);
	}

}

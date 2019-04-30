package net.guides.springboot2.springboot2jpacrudexample.model.config;

import javax.persistence.DiscriminatorValue;
@DiscriminatorValue("orderer")
public class OrdererNodeConfig extends NodeConfig{

	private static final long serialVersionUID = 1L;
	
	public OrdererNodeConfig() {

	}

	public OrdererNodeConfig(String name) {
		super(name);
	}

}

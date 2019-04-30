package net.guides.springboot2.springboot2jpacrudexample.model.config;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("ca")
public class CaNodeConfig extends NodeConfig{

	
	private static final long serialVersionUID = 1L;

	public CaNodeConfig() {

	}

	public CaNodeConfig(String name) {
		super(name);
	}

}

package jpa.test.model.config;

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

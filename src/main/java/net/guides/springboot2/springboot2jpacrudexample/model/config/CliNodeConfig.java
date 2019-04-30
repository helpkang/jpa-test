package net.guides.springboot2.springboot2jpacrudexample.model.config;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("cli")
public class CliNodeConfig extends NodeConfig{
	
	private static final long serialVersionUID = 1L;
	
	public CliNodeConfig() {

	}

	public CliNodeConfig(String name) {
		super(name);
	}

}

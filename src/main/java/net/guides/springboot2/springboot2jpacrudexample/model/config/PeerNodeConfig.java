package net.guides.springboot2.springboot2jpacrudexample.model.config;

import javax.persistence.DiscriminatorValue;

@DiscriminatorValue("peer")
public class PeerNodeConfig extends NodeConfig{
	private static final long serialVersionUID = 1L;
	
	public PeerNodeConfig() {
	}

	public PeerNodeConfig(String name) {
		super(name);
	}

}

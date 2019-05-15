package jpa.test.model.config;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("peer")
public class PeerNodeConfig extends NodeConfig{
	private static final long serialVersionUID = 1L;
	
	public PeerNodeConfig() {
	}

	public PeerNodeConfig(String name) {
		super(name);
	}

}

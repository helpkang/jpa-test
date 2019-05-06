package net.guides.springboot2.springboot2jpacrudexample.model.configcopy;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("peer")
public class PeerNodeConfigCopy extends NodeConfigCopy{
	private static final long serialVersionUID = 1L;
	
	public PeerNodeConfigCopy() {
	}

	public PeerNodeConfigCopy(String name) {
		super(name);
	}

}
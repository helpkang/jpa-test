package net.guides.springboot2.springboot2jpacrudexample.model.org;

import javax.persistence.Entity;
import javax.persistence.Table;

// @MappedSuperclass
@Entity
@Table(name="hl_peer_org")
public class PeerOrg extends Org{
	
	private static final long serialVersionUID = 1L;
	
	public PeerOrg() {}

	public PeerOrg(String name) {
		super(name);
	}

}

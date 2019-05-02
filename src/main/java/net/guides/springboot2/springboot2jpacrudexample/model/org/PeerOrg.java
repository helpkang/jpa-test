package net.guides.springboot2.springboot2jpacrudexample.model.org;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Table;

import net.guides.springboot2.springboot2jpacrudexample.model.node.PeerNode;

// @MappedSuperclass
@Entity
@Table(name="hl_peer_org")
public class PeerOrg extends Org<PeerNode>{
	
	private static final long serialVersionUID = 1L;
	
	public PeerOrg() {}

	public PeerOrg(String name) {
		super(name);
	}


}

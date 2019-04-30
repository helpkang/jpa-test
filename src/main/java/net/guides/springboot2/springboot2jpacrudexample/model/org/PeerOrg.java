package net.guides.springboot2.springboot2jpacrudexample.model.org;

import javax.persistence.Entity;
import javax.persistence.Table;

// @MappedSuperclass
@Entity
@Table(name="hl_peer_org")
public class PeerOrg extends Org{

	// @OneToMany(fetch=FetchType.EAGER, cascade = CascadeType.ALL)
	// @JoinColumn(name = "org_id")
	// private ArrayList<PeerNode> nodes = new ArrayList<>();
	
	public PeerOrg() {}

	public PeerOrg(String name) {
		super(name);
	}

}

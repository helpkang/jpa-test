package net.guides.springboot2.springboot2jpacrudexample.model.org;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import net.guides.springboot2.springboot2jpacrudexample.model.node.CaNode;
import net.guides.springboot2.springboot2jpacrudexample.model.node.CliNode;

@Entity
@Table
public class CaOrg extends Org{
	// @Id
	// @GeneratedValue(strategy = GenerationType.TABLE)
	// private long id;

	@OneToOne(fetch=FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinTable(name = "ca_org_cli_node")
	private CliNode cliNode;


	// @OneToMany(fetch=FetchType.EAGER, cascade = CascadeType.ALL)
	// @JoinTable(name = "ca_org_orderer_orgs")
	// private ArrayList<OrdererOrg> ordererOrgs = new ArrayList<>();

	// @OneToMany(fetch=FetchType.EAGER, cascade = CascadeType.ALL)
	// @JoinTable(name = "ca_org_peer_orgs")
	// private ArrayList<PeerOrg> peerOrgs = new ArrayList<>();
	
	

	public CaOrg() {}

	public CaOrg(String name) {
		super(name);
	}



	public CliNode getCliNode() {
		return cliNode;
	}


	public void setCliNode(CliNode cliNode) {
		this.cliNode = cliNode;
	}

	// public ArrayList<OrdererOrg> getOrdererOrgs() {
	// 	return ordererOrgs;
	// }

	
	// public void setOrdererOrgs(ArrayList<OrdererOrg> ordererOrgs) {
	// 	this.ordererOrgs = ordererOrgs;
	// }


	// public ArrayList<PeerOrg> getPeerOrgs() {
	// 	return peerOrgs;
	// }


	// public void setPeerOrgs(ArrayList<PeerOrg> peerOrgs) {
	// 	this.peerOrgs = peerOrgs;
	// }


}

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
@Table(name="hl_ca_org")
public class CaOrg extends Org<CaNode>{
	
	private static final long serialVersionUID = 1L;

	@OneToOne(fetch=FetchType.EAGER, cascade=CascadeType.ALL)
	@JoinTable(name = "hl_ca_org_cli_node")
	private CliNode cliNode;


	@OneToMany(fetch=FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name = "ca_org_id")
	private List<OrdererOrg> ordererOrgs = new ArrayList<>();

	@OneToMany(fetch=FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinColumn(name = "ca_org_id")
	private List<PeerOrg> peerOrgs = new ArrayList<>();
	
	

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

	


	public List<OrdererOrg> getOrdererOrgs() {
		return ordererOrgs;
	}

	
	public void setOrdererOrgs(List<OrdererOrg> ordererOrgs) {
		this.ordererOrgs = ordererOrgs;
	}


	public List<PeerOrg> getPeerOrgs() {
		return peerOrgs;
	}


	public void setPeerOrgs(List<PeerOrg> peerOrgs) {
		this.peerOrgs = peerOrgs;
	}


}

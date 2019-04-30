package net.guides.springboot2.springboot2jpacrudexample.model.org;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import net.guides.springboot2.springboot2jpacrudexample.model.StringObject;
import net.guides.springboot2.springboot2jpacrudexample.model.node.Node;


@Entity
@Table(name="hl_channel")
public class Channel extends StringObject {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	@Column(nullable = false)
	private String name;

	@OneToMany(fetch=FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name="channel_id")
	private List<PeerOrg> peerOrgs = new ArrayList<>();

	//PeerNode 여야하는데 안된다 ㅎ
	@OneToMany(fetch=FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinTable(name="hl_channel_peer_node")
	private List<Node> peerNodes = new ArrayList<>();

	public Channel() {}

	public Channel(String name) {
		this.name = name;
	}


	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<PeerOrg> getPeerOrgs() {
		return peerOrgs;
	}

	public void setPeerOrgs(List<PeerOrg> peerOrgs) {
		this.peerOrgs = peerOrgs;
	}

	public List<Node> getPeerNodes() {
		return peerNodes;
	}

	public void setPeerNodes(List<Node> peerNodes) {
		this.peerNodes = peerNodes;
	}



}

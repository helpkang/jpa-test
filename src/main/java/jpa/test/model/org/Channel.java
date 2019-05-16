package jpa.test.model.org;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jpa.test.model.node.Node;
import jpa.test.model.node.PeerNode;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@Entity
@Table(name="hl_channel")
@Data
public class Channel {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	@Column(nullable = false)
	private String name;


	//PeerNode 여야하는데 안된다 ㅎ
	@JsonIgnore
    @EqualsAndHashCode.Exclude
    @ToString.Exclude
	@OneToMany(fetch=FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinTable(name="hl_channel_peer_node")
	private List<Node> peerNodes = new ArrayList<>();

	@JsonIgnore
    @EqualsAndHashCode.Exclude
    @ToString.Exclude
	@OneToMany(fetch=FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinTable(name="hl_channel_peer_org")
	private List<PeerOrg> peerOrgs = new ArrayList<>();

	public void addPeerNode(PeerNode peerNode){
		getPeerNodes().add(peerNode);
	}

}

package jpa.test.model.org;

import javax.persistence.Entity;
import javax.persistence.Table;

import jpa.test.model.node.PeerNode;

@Entity
@Table(name="hl_peer_org")
public class PeerOrg extends Org<PeerNode>{

}

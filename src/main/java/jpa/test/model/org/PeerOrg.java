package jpa.test.model.org;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jpa.test.model.node.PeerNode;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@Entity
@Table(name="hl_peer_org")
@Data
@EqualsAndHashCode(callSuper = true)
public class PeerOrg extends Org{
	
	@JsonIgnore
    @EqualsAndHashCode.Exclude
    @ToString.Exclude
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="peer_org_id")
	private Set<PeerNode> nodes = new HashSet<>();
}

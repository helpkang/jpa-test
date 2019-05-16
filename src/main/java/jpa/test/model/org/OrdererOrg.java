package jpa.test.model.org;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jpa.test.model.node.OrdererNode;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@Entity
@Table(name="hl_orderer_org")
@Data
@EqualsAndHashCode(callSuper=true)
public class OrdererOrg extends Org{

	
	@JsonIgnore
    @EqualsAndHashCode.Exclude
    @ToString.Exclude
	@OneToMany(fetch=FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name = "order_org_id")
	private Set<Channel> channels = new HashSet<>();


	
	@JsonIgnore
    @EqualsAndHashCode.Exclude
    @ToString.Exclude
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="orderer_org_id")
	private Set<OrdererNode> nodes = new HashSet<>();

}

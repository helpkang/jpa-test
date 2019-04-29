package net.guides.springboot2.springboot2jpacrudexample.model.org;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.MappedSuperclass;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import net.guides.springboot2.springboot2jpacrudexample.model.node.OrdererNode;

// @MappedSuperclass
@Entity
@Table
public class OrdererOrg extends Org{

		
	@OneToMany(fetch=FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name="orderer_org_id")
	private List<OrdererNode> nodes = new ArrayList<>();

	// @OneToMany(fetch=FetchType.EAGER, cascade = CascadeType.ALL)
	// @JoinColumn(name = "org_id")
	// private ArrayList<OrdererNode> nodes = new ArrayList<>();

	public OrdererOrg() {}

	public OrdererOrg(String name) {
		super(name);
	}

}

package net.guides.springboot2.springboot2jpacrudexample.model.org;

import javax.persistence.Entity;
import javax.persistence.Table;

// @MappedSuperclass
@Entity
@Table(name="hl_orderer_org")
public class OrdererOrg extends Org{

	public OrdererOrg() {}

	public OrdererOrg(String name) {
		super(name);
	}

}

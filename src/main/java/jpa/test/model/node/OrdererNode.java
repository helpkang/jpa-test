package jpa.test.model.node;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("orderer")
public class OrdererNode extends Node{

	
	
	public OrdererNode() {

	}

	public OrdererNode(String name) {
		super(name);
	}

}

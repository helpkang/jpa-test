package jpa.test.model.node;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("orderer")
public class OrdererNode extends Node{

	private static final long serialVersionUID = 1L;
	
	public OrdererNode() {

	}

	public OrdererNode(String name) {
		super(name);
	}

}

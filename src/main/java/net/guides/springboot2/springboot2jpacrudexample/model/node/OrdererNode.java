package net.guides.springboot2.springboot2jpacrudexample.model.node;

import javax.persistence.DiscriminatorValue;
@DiscriminatorValue("orderer")
public class OrdererNode extends Node{


	
	public OrdererNode() {

	}

	public OrdererNode(String name) {
		super(name);
	}

}

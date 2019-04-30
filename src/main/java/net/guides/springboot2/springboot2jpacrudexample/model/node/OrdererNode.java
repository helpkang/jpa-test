package net.guides.springboot2.springboot2jpacrudexample.model.node;

import javax.persistence.DiscriminatorValue;
@DiscriminatorValue("orderer")
public class OrdererNode extends Node{

	private static final long serialVersionUID = 1L;
	
	public OrdererNode() {

	}

	public OrdererNode(String name) {
		super(name);
	}

}

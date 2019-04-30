package net.guides.springboot2.springboot2jpacrudexample.model.node;

import javax.persistence.DiscriminatorValue;

@DiscriminatorValue("peer")
public class PeerNode extends Node{
	
	public PeerNode() {

	}

	public PeerNode(String name) {
		super(name);
	}

}

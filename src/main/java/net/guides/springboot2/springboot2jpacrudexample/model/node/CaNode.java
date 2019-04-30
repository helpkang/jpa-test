package net.guides.springboot2.springboot2jpacrudexample.model.node;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("ca")
public class CaNode extends Node{

	
	public CaNode() {

	}

	public CaNode(String name) {
		super(name);
	}

}

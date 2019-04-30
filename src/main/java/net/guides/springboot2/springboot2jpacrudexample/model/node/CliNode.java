package net.guides.springboot2.springboot2jpacrudexample.model.node;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("cli")
public class CliNode extends Node{
	
	
	public CliNode() {

	}

	public CliNode(String name) {
		super(name);
	}

}

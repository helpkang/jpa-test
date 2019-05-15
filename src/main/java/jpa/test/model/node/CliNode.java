package jpa.test.model.node;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("cli")
public class CliNode extends Node{
	
	private static final long serialVersionUID = 1L;
	
	public CliNode() {

	}

	public CliNode(String name) {
		super(name);
	}

}

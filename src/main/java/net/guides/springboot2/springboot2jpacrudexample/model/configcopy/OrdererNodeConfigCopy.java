package net.guides.springboot2.springboot2jpacrudexample.model.configcopy;

import javax.persistence.DiscriminatorValue;
@DiscriminatorValue("orderer")
public class OrdererNodeConfigCopy extends NodeConfigCopy{

	private static final long serialVersionUID = 1L;
	
	public OrdererNodeConfigCopy() {

	}

	public OrdererNodeConfigCopy(String name) {
		super(name);
	}

}

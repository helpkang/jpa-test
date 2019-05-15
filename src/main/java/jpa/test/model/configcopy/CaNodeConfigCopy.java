package jpa.test.model.configcopy;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("ca")
public class CaNodeConfigCopy extends NodeConfigCopy{

	
	private static final long serialVersionUID = 1L;

	public CaNodeConfigCopy() {

	}

	public CaNodeConfigCopy(String name) {
		super(name);
	}

}

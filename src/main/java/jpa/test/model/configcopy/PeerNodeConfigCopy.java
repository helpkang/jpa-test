package jpa.test.model.configcopy;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("peer")
public class PeerNodeConfigCopy extends NodeConfigCopy{
	
}
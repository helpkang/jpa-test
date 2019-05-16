package jpa.test.model.configcopy;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("ca")
public class CaNodeConfigCopy extends NodeConfigCopy{


}

package jpa.test.model.node;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("ca")
public class CaNode extends Node{

}

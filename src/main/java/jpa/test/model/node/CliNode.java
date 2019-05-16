package jpa.test.model.node;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("cli")
public class CliNode extends Node{

}

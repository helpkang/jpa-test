package jpa.test.model.node;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("peer")
public class PeerNode extends Node{
}

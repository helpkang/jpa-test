package jpa.test.model.config;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("peer")
public class PeerNodeConfig extends NodeConfig{

}

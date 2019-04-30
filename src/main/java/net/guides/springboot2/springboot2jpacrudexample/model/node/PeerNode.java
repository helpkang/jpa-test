package net.guides.springboot2.springboot2jpacrudexample.model.node;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.Table;

@MappedSuperclass
// @Entity
// @Table
public class PeerNode extends Node{
	
	public PeerNode() {

	}

	public PeerNode(String name) {
		super(name);
	}

}

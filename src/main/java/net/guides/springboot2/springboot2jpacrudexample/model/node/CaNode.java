package net.guides.springboot2.springboot2jpacrudexample.model.node;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.Table;

// @MappedSuperclass
@Entity
@Table
public class CaNode extends Node{

	
	public CaNode() {

	}

	public CaNode(String name) {
		super(name);
	}

}

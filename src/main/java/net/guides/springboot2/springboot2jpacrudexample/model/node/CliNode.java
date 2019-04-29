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
public class CliNode extends Node{
	
	
	public CliNode() {

	}

	public CliNode(String name) {
		super(name);
	}

}

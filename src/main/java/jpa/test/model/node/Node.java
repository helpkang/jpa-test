package jpa.test.model.node;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "hl_node")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "node_type")
@Data
public abstract class Node {
	
	@Id
	@GeneratedValue(strategy = GenerationType.TABLE)
	private long id;

	@Column(nullable = false)
	private String name;

}

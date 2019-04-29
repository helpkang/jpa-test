package net.guides.springboot2.springboot2jpacrudexample.model.org;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

@Entity
@Table
@Inheritance(strategy = InheritanceType.JOINED)
// @DiscriminatorColumn(name = "org_type")
public abstract class Org{
	@Id
	@GeneratedValue(strategy = GenerationType.TABLE)
	private long id;

	@Column(nullable = false)
	private String name;


	// @OneToMany(fetch=FetchType.EAGER, cascade = CascadeType.ALL)
	// @JoinTable(name = "org_node")
	// private List<T> nodes = new ArrayList<>();

	public Org() {

	}

	public Org(String name) {
		this.name = name;
	}


	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}



	// public List<T> getNodes() {
	// 	return nodes;
	// }


	// public void setNodes(List<T> nodes) {
	// 	this.nodes = nodes;
	// }

	// public void addHost(T node) {
	// 	this.nodes.add(node);
	// }


	@Override
	public String toString() {
		return ReflectionToStringBuilder.toString(this);
	}
}

package net.guides.springboot2.springboot2jpacrudexample.model.org;

import java.beans.Transient;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.MappedSuperclass;
import javax.persistence.OneToMany;

import net.guides.springboot2.springboot2jpacrudexample.model.StringObject;
import net.guides.springboot2.springboot2jpacrudexample.model.node.Node;


@MappedSuperclass
public abstract class Org<T extends Node> extends StringObject{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.TABLE)
	private long id;

	@Column(nullable = false)
	private String name;

	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="org_id")
	private List<Node> nodes = new ArrayList<>();


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

	public List<Node> getNodes() {
		return nodes;
	}

	public void setNodes(List<Node> nodes) {
		this.nodes = nodes;
	}

	@SuppressWarnings("unchecked")
	@Transient
	public List<T> getNodes_() {
		return (List<T>)getNodes();
	}

	@SuppressWarnings("unchecked")
	@Transient
	public void setNodes_(List<T> nodes) {
		setNodes((List<Node>) nodes);
	}

}

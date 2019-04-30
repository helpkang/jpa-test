package net.guides.springboot2.springboot2jpacrudexample.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import net.guides.springboot2.springboot2jpacrudexample.model.config.NodeConfig;


@Entity
@Table(name="hl_config")
public class Config extends StringObject {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	@Column(nullable = false)
	private String name;

	@Column(nullable = false)
	private String version;

	@Column(nullable = false)
	private String type;

	@OneToMany(fetch=FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinColumn(name = "config_id")
	private List<NodeConfig> nodes = new ArrayList<>();

	public Config() {}

	public Config(String name) {
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


	public String getVersion() {
		return version;
	}


	public void setVersion(String version) {
		this.version = version;
	}


	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}


	public List<NodeConfig> getNodes() {
		return nodes;
	}


	public void setNodes(List<NodeConfig> nodes) {
		this.nodes = nodes;
	}
	

}

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
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name="hl_network")
public class Network extends StringObject {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column
	@GeneratedValue(strategy=GenerationType.TABLE)
	private long id;
	
	@Column(nullable = false)
	private String name;
	
	@OneToMany(fetch=FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name = "network_id")
	private List<Host> hosts = new ArrayList<>();


	@ManyToOne(fetch=FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name = "config_copy_id")
	private ConfigCopy copyConfig;

	public Network() {}

	public Network(String name) {
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

	public List<Host> getHosts() {
		return hosts;
	}

	public void setHosts(List<Host> hosts) {
		this.hosts = hosts;
	}


}

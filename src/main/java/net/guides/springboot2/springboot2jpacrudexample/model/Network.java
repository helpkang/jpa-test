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
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

import net.guides.springboot2.springboot2jpacrudexample.model.org.CaOrg;
import net.guides.springboot2.springboot2jpacrudexample.model.org.Org;

// import net.guides.springboot2.springboot2jpacrudexample.model.org.CaOrg;

@Entity
@Table
public class Network {
	
	@Id
	@Column
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	
	@Column(nullable = false)
	private String name;
	
	@OneToMany(fetch=FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name = "network_id")
	private List<Host> hosts = new ArrayList<>();

	@OneToOne(fetch=FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinTable(name = "network_ca_org")
	// private Org caOrg;
	private CaOrg caOrg;

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


	@Override
	public String toString() {
		return ReflectionToStringBuilder.toString(this);
	}


	public CaOrg getCaOrg() {
		return caOrg;
	}


	public void setCaOrg(CaOrg caOrg) {
		this.caOrg = caOrg;
	}

}

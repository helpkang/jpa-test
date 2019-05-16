package jpa.test.model;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jpa.test.model.org.OrdererOrg;
import jpa.test.model.org.PeerOrg;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;


@Entity
@Table(name="hl_network")
@Data
public class Network  {
	
	
	
	@Id
	@Column
	@GeneratedValue(strategy=GenerationType.TABLE)
	private long id;
	
	@Column(nullable = false)
	private String name;
	

	@JsonIgnore
    @EqualsAndHashCode.Exclude
    @ToString.Exclude
	@OneToMany(fetch=FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name = "network_id")
	private List<Host> hosts = new ArrayList<>();

	@JsonIgnore
    @EqualsAndHashCode.Exclude
    @ToString.Exclude
	@OneToMany(fetch=FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name = "network_id")
	private Set<OrdererOrg> orderOrgs = new HashSet<>();

	@JsonIgnore
    @EqualsAndHashCode.Exclude
    @ToString.Exclude
	@OneToMany(fetch=FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name = "network_id")
	private Set<PeerOrg> peerOrgs = new HashSet<>();


	@JsonIgnore
    @EqualsAndHashCode.Exclude
    @ToString.Exclude
	@OneToOne(fetch=FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name = "copy_config_id")
	private ConfigCopy copyConfig;

}

package jpa.test.model;

import java.util.HashSet;
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

import jpa.test.model.configcopy.NodeConfigCopy;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;


@Entity
@Table(name="hl_config_copy")
@Data
public class ConfigCopy  {

	
	
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
	@JoinColumn(name = "copy_config_id")
	@JsonIgnore
    @EqualsAndHashCode.Exclude
    @ToString.Exclude
	private Set<NodeConfigCopy> nodes = new HashSet<>();

	@OneToOne(fetch=FetchType.LAZY)
	@JoinColumn(name = "config_id")
	@JsonIgnore
    @EqualsAndHashCode.Exclude
    @ToString.Exclude
	private Config config;


	// @JsonIgnore
    // @EqualsAndHashCode.Exclude
    // @ToString.Exclude
	// @OneToOne(mappedBy = "copyConfig")
	// @PrimaryKeyJoinColumn
	// private ConfigCopy copyConfig;
	

}

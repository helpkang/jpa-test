package jpa.test.model.org;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.MappedSuperclass;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;


@Data
@MappedSuperclass
public abstract class Org<T>{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	@Column(nullable = false)
	private String name;


	@JsonIgnore
    @EqualsAndHashCode.Exclude
    @ToString.Exclude
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="org_id")
	private Set<T> nodes = new HashSet<>();

}

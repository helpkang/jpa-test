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
public abstract class Org{
	@Id
	@GeneratedValue(strategy = GenerationType.TABLE)
	private long id;

	@Column(nullable = false)
	private String name;


}

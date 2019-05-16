package jpa.test.model.org;

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

import com.fasterxml.jackson.annotation.JsonIgnore;

import jpa.test.model.node.Node;
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


	@JsonIgnore
    @EqualsAndHashCode.Exclude
    @ToString.Exclude
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="org_id")
	private List<Node> nodes = new ArrayList<>();

}

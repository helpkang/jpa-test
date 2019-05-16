package jpa.test.model.org;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@Entity
@Table(name="hl_orderer_org")
@Data
@EqualsAndHashCode(callSuper=true)
public class OrdererOrg extends Org{

	
	@JsonIgnore
    @EqualsAndHashCode.Exclude
    @ToString.Exclude
	@OneToMany(fetch=FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name = "order_org_id")
	private List<Channel> channels = new ArrayList<>();


	

}

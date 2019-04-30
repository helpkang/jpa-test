package net.guides.springboot2.springboot2jpacrudexample.model.org;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

// @MappedSuperclass
@Entity
@Table(name="hl_orderer_org")
public class OrdererOrg extends Org{

	
	@OneToMany(fetch=FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name = "order_org_id")
	private List<Channel> channels = new ArrayList<>();


	public OrdererOrg() {}

	public OrdererOrg(String name) {
		super(name);
	}


	public List<Channel> getChannels() {
		return channels;
	}


	public void setChannels(List<Channel> channels) {
		this.channels = channels;
	}

	

}

package net.guides.springboot2.springboot2jpacrudexample;

import java.util.Optional;

import javax.transaction.Transactional;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringRunner;

import net.guides.springboot2.springboot2jpacrudexample.model.Host;
import net.guides.springboot2.springboot2jpacrudexample.model.Network;
import net.guides.springboot2.springboot2jpacrudexample.model.node.CaNode;
import net.guides.springboot2.springboot2jpacrudexample.model.node.CliNode;
import net.guides.springboot2.springboot2jpacrudexample.model.node.Node;
import net.guides.springboot2.springboot2jpacrudexample.model.org.CaOrg;
import net.guides.springboot2.springboot2jpacrudexample.repository.NetworkRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
@FixMethodOrder(MethodSorters.DEFAULT)
public class ApplicationTests {

	@Autowired
	NetworkRepository repositoris;

	@Transactional
	@Test
	@Rollback(false)
	public void contextLoads() {
		Network network = new Network("haha");
		setHost(network);
		setCaOrg(network);

		repositoris.save(network);
		System.out.println("save===>"+network);
		
	}
	@Transactional
	@Test
	public void read() {
		try{

			find();
		}catch(Exception e){
			e.printStackTrace();
		}
		
	}


	public void find() {
		repositoris.findAll();
		// System.out.println(repositoris.findAll());
		System.out.println("count===>"+repositoris.count());
		Optional<Network> network = repositoris.findById(1L);
		System.out.println("read===>"+network.get());
		// if(!network.isPresent()) throw new RuntimeException("network key 1L not exist!");
		// CliNode cliNode = network.get().getCaOrg().getCliNode();
		// if(cliNode == null){
		// 	throw new RuntimeException("cli node not exist!");
		// }
	}

	private void setHost(Network network) {
		Host host = new Host("host1");
		Node node = new CaNode("ca node1");
		host.getNodes().add(node);
		network.getHosts().add(host);
	}

	private void setCaOrg(Network network) {
		CaOrg caorg = new CaOrg("ca node");
		CliNode cliNode = new CliNode("cli node");
		caorg.setCliNode(cliNode);
		network.setCaOrg(caorg);
	}

}

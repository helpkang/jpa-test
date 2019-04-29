package net.guides.springboot2.springboot2jpacrudexample;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
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
public class ApplicationTests {

	@Autowired
	NetworkRepository repositoris;

	@Test
	public void contextLoads() {
		Network network = new Network("haha");
		setHost(network);
		setCaOrg(network);

		repositoris.save(network);
		System.out.println(network);
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

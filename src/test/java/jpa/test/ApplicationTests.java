package jpa.test;

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

import jpa.test.model.Host;
import jpa.test.model.Network;
import jpa.test.model.node.CaNode;
import jpa.test.model.node.OrdererNode;
import jpa.test.model.node.PeerNode;
import jpa.test.model.org.Channel;
import jpa.test.model.org.OrdererOrg;
import jpa.test.model.org.PeerOrg;
import jpa.test.repository.NetworkRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ApplicationTests {

	@Autowired
	NetworkRepository repositoris;

	@Transactional
	@Test
	@Rollback(false)
	public void contextLoads() {
		Network network = new Network();
		network.setName("haha");
		addHost(network);
		addOrg(network);

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
		// repositoris.findAll();
		System.out.println("findAll=>"+repositoris.findAll());
		System.out.println("count===>"+repositoris.count());
		Optional<Network> network = repositoris.findById(1L);
		System.out.println("read===>"+network.get());
		// if(!network.isPresent()) throw new RuntimeException("network key 1L not exist!");
		// CliNode cliNode = network.get().getCaOrg().getCliNode();
		// if(cliNode == null){
		// 	throw new RuntimeException("cli node not exist!");
		// }
	}

	private void addHost(Network network) {
		Host host = new Host();
		host.setName("host1");
		network.getHosts().add(host);

		addNodes(host);
	}

	private void addNodes(Host host) {
		CaNode caNode = new CaNode();
		caNode.setName("ca node1");
		host.getNodes().add(caNode);
		
		OrdererNode orderNode = new OrdererNode();
		orderNode.setName("order node1");
		host.getNodes().add(orderNode);
		
		PeerNode peerNode = new PeerNode();
		peerNode.setName("peer node1");
		host.getNodes().add(peerNode);
	}

	private void addOrg(Network network) {
		OrdererOrg ordererOrg = new OrdererOrg();
		network.getOrderOrgs().add(ordererOrg);
		ordererOrg.setName("orderOrg1");

		
		PeerOrg peerOrg = new PeerOrg();
		network.getPeerOrgs().add(peerOrg);
		peerOrg.setName("peerOrg1");
		
		network.getHosts().get(0).getNodes().forEach(node->{
			if(node instanceof OrdererNode){
				ordererOrg.getNodes().add(node);
			}else if(node instanceof PeerNode){
				peerOrg.getNodes().add(node);
			}
		});
		
		addChennel(ordererOrg, peerOrg);

	}

	private void addChennel(OrdererOrg ordererOrg, PeerOrg peerOrg) {
		Channel channel = new Channel();
		ordererOrg.getChannels().add(channel);
		channel.setName("channel1");
		channel.getPeerOrgs().add(peerOrg);

		peerOrg.getNodes().forEach((peerNode)->{
			System.out.println("peerNode==>"+ peerNode);
			channel.addPeerNode((PeerNode)peerNode);
		});
	
	}

}

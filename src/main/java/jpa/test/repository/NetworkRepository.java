package jpa.test.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import jpa.test.model.Network;

@Repository
public interface NetworkRepository extends JpaRepository<Network, Long>{

}

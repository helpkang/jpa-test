package jpa.test.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import jpa.test.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}

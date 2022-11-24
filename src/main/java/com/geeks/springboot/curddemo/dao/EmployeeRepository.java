package com.geeks.springboot.curddemo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.geeks.springboot.curddemo.entity.Employee;


//@RepositoryRestResource(path="members")
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
   
	// that's it .... no need to write any code LOL!
}

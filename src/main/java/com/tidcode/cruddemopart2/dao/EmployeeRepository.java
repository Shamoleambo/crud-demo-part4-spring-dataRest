package com.tidcode.cruddemopart2.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tidcode.cruddemopart2.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}

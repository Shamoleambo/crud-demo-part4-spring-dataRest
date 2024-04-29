package com.tidcode.cruddemopart2.dao;

import java.util.List;

import com.tidcode.cruddemopart2.entity.Employee;

public interface EmployeeDAO {

	List<Employee> findAll();

}

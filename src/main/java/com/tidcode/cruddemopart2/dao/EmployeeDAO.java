package com.tidcode.cruddemopart2.dao;

import java.util.List;

import com.tidcode.cruddemopart2.entity.Employee;

public interface EmployeeDAO {

	List<Employee> findAll();
	
	Employee findById(int id);
	
	Employee save(Employee employee);
	
	void deleteById(int id);

}

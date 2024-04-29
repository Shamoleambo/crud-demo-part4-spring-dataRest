package com.tidcode.cruddemopart2.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tidcode.cruddemopart2.dao.EmployeeDAO;
import com.tidcode.cruddemopart2.entity.Employee;

@RestController
@RequestMapping("/api")
public class EmployeeRestController {

	private EmployeeDAO employeeDAO;

	@Autowired
	public EmployeeRestController(@Qualifier("employeeDAOJpaImpl") EmployeeDAO employeeDAO) {
		this.employeeDAO = employeeDAO;
	}

	@GetMapping("/employees")
	public List<Employee> findAll() {
		return this.employeeDAO.findAll();
	}

}

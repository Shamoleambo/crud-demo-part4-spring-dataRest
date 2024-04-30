package com.tidcode.cruddemopart2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.tidcode.cruddemopart2.dao.EmployeeDAO;
import com.tidcode.cruddemopart2.entity.Employee;

import jakarta.transaction.Transactional;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	private EmployeeDAO employeeDAO;

	@Autowired
	public EmployeeServiceImpl(@Qualifier("employeeDAOJpaImpl") EmployeeDAO employeeDAO) {
		this.employeeDAO = employeeDAO;
	}

	@Override
	public List<Employee> findAll() {
		return this.employeeDAO.findAll();
	}

	@Override
	public Employee findById(int id) {
		return this.employeeDAO.findById(id);
	}

	@Override
	@Transactional
	public Employee save(Employee employee) {
		return this.employeeDAO.save(employee);
	}

	@Override
	@Transactional
	public void deleteById(int id) {
		this.employeeDAO.deleteById(id);
	}
}

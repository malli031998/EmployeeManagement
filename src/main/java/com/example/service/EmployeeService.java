package com.example.service;

	import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.Employee;
import com.example.repository.EmployeeRepository;

	@Service
	public class EmployeeService {

	    @Autowired
	    private EmployeeRepository employeeRepository;

	    public List<Employee> getAllEmployees() {
	        return employeeRepository.findAll();
	    }

	    public Optional<Employee> getEmployeeById(Long id) {
	        return employeeRepository.findById(id);
	    }

	    public Employee saveEmployee(Employee employee) {
	        return employeeRepository.save(employee);
	    }

	    public Employee updateEmployee(Long id, Employee employeeDetails) {
	        Employee employee = employeeRepository.findById(id).orElseThrow();
	        employee.setName(employeeDetails.getName());
	        employee.setDepartment(employeeDetails.getDepartment());
	        employee.setSalary(employeeDetails.getSalary());
	        return employeeRepository.save(employee);
	    }

	    public void deleteEmployee(Long id) {
	        employeeRepository.deleteById(id);
	    }
	}



package com.tcs.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.tcs.beans.Employee;
import com.tcs.dao.EmployeeDao;
import com.tcs.exception.EmployeeNotFoundException;


@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeDao employeeDao;
	
	@Override
	@Transactional
	public Employee store(Employee employee) {
		int res=employeeDao.save(employee);
		System.out.println(res);
		Employee emp=employeeDao.fetchEmployee(res);
		return emp;
		
//		return employee;
		
	}

	@Override
	public Employee findEmployeeById(int id) throws EmployeeNotFoundException {
		// TODO Auto-generated method stub
		Employee emp= employeeDao.fetchEmployee(id);
		if(emp==null) {
			throw new EmployeeNotFoundException("SORRY NOT FOUND");
			
		}
		return emp;
	}

	@Override
	public Employee updateEmployeeSalary(int id, double salary) throws EmployeeNotFoundException {
		// TODO Auto-generated method stub
		
		return null;
	}

	@Override
	public Employee updateEmployeeName(int id, String name) throws EmployeeNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Employee> getEmployees() {
		// TODO Auto-generated method stub
		return employeeDao.fetchEmployees();
	}

	@Override
	public List<Employee> getEmployeesOrderByName() {
		// TODO Auto-generated method stub
		return null;
	}

}

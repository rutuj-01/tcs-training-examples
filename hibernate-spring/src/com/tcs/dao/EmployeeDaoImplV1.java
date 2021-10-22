package com.tcs.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.tcs.beans.Employee;

@Repository
public class EmployeeDaoImplV1 implements EmployeeDao{
	
	@Autowired
	private HibernateTemplate template;
	
	@Override
	public int save(Employee employee) {
		int key=(Integer)template.save(employee);
		return key;
	}

	@Override
	public void updateEmployeeName(Employee employee, int id) {
		// TODO Auto-generated method stub
		template.update(employee);
		
	}

	@Override
	public Employee fetchEmployee(int id) {
		// TODO Auto-generated method stub
		return template.get(Employee.class,id);
	}

	@Override
	public List<Employee> fetchEmployees() {
		// TODO Auto-generated method stub
		return template.loadAll(Employee.class);
	}

}

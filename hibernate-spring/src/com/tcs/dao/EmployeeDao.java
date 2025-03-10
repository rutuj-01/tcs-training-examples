package com.tcs.dao;
import java.util.List;

import com.tcs.beans.Employee;
public interface EmployeeDao {
	public int save(Employee employee);
	public void updateEmployeeName(Employee employee, int id);
	public Employee fetchEmployee(int id);
	public List<Employee> fetchEmployees();
}

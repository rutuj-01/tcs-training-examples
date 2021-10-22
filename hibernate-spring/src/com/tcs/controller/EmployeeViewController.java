package com.tcs.controller;

import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.tcs.beans.Employee;
import com.tcs.exception.EmployeeNotFoundException;
import com.tcs.service.EmployeeService;

public class EmployeeViewController {
	public static void main(String[] args) throws EmployeeNotFoundException {
		
	
	ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
	EmployeeService employeeService= (EmployeeService) context.getBean("employeeServiceImpl");

	
	Scanner scan = new Scanner(System.in);
	int option = 0;
	do {
		System.out.println("Enter the option");
		System.out.println("1: Store employee 2: Get employee 3: Get all employees "
				+ "4: Update Salary 5: Update Name 6: Sort employees by name 7: Exit");
		option = scan.nextInt();
//		EmployeeService employeeService = null;
		switch(option) {
		case 1: 
			Employee e = new Employee();
			System.out.println("Enter name");
			e.setName(scan.next());
			System.out.println("Enter sal");
			e.setSalary(scan.nextDouble());
			// call the store method of service
			Employee storedEmployee = employeeService.store(e);
			System.out.println("Hello, "+storedEmployee.getName()+", your id is : "+storedEmployee.getId());
			break;
		case 2: 
			System.out.println("Enter id");
			try {
				Employee emp = employeeService.findEmployeeById(scan.nextInt());
				System.out.println("Employee found.");
				System.out.println("Id: "+emp.getId()+", Name: "+emp.getName()+", Salary: "+emp.getSalary());
			} catch (EmployeeNotFoundException e1) {
				System.err.println(e1.getMessage());
			}
			break;
		case 3: 
			List<Employee> list = employeeService.getEmployees();
			for(Employee it : list) {
				System.out.println("Id: "+it.getId()+", Name: "+it.getName()+", Salary: "+it.getSalary());
			}
			break;
		case 4:
			Employee e1 = new Employee();
			System.out.println("Enter name to update");
			String name=scan.next();
			// call the store method of service
			System.out.println("enter id to update");
			int id=(scan.nextInt());
			storedEmployee = employeeService.updateEmployeeName(id,name);
			System.out.println("UPDATED");
		}
			
	} while(option != 7);
	System.out.println("Program Exits!");
	scan.close();	
	}
}
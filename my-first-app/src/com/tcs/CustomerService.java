package com.tcs;

public class CustomerService {
	private CustomerDao customerDao;
	
	public CustomerService(CustomerDao dao) {
		this.customerDao=dao;
		
	}
	
	public void testDependencies() {
		System.out.println("TEST DEPENDencies of cust service");
		customerDao.connect();
		
	}
}

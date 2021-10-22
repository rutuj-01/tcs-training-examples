package com.tcs;

public class CustomerDao {
	private DataSource datasource;
	
	
	public DataSource getDatasource() {
		return datasource;
	}


	public void setDatasource(DataSource datasource) {
		this.datasource = datasource;
	}


	public void connect()
	{
		System.out.println("---connect---");
		System.out.println("username"+datasource.getUsername());
		System.out.println("password"+datasource.getPassword());
		System.out.println("url"+datasource.getUrl());
		
	}
}

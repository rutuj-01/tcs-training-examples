package com.tcs;

import javax.transaction.HeuristicMixedException;
import javax.transaction.HeuristicRollbackException;
import javax.transaction.RollbackException;
import javax.transaction.SystemException;
import javax.transaction.Transaction;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class TestStoreEmp {

	public static void main(String[] args) throws Exception, RollbackException, HeuristicMixedException, HeuristicRollbackException, SystemException {
		// TODO Auto-generated method stub
		SessionFactory factory=HibernateUtil.createSessionFactory();
		Session session=factory.openSession();
		Employee e1=new Employee();
		e1.setName("Drac");
		e1.setSalary(42200);
		org.hibernate.Transaction transaction= session.beginTransaction();
		session.save(e1);
		transaction.commit();
		
		session.close();
		factory.close();
		System.out.println("HURRAYYY!!!!");
			
	}

}

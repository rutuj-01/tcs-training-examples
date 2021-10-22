package com.tcs;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {

//	public static SessionFactory createSessionFactory() {
//		Configuration cfg=new Configuration().configure();
//		
//		SessionFactory factory = cfg.buildSessionFactory();
//		return factory;
//	}

	public static SessionFactory createSessionFactory() {
		// TODO Auto-generated method stub
		Configuration cfg=new Configuration().configure();
		
		SessionFactory factory = cfg.buildSessionFactory();
		return factory;
	}
}

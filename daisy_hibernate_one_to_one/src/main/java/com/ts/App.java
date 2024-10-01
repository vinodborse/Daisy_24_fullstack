package com.ts;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
    	Configuration cfg = new Configuration().configure("hibernate.cfg.xml")
				  .addAnnotatedClass(User.class)
				  .addAnnotatedClass(Aadhar.class);
	
    	SessionFactory sf = cfg.buildSessionFactory();
	
    	Session session = sf.openSession();
	
    	session.beginTransaction();
    	//---------------------------
			
    	User u = new User();
    	
    	u.setId(1);
    	u.setName("Vinod");
    	
    	
    	Aadhar a = new Aadhar();
    	
    	a.setId(101);
    	a.setAadharnumber(121212);
    	
    	u.setAadhar(a);
    	
    	session.persist(u);
    	session.persist(a);
	
	
		//----------------------------
		
		session.getTransaction().commit();
		session.close();

    }
}

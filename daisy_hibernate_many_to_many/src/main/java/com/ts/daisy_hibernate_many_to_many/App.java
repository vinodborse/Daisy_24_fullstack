package com.ts.daisy_hibernate_many_to_many;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class App 
{
    public static void main( String[] args )
    {
       	Configuration cfg = new Configuration().configure("hibernate.cfg.xml")
				  .addAnnotatedClass(Student.class)
				  .addAnnotatedClass(Batch.class);
		
	  	SessionFactory sf = cfg.buildSessionFactory();
		
	  	Session session = sf.openSession();
		
	  	session.beginTransaction();
	  	//---------------------------
	  		Student s = new Student();
	  		
	  		s.setRollno(1);
	  		s.setName("Vinod");
	  		s.setAddress("Pune");
	  		
	  		Student s2 = new Student();
	  		s2.setRollno(2);
	  		s2.setName("Rahul");
	  		s2.setAddress("Pune");
	  		
	  		Batch b1 = new Batch();
	  		b1.setId(101);
	  		b1.setName("FullStack");
	  		b1.setCode("FS");
	
	  		Batch b2 = new Batch();
	  		b2.setId(102);
	  		b2.setName("Core Java");
	  		b2.setCode("CJ");
	  		
	  		List<Batch> batches = new ArrayList<>();
	  		
	  		batches.add(b1);
	  		batches.add(b2);
	  		
	  		s.setBatch(batches);
	  		s2.setBatch(batches);
	  		
	  		session.persist(s);
	  		session.persist(s2);
	  		session.persist(b1);
	  		session.persist(b2);
	  		
	  		
		//----------------------------
		
		session.getTransaction().commit();
		session.close();

    }
}

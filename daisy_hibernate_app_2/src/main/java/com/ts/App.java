package com.ts;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Configuration cfg = new Configuration().configure("hibernate.cfg.xml")
					  .addAnnotatedClass(Student.class);
    	
		SessionFactory sf = cfg.buildSessionFactory();
		
		Session session = sf.openSession();
		
		session.beginTransaction();
		//---------------------------
				
		Student s = new Student();
		s.setAddress("Pune");
		s.setName("Rahul");
		session.persist(s);
		
		//----------------------------
		
		session.getTransaction().commit();
		session.close();

    }
}

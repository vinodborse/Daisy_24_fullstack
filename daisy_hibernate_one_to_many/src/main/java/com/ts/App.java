package com.ts;

import java.util.ArrayList;
import java.util.List;

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
				  .addAnnotatedClass(User.class)
				  .addAnnotatedClass(Document.class);
		
	  	SessionFactory sf = cfg.buildSessionFactory();
		
	  	Session session = sf.openSession();
		
	  	session.beginTransaction();
	  	//---------------------------
	
	  	User u = new User();
	  	u.setId(1);
	  	u.setName("Vinod");

	  	
	  	Document d1 = new Document();
	  	d1.setId(101);
	  	d1.setType("Aadhar");
	  	d1.setDocnumber("121212");
	  	
	  	Document d2 = new Document();
	  	d2.setId(102);
	  	d2.setType("Pan");
	  	d2.setDocnumber("1q2w3e");
	  	
	  	List<Document> documents = new ArrayList<Document>();

	  	documents.add(d1);
	  	documents.add(d2);
	  	
	  	u.setDocument(documents);
	  	
	  	session.persist(u);
	  	
	  	session.persist(d1);
	  	session.persist(d2);
	
		//----------------------------
		
		session.getTransaction().commit();
		session.close();

    }
}

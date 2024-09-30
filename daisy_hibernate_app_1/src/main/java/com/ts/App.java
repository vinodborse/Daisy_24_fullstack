package com.ts;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class App 
{
    public static void main( String[] args )
    {
       Configuration cfg = new Configuration().configure("hibernate.cfg.xml")
    		   								  .addAnnotatedClass(Student.class)
    		   								  .addAnnotatedClass(Teacher.class);
       SessionFactory sf = cfg.buildSessionFactory();
       
       Session session = sf.openSession();
       
       session.beginTransaction();
       //---------------------------
       	//INSERT INTO student(rollno, name, address) VALUE (1, "Vinod", "Pune");
//       session.save();

      /* 
       Student s = new Student();
       s.setRollno(1);
       s.setName("Vinod");
       s.setAddress("Pune");
       
       
       session.persist(s);
       */
       // SELECT * FROM student WHERE rollno = 1;  
       
		/*
		  Student std = session.get(Student.class, 5);
		  System.out.println("Student name is:- "+ std.getName());
		 */
       
       // UPDATE student SET address = "Surat" WHERE rollno = 4;

		/*
		  Student std1 = session.get(Student.class, 4); std1.setAddress("Surat");
		 */
       
       // DELETE FROM student WHERE rollno = 3;
       Student std2 = session.get(Student.class, 3);
       session.remove(std2);
       
       //----------------------------
       
       session.getTransaction().commit();
       session.close();
       
       
    }
}

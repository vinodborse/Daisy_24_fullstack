package com.ts;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {

    	ApplicationContext ac = new ClassPathXmlApplicationContext("config.xml");
    	
    	//Common c = ac.getBean("t", Common.class); //new Student();
    	//c.hello();
    	
    	
    	/*
    		User u1 = ac.getBean("usr", User.class); //new User();
    		System.out.println(u1.getName());
    	*/
    	
    	User u2 = ac.getBean("u2", User.class); //new User(1, "Vinod", "Pune");
    	System.out.println(u2.getName());
    }
}

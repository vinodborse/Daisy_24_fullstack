package com.ts.daisy_jdbc_app;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class App 
{
    public static void main( String[] args ) throws ClassNotFoundException, SQLException
    {
    	Class.forName("com.mysql.cj.jdbc.Driver");
    	String url = "jdbc:mysql://127.0.0.1:3306/daisy_db";
    	String username = "root";
    	String password = "root";
    	Connection connection =  DriverManager.getConnection(url, username, password);
    	Statement statement =  connection.createStatement();
    	ResultSet rs =  statement.executeQuery("SELECT * FROM student");
    	
    	while (rs.next()) {
        	String studentName = rs.getString("adress");
        	System.out.println(studentName);			
		}
    	
    	connection.close();
    }
}

/*
MOBILE --> mysql connector
number --> url, username, password
call   --> CONNECTION
start  --> createStatement
speak  --> executeQuery (SELECT * FROM student WHERE rollno = 2)
reply  --> ResultSet
cut	   --> Close
*/
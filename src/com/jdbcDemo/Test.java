package com.jdbcDemo;

import java.sql.Connection;


import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class Test {
public static void main(String[] args) throws SQLException {
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
	
	//same
	//make the connection(url,hostname ,DB name, username,password)
	Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/demo1","root","Pratiksha1@$");
	//sql query
	
	
	String sql="insert into employee(emp_name,emp_city,emp_sal) values('dipak','phaltan','130000')";
	//by statement
     Statement stmt=connection.createStatement();
	
	stmt.execute(sql);
	//by prepared statement
	String city="chandrapur";
	String name="pratiksha";
	long salary=1500000;
	PreparedStatement pps= connection.prepareStatement("insert into employee(emp_name,emp_city,emp_sal) values(?,?,?)");
	
	pps.setString(1, city);
	pps.setString(2,name);
	pps.setLong(3, salary);
	
	pps.execute();
	System.out.println("record inserted successfully");
	connection.close();
	stmt.close();

} catch (Exception e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
}
}
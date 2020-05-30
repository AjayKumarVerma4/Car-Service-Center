package com.ajay.utils;

import java.sql.Connection;
import java.sql.DriverManager;

public class JDBCUtils {
  
	public static Connection getConnection(){ 
	    Connection con=null;  
	    try{  
	        Class.forName("com.mysql.jdbc.Driver");  
	        con=DriverManager.getConnection("jdbc:mysql://localhost:3306/AdvanceJava","root","password");  
	    }catch(Exception e){System.out.println(e);}  
	    return con;  
	 }
	
}

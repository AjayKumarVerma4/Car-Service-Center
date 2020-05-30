package com.ajay.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.ajay.model.ContactUs;
import com.ajay.utils.JDBCUtils;

public class ContactUsDao {

	public static int contactus(ContactUs contact){  
	    int status=0;  
	    try{  
	        Connection con=JDBCUtils.getConnection();  
	        PreparedStatement ps=con.prepareStatement(  
	"insert into CONTACTUS(name,email,country,message) values(?,?,?,?)");  
	       
	        ps.setString(1,contact.getName());   
	        ps.setString(2,contact.getEmail());  
	        ps.setString(3,contact.getCountry());  
	        ps.setString(4,contact.getMessage()); 
	        
	        status=ps.executeUpdate();  
	    }catch(Exception e){
	    	System.out.println(e);
	    }  
	    return status;  
	} 
	
}

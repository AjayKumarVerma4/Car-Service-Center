package com.ajay.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.ajay.model.Booking;
import com.ajay.utils.JDBCUtils;

public class BookingDao {
	public static int bookNow(Booking book){  
	    int status=0;  
	    try{  
	        Connection con=JDBCUtils.getConnection();  
	        PreparedStatement ps=con.prepareStatement(  
	"insert into BOOKSERVICE(location,vehicleType,vehicleNumber,vehicleModel,serviceType,chooseService,clientName,email,mobileNumber) values(?,?,?,?,?,?,?,?,?)");  
	       
	        ps.setString(1,book.getLocation());   
	        ps.setString(2,book.getVehicleType());  
	        ps.setString(3,book.getVehicleNumber());  
	        ps.setString(4,book.getVehicleModel()); 
	        ps.setString(5,book.getServiceType());   
	        ps.setString(6,book.getChooseService());  
	        ps.setString(7,book.getClientName());  
	        ps.setString(8,book.getEmail()); 
	        ps.setString(9,book.getMobileNumber());
	        
	        status=ps.executeUpdate();  
	    }catch(Exception e){
	    	System.out.println(e);
	    }  
	    return status;  
	} 
}

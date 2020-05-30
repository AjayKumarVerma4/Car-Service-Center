package com.ajay.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.http.HttpSession;

import com.ajay.model.User;
import com.ajay.utils.JDBCUtils;

import co.ajay.dto.UserDTO;

public class UserDao {
	
public static int register(User u){  
    int status=0;  
    try{  
        Connection con=JDBCUtils.getConnection();  
        PreparedStatement ps=con.prepareStatement(  
"insert into USERS(firstName,lastName,email,mobileNumber,password) values(?,?,?,?,?)");  
       
        ps.setString(1,u.getFirstName());  
        ps.setString(2,u.getLastName());  
        ps.setString(3,u.getEmail());  
        ps.setString(4,u.getMobileNumber());  
        ps.setString(5,u.getPassword()); 
        
        status=ps.executeUpdate();  
    }catch(Exception e){
    	System.out.println(e);
    }  
    return status;  
} 

public boolean isValidUser(UserDTO user){
    boolean status = false;
    try (
    	Connection connection = JDBCUtils.getConnection();
        PreparedStatement preparedStatement = connection.prepareStatement("select email,password from USERS where email = ? and password = ? ")) {
        preparedStatement.setString(1, user.getEmail());
        preparedStatement.setString(2, user.getPassword());

        ResultSet rs = preparedStatement.executeQuery();
        while(rs.next()) {
        	status=true;

        }

    } catch (SQLException e) {
    	e.printStackTrace();
    }
    return status;
}

}

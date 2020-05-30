package co.ajay.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ajay.dao.UserDao;
import com.ajay.model.User;

@WebServlet("/register")
public class UserController extends HttpServlet{
	private static final long serialVersionUID = 1L;
	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
	throws ServletException, IOException{
		response.setContentType("text/html");
		
		PrintWriter out=response.getWriter();
		
		String firstName=request.getParameter("firstName");
		String lastName=request.getParameter("lastName");
		String email=request.getParameter("email");
		String mobileNumber=request.getParameter("mobileNumber");
		String password=request.getParameter("password");
		
		User emp=new User();
		emp.setFirstName(firstName);
		emp.setLastName(lastName);
		emp.setEmail(email);
		emp.setMobileNumber(mobileNumber);
		emp.setPassword(password);
		
		int status=UserDao.register(emp);
		if(status>0) {
			out.print("<p style=\"color:green; text-align:center; margin-top: 4%;\">User Registered successfully !</p>");
			request.getRequestDispatcher("login.jsp").include(request, response);
		}
		else {
			out.println("sorry ! unable to register");
		}
		out.close();
	}
}

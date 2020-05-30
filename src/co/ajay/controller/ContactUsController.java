package co.ajay.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ajay.dao.ContactUsDao;
import com.ajay.model.ContactUs;
@WebServlet("/contactus")
public class ContactUsController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       response.setContentType("text/html");
       
       PrintWriter out=response.getWriter();
       
       String name=request.getParameter("name");
       String email=request.getParameter("email");
       String country=request.getParameter("country");
       String message=request.getParameter("message");
       
       ContactUs contact=new ContactUs();
       contact.setName(name);
       contact.setEmail(email);
       contact.setCountry(country);
       contact.setMessage(message);
       
       int status=ContactUsDao.contactus(contact);
       if(status > 0) {
    	   out.println("<p style=\\\"color:green; text-align:center; margin-top: 4%;\\\">Message Send Successfully !</p>");
    	   request.getRequestDispatcher("home.jsp").include(request, response);
       }
		else {
			out.println("sorry ! unable to send message");
		}
		out.close();
       
	}

}

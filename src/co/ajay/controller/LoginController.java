package co.ajay.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.ajay.dao.UserDao;

import co.ajay.dto.UserDTO;

@WebServlet("/login")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	UserDao userDao=new UserDao();

	UserDTO dto=null;
	
	@Override
	public void service(HttpServletRequest request, HttpServletResponse response)
  throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		String email=request.getParameter("email");
		String password=request.getParameter("password");
		
		dto=new UserDTO();
		
		dto.setEmail(email);
		dto.setPassword(password);
		
		try {
			boolean flag=userDao.isValidUser(dto);
			if(flag) {
				HttpSession session = request.getSession();
				session.setAttribute("email",email);  
				RequestDispatcher rd=request.getRequestDispatcher("/dashboard.jsp");
				rd.forward(request, response);
			}
			else {
				out.println("<font color=red>Please Enter Correct Email and Password</font");
				RequestDispatcher rd=request.getRequestDispatcher("/login.jsp");
				rd.forward(request, response);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}

}

package co.ajay.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ajay.dao.BookingDao;
import com.ajay.model.Booking;
@WebServlet("/bookService")
public class BookingController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		
		PrintWriter out=response.getWriter();
		
		String location=request.getParameter("location");
		String vehicleType=request.getParameter("vehicleType");
		String vehicleNumber=request.getParameter("vehicleNumber");
		String vehicleModel=request.getParameter("vehicleModel");
		String serviceType=request.getParameter("serviceType");
		String chooseService=request.getParameter("chooseService");
		String clientName=request.getParameter("clientName");
		String email=request.getParameter("email");
		String mobileNumber=request.getParameter("mobileNumber");
		
		Booking booking=new Booking();
		booking.setLocation(location);
		booking.setVehicleType(vehicleType);
		booking.setVehicleNumber(vehicleNumber);
		booking.setVehicleModel(vehicleModel);
		booking.setServiceType(serviceType);
		booking.setChooseService(chooseService);
		booking.setClientName(clientName);
		booking.setEmail(email);
		booking.setMobileNumber(mobileNumber);
		
		int status=BookingDao.bookNow(booking);
		if(status>0) {
			out.print("<p style=\"color:green; text-align:center; margin-top: 4%;\">Services Booked Successfully !</p>");
			request.getRequestDispatcher("dashboard.jsp").include(request, response);
		}
		else {
			out.println("sorry ! unable to register");
		}
		out.close();
	}

}

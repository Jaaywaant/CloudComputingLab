package com.atv;
import com.atv.dao.SignupDao;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.sql.Date;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

@WebServlet("/Signup")
public class Signup extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException
	{
		String id= request.getParameter("Employee_ID_Number");
		Integer Employee_ID_Number=Integer.valueOf(id);
		String pass = request.getParameter("pass");
		String Fname = request.getParameter("Fname");
		String Lname = request.getParameter("Lname");
		String d = request.getParameter("DOB");
		Date DOB= Date.valueOf(d);
		String contact = request.getParameter("Contact");
		Integer Contact=Integer.valueOf(contact);
				
		SignupDao dao2 = new SignupDao();
		dao2.insert(Employee_ID_Number, pass, Fname, Lname, DOB, Contact);
		response.sendRedirect("login.jsp");
	}	
}

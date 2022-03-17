package com.atv;
import com.atv.dao.loginDao;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

@WebServlet("/login")
public class login extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException
	{
		String id= request.getParameter("Employee_ID_Number");
		Integer Employee_ID_Number=Integer.valueOf(id);
		String pass = request.getParameter("pass");
		
		loginDao dao = new loginDao();
				
		if(dao.check(Employee_ID_Number, pass))
		{
			HttpSession session = request.getSession();
			session.setAttribute("username", Employee_ID_Number);
			response.sendRedirect("welcome.jsp");
		}
		else
		{
			response.sendRedirect("login.jsp");
		}
	}	
}

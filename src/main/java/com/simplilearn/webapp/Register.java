
package com.simplilearn.webapp;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class Register extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public Register() {
        super();
     }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
	    response.sendRedirect("register.html");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String userName = request.getParameter("username");
		String userEmail = request.getParameter("useremail");
		String userPassword = request.getParameter("password");
		String CnfPassword = request.getParameter("cnfpassword");
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.print("<html><body>");
		
		if(userName.equals("") && userEmail.equals("") && userPassword.equals("") && CnfPassword.equals("")) {
			out.print("<h1 style='color:red'> Registration failed * Required fields are missing!! Please try again!! </h1>");
	}else
	   {
		if(userPassword.equalsIgnoreCase(CnfPassword))
		{
			out.print("<h1 style='color:green'> Registration successfull!! for user "+userName+" </h1>");
		}
		else
			{
				out.print("<h1 style='color:red'> Invalid as Password Mismatch </h1>");
			}
		}
	}

	
}
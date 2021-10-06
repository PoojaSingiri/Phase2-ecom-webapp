package com.simplilearn.webapp;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public Login() {
        super();
        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
	    response.sendRedirect("login.html");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String userEmail = request.getParameter("useremail");
		String userPassword = request.getParameter("password");
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.print("<html><body>");
		if(userEmail.equals("") && userPassword.equals("")) {
		out.print("<h1 style='color:red'> Login failed * Required fields are missing!! Please try again!! </h1>");
		}else {
			if(userEmail.equals("admin@gmail.com") && userPassword.equals("admin@123")) {
				out.print("<h1 style='color:green'> Login successfull!! for user  "+userEmail+" </h1>");
			}
			else {
				out.print("<h1 style='color:red'> Invalid login credentials </h1>");
			}
		}
	}

}

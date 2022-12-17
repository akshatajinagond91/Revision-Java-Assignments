package com.controller;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.model.BLManger;
import com.pojo.Registration;
import com.pojo.Role;


@WebServlet("/LoginServlate")
public class LoginServlate extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	BLManger bl=new BLManger();
	Role r=new Role();
	Registration u=new Registration();
       
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		String email=request.getParameter("email");
		String password=request.getParameter("password");
		
		Registration ur=bl.serchbyemaillogin(email);
		
		boolean b = bl.searchbyCandEmailAndPassword(email, password);
		
		if(b==true)
		{
			if(ur.getRole().getRname().equals("user"))
			{
				
				
				String fname = ur.getFname();
				String lname = ur.getLname();
				String emaill = ur.getEmail();
				
				HttpSession session = request.getSession();
				
				session.setAttribute("fname",fname);
				session.setAttribute("lname",lname);
				session.setAttribute("emaill", emaill);
				
			
			response.sendRedirect("user.jsp");
			}
			
			
			else if (ur.getRole().getRname().equals("police")) 
			{
				String fname = ur.getFname();
				String lname = ur.getLname();
				String emaill = ur.getEmail();
				
				HttpSession session = request.getSession();
				
				session.setAttribute("fname",fname);
				session.setAttribute("lname",lname);
				session.setAttribute("emaill", emaill);
				
				
				response.sendRedirect("policestation.jsp");
				
				
			}
			else if(ur.getRole().getRname().equals("admin"))
			{
				
				String fname = ur.getFname();
				String lname = ur.getLname();
				String emaill = ur.getEmail();
				
				HttpSession session = request.getSession();
				
				session.setAttribute("fname",fname);
				session.setAttribute("lname",lname);
				session.setAttribute("emaill", emaill);
				
				
				response.sendRedirect("admin.jsp");
			}
		}
		
		else
		{
            response.sendRedirect("login.html");
		}
	}

}

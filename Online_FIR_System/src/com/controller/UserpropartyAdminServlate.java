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


@WebServlet("/UserpropartyAdminServlate")
public class UserpropartyAdminServlate extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	BLManger bl=new BLManger();
	Registration r=new Registration();
       
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		HttpSession session=request.getSession(false);
		String emaill=(String)session.getAttribute("emaill");
		
		
		  r=bl.serchbyemailuser(emaill);
		
		
		
		//HttpSession session=request.getSession();
		session.setAttribute("list",r);
		
		response.sendRedirect("UserProfileUpdateAdmin.jsp");
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		String fname=request.getParameter("fname");
		String lname=request.getParameter("lname");
		String address=request.getParameter("address");
		String city=request.getParameter("city");
		String email=request.getParameter("email");
		String mobileno=request.getParameter("mobileno");
		
		r.setFname(fname);
		r.setLname(lname);
		r.setAddress(address);
		r.setCity(city);
		r.setEmail(email);
		r.setMobileno(mobileno);
		
		
		bl.updateuserpro(r);
		
		response.sendRedirect("UserProfileUpdateAdmin.jsp");
	}

}

package com.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.model.BLManger;
import com.pojo.Registration;
import com.pojo.Theftrecord;


@WebServlet("/TheftServlate")
public class TheftServlate extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	BLManger bl=new BLManger();
	Registration r=new Registration();
	Theftrecord t=new Theftrecord();
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	    String email=request.getParameter("email");
		String theftthing=request.getParameter("theftthing");
		String theftthingaddress=request.getParameter("theftthingaddress");
		String theftthingcity=request.getParameter("theftthingcity");
		String information=request.getParameter("information");
		
		
		r=bl.serchbyemailtheft(email);
		
		
		t.setRegistration(r);
		t.setTheftthing(theftthing);
		t.setTheftthingaddress(theftthingaddress);
		t.setTheftthingcity(theftthingcity);
		t.setInformation(information);
		
		
		
		bl.savetheft(t);
		
		
	
		response.sendRedirect("Theft_Search.jsp");
	}
	

}

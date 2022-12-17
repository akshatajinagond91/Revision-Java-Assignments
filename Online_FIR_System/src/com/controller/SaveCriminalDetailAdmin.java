package com.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.model.BLManger;
import com.pojo.Criminaldetail;


@WebServlet("/SaveCriminalDetailAdmin")
public class SaveCriminalDetailAdmin extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	BLManger bl=new BLManger();
	Criminaldetail c=new Criminaldetail();
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String name=request.getParameter("name");
		String address=request.getParameter("address");
		String city=request.getParameter("city");
		String mobileno=request.getParameter("mobileno");
		String information=request.getParameter("information");
		
		
		c.setName(name);
		c.setAddress(address);
		c.setCity(city);
		c.setMobileno(mobileno);
		c.setInformation(information);
		
		bl.savecriminalrecord(c);
		
		response.sendRedirect("CriminalDetailAdmin.jsp");
	}

}

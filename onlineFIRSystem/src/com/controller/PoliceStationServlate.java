package com.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.model.BLManger;
import com.pojo.Registration;
import com.pojo.Role;


@WebServlet("/PoliceStationServlate")
public class PoliceStationServlate extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	BLManger bl=new BLManger();
	Role r=new Role();
	Registration rg=new Registration();
       
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	   
		String stationname=request.getParameter("stationname");
		String rname=request.getParameter("rname");
		String fname=request.getParameter("fname");
		String lname=request.getParameter("lname");
		String address=request.getParameter("address");
		String city=request.getParameter("city");
		String email=request.getParameter("email");
		String password=request.getParameter("password");
		String mobileno=request.getParameter("mobileno");
		
		r=bl.searchbyname(rname);
		
		
		rg.setRole(r);
		rg.setStationname(stationname);
		rg.setFname(fname);
		rg.setLname(lname);
		rg.setAddress(address);
		rg.setCity(city);
		rg.setEmail(email);
		rg.setPassword(password);
		rg.setMobileno(mobileno);
		
		
		bl.saveregister(rg);
		
		
	
		response.sendRedirect("login.html");
	}

}

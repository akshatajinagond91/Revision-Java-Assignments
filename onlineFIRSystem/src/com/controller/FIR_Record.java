package com.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.model.BLManger;
import com.pojo.Firrecord;
import com.pojo.Registration;


@WebServlet("/FIR_Record")
public class FIR_Record extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	BLManger bl=new BLManger();
	Registration r=new Registration();
	Firrecord f=new Firrecord();
  
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		 String email=request.getParameter("email");
			String victim_name=request.getParameter("victim_name");
			String victim_address=request.getParameter("victim_address");
			String victim_city=request.getParameter("victim_city");
			String information=request.getParameter("information");
			
			
			r=bl.serchbyemailfir(email);
			
			
			f.setRegistration(r);
			f.setVictimName(victim_name);
			f.setVictimAddress(victim_address);
			f.setVictimCity(victim_city);
			f.setInformation(information);
			
			
			
			bl.savefir(f);
			
			
		
			response.sendRedirect("FIR_Search.jsp");
		}
	

}

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


@WebServlet("/RagisterRecordUpdateServlate")
public class RagisterRecordUpdateServlate extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	BLManger bl=new BLManger();
	Registration r=new Registration();
       
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		String regNo=request.getParameter("regNo");
		int regNo1=Integer.parseInt(regNo);
		
		r=bl.serachidragister(regNo1);
		
		HttpSession session=request.getSession();
		session.setAttribute("list",r);
		
		response.sendRedirect("RagisterRecordUpdate.jsp");
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	    
		String stationname=request.getParameter("stationname");
		String fname=request.getParameter("fname");
		String lname=request.getParameter("lname");
		String address=request.getParameter("address");
		String city=request.getParameter("city");
		String email=request.getParameter("email");
		String mobileno=request.getParameter("mobileno");
		
		r.setStationname(stationname);
		r.setFname(fname);
		r.setLname(lname);
		r.setAddress(address);
		r.setCity(city);
		r.setEmail(email);
		r.setMobileno(mobileno);
		
		
		bl.updateuserpro(r);
		
		response.sendRedirect("ViewRagisterRecordAdmin.jsp");
	}

}

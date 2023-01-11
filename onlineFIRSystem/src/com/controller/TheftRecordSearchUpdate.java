package com.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.model.BLManger;
import com.pojo.Theftrecord;


@WebServlet("/TheftRecordSearchUpdate")
public class TheftRecordSearchUpdate extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	BLManger bl=new BLManger();
	Theftrecord t=new Theftrecord();
       
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
        String theftNo=request.getParameter("theftNo");
        
        int theftNo1=Integer.parseInt(theftNo);
		
		
		t=bl.serchbyidtheft(theftNo1);
		
		HttpSession session=request.getSession();
		session.setAttribute("list",t);
		
		response.sendRedirect("TheftRecordUpdateDelete.jsp");
	
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String theftthing=request.getParameter("theftthing");
		String theftthingaddress=request.getParameter("theftthingaddress");
		String theftthingcity=request.getParameter("theftthingcity");
		String information=request.getParameter("information");
		
		
		t.setTheftthing(theftthing);
		t.setTheftthingaddress(theftthingaddress);
		t.setTheftthingcity(theftthingcity);
		t.setInformation(information);
		
		
		
		bl.updatetheft(t);
		response.sendRedirect("Theft_Search.jsp");
	}

}

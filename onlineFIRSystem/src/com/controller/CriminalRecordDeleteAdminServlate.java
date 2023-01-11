package com.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.model.BLManger;
import com.pojo.Criminaldetail;


@WebServlet("/CriminalRecordDeleteAdminServlate")
public class CriminalRecordDeleteAdminServlate extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	BLManger bl=new BLManger();
	Criminaldetail c=new Criminaldetail();
   
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	 
		String criminalNo=request.getParameter("criminalNo");
		int criminalNo1=Integer.parseInt(criminalNo);
		
		c=bl.searchcriminalrecordno(criminalNo1);
		
		bl.deletecriminalrecord(c);
		
		response.sendRedirect("ViewCriminalDetailAdmin.jsp");
	
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}

package com.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.model.BLManger;
import com.pojo.Missingrecord;

@WebServlet("/MissingRecordSearchUpdate")
public class MissingRecordSearchUpdate extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	BLManger bl=new BLManger();
	Missingrecord m=new Missingrecord();
       
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
        String missingNo=request.getParameter("missingNo");
        
        int missingNo1=Integer.parseInt(missingNo);
		
		
		m=bl.serchbyidmissing(missingNo1);
		
		HttpSession session=request.getSession();
		session.setAttribute("list",m);
		
		response.sendRedirect("MissingReportUpdateDelete.jsp");
	
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String missingthing=request.getParameter("missingthing");
		String missingthingaddress=request.getParameter("missingthingaddress");
		String missingthingcity=request.getParameter("missingthingcity");
		String information=request.getParameter("information");
		
		
		m.setMissingthing(missingthing);
		m.setMissingthingaddress(missingthingaddress);
		m.setMissingthingcity(missingthingcity);
		m.setInformation(information);
		
		
		
		bl.updatemissing(m);
		response.sendRedirect("Missing_Search.jsp");
	}

}

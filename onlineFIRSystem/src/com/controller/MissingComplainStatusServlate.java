package com.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.model.BLManger;
import com.pojo.Missingrecord;
import com.pojo.Status;


@WebServlet("/MissingComplainStatusServlate")
public class MissingComplainStatusServlate extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	BLManger bl=new BLManger();
	Missingrecord m=new Missingrecord();
	Status s=new Status();
	
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String usertype=request.getParameter("usertype");
		String status=request.getParameter("status");
		String missingNo=request.getParameter("missingNo");
	    int missingNo1=Integer.parseInt(missingNo);
	    
	    m=bl.searchmissingidstatus(missingNo1);
	   
	    s.setMissingrecord(m);
	    s.setUsertype(usertype);
	    s.setStatus(status);
	    
	    bl.savemissingstatus(s);
	    
	    response.sendRedirect("ViewMissingComplainStatus.jsp");
	   

	}

}

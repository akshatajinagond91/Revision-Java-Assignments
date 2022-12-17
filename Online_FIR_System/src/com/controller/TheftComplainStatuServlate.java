package com.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.model.BLManger;
import com.pojo.Status;
import com.pojo.Theftrecord;


@WebServlet("/TheftComplainStatuServlate")
public class TheftComplainStatuServlate extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	BLManger bl=new BLManger();
	Theftrecord t=new Theftrecord();
	Status s=new Status();
       
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		String usertype=request.getParameter("usertype");
		String status=request.getParameter("status");
		String theftNo=request.getParameter("theftNo");
	    int theftNo1=Integer.parseInt(theftNo);
	    
	    t=bl.searchtheftidstatus(theftNo1);
		   
	    s.setTheftrecord(t);
	    s.setUsertype(usertype);
	    s.setStatus(status);
	    
	    bl.savetheftstatus(s);
	    
	    response.sendRedirect("ViewTheftComplainStatus.jsp");
	}

}

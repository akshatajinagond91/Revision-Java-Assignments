package com.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.model.BLManger;
import com.pojo.Status;


@WebServlet("/MissingStatusAdminUpdate")
public class MissingStatusAdminUpdate extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	BLManger bl=new BLManger();
	Status s=new Status();
       
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		String statusNo=request.getParameter("statusNo");
		int statusNo1=Integer.parseInt(statusNo);
		
		s=bl.searchmissingstatus(statusNo1);
	
		HttpSession session=request.getSession();
		session.setAttribute("list", s);
		
		response.sendRedirect("MissingStatusUpdateAdmin.jsp");
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String status=request.getParameter("status");
		
		
		s.setStatus(status);
		
		bl.missingstatusupdate(s);
		
		response.sendRedirect("ViewMissingStatusAdmin.jsp");
	}

}

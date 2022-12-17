package com.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.model.BLManger;
import com.pojo.Theftrecord;


@WebServlet("/TheftRecordDeleteAdmin")
public class TheftRecordDeleteAdmin extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	BLManger bl=new BLManger();
	Theftrecord t=new Theftrecord();
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		String theftNo=request.getParameter("theftNo");
		int theftNo1=Integer.parseInt(theftNo);
		
		t=bl.serachidtheftdelete(theftNo1);
		
		bl.deletemissing(t);
		
		response.sendRedirect("SearchTheftRecordAdmin.jsp");
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}

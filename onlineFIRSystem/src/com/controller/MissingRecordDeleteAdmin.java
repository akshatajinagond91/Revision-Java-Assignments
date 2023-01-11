package com.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.model.BLManger;
import com.pojo.Missingrecord;


@WebServlet("/MissingRecordDeleteAdmin")
public class MissingRecordDeleteAdmin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    BLManger bl=new BLManger();
    Missingrecord m=new Missingrecord();
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	   
		String missingNo=request.getParameter("missingNo");
		int missingNo1=Integer.parseInt(missingNo);
		
		m=bl.serachidmissingdelete(missingNo1);
		
		bl.deletemissing(m);
		
		response.sendRedirect("SearchMissingForAdmin.jsp");
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}

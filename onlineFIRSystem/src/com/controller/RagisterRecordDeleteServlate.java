package com.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.model.BLManger;
import com.pojo.Registration;


@WebServlet("/RagisterRecordDeleteServlate")
public class RagisterRecordDeleteServlate extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    BLManger bl=new BLManger();
    Registration r=new Registration();
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		String regNo=request.getParameter("regNo");
		int regNo1=Integer.parseInt(regNo);
		
		r=bl.serachidragister(regNo1);
		
		bl.deleteragister(r);
		
		response.sendRedirect("ViewRagisterRecordAdmin.jsp");
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}

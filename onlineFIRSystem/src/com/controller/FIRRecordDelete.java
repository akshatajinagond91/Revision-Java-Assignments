package com.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.model.BLManger;
import com.pojo.Firrecord;


@WebServlet("/FIRRecordDelete")
public class FIRRecordDelete extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	BLManger bl=new BLManger();
	Firrecord f=new Firrecord();
       
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		String firNo=request.getParameter("firNo");
		int firNo1=Integer.parseInt(firNo);
		
		f=bl.serachidfirdelete(firNo1);
		
		bl.deletefir(f);
		
		response.sendRedirect("FIR_Search.jsp");
		
	
	
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}

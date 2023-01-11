package com.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.model.BLManger;
import com.pojo.Firrecord;
import com.pojo.Status;


@WebServlet("/FIRComplainStatusUserServalate")
public class FIRComplainStatusUserServalate extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	BLManger bl=new BLManger();
	Firrecord f=new Firrecord();
	Status s=new Status();
   
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String usertype=request.getParameter("usertype");
		String status=request.getParameter("status");
		String firNo=request.getParameter("firNo");
	    int firNo1=Integer.parseInt(firNo);
	    
	    f=bl.searchfiridstatususer(firNo1);
	   
	    s.setFirrecord(f);
	    s.setUsertype(usertype);
	    s.setStatus(status);
	    
	    bl.savefirstatususer(s);
	    
	    response.sendRedirect("ViewFIRComplainStatusUser.jsp");
	}

}

package com.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.model.BLManger;
import com.pojo.Firrecord;


@WebServlet("/FIRRecordUpdateAdmin")
public class FIRRecordUpdateAdmin extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	BLManger bl=new BLManger();
	Firrecord f=new Firrecord();
       
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		String firNo=request.getParameter("firNo");
        
        int firNo1=Integer.parseInt(firNo);
		
		
		f=bl.serchbyidfir(firNo1);
		
		HttpSession session=request.getSession();
		session.setAttribute("list",f);
		
		response.sendRedirect("UpdateFIRRecordAdmin.jsp");
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String victimName=request.getParameter("victimName");
		String victimAddress=request.getParameter("victimAddress");
		String victimCity=request.getParameter("victimCity");
		String information=request.getParameter("information");
		
		
		f.setVictimName(victimName);
		f.setVictimAddress(victimAddress);
		f.setVictimCity(victimCity);
		f.setInformation(information);
		
		
		
		bl.updatefir(f);
		response.sendRedirect("SearchFIRRecordAdmin.jsp");
	}

}

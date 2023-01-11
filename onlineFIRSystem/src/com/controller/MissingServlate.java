package com.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.model.BLManger;
import com.pojo.Missingrecord;
import com.pojo.Registration;

@WebServlet("/MissingServlate")
public class MissingServlate extends HttpServlet {
	private static final long serialVersionUID = 1L;

	BLManger bl = new BLManger();
	Registration r = new Registration();
	Missingrecord m = new Missingrecord();

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException,
			IOException {

		String email = request.getParameter("email");
		String missingthing = request.getParameter("missingthing");
		String missingthingaddress = request.getParameter("missingthingaddress");
		String missingthingcity = request.getParameter("missingthingcity");
		String information = request.getParameter("information");

		r = bl.serchbyemailmissing(email);

		m.setRegistration(r);
		m.setMissingthing(missingthing);
		m.setMissingthingaddress(missingthingaddress);
		m.setMissingthingcity(missingthingcity);
		m.setInformation(information);

		bl.savemissing(m);

		response.sendRedirect("Missing_Search.jsp");
	}

}

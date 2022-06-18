package com.servlets;

import jakarta.servlet.http.HttpServlet;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.entities.login;


import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class loginservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	public void doPost(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException
	
	{
		try {
			 
			  int id= Integer.parseInt(request.getParameter("user_id"));
			  String uname=request.getParameter("user_name");
			  String email=request.getParameter("user_email");
			  String password=request.getParameter("user_password");
			  Date date=new Date();
			  login lgn=new login();
			  lgn.setId(id);
			  lgn.setUsername(uname);
			  lgn.setEmail(email);
			  lgn.setPassword(password);
			  lgn.setNewDate(date);
			  SessionFactory fact=	new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
			  Session s= fact.openSession();
			  Transaction tx=s.beginTransaction();
			  s.save(lgn);
			  tx.commit();
			  s.close();
			  fact.close();
			  response.setContentType("text/html");
			  PrintWriter out=response.getWriter();
    		  response.sendRedirect("login.jsp");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("error occured");
		}
	}
	
}

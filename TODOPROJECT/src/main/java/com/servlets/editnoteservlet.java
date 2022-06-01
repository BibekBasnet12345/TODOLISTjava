package com.servlets;

import java.io.IOException;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.entities.Todo;
import com.helper.factory;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class editnoteservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	public void doPost(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException
	{
   try {
	String title=request.getParameter("title");
	String content=request.getParameter("content");
	int id=Integer.parseInt(request.getParameter("listid").trim());
	Session session=factory.getFactory().openSession();
	Transaction tx=session.beginTransaction();
	Todo tt=(Todo)session.get(Todo.class,id);
	tt.setTitle(title);
	tt.setContent(content);
	tt.setAdded_Date(new Date());
	session.save(tt);
	tx.commit();
	session.close();
	response.sendRedirect("allnotes.jsp");
	
   } catch (Exception e) {
	e.printStackTrace();
   }
   System.out.println("hello");
	}
}

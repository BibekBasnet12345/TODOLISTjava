package com.servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.entities.Todo;
import com.helper.factory;



public class deleteservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public deleteservlet() {
        super();
    }
	public void doGet(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException{
		try {
		 int list_id=Integer.parseInt(request.getParameter("list_id").trim());
		 Session ss=factory.getFactory().openSession();
		 Transaction tx=ss.beginTransaction();
		 Todo td=(Todo)ss.get(Todo.class, list_id);
		 ss.delete(td);
		 tx.commit();
		 ss.close();
		 
		 response.sendRedirect("allnotes.jsp");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}


}

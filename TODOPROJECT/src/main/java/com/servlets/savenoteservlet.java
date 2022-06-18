package com.servlets;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.entities.Todo;
import com.helper.factory;


public class savenoteservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public void doPost(HttpServletRequest request,HttpServletResponse response)throws SecurityException,IOException
    {	
    	try {
    		//addnotes form content fetch
    		String title=request.getParameter("title");
    		String content=request.getParameter("content");
    		 
    		
           Todo td=new Todo(title, content,  new Date());
           
           //hibernate saving
           
         Session s=factory.getFactory().openSession();
         Transaction tx=s.beginTransaction();
        
         s.save(td);
         tx.commit();
   	    
 	     s.close();
 	     
 	    response.setContentType("text/html");
	     PrintWriter out=response.getWriter();
	     response.sendRedirect("allnotes.jsp");
    		
			
		} catch (Exception e) {
			e.printStackTrace();
		}
    	
    	System.out.println("hello");//console ma print garxa
    }
    
   


}

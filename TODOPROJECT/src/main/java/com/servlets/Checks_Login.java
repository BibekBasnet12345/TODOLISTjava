package com.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import org.apache.catalina.connector.Response;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.entities.login;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class Checks_Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
public void doPost(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException
	
	{
	try {
		 
		  int id=Integer.parseInt(request.getParameter("user_id"));
		  String uname=request.getParameter("user_name");
		  String email=request.getParameter("user_email");
		  String password=request.getParameter("user_password");
		  SessionFactory fact=	new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		  response.setContentType("text/html");
		  PrintWriter printWriter=response.getWriter();
			
		  Session s=fact.openSession();
		  Transaction tx=s.beginTransaction();
		  login login= s.load(login.class, id);
		   boolean forid=login.getId()==id;
		   boolean forname=login.getUsername().equals(uname);
	       boolean foremail= login.getEmail().equals(email);
	       boolean forpassword=login.getPassword().equals(password);
		   
		   if (forid&&forname&&foremail&&forpassword) {
			response.sendRedirect("addnotes.jsp");
	      	
	   }else if (!forname) {
		   printWriter.println("<div style='width:50%;\r\n"
		   		+ "border:2px solid black;\r\n"
		   		+ "margin:auto;\r\n"
		   		+ "padding:20px;\r\n"
		   		+ "font-size:20px;'>");
		   printWriter.println("<h1>Your UserName is wrong!!!!</h1><br>");
		   printWriter.println("<h1><a href='login.jsp'><button>Login Page</button></a>Go to Login page.If you remember your Name.</h1><br><h1><a href='Home.jsp'><button>Register page</button></a>Go to Registration page.If you want to register again</h1>");
		   printWriter.println("</div>");
		}else if (!foremail) {
		   printWriter.println("<div style='width:50%;\r\n"
				   		+ "border:2px solid black;\r\n"
				   		+ "margin:auto;\r\n"
				   		+ "padding:20px;\r\n"
				   		+ "font-size:20px;'>");
    	  printWriter.println("<h1>Your Email is wrong!!!!</h1><br>");
    	  printWriter.println("<h1><a href='login.jsp'><button>Login Page</button></a>Go to Login page.If you remember your Email.</h1><br><h1><a href='Home.jsp'><button>Register page</button></a>Go to Registration page.If you want to register again</h1>");
    	  printWriter.println("</div>");	 
	    }else if (!forpassword) {
	      printWriter.println("<div style='width:50%;\r\n"
				   		+ "border:2px solid black;\r\n"
				   		+ "margin:auto;\r\n"
				   		+ "padding:20px;\r\n"
				   		+ "font-size:20px;'>");
	      printWriter.println("<h1>Your password is wrong!!!!</h1><br>");
		  printWriter.println("<h1><a href='login.jsp'><button>Login Page</button></a>Go to Login page.If you remember your Password.</h1><br><h1><a href='Home.jsp'><button>Register page</button></a>Go to Registration page.If you want to register again</h1>");
		  printWriter.println("</div>");	
	   }else {
		  printWriter.println("<h1>Error login</h1><br>");
		  printWriter.println("<h1><a href='login.jsp'><button>Login Page</button></a>Go to Login page.If you remember your Details.</h1><br><h1><a href='Home.jsp'><button>Register page</button></a>Go to Registration page.If you want to register again</h1>");	
		}
			
     	  tx.commit();
      	  s.close();	
      	  fact.close();
		   
	} catch (Exception e) {
		response.setContentType("");
		PrintWriter write=response.getWriter();
		write.println("<h1>Id not Registered</h1>");
		
	}
	}
 
}

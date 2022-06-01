<!doctype html>
<%@page import="com.entities.Todo"%>
<%@page import="com.helper.factory"%>
<%@page import="org.hibernate.Session"%>
<html lang="en">
  <head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    
     
    <title>TODO LIST:EDIT PAGE</title>
    <%@include file="scriptandcss.jsp" %>
  </head>
  <body>
   <div class="container">
   <%@include file="navbar.jsp" %>
  
   
 </div>
   <%
   int list_id=Integer.parseInt(request.getParameter("list_id").trim());
   Session s=factory.getFactory().openSession();
   Todo td=(Todo)s.get(Todo.class, list_id);
   %>
   <div class="container">

   <br>
   <h1>Edit Your List</h1>
   <br>
 
   <form action="editnoteservlet" method="post">
   <input value="<%=td.getId()%>" name="listid"type="hidden" >
  <div class="form-group">
    <label for="title">Note Title</label>
    <input name="title" required type="text" class="form-control" id="title" aria-describedby="emailHelp" placeholder="Enter here"  value="<%=td.getTitle() %>"/>
   </div>
  <div class="form-group">
    <label for="content">Your Content</label>
    <textarea name="content" required id="content" placeholder="Enter your content here" class="form-control" style="height:100px;"> <%=td.getContent()%></textarea>
  </div>
   <div class="container text-center">
  <button type="submit" class="btn btn-success">Update</button>
  </div>
</form>
   </div>
  </body>
</html>
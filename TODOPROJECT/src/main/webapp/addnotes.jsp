<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>ADD NOTES</title>
 <%@include file="scriptandcss.jsp" %>
</head>
<body>
 <div class="container">
   <%@include file="navbar.jsp" %>

   <br>
   <h1>Please Fill Your Note Details</h1>
   
   <br>
   <!-- this is add form -->
   <form action="savenoteservlet" method="post">
  <div class="form-group">
    <label for="title">Note Title</label>
    <input  name="title" required type="text" class="form-control" id="title" aria-describedby="emailHelp" placeholder="Enter here">
   </div>
  <div class="form-group">
    <label for="content">Your Content</label>
    <textarea name="content" required id="content" placeholder="Enter your content here" class="form-control" style="height:100px;"></textarea>
  </div>
   <div class="container text-center">
  <button type="submit" class="btn btn- pink">Add</button>
  </div>
</form>
   </div>
</body>
</html>
<!doctype html>
<html lang="en">
  <head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    
     
    <title>TODO LIST:HOME PAGE</title>
    <%@include file="scriptandcss.jsp" %>
  </head>
  <body>
   <div class="container">
   <%@include file="navbar.jsp" %>
  
   <br>
    <h1 class="text-uppercase text-center">this is Home  page</h1>
    <br>
    
    <div class="card py-5">
    <img alt="" class="img-fluid mx-auto" src="home.png" style="max-width:400px;">
    <h1 class="text-info text-uppercase text-center">start making your notes</h1>
    <div class="container text-center">
    <button class="btn btn-warning"><a href="addnotes.jsp" class="text-danger">Click here to Add new List</a></button>
    </div>
    </div>
 </div>
   
  </body>
</html>
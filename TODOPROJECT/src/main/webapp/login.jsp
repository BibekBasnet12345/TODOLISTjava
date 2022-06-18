<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>LOGIN</title>
<style>
.container{
width:35%;
border:2px solid black;
margin:auto;
padding:20px;
font-size:20px;
}</style>
</head>
<body>
<div class="container">
<form action="Checks_Login" method="post">
   <table>
     <tr>
     <td>Enter the ID:</td>
     <td><input required type="text" autocomplete="off" name="user_id" placeholder="ID here"></td>
     </tr>
      <tr>
       <td>Enter your Name:</td>
       <td><input required type="text" autocomplete="off"  name="user_name" placeholder="Name here"></td>
     </tr>
     <tr>
       <td>Enter your Email:</td>
       <td><input  required type="email" autocomplete="off"  name="user_email" placeholder="Email here"></td>
     </tr>
     <tr>
       <td>Enter your password:</td>
       <td><input  required type="password" name="user_password" placeholder="Password here"></td>
     </tr>
     <tr>
     <td></td>
     <td><button type="submit">Login</button>
     </td>
     </tr>
 </table>
</form> 
</div>>
</body>
</html>
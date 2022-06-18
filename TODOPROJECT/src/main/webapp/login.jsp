<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Page</title>
<!-- I used Materlize CSS just to look COOL with the help of documentation -->
    <!-- Compiled and minified CSS -->
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/css/materialize.min.css">

     
</head>
<body style="background:url(background.jpg);background-size:cover; background-attachment:fixed;">

<div class="container">
    <div class="row">
       <div class="col m6 offset-m3">
           <div class="card grey lighten-3">
           <div class="card-content">
           <h4 style="margin-top:10px;"class="center-align">Login</h4>
           
           <div class="form center-align">
           <form  action="Checks_Login" method="post">
			
			
					<input required type="text" autocomplete="off"
						name="user_id" placeholder="Enter the ID here">
				
			       <input required type="text" autocomplete="off"
						name="user_name" placeholder="Enter your Name Here">
					
					<input required type="email" autocomplete="off"
						name="user_email" placeholder="Enter your Email here">
			
			
					<input required type="password" name="user_password"
						placeholder="Enter your Password here">
				
					
					<button type="submit" class="btn purple accent-4">Login</button>
			
		</form>
		  GO TO REGISTRATION PAGE:<button><a href="Home.jsp">Click here!!!</a></button>
           </div>
           </div>
           </div>

       </div>

     </div>

</div>
</body>
</html>
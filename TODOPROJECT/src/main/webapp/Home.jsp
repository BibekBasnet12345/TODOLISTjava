<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Register Form</title>
<style>
.container {
	width: 35%;
	border: 2px solid black;
	margin: auto;
	padding: 20px;
	font-size: 20px;
}

#myform table tr td input {
	font-size: 20px;
}
</style>
</head>
<body>
	<h1>You Have to Make Account before Using TODO list</h1>
	<div class="container">
		<h1>Registration Form</h1>
		<form id="myform" action="loginservlet" method="post">
			<table>
				<tr>
					<td>Enter the ID:</td>
					<td><input required type="text" autocomplete="off"
						name="user_id" placeholder="ID here"></td>
				</tr>
				<tr>
					<td>Enter your Name:</td>
					<td><input required type="text" autocomplete="off"
						name="user_name" placeholder="Name here"></td>
				</tr>
				<tr>
					<td>Enter your Email:</td>
					<td><input required type="email" autocomplete="off"
						name="user_email" placeholder="Email here"></td>
				</tr>
				<tr>
					<td>Enter your password:</td>
					<td><input required type="password" name="user_password"
						placeholder="Password here"></td>
				</tr>
				<tr>
					<td></td>
					<td><button type="submit">Register</button></td>
				</tr>
			</table>
		</form>
		Already Have Account:
		<button type="reset">
			<a href="login.jsp" class="btn btn-primary">SignUp</a>
		</button>
	</div>
</body>
</html>
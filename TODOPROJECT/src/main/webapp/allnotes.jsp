<!doctype html>
<%@page import="org.hibernate.criterion.NotEmptyExpression"%>
<%@page import="java.util.List"%>
<%@page import="org.hibernate.Query"%>

<%@page import="com.helper.factory"%>
<%@page import="org.hibernate.Session"%>
<%@page import="com.entities.*"%>
<html lang="en">
<head>
<!-- Required meta tags -->
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">


<title>TODO LIST:ALL NOTES</title>
<%@include file="scriptandcss.jsp"%>
</head>
<body>
	<div class="container">
		<%@include file="navbar.jsp"%>
		<br>
		<h1 class="text-uppercase">all notes</h1>
		<div class="row">
			<div class="container text-center">
				<button class="btn btn-warning">
					<a href="addnotes.jsp" class="text-danger">Click here to Add
						new List</a>
				</button>
			</div>
			<div class="col-12">
				<%
                   Session se=factory.getFactory().openSession();
    //HQL query to select all from table
    String hql="FROM Todo";
    Query q=se.createQuery(hql);
    List<Todo>li=q.list();
    for(Todo n:li)
    {
    %>
				<div class="card mt-3">

					<img class=" class-img-top m-4  mx-auto" src="notepad.png"
						style="max-width: 100px;" class="card-img-top" alt="...">
					<div class="card-body px-5">
						<h6 class="card-title text-warning">
							(<%=n.getId()%>)
						</h6>
						<h3 class="card-title text-dark"><%=n.getTitle()%></h3>
						<p class="card-text text-success"><%=n.getContent()%></p>
						<p>
							<b class="text-danger"><%=n.getAdded_Date()%></b>
						</p>
						<div class="container text-center">
							<a href="deleteservlet?list_id=<%=n.getId()%>"
								class="btn btn-danger">Delete</a> <a
								href="edit.jsp?list_id=<%=n.getId() %>" class="btn btn-primary">Edit</a>
						</div>
					</div>
				</div>

				<%
 }
 se.close();
    
    %>
			</div>
		</div>

	</div>

</body>
</html>
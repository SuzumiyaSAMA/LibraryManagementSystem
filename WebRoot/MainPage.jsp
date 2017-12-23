<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Library Management System</title>
<link rel="stylesheet" type="text/css" href="base.css" />
</head>
<body>
<div style="background-color:Azure; color:Brown">
<p>Hello, <%=session.getAttribute("user.name") %>. If not you, Please <a href="./index.jsp">login again</a>.</p>
</div>
<div id="head" style="margin:0 auto;text-align:center">
<table style="margin:auto">
		<caption>
		<h1>Welcome, <%=session.getAttribute("user.name") %></h1>
		<h3 style="color:yellow">What do you want to do today?</h3>
		</caption>
		<tr>
			<td>
			<form action="./RecordBook.jsp" method="post"><input type="submit" value="Record in Book"></form>
			</td>
			<td>
			<form action="./SearchBook.jsp" method="post"><input type="submit" value="Search Book"></form>
			</td>
			<td>
			<form action="./ReturnBook.jsp" method="post"><input type="submit" value="Return Book"></form>
			</td>
		</tr>
	</table>
</div>
	
</body>
</html>
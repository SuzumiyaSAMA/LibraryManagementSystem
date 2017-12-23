<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Library Management System</title>
<link rel="stylesheet" type="text/css" href="base.css" />
</head>
<body>
<div style="background-color:Azure; color:Brown">
<p>Hello, <%=session.getAttribute("user.name") %>. If not you, Please <a href="./index.jsp">login again</a>.</p>
</div>
<h1 style="text-align:center">Please enter the name of the book.</h1>
	<div id="section" style="margin:0 auto;text-align:center">
		<table style="margin:0 auto;" cellpadding="10">
			<s:form action="SearchBook.action" method="post" theme="simple">
			<tr>
			<td>Book Name:</td><td><s:textfield name="book.name" size="20" /></td>
			</tr>
			<tr>
				<td><s:submit value="Submit" /></td>
				<td><s:reset value="Reset" /></td>
			</tr>
			</s:form>
		</table>
	</div>
</body>
</html>
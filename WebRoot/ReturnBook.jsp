<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
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
			<s:form action="ReturnBook.action" method="post" theme="simple">
				<tr>
					<td>Book Name:</td>
					<td><s:textfield name="book.name" size="20" /></td>
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

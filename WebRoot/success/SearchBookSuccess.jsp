<%@ page language="java" import="java.util.*" pageEncoding="UTF-8" import="com.opensymphony.xwork2.ActionContext"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title>Library Management System</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
<link rel="stylesheet" type="text/css" href="../base.css" />
</head>

<body>
<div id="head"  style="margin:0 auto;text-align:center">
	<table border="1" style="margin:0 auto;text-align:center">
	<caption><h2>This is your book information</h2></caption>
	<tr>
	<td>bookNo</td><td>bookName</td><td>bookWriter</td><td>bookPublisher</td><td>bookNumber</td>
	</tr>
	<tr>
	<td><%=session.getAttribute("BookNo") %></td>
	<td><%=session.getAttribute("BookName") %></td>
	<td><%=session.getAttribute("BookWriter") %></td>
	<td><%=session.getAttribute("BookPublisher") %></td>
	<td><%=session.getAttribute("BookNumber") %></td>
	</tr>
	</table><br>
</div>
<div id="section" style="margin:auto;width:200px; text-align:center">
	<% if(Integer.valueOf(String.valueOf(session.getAttribute("BookNumber"))) > 0) {%>
	<input type="button" value="Borrow this book?" onclick="location.href='BorrowBook.action'" style="width:200px">
	<%}%>
	<br><br>
	<input type="button" value="Back to main page" onclick="location.href='./MainPage.jsp'" style="width:200px">
</div>
</body>
</html>

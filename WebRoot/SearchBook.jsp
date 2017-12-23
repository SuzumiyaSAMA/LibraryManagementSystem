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
	<div id="section" style="margin:0 auto;text-align:center">
	<s:form action="SearchBook.action" method="post" theme="simple">
			Book Name : <s:textfield name="book.name" size="20" /><br>
			<s:submit value="submit" />
			<s:reset value="reset" />
		</s:form>
	</div>
</body>
</html>
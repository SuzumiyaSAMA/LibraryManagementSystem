<%@ page language="java" pageEncoding="utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<title>Library Management System</title>
<link rel="stylesheet" type="text/css" href="base.css" />
</head>

<body>
	<div id="head">
		<h1>Welcome</h1>
	</div>
	<div id="section" style="margin:0 auto;text-align:center">
		<s:form action="UserCheck.action" method="post" theme="simple">
			UserName : <s:textfield name="user.name" size="20" /><br>
			Password : <s:password name="user.password" size="20" /><br>
			<s:submit value="submit" />
			<s:reset value="reset" />
		</s:form>
	</div>
</body>



</html>

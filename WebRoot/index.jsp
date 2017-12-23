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
		<table style="margin:0 auto" cellpadding="10">
			<s:form action="UserCheck.action" method="post" theme="simple">
				<tr>
					<s:fielderror style="color:red">
						<s:param>user.name</s:param>
					</s:fielderror>
				</tr>
				<tr>
					<td style="font-size:20px; font-weight:bold">UserName :</td>
					<td><s:textfield name="user.name" size="20" /></td>
				</tr>
				<tr>
					<s:fielderror style="color:red">
						<s:param>user.password</s:param>
					</s:fielderror>
				</tr>
				<tr>
					<td style="font-size:20px; font-weight:bold">Password :</td>
					<td><s:password name="user.password" size="20" /></td>
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

<%@ page language="java" contentType="text/html; charset=gb2312"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=gb2312">
<title>AppUser.jsp</title>
</head>
<body>
	<%@ include file="../header.jsp"%>
	<%@ include file="userheader.jsp"%>
	<hr />
	<s:property value="#session.user" />
	<br />
	<table width="300" border="1">
		<tr height="30">
			<td>posName</td>
			<td>enterprise</td>
			<td>appTime</td>
		</tr>
		<s:iterator value="apps" status="index">
			<tr height="30">
				<td><s:property value="posName" /></td>
				<td><s:property value="enterprise" /></td>
				<td><s:property value="appTime" /></td>
			</tr>
		</s:iterator>
	</table>
	<%@ include file="../footer.jsp"%>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=gb2312"%>
<%@ taglib prefix="s"  uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=gb2312">
<title>ReplyHrByType.jsp</title>
</head>
<body>
<%@ include file="../header.jsp" %>
<%@ include file="hrheader.jsp" %>
<hr/>
<s:property value="#session.user"/>
<br/>
<table width="300" border="1">
	<tr height="30">
		<td>posName</td>
		<td>appTime</td>
		<td>userName</td>
		<td>userAge</td>
		<td>userSchool</td>
		<td>replyType</td>
		<td>replyTime</td>
	</tr>
<s:iterator value="replys" status="index">
	<tr height="30">
		<td><s:property value="posName"/></td>
		<td><s:property value="appTime"/></td>
		<td><s:property value="userName"/></td>
		<td><s:property value="userAge"/></td>
		<td><s:property value="userSchool"/></td>
		<td><s:property value="replyType"/></td>
		<td><s:property value="replyTime"/></td>
	</tr>
</s:iterator>
</table>
<%@ include file="../footer.jsp" %>
</body>
</html>
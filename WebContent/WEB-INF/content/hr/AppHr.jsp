<%@ page language="java" contentType="text/html; charset=gb2312"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=gb2312">
<title>AppHr.jsp</title>
</head>
<body>
<s:if test="tip!=null">
	<script>
		alert('<s:property value="tip"/>');
	</script>
</s:if>
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
		<td>userPn</td>
		<td>&nbsp;</td>
	</tr>
<s:iterator value="apps" status="index">
	<tr height="30">
		<td><s:property value="posName"/></td>
		<td><s:property value="appTime"/></td>
		<td><s:property value="userName"/></td>
		<td><s:property value="userAge"/></td>
		<td><s:property value="userSchool"/></td>
		<td><s:property value="userPn"/></td>
		<td>
		<a href='processRepApp.action?repRequest=ok&appid=<s:property value="id"/>'>agree</a>&nbsp;
		<a href='processRepApp.action?repRequest=deny&appid=<s:property value="id"/>'>deny</a>
		</td>
	</tr>
</s:iterator>
</table>
<%@ include file="../footer.jsp" %>
</body>
</html>
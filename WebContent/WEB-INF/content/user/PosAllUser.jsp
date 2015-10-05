<%@ page language="java" contentType="text/html; charset=gb2312"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=gb2312">
<title>PosAllUser.jsp</title>
</head>
<body>
	<s:if test="tip!=null">
		<script>
		alert('<s:property value="tip"/>');
	</script>
	</s:if>
	<%@ include file="../header.jsp"%>
	<%@ include file="userheader.jsp"%>
	<hr />
	<s:property value="#session.user" />
	<br />
	<table width="300" border="1">
		<tr height="30">
			<td>name</td>
			<td>salary</td>
			<td>descText</td>
			<td>pubTime</td>
			<td>enterprise</td>
			<td>&nbsp;</td>
		</tr>
		<s:iterator value="poses" status="index">
			<tr height="30">
				<td><s:property value="name" /></td>
				<td><s:property value="salary" /></td>
				<td><s:property value="descText" /></td>
				<td><s:property value="pubTime" /></td>
				<td><s:property value="enterprise" /></td>
				<td><a
					href='processAddApp.action?posid=<s:property value="id"/>'>App!</a>
				</td>
			</tr>
		</s:iterator>
	</table>
	<%@ include file="../footer.jsp"%>
</body>
</html>
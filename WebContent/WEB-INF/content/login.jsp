<%@ page language="java" contentType="text/html; charset=gb2312"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=gb2312">
<title>��¼</title>
</head>
<body>
	<%@include file="header.jsp"%>
	<hr />
	<s:if test="tip!=null">
		<s:property value="tip" />
	</s:if>
	<br /> User
	<s:form action="rb/userlogin" method="post">
		<s:textfield name="user.userName" label="�û���" />
		<s:textfield name="user.userPass" label="����" />
		<s:submit value="��¼" />
		<s:reset value="����" />
	</s:form>
	<br />
	<hr />
	<br /> Hr
	<s:form action="rb/hrlogin" method="post">
		<s:textfield name="hr.hrName" label="�û���" />
		<s:textfield name="hr.hrPass" label="����" />
		<s:submit value="��¼" />
		<s:reset value="����" />
	</s:form>
	<%@include file="footer.jsp"%>
</body>
</html>
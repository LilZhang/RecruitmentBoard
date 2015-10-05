<%@ page language="java" contentType="text/html; charset=gb2312"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=gb2312">
<title>登录</title>
</head>
<body>
	<%@include file="header.jsp"%>
	<hr />
	<s:if test="tip!=null">
		<s:property value="tip" />
	</s:if>
	<br /> User
	<s:form action="rb/userlogin" method="post">
		<s:textfield name="user.userName" label="用户名" />
		<s:textfield name="user.userPass" label="密码" />
		<s:submit value="登录" />
		<s:reset value="重填" />
	</s:form>
	<br />
	<hr />
	<br /> Hr
	<s:form action="rb/hrlogin" method="post">
		<s:textfield name="hr.hrName" label="用户名" />
		<s:textfield name="hr.hrPass" label="密码" />
		<s:submit value="登录" />
		<s:reset value="重填" />
	</s:form>
	<%@include file="footer.jsp"%>
</body>
</html>
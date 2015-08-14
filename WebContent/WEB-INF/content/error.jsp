<%@ page language="java" contentType="text/html; charset=gb2312"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=gb2312">
<title>error.jsp</title>
</head>
<body>
	<%@include file="header.jsp"%>
	<hr />
	<br /> 0.0 ERROR 0.0
	<br />
	<br />
	<s:property value="exception.message" />
	<br />
	<%@include file="footer.jsp"%>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=gb2312"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=gb2312">
<title>Hr Index</title>
</head>
<body>
	<%@include file="../header.jsp"%>
	<%@include file="hrheader.jsp"%>
	<s:if test="tip!=null">
		<s:property value="tip" />
	</s:if>
	<hr />
	Welcome,
	<s:property value="#session.user" />
	<br /> Hr�û�
	<%@include file="../footer.jsp"%>
</body>
</html>
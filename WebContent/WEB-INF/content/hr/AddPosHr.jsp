<%@ page language="java" contentType="text/html; charset=gb2312"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=gb2312">
<title>AddPosHr.jsp</title>
</head>
<body>
	<s:if test="tip!=null">
		<script>
		alert('<s:property value="tip"/>');
	</script>
	</s:if>
	<%@ include file="../header.jsp"%>
	<%@ include file="hrheader.jsp"%>
	<hr />
	<s:property value="#session.user" />
	<br />
	<s:form action="rb/processAddPos">
		<s:textfield name="posName" label="posName" />
		<s:textfield name="posSalary" label="posSalary" />
		<s:textfield name="posText" label="posText" />
		<s:token />
		<tr>
			<td colspan="2"><s:submit value="发布" /> <s:reset value="重新输入" />
			</td>
		</tr>
	</s:form>
	<%@ include file="../footer.jsp"%>
</body>
</html>
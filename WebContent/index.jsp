<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<a href="${pageContext.request.contextPath }/live/request.jsp">演示request的创建和销毁</a><br>
	<a href="${pageContext.request.contextPath }/live/session_des.jsp">演示session销毁</a><br>
	<br>
	<a href="${pageContext.request.contextPath }/attr/attr_set.jsp">添加属性</a><br>
	<a href="${pageContext.request.contextPath }/attr/attr_rep.jsp">替换|添加 属性</a><br>
	<a href="${pageContext.request.contextPath }/attr/attr_rem.jsp">删除属性</a><br>
	<br>
	<a href="${pageContext.request.contextPath }/session/session_set.jsp">javabean绑定到session中</a><br>
	<a href="${pageContext.request.contextPath }/session/session_rem.jsp">javabean从session中解绑</a><br>
	<a href="${pageContext.request.contextPath }/session/session_getbean.jsp">获取Javabean的名称（活化）</a><br>
	<hr>
	
	<a href="${pageContext.request.contextPath }/demo1">filter入门</a><br>
	<a href="${pageContext.request.contextPath }/demo2">filter生命周期</a><br>
	<a href="${pageContext.request.contextPath }/a/b/demo3">filterchain执行顺序</a><br>
	<a href="${pageContext.request.contextPath }/e/demo20">dispatcher使用</a><br>
</body>
</html>
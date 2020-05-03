<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>

<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<base href="<%=basePath%>">

<!DOCTYPE html>

<html>
<body>
<h2>Hello,wonderful day!</h2>
<a href="<%=basePath%>/api/user">点击我找到范冰冰</a>
</body>
</html>

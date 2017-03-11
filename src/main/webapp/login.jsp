<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/3/6
  Time: 8:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="view/tagPage.jsp"%>
<html>
<head>
    <title>login</title>
</head>
<body>
<h1>登录</h1>
<p>${message}</p>
<form action="${webRoot}/loginController/login.do" method="post">
    工号:<input type="text" id="empId" name="empId" value="${empFromForm.empId}" /><br>
    密码:<input type="password" id="empPwd" name="empPwd" value="${empFromForm.empPwd}" /><br>
    <input type="submit" value="登录"/>
    <input type="reset" value="重新填写"/>
</form>
</body>
</html>

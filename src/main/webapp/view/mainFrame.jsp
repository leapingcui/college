<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="tagPage.jsp"%>
<html>
<head>
    <title>mainFrame</title>
</head>
<body>
<h1>学生信息</h1>
<h3><a href="${webRoot}/studentController/testLogback.do">测试logback</a></h3>
<a href="${webRoot}/studentController/insertStudentUI.do">新增</a>
<table border="1" >
    <tr>
        <th>学号</th>
        <th>姓名</th>
        <th>性别</th>
        <th>出生日期</th>
        <th>班级</th>
        <th>详情</th>
        <th>编辑</th>
        <th>删除</th>
    </tr>
    <c:forEach items="${students}" var="student">
    <tr>
        <td>${student.stuId}</td>
        <td>${student.stuName}</td>
        <td>${student.stuSex}</td>
        <td><fmt:formatDate value="${student.stuBirth}" pattern="yyyy-MM-dd"></fmt:formatDate> </td>
        <td>${student.classes.claName}</td>
        <td><a href="${webRoot}/studentController/detailedStudent.do?stuId=${student.stuId}">详情</a></td>
        <td><a href="${webRoot}/studentController/updateStudentUI.do?stuId=${student.stuId}">编辑</a></td>
        <td><a href="${webRoot}/studentController/deleteStudent.do?stuId=${student.stuId}">删除</a></td>
    </tr>
    </c:forEach>
</table>
</body>
</html>

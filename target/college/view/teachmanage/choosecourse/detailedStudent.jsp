<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="../../tagPage.jsp"%>
<html>
<head>
    <title>detailedStudent</title>
</head>
<body>
<h1>学生详情</h1>
    <a href="${webRoot}/studentController/showAllStudents.do">返回</a>
    <table border="1">
        <tr>
            <td>学号</td>
            <td>${student.stuId}</td>
        </tr>
        <tr>
            <td>姓名</td>
            <td>${student.stuName}</td>
        </tr>
        <tr>
            <td>性别</td>
            <td>${student.stuSex}</td>
        </tr>
        <tr>
            <td>出生年月</td>
            <td><fmt:formatDate value="${student.stuBirth}" pattern="yyyy-MM-dd"></fmt:formatDate> </td>
        </tr>
        <tr>
            <td>班级号</td>
            <td>${student.classes.claId}</td>
        </tr>
        <tr>
            <td>班级名</td>
            <td>${student.classes.claName}</td>
        </tr>
    </table>

</body>
</html>

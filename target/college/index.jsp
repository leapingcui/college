<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="view/tagPage.jsp"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.0 Transitional//EN">
<HTML>
<HEAD>
    <TITLE>index</TITLE>
    <META http-equiv=Content-Type content="text/html; charset=utf-8">
</HEAD>
<BODY>

<%--
<h1><a href="${webRoot}/studentController/hello.do" target="_blank">hello</a></h1>
<h1><a href="${webRoot}/studentController/showAllStudents.do" target="_blank">显示所有学生</a></h1>
<h1><a href="${webRoot}/studentController/showStudentToJspById.do?stuId=101" target="_blank">jsp页面显示</a></h1>
<h1><a href="${webRoot}/studentController/showStudentToJSONById.do?stuId=101" target="_blank">json页面显示</a></h1>
--%>

<jsp:forward page="/view/login.jsp"></jsp:forward>
</BODY>
</HTML>
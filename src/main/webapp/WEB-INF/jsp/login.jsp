<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="UTF-8" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Login</title>
</head>
<body>
<form:form id="loginForm" modelAttribute="user" action="loginProcess" method="post">
    <table align="center">
        <tr>
            <td>
                <form:label path="userName">用户名: </form:label>
            </td>
            <td>
                <form:input path="userName" name="userName" id="userName" />
            </td>
        </tr>
        <tr>
            <td>
                <form:label path="userPassword">密码:</form:label>
            </td>
            <td>
                <form:password path="userPassword" name="userPassword" id="userPassword" />
            </td>
        </tr>
        <tr>
            <td></td>
            <td align="left">
                <form:button id="login" name="login">登录</form:button>
            </td>
        </tr>
        <tr></tr>
        <tr>
            <td></td>
            <td><a href="/">主页</a>
            </td>
        </tr>
    </table>
</form:form>
<table align="center">
    <tr>
        <td style="font-style: italic; color: red;">${message}</td>
    </tr>
</table>
</body>
</html>
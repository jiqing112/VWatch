<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Registration</title>
</head>
<body>
<form:form id="regForm" modelAttribute="user" action="/user/register" method="post">
    <table align="center">
        <tr>
            <td>
                <form:label path="userName">账号</form:label>
            </td>
            <td>
                <form:input path="userName" name="userName" id="userName" />
            </td>
            <td>
                <form:errors path="userName"/>
            </td>
        </tr>
        <tr>
            <td>
                <form:label path="userPassword">密码</form:label>
            </td>
            <td>
                <form:password path="userPassword" name="userPassword" id="userPassword" />
            </td>
            <td>
                <form:errors path="userPassword"/>
            </td>
        </tr>
        <tr>
            <td>
                <form:label path="userGender">性别</form:label>
            </td>
            <td>
                <form:input path="userGender" name="userGender" id="userGender" />
            </td>
        </tr>
        <tr>
            <td>
                <form:label path="userEmail">邮箱</form:label>
            </td>
            <td>
                <form:input path="userEmail" name="userEmail" id="userEmail" />
            </td>
        </tr>
        <tr>
            <td>
                <form:label path="userPhone">手机号</form:label>
            </td>
            <td>
                <form:input path="userPhone" name="userPhone" id="userPhone" />
            </td>
        </tr>
        <tr>
            <td></td>
            <td>
                <form:button id="register" name="register">Register</form:button>
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
</body>

</html>
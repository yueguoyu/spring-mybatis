<%--
  Created by IntelliJ IDEA.
  User: ygy
  Date: 17-10-10
  Time: 下午2:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="mvc" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Title</title>
    <style type="text/css">
        .formFieldError {background-color: aquamarine}
    </style>
</head>
<body>
<%--@elvariable id="User" type="com.ygy.model"--%>
<mvc:form modelAttribute="user" method="post" action="login">
    <table>
        <tr>
            <td><mvc:label path="name">name</mvc:label></td>
            <td><mvc:input path="name"/>
            </td>
        </tr>
        <tr>
            <td><mvc:label path="password">password</mvc:label></td>
            <td><mvc:password path="password"/></td>
        </tr>
    </table>
    <input type="submit" value="go">

</mvc:form>
</body>
</html>

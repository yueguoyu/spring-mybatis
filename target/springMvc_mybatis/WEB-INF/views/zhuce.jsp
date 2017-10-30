<%@ taglib prefix="mvc" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: ygy
  Date: 17-10-10
  Time: 下午2:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <style type="text/css">
        .formFieldError {background-color: aquamarine}
    </style>
</head>
<body>
<%--@elvariable id="user1" type="com.ygy.model.User"--%>
<from>
    <table>
           <tr>
               <td>name</td>
               <td><input type="text" name="name"></td>
           </tr>
    </table>
</from>
</body>
</html>

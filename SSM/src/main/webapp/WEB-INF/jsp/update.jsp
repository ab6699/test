<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<center>
<form action="/update">
    <div><label>编号:</label>
    <input type="text" name="id" readonly="readonly" value="${user.id}">
    </div>
    <div>
        <label>请输入用户名:</label>
        <input type="text" name="username" value="${user.username}">
    </div>

    <div>
        <label>请输入密码:</label>
        <input type="text" name="password" value=" ${user.password}">
    </div>

    <input type="submit" value="修改"/>
</form>
</center>
</body>
</html>

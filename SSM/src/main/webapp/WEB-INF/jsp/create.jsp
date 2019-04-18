<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<center>
<form action="/add">
    <div><label>编号自动生成，无需填写</label></div>

    <div>
        <label>请输入用户名:</label>
        <input type="text" name="username">
    </div>

    <div>
        <label >请输入密码:</label>
        <input type="text" name="password">
    </div>

  <input type="submit" value="新增"/>

</form>
</center>
</body>
</html>

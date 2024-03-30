<%--
  Created by IntelliJ IDEA.
  User: jungwoopark
  Date: 2024/03/20
  Time: 1:38 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
<form action="/jsp/members/save.jsp" method="post">
    username : <input type="text" name="username" />
    age : <input type="text" name="age" />
    <button type="submit">전송</button>
</form>
</body>
</html>

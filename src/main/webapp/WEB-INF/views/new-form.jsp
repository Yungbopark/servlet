<%--
  Created by IntelliJ IDEA.
  User: jungwoopark
  Date: 2024/03/21
  Time: 1:40 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%--상대경로 사용, [현재 url 이 속 계층 경로 + /save --%>
    <form action="save", method="post">
        username : <input type="text" name="username">
        age: <input type="text" name="age">
        <button type="submit">전송</button>
    </form>
</body>
</html>

<%--
  Created by IntelliJ IDEA.
  User: jungwoopark
  Date: 2024/03/21
  Time: 2:02 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<ul>
    <%--model 에 담긴 객체를 가져올 때는 jstl 표현식을 사용한다 (프로퍼티 접근법) --%>
    <%--view 는 출력만 담당함--%>
    <li>id=${member.id}</li>
    <li>username=${member.username}</li>
    <li>age=${member.age}</li>
</ul>
</body>
</html>

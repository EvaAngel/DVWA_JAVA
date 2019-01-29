<%@ page import="pojo.User" %><%--
  Created by IntelliJ IDEA.
  User: fuxin
  Date: 2019/1/23
  Time: 9:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <%User user=(User)request.getAttribute("user");%>
    <%=user.getUsername()%>
    <%=user.getPassword()%>
</body>
</html>

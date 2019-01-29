<%--
  Created by IntelliJ IDEA.
  User: fuxin
  Date: 2019/1/21
  Time: 22:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>sql注入漏洞测试</title>
</head>
<body>
<script>
    //这种是初级get提交数据
    function chujiget() {
        var sql = document.getElementsByName("sqltest")[0];
        alert(sql.value);
        document.location = '/sqlinjection.do?sqltest=' + sql.value;

    }
    //这种是初级post提交数据
    function chujipost() {
        var sql = document.getElementsByName("sqltest")[0];
        document.write("<form action='/sqlinjection.do' method=post name=myForm style='display:none'>");
        document.write("<input type=hidden name='sqltest' value="+sql.value+">");//参数1
        document.write("</form>");
        document.myForm.submit();
    }
</script>
<table align="center">
    <tr>
        <td>初级测试：</td>
        <td><input type="text" value="请输入测试语句" name="sqltest"></td>
        <td><input type="button" value="开始测试" onclick="chujiget()"></td>
    </tr>
    <tr>
        <td>中级测试：</td>
        <td><input type="text" value="请输入测试语句" name="sqltest"></td>
    </tr>
    <tr>
        <td>高级测试：</td>
        <td><input type="text" value="请输入测试语句" name="sqltest"></td>
    </tr>
</table>
</body>
</html>

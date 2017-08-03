<%--
  Created by IntelliJ IDEA.
  User: Guihu
  Date: 2017/8/3
  Time: 8:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
  String path = request.getContextPath();
  String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
  String test = request.getParameter("test");//用request得到
%>
<html>
  <head>
    <title>Test2</title>
  </head>
  <body>
  Hi,<%=test%>
  <%--http://localhost:8080/springmvc/test/test?test=1--%>
  </body>
</html>

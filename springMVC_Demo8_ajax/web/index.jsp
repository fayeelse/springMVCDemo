<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2021/7/15
  Time: 15:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
    <script src="${pageContext.request.contextPath}/static/js/jquery-3.6.0.js"></script>
    <script>
      function a(){
        $.post({
          url:"${pageContext.request.contextPath}/a1",
          data:{"name":$("#username").val()},
          success:function (data,status) {
            console.log("data="+data);
            console.log("status="+status);
          }
        })
      }
    </script>
  </head>
  <body>
  <%--失去焦点的时候，发布一个请求到后台--%>
  用户名:<input type="text" id="username" onblur="a()">
  </body>
</html>

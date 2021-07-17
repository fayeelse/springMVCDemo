
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登录</title>
    <script src="${pageContext.request.contextPath}/static/js/jquery-3.6.0.js"></script>
    <script>
        function a1() {
            $.post({
                url:"${pageContext.request.contextPath}/a3",
                data:{"name":$("#name").val()},
                success:function (data) {
                    if(data.toString()=="√"){
                        $("#userInfo").css("color","green");
                    }
                    if(data.toString()=="×"){
                        $("#userInfo").css("color","red")
                    }
                    $("#userInfo").html(data);
                }
            })
        }
        function a2() {
            $.post({
                url:"${pageContext.request.contextPath}/a3",
                data:{"pwd":$("#pwd").val()},
                success:function (data) {
                    if(data.toString()=="×"){
                        $("#pwdInfo").css("color","red");
                    }
                    if(data.toString()=="√"){
                        $("#pwdInfo").css("color","green")
                    }
                    $("#pwdInfo").html(data)
                }
            })
        }
    </script>
</head>
<body>
<p>
    昵称:<input type="text" id="name" onblur="a1()">
    <span id="userInfo"></span>
</p>
<p>
    密码:<input type="text" id="pwd" onblur="a2()">
    <span id="pwdInfo"></span>
</p>
</body>
</html>

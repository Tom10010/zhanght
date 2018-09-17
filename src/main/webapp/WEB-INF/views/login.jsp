<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<html>
<title>
    你好
</title>

<body>

<h2>Hello World!</h2>
<form action="http://localhost:8080/aaa/ccc">
    username:<input type="text" id="username" name="username" placeholder="请输入用户名" required="required"><br>
    password:<input type="password" id="password" name="password" placeholder="请输入密码" required="required">
    <input type="submit" value="登录"  >
</form>
</body>

<script src="../js/jquery-3.3.1.js" type="text/javascript"></script>
<script type="text/javascript">

    function request() {
        var username=$('#username').val();
        var password=$('#password').val();
        var url="http://localhost:8080/aaa/ccc"

        var postData = {
            'username' : username,
            'password' : password
        }

        $.ajax({
            url     : url,
            type    : "POST",
            data    : postData,
            success : function (data) {
                $('body .mask').remove();
                if (data == null){
                    alert("aaa");
                }
                alert("aaa");
            },
            error : function (result) {
                $('body .mask').remove();
                alert("noasfdasd");
            }

        });

    };

</script>
</html>

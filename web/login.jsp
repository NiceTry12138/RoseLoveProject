<%--
  Created by IntelliJ IDEA.
  User: cong
  Date: 19-6-1
  Time: 下午5:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="Expires" content="0">
    <meta http-equiv="Pragma" content="no-cache">
    <meta http-equiv="Cache-control" content="no-cache">
    <meta http-equiv="Cache" content="no-cache">
    <title>登录</title>
    <script type="text/javascript" src="./jquery-3.2.1.min.js"></script>
    <!-- 最新版本的 Bootstrap 核心 CSS 文件 -->
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">

    <!-- 可选的 Bootstrap 主题文件（一般不用引入） -->
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/css/bootstrap-theme.min.css" integrity="sha384-rHyoN1iRsVXV4nD0JutlnGaslCJuC7uwjduW9SVrLvRYooPp2bWYgmgJQIXwl/Sp" crossorigin="anonymous">

    <!-- 最新的 Bootstrap 核心 JavaScript 文件 -->
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>
    <style>
        a:hover{
            text-decoration: none;
        }
    </style>
</head>
<body>
<div style="padding-bottom: 5%; background-color: rgb(250,118,131); ">
    <br>
    <div class="btn-group col-md-offset-1">
        <span style="font-size: 20px">没有帐号？马上</span>
        <button type="button" class="btn Mybutton" onclick="window.location.href='${pageContext.request.contextPath}/register.jsp'">注册</button>
    </div>
    <div class="col-md-6 col-md-offset-2">
        <img class="col-md-3  " src="img/logo3.png">
        <img class="col-md-6  " src="img/logo2.png">
    </div>
</div>

<div style="display: block; overflow: hidden">
    <div style="margin-top: 30px; margin-left: 20%; float: left; text-align: center">

    </div>
    <div style="float: right; margin-right: 20%; text-align: center; margin-top: 30px">
        <span style="font-size: 20px">登录Rose在线情缘</span><br><br>
        <form method="post" action="${pageContext.request.contextPath}/login">
            <span style="font-size: 18px">邮&nbsp;&nbsp;&nbsp;箱</span>&nbsp;&nbsp;&nbsp;<input type="text" name="userName"><br><br>
            <span style="font-size: 18px">密&nbsp;&nbsp;&nbsp;码</span>&nbsp;&nbsp;&nbsp;<input type="password" name="password"><br><br>
            <span style="font-size: 18px">验证码</span>&nbsp;&nbsp;&nbsp;<input name="vcode" type="text"/><br><br>
            <a href="javascript:refreshCode();" style="margin-left: 20px">
                <img style="width: 80px;height: 30px;" src="${pageContext.request.contextPath}/image/vcode" title="看不清，换张图片" id="code">
                <span style="font-size: 10px; ">看不清，换张图</span>
            </a><span style="color: red"><%
                        if (request.getAttribute("msg") != null){
                            out.print((String)request.getAttribute("msg"));
                        }
                        %></span>
            <br><br>
            <div style="margin: 0 auto">
                <input type="submit" value="立即登录" class="btn btn-primary" style="display: table-cell"><br><br>
                <a style="margin: 0 auto" href="javascript:location.href='${pageContext.request.contextPath}/register.jsp'">免费注册</a>
            </div>

        </form>
    </div>
</div>

<div style="text-align: center; margin-top: 30px">
    <span>品牌：专业婚恋服务  专业：庞大的资深红娘队伍  真实：诚信会员验证体系</span><br>
    <span>客服热线：xxxx-xxx-xxx（周一至周日：9:00-21:00）客服信箱：xxx@xxx.com</span><br>
    <span>违法和不良信息举报  xxxx-xxx-xxx  举报信箱：xxx@xxx.com</span><br>
    <span>Copyright © 2018-2019 版权所有：宜昌市Rose在线情缘网信息技术有限公司</span><br>
    <span>增值电信业务经营许可证：粤xx-xxx</span>
</div>
<script>
    function refreshCode() {

        var codeImg = document.getElementById("code");
        function refreshCode() {
            codeImg.src = "${pageContext.request.contextPath}/image/vcode?time=" + new Date().getTime();
        }
    }
</script>
</body>
</html>

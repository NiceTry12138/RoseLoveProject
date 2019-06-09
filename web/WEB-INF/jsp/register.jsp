<%--
  Created by IntelliJ IDEA.
  User: cong
  Date: 19-6-1
  Time: 下午2:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="en">
<head>
    <meta http-equiv="Expires" content="0">
    <meta http-equiv="Pragma" content="no-cache">
    <meta http-equiv="Cache-control" content="no-cache">
    <meta http-equiv="Cache" content="no-cache">
    <meta charset="UTF-8">
    <title>注册</title>
    <script type="text/javascript" src="jquery-3.2.1.min.js"></script>
    <!-- 最新版本的 Bootstrap 核心 CSS 文件 -->
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">

    <!-- 可选的 Bootstrap 主题文件（一般不用引入） -->
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/css/bootstrap-theme.min.css" integrity="sha384-rHyoN1iRsVXV4nD0JutlnGaslCJuC7uwjduW9SVrLvRYooPp2bWYgmgJQIXwl/Sp" crossorigin="anonymous">

    <!-- 最新的 Bootstrap 核心 JavaScript 文件 -->
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>
    <style>
        div > form > div{
            margin-top: 3%;
        }
        div > form > div span {
            margin-left: 20px;
            margin-right: 50px;
            font-size: 18px;
        }
        a:hover {
            text-decoration: none;
        }
    </style>
</head>
<body>
<div style="background-color: white;overflow: hidden; height: 263px">
    <div style="float: left; height: 263px">
        <img src="${pageContext.request.contextPath}/img/u86.png" style="outline: none; " tabindex="0">
    </div>
    <div style="padding: 0px; float: right; margin-right: 10%; margin-top: 10%" >
        <span style="font-size: 20px">已有帐号？马上</span>
        <a class="btn btn-primary btn-sm" style="margin-bottom: 10px">登录</a>
    </div>
</div>

<div style="float: left; width: 50%; background-color: #F4F4F4;margin-top: 20px; margin-left: 3%">
    <div align="center" style="font-size: 30px">注册Rose在线情缘</div>
    <form method="post" style="margin-left: 10%;">
        <div>
            <div style="font-size: 25px">注册账户</div><br>
            <span >用户名</span><input name="userName" type="text"/><br><br>
            <span>密&nbsp;&nbsp;&nbsp;码</span><input name="passWord" type="password"/><br><br>
            <span>邮&nbsp;&nbsp;&nbsp;箱</span><input name="mail" type="email"/><br><br>
            <span>验证码</span><input name="vcode" type="text"/><br><br>
            <a href="javascript:refreshCode();" style="margin-left: 20px">
                <img style="width: 80px;height: 30px;" src="${pageContext.request.contextPath}/image/vcode" title="看不清，换张图片" id="code">
                <span style="font-size: 10px; ">看不清，换张图</span>
            </a><br><br>
        </div>
        <div id="statue">
            <div style="font-size: 25px">编辑征婚资料</div><br><br>
            <span>我的性别</span><input type="radio" name="gender" value="男" checked="checked">男&nbsp;&nbsp;&nbsp;<input type="radio" name="gender" value="女">女<br><br>
            <span>婚姻状况</span><input type="radio" name="bride" value="未婚" checked="checked">未婚&nbsp;&nbsp;&nbsp;<input type="radio" name="bride" value="离婚">离婚&nbsp;&nbsp;&nbsp;<input type="radio" name="bride" value="丧偶" >丧偶<br><br>
            <span>出生日期</span>
            <select>
                <option>1980</option>
            </select>年&nbsp;&nbsp;&nbsp;
            <select>
                <option>1</option>
            </select>月&nbsp;&nbsp;&nbsp;
            <select>
                <option>1</option>
            </select>日
            <br><br>
            <span>工作地区</span>
            <select>
                <option value ="volvo">湖南</option>
                <option value ="saab">湖北</option>
                <option value="opel">河北</option>
            </select>省&nbsp;&nbsp;&nbsp;
            <select id="shi">
            </select>市&nbsp;&nbsp;&nbsp;
            <select id="qu  ">
            </select>区

            <br><br>

            <span>我的身高</span><input type="number" name="height"><br><br>
            <span>我的学历</span><input type="text" name="xueli"><br><br>
            <span>我的收入</span><input type="number" name="income"><br><br>
        </div>
        <input type="submit" class="btn btn-primary" value="立即注册">
    </form>
</div>
<script>
    var codeImg = document.getElementById("code");
    function refreshCode() {
        codeImg.src = "${pageContext.request.contextPath}/image/vcode?time=" + new Date().getTime();
    }
</script>

</body>
</html>
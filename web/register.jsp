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
        #wasForm > div{
            margin-top: 3%;
        }
        #wasForm > div span {
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
<div style="padding-bottom: 5%; background-color: rgb(250,118,131); ">
    <br>
    <div class="btn-group col-md-offset-1">
        <span style="font-size: 20px">已有账号？马上</span>
        <button type="button" class="btn Mybutton" onclick="window.location.href='${pageContext.request.contextPath}/login.jsp'">登录</button>
    </div>
    <div class="col-md-6 col-md-offset-2">
        <img class="col-md-3  " src="img/logo3.png">
        <img class="col-md-6  " src="img/logo2.png">
    </div>
</div>

<div style="float: left; width: 50%; background-color: #F4F4F4;margin-top: 20px; margin-left: 20%">
    <div align="center" style="font-size: 30px">注册Rose在线情缘</div>
    <div style="margin-left: 10%;" id="wasForm">
        <div>
            <div style="font-size: 25px">注册账户</div><br>
            <span >用户名</span><input name="userName" type="text"/><span style="color:red;margin: 0">*</span><br><br>
            <span>密&nbsp;&nbsp;&nbsp;码</span><input name="passWord" type="password"/><span style="color:red;margin: 0">*</span><br><br>
            <span>邮&nbsp;&nbsp;&nbsp;箱</span><input name="mail" id="mail" type="email"/><span style="color:red;margin: 0">*</span><button style="margin-left: 10px" id="sendmail" class="btn btn-primary " onclick="sendMail()">立即发送</button><br><br>
            <span>验证码</span><input name="vcode" type="number"/><span style="color:red;margin: 0">*</span><br><br>

        </div>
        <div id="statue">
            <div style="font-size: 25px">编辑征婚资料</div><br><br>
            <span>我的性别</span><input type="radio" name="gender" value="男" checked="checked">男&nbsp;&nbsp;&nbsp;<input type="radio" name="gender" value="女">女<br><br>
            <span>婚姻状况</span><input type="radio" name="bride" value="未婚" checked="checked">未婚&nbsp;&nbsp;&nbsp;<input type="radio" name="bride" value="离婚">离婚&nbsp;&nbsp;&nbsp;<input type="radio" name="bride" value="丧偶" >丧偶<br><br>
            <span>出生日期</span><input type="date" name="birth">
            <br><br>
            <span>工作地区</span>
            <select id="sheng" onchange="changeCity()">
            </select>省&nbsp;&nbsp;&nbsp;
            <select id="shi" onchange="changeQu()">
            </select>市&nbsp;&nbsp;&nbsp;
            <select id="qu">
            </select>区

            <br><br>

            <span>我的身高</span><input type="number" name="height"><br><br>
            <span>我的学历</span>
            <select id="xueli">
                <option value="高中及以下">高中及以下</option>
                <option value="中专">中专</option>
                <option value="大专">大专</option>
                <option value="大学本科">大学本科</option>
                <option value="硕士">硕士</option>
                <option value="博士">博士</option>
            </select>    <br><br>
            <span>我的收入</span><input type="number" name="income"><br><br>
        </div>

        <div style="text-align: center">
            <button class="btn  btn-primary" id="register" onclick="sendRegister()">立即注册</button>
            <span style="color:red;"><%
                String msg = (String) request.getSession().getAttribute("registmsg");
                if (msg != null && !msg.equals(""))
                    out.print(msg);
            %></span>
        </div>

    </div>
</div>
<script>
    $.getJSON("./city.json", function (result) {
        var sheng = document.getElementById("sheng");
        $.each(result, function (i, data) {
            var option = document.createElement("option");
            var test = document.createTextNode(data.name);
            option.value = data.name;
            option.appendChild(test);
            sheng.appendChild(option);
        })
    });
    function changeQu() {
        var shi = document.getElementById("shi");
        var sheng = document.getElementById("sheng");
        var Shengname = sheng.options[sheng.selectedIndex].value;
        var Shiname = shi.options[shi.selectedIndex].value;
        var qu = document.getElementById("qu");
        qu.innerHTML = "";
        $.getJSON("./city.json", function (result) {
            $.each(result, function (i, data) {
                if(data.name == Shengname){
                    $.each(data.city, function (i2, data2) {
                        if(data2.name == Shiname){
                            $.each(data2.area, function (i3, data3){
                                var option = document.createElement("option");
                                var test = document.createTextNode(data3);
                                option.value = data3;
                                option.appendChild(test);
                                qu.appendChild(option);
                            })
                        }
                    })
                }
            })
        });
    }

    function changeCity() {
        var shi = document.getElementById("shi");
        var sheng = document.getElementById("sheng");
        shi.innerHTML = "";
        var name = sheng.options[sheng.selectedIndex].value;
        $.getJSON("./city.json", function (result) {
            $.each(result, function (i, data) {
                if(data.name == name){
                    $.each(data.city, function (i2, data2) {
                        var option = document.createElement("option");
                        var test = document.createTextNode(data2.name);
                        option.value = data2.name;
                        option.appendChild(test);
                        shi.appendChild(option);
                    })
                }
            })
        });
    }

    var time = 60;

    function sendMail() {
        // 发送邮件
        // alert(document.getElementById("sendmail").className);
        var mail = document.getElementById("mail").value;
        alert(mail);
        $.ajax({
            url : "${pageContext.request.contextPath}/sendmail",
            type : "POST",
            data : {"mail": mail},
            success : function(res){
                alert("发送成功");
            },
            error : function (error) {
                alert("网络错误");
            }
        });
        // 启动定时器
        timeMinus();
    }
    
    function timeMinus() {
        if (time == 0){
            time = 60;
            document.getElementById("sendmail").innerHTML = "重新发送";
            document.getElementById("sendmail").className = "btn btn-primary"
        } else {
            document.getElementById("sendmail").className = "btn btn-primary disabled"
            document.getElementById("sendmail").innerHTML = time + "秒后重新发送";
            time = time-1;
            setTimeout(timeMinus, 1000);
        }

    }

    function sendRegister() {
        var usrname = $("input[name='userName']").val();
        var passwd = $("input[name='passWord']").val();
        var vcode = $("input[name='vcode']").val();
        var mail = document.getElementById("mail").value;
        
        if ($.trim(usrname) == "" || $.trim(passwd) == "" || $.trim(vcode) == "" || $.trim(mail) == ""){
            alert("*号栏为必填项")
            return;
        }
        var reg = new RegExp("^[a-z0-9]+([._\\-]*[a-z0-9])*@([a-z0-9]+[-a-z0-9]*[a-z0-9]+.){1,63}[a-z0-9]+$"); //正则表达式
        if (!reg.test(mail)){
            alert("邮箱格式错误")
            return;
        }
        
        var gender = $("input[name='gender']:checked").val();//回显性别;
        var bride = $("input[name='bride']:checked").val();
        var birth = $("input[name=birth]").val();
        var height = $("input[name=height]").val();
        var income = $("input[name=income]").val();
        var sheng = $("#sheng option:selected").val();
        var shi = $("#shi option:selected").val();
        var qu = $("#qu option:selected").val();
        var education = $("#xueli").val();

        var s="魔羯水瓶双鱼牡羊金牛双子巨蟹狮子处女天秤天蝎射手魔羯";
        var arr=[20,19,21,21,21,22,23,23,23,23,22,22];
        var times = birth.split("-");
        var themonth = parseInt(times[1]);
        var theday = parseInt(times[2]);
        var Constellation = s.substr(themonth*2-(theday<arr[themonth-1]?2:0),2)+"座";;


        var theData = {
            "usrname" : usrname,
            "passwd" : passwd,
            "vcode" : vcode,
            "mail" : mail,
            "gender" : gender,
            "bride" : bride,
            "birth" : birth,
            "height" : height,
            "income" : income,
            "sheng" : sheng,
            "shi" : shi,
            "qu" : qu,
            "education" : education,
            "constellation" : Constellation
        };
        alert("开始注册");
        $.ajax({
            url : "${pageContext.request.contextPath}/register",
            type : "POST",
            data : theData,
            scriptCharset: 'utf-8',
            contentType: "application/x-www-form-urlencoded; charset=utf-8",
            error : function (error) {
                window.location.href = "${pageContext.request.contextPath}/"+error.responseText;
            },
            success : function (result) {
                console.log(result);
                window.location.href = "${pageContext.request.contextPath}/" + result.responseText;
            }
        });
    }
</script>

</body>
</html>
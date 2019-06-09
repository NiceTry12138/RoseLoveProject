<%@ page import="com.Pojo.Usrs" %><%--
  Created by IntelliJ IDEA.
  User: cong
  Date: 19-6-1
  Time: 下午4:37
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
    <title>搜索</title>
    <script type="text/javascript" src="jquery-3.2.1.min.js"></script>
    <!-- 最新版本的 Bootstrap 核心 CSS 文件 -->
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">

    <!-- 可选的 Bootstrap 主题文件（一般不用引入） -->
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/css/bootstrap-theme.min.css" integrity="sha384-rHyoN1iRsVXV4nD0JutlnGaslCJuC7uwjduW9SVrLvRYooPp2bWYgmgJQIXwl/Sp" crossorigin="anonymous">

    <!-- 最新的 Bootstrap 核心 JavaScript 文件 -->
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>

    <style>
        a {
            text-decoration: none;
        }
        a:hover{
            text-decoration: none;
        }
        nav>div>a {
            margin-top: auto;
            margin-bottom: auto;
            margin-left: 100px;
        }
        #search_blod span{
            font-size: 20px;
        }
        #search_blod > div > div{
            float: left;
            margin-right: 20px;
            font-size: 20px;
            border-radius: 5px;
            background-color: rgba(0,0,0,0.32);
            margin-bottom: 20px;
        }
        #search_blod > div{
            overflow: hidden;
        }
    </style>

</head>
<body>

<div style="padding-bottom: 5%; background-color: rgb(250,118,131); ">
    <br>
    <div style="text-align: right;">
        <%
            Usrs usrs = (Usrs) request.getSession().getAttribute("usr");
            if (usrs == null){
                out.print("<a class=\"btn btn-primary btn-sm    \" style=\"margin-bottom: 10px\" onclick=\"window.location.href='" + request.getContextPath() + "/register.jsp'\">注册</a>\n" +
                        "    <a class=\"btn btn-primary btn-sm\" style=\"margin-bottom: 10px\" onclick=\"window.location.href='" + request.getContextPath() + "/login.jsp'\">登录</a>");
            } else {
                out.print("<span style='font-size = 18px;'>欢迎您" + usrs.getUsrname()+"</span>");
            }
        %>
    </div>
    <div style="text-align: center;">
        <img style="height: auto; width: 70%;" src="img/logo1.png">
    </div>
</div>
<div class="row">
    <nav class="navbar navbar-default" role="navigation">
        <div class="container-fluid">
            <div class="navbar-header">
                <button type="button" class="navbar-toggle" data-toggle="collapse"
                        data-target="#example-navbar-collapse">
                    <span class="sr-only">切换导航</span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </button>
                <a class="navbar-brand head-link" href="index.html">Rose在线情缘</a>
            </div>
            <div class="collapse navbar-collapse" id="example-navbar-collapse">
                <ul class="nav navbar-nav col-md-10" style="text-align: center">
                    <li class="col-md-2 col-md-offset-1"><a class="head-font" href="${pageContext.request.contextPath}/index2.jsp">首页</a></li>
                    <li class="active col-md-2"><a class="head-font" href="${pageContext.request.contextPath}/search.jsp">搜索</a></li>
                    <li class="col-md-2"><a class="head-font" href="communication.html">交友论坛</a></li>
                    <li class="col-md-2"><a class="head-font" href="${pageContext.request.contextPath}/activity.jsp">活动</a></li>
                    <li class="col-md-2"><a class="head-font" href="${pageContext.request.contextPath}/personnal.jsp">个人中心</a></li>
                </ul>
            </div>
        </div>
    </nav>
</div>
<div style="margin-left: 15%; width: 75%; border: 1px solid rgba(0,0,0,0.54); border-radius: 8px">
    <div style="overflow: hidden; border-bottom: 1px solid rgba(0,0,0,0.54);">
        <div style="float: left; ">
            <span style="font-size: 25px;"><span class="glyphicon glyphicon-magnet"></span>搜索意中人</span>
        </div>
        <div style="float: right; overflow: hidden; margin-right: 16%">
            <div style="float: left"><input id="searchName" class="form-control" type="text" placeholder="输入昵称，准确搜索"></div>
            <div style="float: right"><button class="btn btn-default" onclick="searchByUsrName()"><span class="glyphicon glyphicon-search"></span></button></div>
        </div>
    </div>
    <div style="margin-top: 20px; overflow: hidden">
        <div style="width: 18%; float: left; margin-left: 2%;">
            <span style="font-size: 20px">基本条件</span>
        </div>

        <div style="width: 78%; float: right; margin-right: 2%; overflow: hidden" id="search_blod">
            <div>
                <div>
                    <span>性别</span>
                    <select id="gender">
                        <option value="男">男</option>
                        <option value="nv">女</option>
                    </select>
                </div>
                <div>
                    <span>年龄</span>
                    <select id="min_old">
                        <option value="null">不限</option>
                    </select>至
                    <select id="max_old">
                        <option value="null">不限</option>
                    </select>
                </div>
                <div>
                    <span>工作地点</span>
                    <select id="sheng" onclick="changeCity()">
                        <option value="null">不限</option>
                    </select>省
                    <select id="shi" onclick="changeQu()">
                        <option value="null">不限</option>
                    </select>市
                    <select id="qu">
                        <option value="null">不限</option>
                    </select>区
                </div>
            </div>
            <div>
                <div>
                    <span>身高</span>
                    <select id="min_height">
                        <option value="null">不限</option>
                    </select>至
                    <select id="max_height">
                        <option value="null">不限</option>
                    </select>
                </div>
                <div>
                    <span>学历</span>
                    <select id="xueli">
                        <option value="高中及以下">高中及以下</option>
                        <option value="中专">中专</option>
                        <option value="大专">大专</option>
                        <option value="大学本科">大学本科</option>
                        <option value="硕士">硕士</option>
                        <option value="博士">博士</option>
                    </select>
                </div>
                <div>
                    <span>收入</span>
                    <select id="min_income">
                        <option value="null">不限</option>
                    </select>至
                    <select id="max_income">
                        <option value="null">不限</option>
                    </select>
                </div>
            </div>
            <div>
                <div>
                    <span>职业</span>
                    <select id="occupation">
                        <option value="null" >不限</option>
                        <option value="医生">医生</option>
                        <option value="公务员">公务员</option>
                        <option value="教师">教师</option>
                    </select>
                </div>
                <div>
                    <span>星座</span>
                    <select id="Constellation">
                        <option value="null">不限</option>
                        <option value="白羊座">白羊座</option>
                        <option value="金牛座">金牛座</option>
                        <option value="双子座">双子座</option>
                        <option value="巨蟹座">巨蟹座</option>
                        <option value="狮子座">狮子座</option>
                        <option value="室女座">室女座</option>
                        <option value="天秤座">天秤座</option>
                        <option value="天蝎座">天蝎座</option>
                        <option value="人马座">人马座</option>
                        <option value="摩羯座">摩羯座</option>
                        <option value="宝瓶座">宝瓶座</option>
                        <option value="双鱼座">双鱼座</option>
                    </select>
                </div>
            </div>

        </div>
    </div>
    <div style="text-align: center">
        <button onclick="searchPerson()" class="btn btn-info">立即搜索</button>
    </div>
</div>
<br>
<div style="text-align: right; margin-left: 0;margin-right: 5%; overflow: hidden"><a href="javascript:changeGroup()" style="font-size: 20px">换一组</a></div>
<div style="overflow: hidden">
    <div id="show" style="text-align: center; overflow: hidden;">

    </div>
</div>
<script>

    var ajaxData = "";

    var min_height = document.getElementById("min_height");
    for(var i = 130; i<=220; i++){
        var option = document.createElement("option");
        var test = document.createTextNode(i);
        option.appendChild(test);
        option.value = i;
        min_height.appendChild(option);
    }
    var max_height = document.getElementById("max_height");
    for(var i = 130; i<=220; i++){
        var option = document.createElement("option");
        var test = document.createTextNode(i);
        option.appendChild(test);
        option.value = i;
        max_height.appendChild(option);
    }
    var income = document.getElementById("min_income");
    for(var i = 1000; i<=10000; i = i+200){
        var option = document.createElement("option");
        var test = document.createTextNode(i);
        option.appendChild(test);
        option.value = i;
        income.appendChild(option);
    }
    var income = document.getElementById("max_income");
    for(var i = 1000; i<=10000; i = i+200){
        var option = document.createElement("option");
        var test = document.createTextNode(i);
        option.appendChild(test);
        option.value = i;
        income.appendChild(option);
    }

    var min_old = document.getElementById("min_old");
    for(var i=18; i<60; i++){
        var option = document.createElement("option");
        var text = document.createTextNode(i + "岁");
        option.value = i;
        option.appendChild(text);
        min_old.appendChild(option);
    }
    var max_old = document.getElementById("max_old");
    for(var i=18; i<60; i++){
        var option = document.createElement("option");
        var text = document.createTextNode(i + "岁");
        option.value = i;
        option.appendChild(text);
        max_old.appendChild(option);
    }

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

    function searchPerson() {
        var gender = document.getElementById("gender").value;
        var min_old = document.getElementById("min_old").value;
        var max_old = document.getElementById("max_old").value;
        var sheng = document.getElementById("sheng").value;
        var shi = document.getElementById("shi").value;
        var qu = document.getElementById("qu").value;
        var min_height = document.getElementById("min_height").value;
        var max_height = document.getElementById("max_height").value;
        var min_income = document.getElementById("min_income").value;
        var max_income = document.getElementById("max_income").value;
        var occupation = document.getElementById("occupation").value; // 职业
        var Constellation = document.getElementById("Constellation").value; // 星座
        var xueli = document.getElementById("xueli").value;
        //alert(gender + " " + min_old + " " + max_old + " " + sheng + " " + shi + " " + qu + min_height + " " + max_height + " " + min_income + " " + max_income + " " + xueli + " " + occupation + " " + Constellation);
        if(min_old > max_old){
            alert("年龄下限不能比上限高哦 亲～");
            return;
        }
        if (min_income > max_income) {
            alert("收入下限不能比上限高哦 亲～");
            return;
        }
        if (min_height > max_height) {
            alert("身高下限不能比上限高哦 亲～");
            return;
        }
        var theDate = {
            "gender": gender,
            "minold": min_old,
            "maxold": max_old,
            "sheng": sheng,
            "shi": shi,
            "qu": qu,
            "minheight": min_height,
            "maxheight": max_height,
            "minincome": min_income,
            "maxincome": max_income,
            "occupation": occupation,
            "constellation": Constellation,
            "education": xueli
        };
        console.log(theDate);
        $.ajax({
            url : "${pageContext.request.contextPath}/seachPerson/search",
            type : "POST",
            data : theDate,
            scriptCharset: 'utf-8',
            contentType: "application/x-www-form-urlencoded; charset=utf-8",
            success : function (result) {
                ajaxData = result;
                console.log(result);
                console.log(result.length);
                var show = document.getElementById("show");
                show.innerHTML = "";
                for (var i = 0; i<result.length; i++){
                    if (i>=8)
                        break;
                    createImgs(result[Math.floor((Math.random()*result.length))]);
                }
            },
            error : function (error) {
                alert("网络错误");
            }
        })
    }

    function createImgs(mail) {
        var show = document.getElementById("show");
        var div = document.createElement("div");
        var img = document.createElement("img");
        var imgDiv = document.createElement("div");
        var button = document.createElement("a");
        var imga = document.createElement("a");
        var buttonText = document.createTextNode("给我写信吧");
        imga.setAttribute("href", "./documentView.html");
        imga.setAttribute("target", "view_window");
        button.setAttribute("target", "view_window");
        img.src = "${pageContext.request.contextPath}/image/headPhoto?mail=" + mail + "&time="+new Date().getTime();
        img.height = 150;
        img.width = 150;
        img.alt = mail;
        imgDiv.style.width = 150;
        imgDiv.style.height = 150;
        imgDiv.style.margin = 0;
        div.style.textAlign = "center";
        button.appendChild(buttonText);
        button.setAttribute("class", "btn btn-danger  btn-sm");
        button.setAttribute("href", "./markMail.html");
        imga.appendChild(img);
        imgDiv.appendChild(imga);
        div.appendChild(imgDiv);
        div.appendChild(button);
        div.style.cssFloat = "left";
        div.style.marginLeft = "6%";
        div.style.marginRight = "6%";
        div.style.width = "150px";
        show.appendChild(div);
    }

    function changeGroup() {
        console.log(ajaxData);
        var show = document.getElementById("show");
        show.innerHTML = "";
        for (var i = 0; i<ajaxData.length; i++){
            if (i>=8)
                break;
            createImgs(ajaxData[Math.floor((Math.random()*ajaxData.length))]);
        }
    }

    function searchByUsrName() {
        var searchName = document.getElementById("searchName").value;
        var url = "${pageContext.request.contextPath}/seachPerson/usrName";
        $.ajax({
            url : url,
            type : "GET",
            data : {"usrName" : searchName},
            scriptCharset: 'utf-8',
            contentType: "application/x-www-form-urlencoded; charset=utf-8",
            success : function (result) {
                if (result == null || result.usremail == ""){
                    console.log(result);
                    alert("查无此人");
                } else {

                    var show = document.getElementById("show");
                    show.innerHTML = "";
                    console.log(result);
                    ajaxData = result;

                    for (var i = 0; i < result.length; i++) {
                        if (i>=8)
                            break;
                        createImgs(ajaxData[Math.floor((Math.random()*ajaxData.length))]);
                    }
                }
            },
            error : function (error) {
                alert("网络错误");
            }
        })
    }

    function changePage(pageName) {
        var url = "${pageContext.request.contextPath}/changePage/" + pageName;
        $.get(url);
    }


</script>
</body>
</html>
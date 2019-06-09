<%@ page import="com.Pojo.Usrs" %><%--
  Created by IntelliJ IDEA.
  User: cong
  Date: 19-6-1
  Time: 下午4:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:redirect url="${pageContext.request.contextPath}/index2.jsp"></c:redirect>
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
<div style="background-color: white;overflow: hidden; height: 263px">
    <div style="float: left; height: 263px">
        <img src="${pageContext.request.contextPath}/img/u86.png" style="outline: none; " tabindex="0" id="showBg">
    </div>

    <div style="padding: 0px; float: right; margin-right: 5%; margin-top: 5%" >
        <%
            Usrs usrs = (Usrs) request.getSession().getAttribute("usr");
            if (usrs == null){
                out.print("<a class=\"btn btn-primary btn-sm    \" style=\"margin-bottom: 10px\" onclick=\"window.location.href='" + request.getContextPath() + "/register.jsp'\">注册</a>\n" +
                        "    <span style=\"font-size: 30px\">|</span>\n" +
                        "    <a class=\"btn btn-primary btn-sm\" style=\"margin-bottom: 10px\" onclick=\"window.location.href='" + request.getContextPath() + "/login.jsp'\">登录</a>");
            } else {
                out.print("<span style='font-size = 18px;'>欢迎您" + usrs.getUsrname()+"</span>");
            }
        %>
    </div>

</div>

<nav class="navbar navbar-default navbar-static-top">
    <div class="container" style="font-size: 30px;">
        <a href="./index2.jsp">首页</a>
        <a href="./search.jsp">搜索</a>
        <a>交友论坛</a>
        <a>活动</a>
        <a href="./personnal.jsp" target="_blank">个人中心</a>
    </div>
</nav>

<div id="ta" style="background-color: #F4F4F4; overflow: hidden">
  <span style="font-size: 30px; margin-left: 10% ; color: aqua ">命中注定的TA</span>
  <div class="container" >
    <a style="margin-left: 40%"  onclick="getYearLater('2000', '2009')">00后</a>
    <a onclick="getYearLater('1990', '1999')">90后</a>
    <a  nclick="getYearLater('1980', '1989')">80后</a>
    <a href="javascript:getUsrs()">换一组</a>
  </div>
  <div id="show" style="overflow: hidden">
    <div style="float: left; margin-left: 6%; margin-right: 7%">
      <img src="${pageContext.request.contextPath}/img/test.jpeg" height="150" width="150"  class="img-rounded" id="img0">
      <div>
        <button class="btn btn-primary">给我写信</button>
      </div>
    </div>
    <div  style="float: left; margin-left: 6%; margin-right: 7%">
      <img src="${pageContext.request.contextPath}/img/test.jpeg" height="150" width="150" class="img-rounded" id="img1">
      <div>
        <button class="btn btn-primary">给我写信</button>
      </div>
    </div>
    <div style="float: left; margin-left: 6%; margin-right: 7%">
      <img src="${pageContext.request.contextPath}/img/test.jpeg" height="150" width="150" class="img-rounded" id="img2">
      <div>
        <button class="btn btn-primary">给我写信</button>
      </div>
    </div>
    <div style="float: left; margin-left: 6%; margin-right: 7%">
      <img src="${pageContext.request.contextPath}/img/test.jpeg" height="150" width="150" class="img-rounded" id="img3">
      <div>
        <button class="btn btn-primary">给我写信</button>
      </div>
    </div>
    <div style="float: left; margin-left: 6%; margin-right: 7%">
      <img src="${pageContext.request.contextPath}/img/test.jpeg" height="150" width="150" class="img-rounded" id="img4">
      <div>
        <button class="btn btn-primary">给我写信</button>
      </div>
    </div>
    <div style="float: left; margin-left: 6%; margin-right: 7%">
      <img src="${pageContext.request.contextPath}/img/test.jpeg" height="150" width="150" class="img-rounded" id="img5">
      <div>
        <button class="btn btn-primary">给我写信</button>
      </div>
    </div>
    <div style="float: left; margin-left: 6%; margin-right: 7%">
      <img src="${pageContext.request.contextPath}/img/test.jpeg" height="150" width="150" class="img-rounded" id="img6">
      <div>
        <button class="btn btn-primary">给我写信</button>
      </div>
    </div>
    <div style="float: left; margin-left: 6%; margin-right: 7%">
      <img src="${pageContext.request.contextPath}/img/test.jpeg" height="150" width="150" class="img-rounded" id="img7">
      <div>
        <button class="btn btn-primary">给我写信</button>
      </div>
    </div>
  </div>
</div>
<script>
    var ajaxData;
    function changePage(pageName) {
        var url = "${pageContext.request.contextPath}/changePage/" + pageName;
        $.get(url);
    }
    function getUsrs() {
        console.log(ajaxData);
        for (var i = 0; i < ajaxData.length; i++) {
            changeImgUrl("img"+i, ajaxData[Math.floor((Math.random()*ajaxData.length))]);
        }
    }

    function changeImgUrl(index, mail) {
        var img = document.getElementById(index);
        console.log(index + " mail = " + mail);
        img.alt = mail;
        img.src = "${pageContext.request.contextPath}/image/headPhoto?mail=" + mail + "&time="+new Date().getTime();
    }

    function buttonClickToPerson(mail) {
        $.ajax({
            url : "${pageContext.request.contextPath}/changePage/markmail?mail="+mail + "&time=" + new Date().getTime(),
            type : "GET"
        })
    }

    function getYearLater(minYear, maxyear) {
        var theurl = "${pageContext.request.contextPath}/seachPerson/theYear";
        var data = {"minyear" : minYear,
                    "maxyear" : maxyear};
        $.ajax({
            url : theurl,
            type : "GET",
            async : false,
            data : data,
            success : function (thedata) {
                console.log(thedata);
                ajaxData = thedata;
                for (var i = 0; i < thedata.length; i++) {
                    if (i >= 8)
                        break;
                    changeImgUrl("img"+i, ajaxData[Math.floor((Math.random()*ajaxData.length))]);
                }
            }
        });

        return false;
    }
</script>
</body>
</html>


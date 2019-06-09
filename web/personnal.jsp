<%@ page import="com.Pojo.Usrs" %>
<%@ page import="com.Pojo.Address" %>
<%@ page import="com.Pojo.Hobby" %>
<%@ page import="java.util.List" %>
<%@ page import="com.Pojo.Demand" %><%--
  Created by IntelliJ IDEA.
  User: cong
  Date: 19-6-1
  Time: 下午2:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:if test="${usr == null}">
    <c:redirect url="${pageContext.request.contextPath}/login.jsp"></c:redirect>
</c:if>
<%
    Usrs usrs = (Usrs) request.getSession().getAttribute("usr");
    Address address = (Address) request.getSession().getAttribute("address");
    Demand demand = (Demand) request.getSession().getAttribute("demand");
%>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="Expires" content="0">
    <meta http-equiv="Pragma" content="no-cache">
    <meta http-equiv="Cache-control" content="no-cache">
    <meta http-equiv="Cache" content="no-cache">
    <title>个人中心</title>
    <script type="text/javascript" src="js/jquery.min.js"></script>
    <script type="text/javascript" src="js/jquery.easyui.min.js"></script>
    <script type="text/javascript" src="js/easyui-lang-zh_CN.js"></script>
    <script type="text/javascript" src="jquery-3.2.1.min.js"></script>
    <link href="css/easyui.css" rel="stylesheet" type="text/css">
    <link href="css/icon.css" rel="stylesheet" type="text/css">
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
        #ta>div>a{
            font-size: 20px;
            margin-top: auto;
            margin-bottom: auto;
            margin-left: 100px;
        }
        #show > div{
            margin-top: 20px;
            width: 150px;
            float: left;
            margin-left: 80px;
            margin-right: 80px;
        }
        #show > div > div > button{
            margin: 10px 33px;
        }
        #person ul li {
            list-style: none;
            font-size: 17px;
            margin: 20px 15%;
        }
        #persondate > input,select{
            margin-left: 20px;
            margin-right: 20px;
        }
        #persondate > span{
            margin-right: 30px;
        }
        iframe{
            min-height: 100%;
        }
    </style>
</head>
<body style="background-color: rgb(246,246,246)">

<div style="padding-bottom: 5%; background-color: rgb(250,118,131); " >
    <br>
    <div style="text-align: right;">
        <%
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
                    <li class="col-md-2"><a class="head-font" href="${pageContext.request.contextPath}/search.jsp">搜索</a></li>
                    <li class="col-md-2"><a class="head-font" href="${pageContext.request.contextPath}/communication.html">交友论坛</a></li>
                    <li class="col-md-2"><a class="head-font" href="${pageContext.request.contextPath}/activity.jsp">活动</a></li>
                    <li class="active col-md-2"><a class="head-font" href="${pageContext.request.contextPath}/personnal.jsp">个人中心</a></li>
                </ul>
            </div>
        </div>
    </nav>
</div>

<div style="overflow: hidden; background-color: rgb(246,246,246)">
    <div id="person" style="float:left; width: 25%; margin-left: 5%; padding-top: 20px; padding-bottom: 20px; border-radius: 10px; background-color: white">
        <div style="text-align: center">
            <img src="test.jpeg" width="90" height="90" class="img-circle">
            <div>昵称:<% out.print(usrs.getUsrname()); %><span></span></div>
        </div>
        <div style="margin-left: 20px;">
            <div style="margin-left: 15%;">资料完成度</div>
            <div id="p" class="easyui-progressbar" data-options="value:60" style="width:70%;height: 20px;margin-left: 15%;"></div>
        </div>
        <ul style="margin-left: 15%; padding: 0; margin-left: 20px">
            <li><a href="javascript:changeIframe('data')">个人资料</a><a style="float: right"><span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span></a></li>
            <li><a href="javascript:changeIframe('heart')">内心独白</a><a style="float: right"><span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span></a></li>
            <li><a href="javascript:changeIframe('hobby')">兴趣爱好</a><a style="float: right"><span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span></a></li>
            <li><a href="javascript:changeIframe('claim')">择友要求</a><a style="float: right"><span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span></a></li>
            <li><a href="javascript:changeIframe('myphoto')">我的相册</a><a style="float: right"><span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span></a></li>
            <li><a href="javascript:changeIframe('mail')">我的信箱</a><a style="float: right"><span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span></a></li>
            <li><a href="javascript:changeIframe('visitor')">我的访客</a><a style="float: right"><span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span></a></li>
            <li><a href="javascript:changeIframe('settting')">系统设置</a><a style="float: right"><span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span></a></li>
        </ul>
    </div>
    <div style="float: right; margin-right: 5%; border-radius: 20px; width: 60%; height: 600px; padding: 0">
        <div class="embed-responsive embed-responsive-16by9" style="width: 100%; height: 600px; margin: 0; padding: 0" >
            <iframe class="embed-responsive-item" src="" id="iframe" onload="" scrolling="no" frameborder="0" height="600px" width="100%" ></iframe>
        </div>
    </div>
    <script>
        var iframe = document.getElementById("iframe");
        function changeIframe(frameName) {
            iframe.setAttribute("src", "htm/" + frameName + ".html");
            switch (frameName) {
                case "data":
                    iframe.setAttribute("onload","changePageIsdata()");
                    break;
                case "claim":
                    iframe.setAttribute("onload","changePageIsClaim()");
                    break;
                case "heart":
                    iframe.setAttribute("onload","changePageIsSignature()");
                    break;
                case "hobby":
                    iframe.setAttribute("onload","changePageIsHobby()");
                    break;
                case "mail":
                    iframe.setAttribute("onload","changePageIsMail()");
                    break;
                case "myphoto":
                    iframe.setAttribute("onload","");
                    break;
                case "settting":
                    iframe.setAttribute("onload","changePageIsSettting()");
                    break;
                case "visitor":
                    iframe.setAttribute("onload","changePageIsVisitor()");
                    break;
            }
        }

        window.onload = function (ev) {
            changeIframe("data");
        };

        function changePageIsdata() {
            document.getElementById("iframe").contentWindow.document.getElementById("Constellation").innerHTML = "<%= usrs.getUsrconstellation() %>" ;
            document.getElementById("iframe").contentWindow.document.getElementById("height").value = "<% String height = String.valueOf(usrs.getUsrheight()); out.print(height.substring(0, height.length()-2));%>";
            document.getElementById("iframe").contentWindow.document.getElementById("education").value = "<%= usrs.getUsreducation()%>";
            document.getElementById("iframe").contentWindow.document.getElementById("income").value = "<%= usrs.getUsrincome()%>";
            document.getElementById("iframe").contentWindow.document.getElementById("occupation").value = "<%= usrs.getUsroccupation()%>";
            document.getElementById("iframe").contentWindow.document.getElementById("year").value = "<%
                int year = usrs.getUsrbirth().getYear();
                if (year >= 80)
                    year += 1900;
                else
                    year += 2000;
                out.print(year);
            %>";
            document.getElementById("iframe").contentWindow.document.getElementById("month").value = "<%= usrs.getUsrbirth().getMonth()%>";
            document.getElementById("iframe").contentWindow.document.getElementById("day").value = "<%= usrs.getUsrbirth().getDay()%>";

            var genderlist = document.getElementById("iframe").contentWindow.document.getElementsByName("gender");
            for (var i=0; i<genderlist.length; i++) {
                if (genderlist[i].value == "<%= usrs.getUsrsex() %>") {
                    genderlist[i].checked = true;
                    break;
                }
            }

            var bridelist = document.getElementById("iframe").contentWindow.document.getElementsByName("bride");
            for (var i = 0; i < bridelist.length; i++) {
                if (bridelist[i].value == "<%= usrs.getUsrmaritalstate() %>") {
                    bridelist[i].checked = true;
                    break;
                }
            }

            var savebutton = document.getElementById("iframe").contentWindow.document.getElementById("update");
            savebutton.setAttribute("onclick", "updateUsrInfo(\"${pageContext.request.contextPath}/UpdateUsrInfo/UsrInfo\",\"<%= usrs.getUsremail()%>\")");
            console.log(savebutton.onclick);
        }
        function changePageIsSignature() {
            var idoc = document.getElementById("iframe").contentWindow.document;
            var text = idoc.getElementById("text");
            text.value = "<%= usrs.getUsrssignature() %>";

            var button = idoc.getElementById("button");
            button.setAttribute("onclick", "updateSignature(\"<%= usrs.getUsremail() %>\", \"<%= request.getContextPath()%>/UpdateUsrInfo/Signature\")");
        }

        function changePageIsMail() {
            var idoc = document.getElementById("iframe").contentWindow;
            idoc.initAll("<%=usrs.getUsremail()%>", "${pageContext.request.contextPath}/SearchMail/getMail", "${pageContext.request.contextPath}/SearchMail/sendMail", "${pageContext.request.contextPath}/SearchMail/deleteMail");
            idoc.findSendMail();
        }

        function changePageIsVisitor() {
            var theDate = {"mail": "<%= usrs.getUsremail()%>"};
            $.ajax({
                url : "${pageContext.request.contextPath}/SearchVisitor",
                data : theDate,
                type : "POST",
                success : function (result) {
                    console.log(result);
                    if (result.usremail == null || result.usremail == ""){
                        alert("暂无访客");
                    }
                    for (var i = 0; i < result.length; i++) {
                        if (i >= 9)
                            break;
                        var img = document.getElementById("iframe").contentWindow.document.getElementById("mail"+i);
                        img.alt = result[i];
                        img.src = "${pageContext.request.contextPath}/image/headPhoto?mail=" + result[i] + "&time="+new Date().getTime();
                    }
                },
                error : function (error) {
                    alert("网络错误");
                    console.log(error);
                }
            })

        }

        function changePageIsClaim() {
            <%
                if (demand == null) out.print("alert(\"您对ta暂无要求\")");
                else {
                    out.print("document.getElementById(\"iframe\").contentWindow.document.getElementById(\"min_height\").value = " + demand.getDemandheight() + "\n"
                    + "document.getElementById(\"iframe\").contentWindow.document.getElementById(\"max_height\").value = " + demand.getDemandheight() + "\n"
                    + "document.getElementById(\"iframe\").contentWindow.document.getElementById(\"education\").value = \"" + demand.getDemandeducation() + "\"\n"
                    + "document.getElementById(\"iframe\").contentWindow.document.getElementById(\"min_old\").value = \"" + demand.getDemandminage() + "\"\n"
                    + "document.getElementById(\"iframe\").contentWindow.document.getElementById(\"max_old\").value = \"" + demand.getDemandmaxage() + "\"\n"
                    + "var genderlist = document.getElementById(\"iframe\").contentWindow.document.getElementsByName(\"gender\");\n" +
                      "  for (var i=0; i<genderlist.length; i++) {\n" +
                      "     if (genderlist[i].value == \"" + demand.getDemandmaxage() + "\") {\n" +
                      "         genderlist[i].checked = true;\n" +
                      "         break;\n" +
                      "     }\n" +
                      "  }"
                    + "var bridelist = document.getElementById(\"iframe\").contentWindow.document.getElementsByName(\"bride\");\n" +
                      "for (var i = 0; i < bridelist.length; i++) {\n" +
                      "     if (bridelist[i].value == \"" + demand.getDemandmaritalstate() + "\") {\n" +
                      "         bridelist[i].checked = true;\n" +
                      "         break;\n" +
                      "     }\n" +
                      "}"
                    );
                }
            %>
            var save = document.getElementById("iframe").contentWindow.document.getElementById("save");
            save.setAttribute("onclick", "updateClaim(\"${pageContext.request.contextPath}/UpdateClaim\", \"<%= usrs.getUsremail()%>\")");
        }

        function changePageIsHobby() {
        }
        
        function changePageIsSettting() {
            var stateList = document.getElementById("iframe").contentWindow.document.getElementsByName("see");
            for (var i = 0; i < stateList.length; i++) {
                if (stateList[i].value == "<%= usrs.getUsrphotostate() %>") {
                    stateList[i].checked = true;
                    break;
                }
            }

            parent.document.getElementById("iframe").contentWindow.document.getElementById("mail").innerHTML = "<%= usrs.getUsremail()%>";
            var sendmail = document.getElementById("iframe").contentWindow.document.getElementById("sendmail");
            var load = document.getElementById("iframe").contentWindow.document.getElementById("load");
            sendmail.setAttribute("onclick", "sendMail(\"${pageContext.request.contextPath}/sendmail\",\"<%=usrs.getUsremail()%>\")");
            load.setAttribute("onclick", "updatePasswd(\"${pageContext.request.contextPath}/UpdateUsrInfo/Password\",\"<%= usrs.getUsremail()%>\")");
            var photoState = document.getElementById("iframe").contentWindow.document.getElementById("photoState");
            photoState.setAttribute("onclick", "updatePhotoState(\"${pageContext.request.contextPath}/UpdateUsrInfo/photoState\", \"<%= usrs.getUsremail()%>\")");
        }



    </script>
</div>

</body>
</html>
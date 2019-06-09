<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 2019-06-09
  Time: 19:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>添加活动</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no">

    <script src="https://cdn.staticfile.org/jquery/3.2.1/jquery.min.js"></script>
    <link rel="stylesheet" href="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/css/bootstrap.min.css">
    <script src="https://cdn.staticfile.org/jquery/2.1.1/jquery.min.js"></script>
    <script src="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/js/bootstrap.min.js"></script>
    <link rel="stylesheet" href="BootstrapResource/css/bootstrap.min.css">
    <script src="BootstrapResource/js/bootstrap.min.js"></script>

    <style>
        .inputFileButton{
            border: none;
            outline: none;
        }
        form{
            padding: 10px;
            margin: 10px;
        }
        .redTag-font
        {
            font-size: 15px;
            color: red;
            font-weight: bold;
        }
        .myButton
        {
            background-color:rgb(250,118,131);
            color: #ffffff;
            border: #ffffff solid 1px;
        }
    </style>
    <script>
        function loadAuthor()
        {
            //////////////////////////////此处填入数据//////////////////////////////
            /*作者名*/
            var authorStr = "大脸猫爱吃鱼rose";
            //////////////////////////////此处填入数据//////////////////////////////
            $("#author").append(authorStr);
        }
        function checkNum(num)
        {
            checkType(num);
            var maxLen = [10, 500, 40, 9, 40, 11];
            var id = ["ActivityName", "ActivityDescribe", "ActivityAdress", "ActivityCost", "ActivityCostexplain", "ActivityCallnumber"];
            var textDom = document.getElementById(id[num]);
            if(textDom.value.length > maxLen[num])
                textDom.value = textDom.value.substring(0, maxLen[num]);
        }
        function checkType(num)
        {
            var type = [1, 1, 1, 0, 1, 0];
            if(type[num]) return;
            var id = ["ActivityName", "ActivityDescribe", "ActivityAdress", "ActivityCost", "ActivityCostexplain", "ActivityCallnumber"];
            var textDom = document.getElementById(id[num]);
            textDom.value=textDom.value.replace(/[^\d]/g,'');
        }
        function pendPhone()
        {
            var textDom = document.getElementById("ActivityCallnumber");
            if(textDom.value.length != 11)
            {
                alert("请输入11位手机号");
                textDom.focus();
                return false;
            }
            return true;
        }
        function pendDate()
        {
            var textDomSt = document.getElementById("ActivityStarttime");
            var textDomEd = document.getElementById("ActivityEndtime");
            var textDomStH = document.getElementById("ActivityStarttimeHour");
            var textDomEdH = document.getElementById("ActivityEndtimeHour");
            if(textDomSt.value > textDomEd.value || textDomStH.value > textDomEdH.value)
            {
                alert("开始时间不能晚于结束时间");
                return false;
            }
            return true;
        }
        function onSubmit()
        {
            var i;
            var alertStr = ["活动标题不能为空", "活动配图不能为空", "活动描述不能为空", "请选择活动类型", "请设置活动时间", "请设置活动时间", "请设置活动时间", "请设置活动时间", "活动地址不能为空", "会费不能为空", "会费说明不能为空", "联系电话不能为空"];
            var id = ["ActivityName", "ActivityPic", "ActivityDescribe", "ActivityType", "ActivityStarttime", "ActivityEndtime", "ActivityStarttimeHour", "ActivityEndtimeHour", "ActivityAdress", "ActivityCost", "ActivityCostexplain", "ActivityCallnumber"];
            for(i = 0; i <= 5; i ++)
                checkNum(i);
            for(i = 0; i <= 11; i ++)
            {
                var textDom = document.getElementById(id[i]);
                if (textDom.value == "")
                {
                    alert(alertStr[i]);
                    textDom.focus();
                    return false;
                }
            }
            return pendPhone() && pendDate();
        }
    </script>
</head>
<body style="background-image: url('img/bg_1.png'); background-repeat: repeat">
<!--标头-->
<div style="padding-bottom: 5%; background-color: rgb(250,118,131); ">
    <br>
    <div style="text-align: right;">
        <button type="button" class="btn myButton" onclick = "window.location.href = 'register.html'">注册</button>
        <button type="button" class="btn myButton" style="margin-right: 30px;" onclick = "window.location.href = 'login.html'">登录</button>
    </div>
    <div style="text-align: left; padding-left: 10%">
        <a href="index.html"><img style="" src="img/logo.png"></a>
    </div>
</div>
<div class="row"><br></div>
<div class="container">
    <div class="col-md-10 col-md-offset-1 modal-content">
        <div class="modal-header">
            <div class="col-md-12" style="background-color: rgb(228,228,228);line-height: 48px; border-radius: 5px;">
                <div>
                    <div class="col-md-8" style="text-align: left">作者 <a id = "author" href="documentView.html"></a></div>
                    <div class="col-md-4" style="text-align: right"><a href="activity.html">返回活动首页</a></div>
                </div>
            </div>
            <script>
                loadAuthor();
            </script>
        </div>
        <div class="modal-body">
            <form class="col-md-10 col-md-offset-1" method="post" action="${pageContext.request.contextPath}/Activity/addActivity" onsubmit="return onSubmit()">
                <div class="form-group col-md-12">
                    <div class="col-md-12" style="line-height: 48px;">
                        <label>活动主题<span class="redTag-font">*</span></label>
                        <input type="text" name="ActivityName" id="ActivityName" class="form-control" oninput="checkNum(0)" placeholder="请输入活动主题">
                        <b>活动封面（240x156）<span class="redTag-font">*</span></b>
                        <input type="file" name="ActivityPic" id="ActivityPic" accept="image/*">
                    </div>
                </div>
                <div class="form-group col-md-12" >
                    <label for="ActivityDescribe" class="col-md-3 control-label">活动描述<span class="redTag-font">*</span></label>
                    <div class="col-md-12">
                        <textarea class="form-control" name="ActivityDescribe" id="ActivityDescribe" style="height: 200px; resize: none" oninput="checkNum(1)" placeholder="请输入活动描述"></textarea>
                    </div>
                </div>
                <div class="form-group col-md-12" >
                    <label for="ActivityType" class="col-md-2">活动类型<span class="redTag-font">*</span></label>
                    <select class="form-control col-md-4" id="ActivityType" name="ActivityType">
                        <option class="active" value="">请选择活动类型</option>
                        <option value="1">线上活动</option>
                        <option value="2">室内活动</option>
                        <option value="3">户外活动</option>
                        <option value="4">野外活动</option>
                        <option value="5">其他活动</option>
                    </select>
                </div>
                <div class="form-group col-md-12">
                    <label for="ActivityStarttime" class="col-md-2">开始时间<span class="redTag-font">*</span></label>
                    <input type="date" class=" glyphicon glyphicon-calendar" id="ActivityStarttime" name="ActivityStarttime"/>
                    <input type="time" id="ActivityStarttimeHour" name="ActivityStarttimeHour"/>
                </div>

                <div class="form-group col-md-12">
                    <label for="ActivityEndtime" class="col-md-2">结束时间<span class="redTag-font">*</span></label>
                    <input type="date" class=" glyphicon glyphicon-calendar" id="ActivityEndtime" name="ActivityEndtime"/>
                    <input type="time" id="ActivityEndtimeHour" name="ActivityEndtimeHour"/>
                </div>

                <div class="form-group col-md-12">
                    <label for="ActivityAdress" class="col-md-2">活动地点<span class="redTag-font">*</span></label>
                    <input type="text" class="form-control col-md-4" id="ActivityAdress" placeholder="请填写活动地点" name="ActivityAdress" oninput="checkNum(2)">
                </div>

                <div class="form-group col-md-12">
                    <label for="ActivityCost" class="col-md-2">会费设置<span class="redTag-font">*</span></label>
                    <input type="text" class="form-control col-md-4" id="ActivityCost" placeholder="请填写会费" name="ActivityCost" oninput="checkNum(3)">
                </div>

                <div class="form-group col-md-12">
                    <label for="ActivityCostexplain" class="col-md-2">会费说明<span class="redTag-font">*</span></label>
                    <input type="text" class="form-control col-md-4" id="ActivityCostexplain" placeholder="请填写费用说明" name="ActivityCostexplain" oninput="checkNum(4)">
                </div>

                <div class="form-group col-md-12">
                    <label for="ActivityCallnumber" class="col-md-2">联系电话<span class="redTag-font">*</span></label>
                    <input type="text" class="form-control col-md-4" id="ActivityCallnumber" placeholder="请填写电话号码" name="ActivityCallnumber" oninput="checkNum(5)">
                </div>

                <div class="col-md-12" style="height: 20px;"></div>
                <div class="col-md-12" style="text-align: center;">
                    <input type="submit" value="提交" class="btn btn-primary">
                </div>
                <div class="col-md-12" style="height: 20px;"></div>
            </form>
        </div>
    </div>
    <div class="col-md-12"><br><br><br></div>
</div>
</body>
</html>
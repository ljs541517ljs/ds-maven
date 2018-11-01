<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/10/30
  Time: 14:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script src="/js/jquery-1.11.3.min.js"></script>
    <script>
        $(function () {
            $.getJSON("json/class_1.js", function(json){
                //dom对象如何转换为jquery对象  $()
                $(json).each(function(i,data){
                    $("#spu").append("<option value='"+data.id+"'>"+data.flmch1+"<option>")
                })
            });
        })

        function spuFu(flbh1){
            $.getJSON("json/class_2_"+flbh1+".js", function(json){
                //清空
                $("#spuFu").empty();
                //dom对象如何转换为jquery对象  $()
                $(json).each(function(i,data){
                    $("#spuFu").append("<option value='"+data.id+"'>"+data.flmch2+"<option>")
                })
            });



        }

        function  toAddAttrPage(){
            var flbh2 = $("#spuFu").val();
            location.href="toAddAttrPage.do?flbh2="+flbh2;
        }

        function toInPage(flbh2) {
            $.post("findAttrInPage.do",{"flbh2":flbh2},function(data){
                $("#inPage").html(data);
            })
        }

    </script>
</head>
<body>
            attr
            <hr>
            一级：<select id="spu" onchange="spuFu(this.value)">
                <option>请选择</option>
            </select>
            二级：<select id="spuFu" onchange="toInPage(this.value)">
                <option>请选择</option>
            </select>
            <br>
            <a href="javascript:toAddAttrPage()">添加</a>

<div id="inPage"></div>
</body>
</html>

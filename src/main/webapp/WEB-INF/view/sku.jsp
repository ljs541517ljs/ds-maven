<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/10/31
  Time: 11:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script src="/js/jquery-1.11.3.min.js"></script>
    <script>

        $(function() {
            $.getJSON("/json/class_1.js", function(json) {
                var oneSelectVal = "";
                $(json).each(function(i,data){
                    $("#skuOneSelectId").append("<option value='"+data.id+"'>"+data.flmch1+"<option>")
                })
            })
        })

        function twoSelect(flbh1) {
            $.getJSON("json/class_2_"+flbh1+".js", function(json){
                //清空
                $("#skuTwoSelectId").empty();
                //dom对象如何转换为jquery对象  $()
                $(json).each(function(i,data){
                    $("#skuTwoSelectId").append("<option value='"+data.id+"'>"+data.flmch2+"<option>")
                })
            });
        }


        function toSkuAddPage() {
            var flbh1 = $("#skuOneSelectId").val();
            var flbh2 = $("#skuTwoSelectId").val();
            location.href = "toSkuAddPage.do?flbh1=" + flbh1 + "&flbh2=" + flbh2;
        }
    </script>
</head>
<body>
            sku
            <hr>
                一级：
                <select id="skuOneSelectId" onchange="twoSelect(this.value)">
                    <option>请选择</option>
                </select>
            二级：
                <select id="skuTwoSelectId">
                    <option>请选择</option>
                </select>
                <hr>
            <a href="javascript:toSkuAddPage()">增加</a>
            </body>
            </html>

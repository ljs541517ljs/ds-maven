<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/10/29
  Time: 16:06
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


            $.getJSON("json/tm_class_1_"+flbh1+".js", function(json){
                $("#ppId").empty();
                //dom对象如何转换为jquery对象  $()
                $(json).each(function(i,data){
                    $("#ppId").append("<option value='"+data.id+"'>"+data.ppmch+"<option>")
                })
            });
        }

        function  toAddPage(){
            var flbh1 = $("#spu").val();
            var flbh2 = $("#spuFu").val();
            var ppId = $("#ppId").val();
            location.href="<%=request.getContextPath()%>/toAddPage.do?flbh1="+flbh1+"&flbh2="+flbh2+"&ppId="+ppId+"";
        }


    </script>
</head>
<body>
         一级：<select id="spu" onchange="spuFu(this.value)">
                    <option>请选择</option>
               </select>
         二级：<select id="spuFu">
                    <option>请选择</option>
               </select>
         品牌：<select id="ppId">
                    <option>请选择</option>
               </select>
<br>
<a href="javascript:toAddPage()">添加</a>
</body>
</html>


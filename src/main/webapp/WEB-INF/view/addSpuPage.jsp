<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/10/29
  Time: 17:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java"  %>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<html>
<head>
    <title>addSpuPage</title>

</head>
<body>
        addSpuPage页面
        flbh1:${spu.flbh1}--
        flbh2:${spu.flbh2}--
        ppId:${spu.ppId}
        <form action="addSpu.do" enctype="multipart/form-data" method="post">
            <input type="hidden" name="flbh1" value="${spu.flbh1}">
            <input type="hidden" name="flbh2" value="${spu.flbh2}">
            <input type="hidden" name="ppId" value="${spu.ppId}">
            <br>
            商品名称：<input type="text" name="shpMch">
            <br>
            商品描述：<textarea name="shpMsh"></textarea>
            <br>
            图片：<input type="file" name="imgs"/>
                <input type="file" name="imgs"/>
                <input type="file" name="imgs"/>
            <br>
            <input type="submit">
        </form>
</body>
</html>

<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/10/30
  Time: 14:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
        flbh2:${flbh2}

        <form action="saveAttr.do" method="post">
            <input type="hidden" name="flbh2" value="${flbh2}">
            <table >
                <tr>
                    <td>属性名：<input type="text" name="attrList[0].shxmMch"></td>
                    <td></td>
                </tr>
                <tr>
                    <td>属性值：<input type="text" name="attrList[0].valueList[0].shxzh"></td>
                    <td>单位：<input type="text" name="attrList[0].valueList[0].shxzhMch"></td>
                </tr>
                <tr>
                    <td>属性值：<input type="text" name="attrList[0].valueList[1].shxzh"></td>
                    <td>单位：<input type="text" name="attrList[0].valueList[1].shxzhMch"></td>
                </tr>
            </table>
            <table >
                <tr>
                    <td>属性名：<input type="text" name="attrList[1].shxmMch"></td>
                    <td></td>
                </tr>
                <tr>
                    <td>属性值：<input type="text" name="attrList[1].valueList[0].shxzh"></td>
                    <td>单位：<input type="text" name="attrList[1].valueList[0].shxzhMch"></td>
                </tr>
                <tr>
                    <td>属性值：<input type="text" name="attrList[1].valueList[1].shxzh"></td>
                    <td>单位：<input type="text" name="attrList[1].valueList[1].shxzhMch"></td>
                </tr>
            </table>
            <input type="submit">
        </form>
</body>
</html>

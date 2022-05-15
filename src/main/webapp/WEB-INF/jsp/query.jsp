<%--
  Created by IntelliJ IDEA.
  User: Visit
  Date: 2021/9/28
  Time: 10:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<table border="1px">
    <tr>
        <th>编号</th>
        <th>姓名</th>

    </tr>
    <c:forEach items="${student}" var="s">
        <tr>
            <td>${s.id}</td>
            <td>${s.name}</td>
        </tr>
    </c:forEach>
</table>
<%--<a href="../stu/toAdd">--%>
<%--    <input type="button" value="添加数据">--%>
<%--</a>--%>
<%--<div>--%>
<%--    <a href='${pageContext.request.contextPath }/stu/all?page=1' >首页</a>--%>
<%--    <c:if test="${page.pageNum > 1 }">--%>
<%--        <a href='${pageContext.request.contextPath }/stu/all?page=${page.pageNum-1}'>上一页</a>--%>
<%--    </c:if>--%>
<%--    <c:if test="${page.pageNum < page.pages }">--%>
<%--        <a href='${pageContext.request.contextPath }/stu/all?page=${page.pageNum+1}'>下一页</a>--%>
<%--    </c:if>--%>
<%--    <a href='${pageContext.request.contextPath }/stu/all?page=${page.pages}'>尾页</a>--%>
<%--    &nbsp;&nbsp;&nbsp;共<span class='current'> ${page.total } </span>条记录--%>
<%--    <span class='current'> ${page.pageNum }/${page.pages } </span>页--%>
<%--</div>--%>
</body>
</html>
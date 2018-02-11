<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%--
  Created by IntelliJ IDEA.
  User: vladimir
  Date: 09.02.2018
  Time: 22:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
    <link type="text/css" rel="stylesheet" href="<c:url value="view/style/history.css"/>">
    <title>История</title>
</head>
    <body>
        <div class="table_block">
            <h2>История</h2>
            <table>
                <tr>
                    <th>Creation date</th>
                    <th>Param1</th>
                    <th>Param2</th>
                    <th>Operation</th>
                    <th>Result</th>
                </tr>
                <tbody>
                    <c:forEach items="${list}" var="log">
                        <tr>
                            <td><fmt:formatDate value="${log.creationDate}" pattern="dd-MM-yyyy HH:mm"/></td>
                            <td><c:out value="${log.param1}"/></td>
                            <td><c:out value="${log.param2}"/></td>
                            <td><c:out value="${log.operation}"/></td>
                            <td><c:out value="${log.result}"/></td>
                        </tr>
                    </c:forEach>
                </tbody>
            </table>
            <a href="/webapp/calculator">Назад</a>
        </div>
    </body>
</html>

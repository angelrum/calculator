<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: vladimir
  Date: 06.02.2018
  Time: 23:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
        <link type="text/css" rel="stylesheet" href="<c:url value="view/style/style.css"/>">
        <title>Калькулятор</title>
    </head>
    <body>
    <form method="post" class="calculator">
        <h2>Калькулятор</h2>
        <div class="value">
            <input type="text" name="val1" size="10"/>
            <input type="text" name=val2 size=10/>
        </div>
        <div class="error">
            <c:if test="${message!=null}">
                <p><c:out value="${message}"/></p>
            </c:if>
        </div>
        <div class="operator">
            <input name="operator" type="radio" value="plus" id="plus" checked>
            <label for="plus">+</label>
            <input name="operator" type="radio" value="minus" id="minus">
            <label for="minus">-</label>
            <input name="operator" type="radio" value="times" id="times">
            <label for="times">x</label>
            <input name="operator" type="radio" value="div" id="div">
            <label for="div">/</label>
        </div>
        <input class="equals" type="submit" value="="/>
        <a href="/webapp/history">История</a>
    </form>
    </body>
</html>

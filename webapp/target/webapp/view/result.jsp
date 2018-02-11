<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: vladimir
  Date: 07.02.2018
  Time: 22:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
    <link type="text/css" rel="stylesheet" href="<c:url value="view/style/style.css"/>">
    <title>Калькулятор</title>
</head>
    <body>
        <div class="calculator">
            <h2>Результат</h2>
            <div class="expression">
                <p>${val1} ${operator} ${val2} =</p>
            </div>
            <div class="result">
                <p>${result}</p>
            </div>
            <a href="/webapp/calculator">Назад</a>
        </div>
    </body>
</html>

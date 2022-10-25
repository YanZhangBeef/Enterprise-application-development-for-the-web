<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01
Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Policy Manager</title>
</head>
<body>
<div align="center">
    <h2>Policy Manager</h2>
    <form method="get" action="searchPolicy">
        <input type="text" name="number" /> &nbsp;
        <input type="submit" value="Search" />
    </form>

    <table border="1" cellpadding="5">
        <tr>
            <th>ID</th>
            <th>Policy Number</th>
            <th>Policy Type</th>

            <th>Policy Description
        </tr>
        <c:forEach items="${listPolicy}" var="policy">
            <tr>
                <td>${policy.id}</td>
                <td>${policy.number}</td>
                <td>${policy.type}</td>

                <td>${policy.description}</td>

            </tr>
        </c:forEach>
    </table>
    <br>
    <br>
    <a href="/IMS/agent/index" >Go Back</a>
    <br>
    <br>
    <a href="/IMS/logout" >Log out</a>
</div>
</body>
</html>

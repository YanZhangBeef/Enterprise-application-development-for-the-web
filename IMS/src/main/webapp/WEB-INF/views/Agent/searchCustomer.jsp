<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Search Result</title>
</head>
<body>
<div align="center">
    <h2>Search Result</h2>
    <table border="1" cellpadding="5">
        <tr>
            <th>ID</th>
            <th>Name</th>
            <th>Action</th>
        </tr>
        <c:forEach items="${result}" var="customer">
            <tr>
                <td>${customer.id}</td>
                <td>${customer.name}</td>

                <td>
                    <a href="${pageContext.request.contextPath}/agent/showDetails?id=${customer.id}">Show details</a>

                </td>
            </tr>
        </c:forEach>
    </table>
    <br>
    <br>
    <a href="/IMS/agent/customerManage" >Go Back</a>
    <br>
    <br>
    <a href="/IMS/logout" >Log out</a>
</div>
</body>
</html>


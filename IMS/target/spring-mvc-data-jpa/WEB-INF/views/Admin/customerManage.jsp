<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01
Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Customer Manager</title>
</head>
<body>
<div align="center">
    <h2>Customer Manager</h2>
    <form method="get" action="search">
        <input type="text" name="name" placeholder ="Search By Name"/> &nbsp;
        <input type="submit" value="Search" />
    </form>

    <form method="get" action = "searchByNumber">
        <input type="text" name="id" placeholder = "Search By Id"/> &nbsp;
        <input type="submit" value="Search" />
    </form>
    <h3><a href="${pageContext.request.contextPath}/admin/new">New Customer</a></h3>
    <table border="1" cellpadding="5">
        <tr>
            <th>ID</th>
            <th>Name</th>
            <th>Address</th>
            <th>ContactNumber</th>
            <th>Email</th>
            <th>Sex</th>
            <th>DateOfBirth</th>
            <th>Status</th>
            <th>RiskRate</th>
            <th>Action</th>
        </tr>
        <c:forEach items="${listCustomer}" var="customer">
            <tr>
                <td>${customer.id}</td>
                <td>${customer.name}</td>
                <td>${customer.address}</td>
                <td>${customer.contactNumber}</td>
                <td>${customer.email}</td>
                <td>${customer.sex}</td>
                <td>${customer.dateOfBirth}</td>
                <td>${customer.status}</td>
                <td>${customer.riskRate}</td>
                <td>
                    <a href="${pageContext.request.contextPath}/admin/edit?id=${customer.id}">Edit</a>
                    &nbsp;&nbsp;&nbsp;
                    <a href="${pageContext.request.contextPath}/admin/delete?id=${customer.id}"
                       onclick="return(confirm('Are you sure you want to delete this Customer ?'))">Delete</a>
                </td>
            </tr>
        </c:forEach>
    </table>
    <br>
    <br>
    <a href="/IMS/admin/index" >Go Back</a>
    <br>
    <br>
    <a href="/IMS/logout" >Log out</a>
</div>
</body>
</html>

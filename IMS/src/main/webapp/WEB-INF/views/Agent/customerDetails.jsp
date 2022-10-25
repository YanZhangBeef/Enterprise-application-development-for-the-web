<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Show Details</title>
</head>
<body>
<div align="center">
    <h2>Show Details</h2>
    <form:form action="showDetails" method="get" modelAttribute="customer">
        <table border="0" cellpadding="5">
            <tr>
                <td>ID: </td>
                <td>${customer.id} <form:hidden path="id"/>
                </td>
            </tr>
            <tr>
                <td>Name: </td>
                <td>${customer.name} <form:hidden path="name"/></td>
            </tr>
            <tr>
                <td>Address: </td>
                <td>${customer.address} <form:hidden path="address"/></td>
            </tr>
            <tr>
                <td>ContactNumber: </td>
                <td>${customer.contactNumber} <form:hidden path="contactNumber"/></td>
            </tr>
            <tr>
                <td>Email: </td>
                <td>${customer.email} <form:hidden path="email"/></td>
            </tr>
            <tr>
                <td>Gender: </td>
                <td>${customer.sex} <form:hidden path="sex"/></td>
            </tr>
            <tr>
                <td>DateOfBirth: </td>
                <td>${customer.dateOfBirth} <form:hidden path="dateOfBirth"/></td>
            </tr>
            <tr>
                <td>Status: </td>
                <td>${customer.status} <form:hidden path="status"/></td>
            </tr>
            <tr>
                <td>RiskRate: </td>
                <td>${customer.riskRate} <form:hidden path="riskRate"/></td>
            </tr>

        </table>
    </form:form>
    <br>
    <br>
    <a href="/IMS/agent/customerManage" >Go Back</a>
    <br>
    <br>
    <a href="/IMS/logout" >Log out</a>
</div>
</body>
</html>

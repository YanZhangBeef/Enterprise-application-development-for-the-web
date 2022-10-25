<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01
Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>PolicyHolderRecords Manager</title>
</head>
<body>
<div align="center">
    <h2>PolicyHolderRecords  Manager</h2>
    <form method="get" action="searchPolicyHolderRecords">
        <input type="text" name="appliedDate" placeholder = "Search By Applied Date"/> &nbsp;
        <input type="submit" value="Search" />
    </form>
    <form method="get" action="searchPhrByCustomerNumber">
        <input type="text" name="id" placeholder = "Search By Customer ID"/> &nbsp;
        <input type="submit" value="Search" />
    </form>
    <form method="get" action="searchPhrByPolicyNumber">
        <input type="text" name="policyNumber" placeholder = "Search By Policy Number"/> &nbsp;
        <input type="submit" value="Search" />
    </form>
    <h3><a href="${pageContext.request.contextPath}/admin/newPolicyHolderRecords ">New PolicyHolderRecords </a></h3>
    <table border="1" cellpadding="5">
        <tr>
            <th>ID</th>
            <th>PolicyNumber</th>
            <th>CustomerName</th>

            <th>CustomerID</th>
            <th>AppliedDate</th>
            <th>Status</th>
            <th>StartDate</th>
            <th>EndDate</th>
            <th>Premium</th>
            <th>OtherDetails</th>

            <th>Action</th>
        </tr>
        <c:forEach items="${listPolicyHolderRecords}" var="policyHolderRecords">
            <tr>
                <td>${policyHolderRecords.id}</td>
                <td>${policyHolderRecords.policyNumber.number}</td>

                <td>${policyHolderRecords.customer.name}</td>
                <td>${policyHolderRecords.customer.id}</td>
                <td>${policyHolderRecords.appliedDate}</td>
                <td>${policyHolderRecords.status}</td>
                <td>${policyHolderRecords.startDate}</td>
                <td>${policyHolderRecords.endDate}</td>
                <td>${policyHolderRecords.premium}</td>
                <td>${policyHolderRecords.otherDetails}</td>

                <td>
                    <a href="${pageContext.request.contextPath}/admin/editPolicyHolderRecords?id=${policyHolderRecords.id}">Edit</a>
                    &nbsp;&nbsp;&nbsp;
                    <a href="${pageContext.request.contextPath}/admin/deletePolicyHolderRecords?id=${policyHolderRecords.id}"
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

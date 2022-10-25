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
            <th>Policy Number</th>
            <th>Policy Type</th>
            <th>Customer Number</th>
            <th>Customer Name</th>
            <th>AppliedDate</th>
            <th>Status</th>
            <th>Action</th>

        </tr>
        <c:forEach items="${result}" var="policyHolderRecords">
            <tr>
                <td>${policyHolderRecords.id}</td>
                <td>${policyHolderRecords.policyNumber.number}</td>
                <td>${policyHolderRecords.policyNumber.type}</td>
                <td>${policyHolderRecords.customer.id}</td>
                <td>${policyHolderRecords.customer.name}</td>
                <td>${policyHolderRecords.appliedDate}</td>
                <td>${policyHolderRecords.status}</td>

                <td>
                    <a href="${pageContext.request.contextPath}/admin/showPhr?id=${policyHolderRecords.id}">Show details</a>

                </td>
            </tr>
        </c:forEach>
    </table>
    <br>
    <br>
    <a href="/IMS/admin/policyHolderRecordsManage" >Go Back</a>
    <br>
    <br>
    <a href="/IMS/logout" >Log out</a>
</div>
</body>
</html>


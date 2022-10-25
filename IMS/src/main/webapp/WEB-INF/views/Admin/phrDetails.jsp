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
    <form:form action="showPhr" method="get" modelAttribute="policyHolderRecords">
        <table border="0" cellpadding="5">
            <tr>
                <td>ID: </td>
                <td>${policyHolderRecords.id} <form:hidden path="id"/>
                </td>
            </tr>

            <tr>
                <td>Applied Date: </td>
                <td>${policyHolderRecords.appliedDate} <form:hidden path="appliedDate"/></td>
            </tr>
            <tr>
            <td>Status: </td>
            <td>${policyHolderRecords.status} <form:hidden path="status"/></td>
        </tr>
            <tr>
                <td>Start Date: </td>
                <td>${policyHolderRecords.startDate} <form:hidden path="startDate"/></td>
            </tr>
            <tr>
                <td>End Date: </td>
                <td>${policyHolderRecords.endDate} <form:hidden path="endDate"/></td>
            </tr>
            <tr>
                <td>Premium: </td>
                <td>${policyHolderRecords.premium} <form:hidden path="premium"/></td>
            </tr>

            <tr>
                <td>Other Details: </td>
                <td>${policyHolderRecords.otherDetails} <form:hidden path="otherDetails"/></td>
            </tr>

        </table>
    </form:form>
    <br>
    <br>
    <a href="/IMS/admin/policyHolderRecordsManage" >Go Back</a>
    <br>
    <br>
    <a href="/IMS/logout" >Log out</a>
</div>
</body>
</html>

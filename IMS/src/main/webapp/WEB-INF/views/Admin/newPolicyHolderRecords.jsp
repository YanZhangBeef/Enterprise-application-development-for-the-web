<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>New PolicyHolderRecords</title>
</head>
<body>
<div align="center">
    <h2>New PolicyHolderRecords</h2>

    <form:form action="savePolicyHolderRecords" method="post" modelAttribute="policyHolderRecords">
        <table border="0" cellpadding="5">
            <tr>
                <td>Policy ID: </td>
                <td> <form:input path="policyNumber.id"/></td>

            </tr>
            <tr>
                <td>Customer ID: </td>
                <td><form:input path="customer.id"/></td>

            </tr>
            <tr>
                <td>Applied Date: </td>
                <td><form:input path="appliedDate" pattern="\d{4}/\d{2}/\d{2}" placeholder = "2000/01/12"/></td>
            </tr>
            <tr>
                <td>Status: </td>
                <td><form:input path="status" /></td>
            </tr>

            <tr>
                <td>Start Date: </td>
                <td><form:input path="startDate" pattern="\d{4}/\d{2}/\d{2}" placeholder = "2000/01/12"/></td>
            </tr>
            <tr>
                <td>End Date: </td>
                <td><form:input path="endDate" pattern="\d{4}/\d{2}/\d{2}" placeholder = "2000/01/12"/></td>
            </tr>

            <tr>
                <td>Premium: </td>
                <td><form:input path="premium" /></td>
            </tr>
            <tr>
                <td>Other details: </td>
                <td><form:input path="otherDetails" /></td>
            </tr>

            <tr>
                <td colspan="2"><input type="submit" value="Save"></td>
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


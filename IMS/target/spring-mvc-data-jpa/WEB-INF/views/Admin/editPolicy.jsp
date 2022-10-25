<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Edit Policy</title>
</head>
<body>
<div align="center">
    <h2>Edit Policy</h2>
    <form:form action="savePolicy" method="post" modelAttribute="policy">
        <table border="0" cellpadding="5">
            <tr>
                <td>ID: </td>
                <td>${policy.id}
                    <form:hidden path="id"/>
                </td>
            </tr>
            <tr>
                <td>Policy number: </td>
                <td><form:input path="number" /></td>
            </tr>
            <tr>
                <td>Policy type: </td>
                <td><form:input path="type" /></td>
            </tr>

            <tr>
                <td>Description: </td>
                <td><form:input path="description" /></td>
            </tr>

            <tr>
                <td colspan="2"><input type="submit" value="Save"></td>
            </tr>
        </table>
    </form:form>
    <br>
    <br>
    <a href="/IMS/admin/policyManage" >Go Back</a>
    <br>
    <br>
    <a href="/IMS/logout" >Log out</a>
</div>
</body>
</html>

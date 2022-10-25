<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>New Customer</title>
    <script>
        function required() {

            if (document.getElementById("name").value == "") {
                alert("Name must be filled out");
                return false;
            }

        }
    </script>

</head>
<body>
<div align="center">
    <h2>New Customer</h2>

    <form:form action="save" method="post" modelAttribute="customer" onsubmit="return required()">
        <table border="0" cellpadding="5">
            <tr>
                <td>Name: </td>
                <td><form:input path="name"  id = "name"/></td>

            </tr>
            <tr>
                <td>Address: </td>
                <td><form:input path="address" /></td>
            </tr>
            <tr>
                <td>Email: </td>
                <td><form:input path="email"  pattern=".+@gmail\.com" placeholder = "111@gmail.com"/></td>
            </tr>
            <tr>
                <td>ContactNumber: </td>
                <td><form:input path="contactNumber" minlength="10"/>
                </td>
            </tr>
            <tr>
                <td>Sex: </td>
                <td><form:select path = "sex" >

                    <form:option value = "female" lable = "Female" />
                    <form:option value = "other" lable = "Other" />
                    </form:select>
                </td>

            </tr>
            <tr>
                <td>DateOfBirth: </td>
                <td><form:input path="dateOfBirth" pattern="\d{4}/\d{2}/\d{2}" placeholder = "2000/01/12"/></td>
            </tr>
            <tr>
                <td>Employment Status: </td>
                <td><form:input path="status" /></td>
            </tr>
            <tr>
                <td>RiskRate: </td>
                <td><form:input path="riskRate" /></td>
            </tr>
            <tr>
                <td colspan="2"><input type="submit" value="Save"></td>
            </tr>
        </table>
    </form:form>
    <br>
    <br>
    <a href="/IMS/admin/customerManage" >Go Back</a>
    <br>
    <br>
    <a href="/IMS/logout" >Log out</a>
</div>
</body>
</html>


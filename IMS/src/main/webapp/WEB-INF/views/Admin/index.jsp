<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Admin Index</title>
</head>
<body>
<h2>Welcome To Insurance Management System</h2>


<a href="${pageContext.request.contextPath}/admin/customerManage">Go to Customer Manager Page</a>
<br>
<br>
<a href="${pageContext.request.contextPath}/admin/policyManage">Go to Policy Manager Page</a>
<br>
<br>
<a href="${pageContext.request.contextPath}/admin/policyHolderRecordsManage">Go to policyHolderRecords Manager Page</a>
<br>
<br>
<a href="/IMS/logout" >Log out</a>
</body>
</html>

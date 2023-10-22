<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
<title>Management Admin</title>

<link href="css/bootstrap1.min.css" rel="stylesheet" type="text/css"/>
<link href="css/metisMenu.css" rel="stylesheet" type="text/css"/>
<link href="css/style1.css" rel="stylesheet" type="text/css"/>
</head>
<body class="crm_body_bg">
    <c:set var="user" value = "${sessionScope.USER}"></c:set>
    <c:if test="${empty user}">
        <h2>Access Denied. Please login</h2>
        <a href="index.jsp">Click here to go back home</a>
    </c:if>
    <c:if test="${not empty user}">
        <%@include file="MenuAdmin.jsp" %>
    </c:if>


    <script src=".\js\jquery1-3.4.1.min.js"></script>

    <script src=".\js\bootstrap1.min.js"></script>

    <script src=".\js\metisMenu.js"></script>

    <script src=".\js\custom.js"></script>


</body></html>

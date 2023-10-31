<%-- 
    Document   : Person
    Created on : Oct 17, 2023, 6:29:27 PM
    Author     : Admin
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <style>
            *{
                font-size: medium;
            }
            .py-5{
                margin-top: 15rem;
                margin-bottom: 15rem;
                height: 100%;
                border-bottom: grey 1px solid;
            }
        </style>
    </head>
    <body>
        <%@include file="header.jsp" %><br/>
        <c:set var="user" value = "${sessionScope.USER}"></c:set>
            <section style="background-color: white;">
                <div class="container py-5">
                    <div class="row">
                        <div class="col-lg-4">
                            <div class="card mb-4">
                                <div class="card-body text-center">
                                    <img src="https://png.pngtree.com/png-vector/20190417/ourlarge/pngtree-vector-business-men-icon-png-image_947324.jpg" alt="avatar"
                                         class="rounded-circle img-fluid" style="width: 150px;height: 150px;">
                                
                                <h5 class="my-3">${user.getName()}</h5>
                                <c:if test="${user.getRoleID()==2}">
                                    <p class="text-muted mb-1">Admin account</p>
                                    <p class="text-muted mb-4"></p>
                                </c:if>
                                <c:if test="${user.getRoleID()==1}">
                                    <p class="text-muted mb-1">Seller account</p>
                                    <p class="text-muted mb-4"></p>
                                </c:if>
                                <c:if test="${user.getRoleID()==0}">
                                    <p class="text-muted mb-1">Customer account</p>
                                    <p class="text-muted mb-4"></p>
                                </c:if>
                            </div>
                        </div>

                    </div>
                    <form action="updateuser" method="post" class="col-lg-8">
                        <div >
                            <div class="card mb-4">
                                <div class="card-body">
                                    <div class="row">
                                        <div class="col-lg-3">
                                            <p class="mb-0">Full Name</p>
                                        </div>
                                        <div class="col-lg-9">
                                            <input class="text-muted mb-0" name="ten" type="text" value="${param.ten}">
                                        </div>
                                    </div>
                                    <hr>
                                    <div class="row">
                                        <div class="col-lg-3">
                                            <p class="mb-0">Email</p>
                                        </div>
                                        <div class="col-lg-9">
                                            <input class="text-muted mb-0" name="mail" type="text" value="${param.mail}">
                                        </div>
                                    </div>
                                    <hr>
                                    <div class="row">
                                        <div class="col-lg-3">
                                            <p class="mb-0">Phone</p>
                                        </div>
                                        <div class="col-lg-9">
                                            <input class="text-muted mb-0" name="sdt" type="text" value="${param.sdt}">
                                        </div>
                                    </div>
                                    <hr>
                                    <div class="row">
                                        <div class="col-lg-3">
                                            <p class="mb-0">Address</p>
                                        </div>
                                        <div class="col-lg-9">
                                            <input class="text-muted mb-0" name="diachi" type="text" value="${param.diachi}">
                                        </div>
                                    </div>

                                </div>
                            </div>
                            <input type="submit" value="Save" name="update">
                            <a href="logout">Logout</a>
                            <c:set var="smsUpdate" value="${requestScope.SMSUPDATEUSER}"></c:set>
                            <c:if test="${not empty smsUpdate}">
                                <p style="color:red;">Cannot update</p>
                                <p style="color:red;">${smsUpdate}</p>
                            </c:if>
                        </div>
                    </form>
                </div>
            </div>
        </section>
        <div style="border: grey 0.75px solid;"></div>
        <%@include file="footer.html" %>
        <script>

        </script>
    </body>
</html>

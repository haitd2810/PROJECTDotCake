<%-- 
    Document   : Hoang_SignUp
    Created on : Oct 15, 2023, 1:29:17 AM
    Author     : DELL
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!--
Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Html.html to edit this template
-->
<html>
    <head>
        <title>TODO supply a title</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link href="https://fonts.googleapis.com/css?family=Lato:300,400,700&display=swap" rel="stylesheet">

        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">

        <link rel="stylesheet" href="css/Hoang_Style.css">
    </head>
    <body>
        <section class="ftco-section">
            <div class="container">
                <div class="row justify-content-center">
                    <div class="col-md-6 text-center mb-5">
                        <h2 class="heading-section">DOTCAKE</h2>
                    </div>
                </div>
                <div class="row justify-content-center">
                    <div class="col-md-12 col-lg-10">
                        <div class="wrap d-md-flex">
                            <div class="img" style="background-image: url(images/img1.jpg);">
                            </div>
                            <div class="login-wrap p-4 p-md-5">
                                <div class="d-flex">
                                    <div class="w-100">
                                        <h3 class="mb-4">Sign Up</h3>
                                    </div>
                                    <div class="w-100">
                                        <p class="social-media d-flex justify-content-end">
                                            <a href="https://www.facebook.com/profile.php?id=100063622465522" class="social-icon d-flex align-items-center justify-content-center"><span class="fa fa-facebook"></span></a>
                                            <a href="https://www.youtube.com/watch?v=1qPOU8bC1rw" class="social-icon d-flex align-items-center justify-content-center"><span class="fa fa-youtube"></span></a>
                                        </p>
                                    </div>
                                </div>
                                <form action="signup" class="signin-form" method="post">
                                    
                                    <div class="form-group mb-3">
                                        <label class="label" for="name">Name</label>
                                        <input type="text" class="form-control" placeholder="Name" required name="name">                                
                                    </div>
                                    
                                    <div class="form-group mb-3">
                                        <label class="label" for="name">Username</label>
                                        <input type="text" class="form-control" placeholder="Username" required name="user">
                                    </div>

                                    <div class="form-group mb-3">
                                        <label class="label" for="password">Password</label>
                                        <input type="password" class="form-control" placeholder="Password" required name="pass">
                                    </div>

                                    <div class="form-group mb-3">
                                        <label class="label" for="password"> Repeat Password</label>
                                        <input type="password" class="form-control" placeholder="Password" required name="repass">
                                    </div>

                                    <div class="form-group mb-3">
                                        <label class="label" for="name">Email</label>
                                        <input type="text" class="form-control" placeholder="Email" required name="email">                                
                                    </div>
                                    
                                    <div class="form-group mb-3">
                                        <label class="label" for="name">Phone number</label>
                                        <input type="text" class="form-control" placeholder="Phone number" required name="phone">                                
                                    </div>
                                    
                                    <center>
                                        <%
                                        String error = (String)request.getAttribute("msg");
                                        if(error != null){
                                        %>
                                        <div style="color: red">
                                            <%= error %>
                                        </div>
                                        <%
                                            }
                                        %>
                                    </center>
                                    
                                    <div class="form-group">
                                        <button type="submit" class="form-control btn btn-primary rounded submit px-3">Sign Up</button>
                                    </div>
                                    <div class="form-group d-md-flex">
                                        <div class="w-50 text-left">
                                            <label class="checkbox-wrap checkbox-primary mb-0">Remember Me
                                                <input type="checkbox" checked>
                                                <span class="checkmark"></span>
                                            </label>
                                        </div>
                                    </div>
                                </form>
                                <p class="text-center"><a href="Hoang_SignIn.jsp">Sign In</a></p>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </section>

        <script src="js/jquery.min.js"></script>
        <script src="js/popper.js"></script>
        <script src="js/bootstrap.min.js"></script>
        <script src="js/main.js"></script>

    </body>
</html>


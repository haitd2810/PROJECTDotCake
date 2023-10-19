<%-- 
    Document   : contact
    Created on : Oct 10, 2023, 3:47:49 PM
    Author     : Duy Hai
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Contact</title>
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css">
	<script src="https://cdn.jsdelivr.net/npm/jquery@3.6.4/dist/jquery.slim.min.js"></script>
	<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"></script>
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/js/bootstrap.bundle.min.js"></script>
    <link rel="stylesheet" href="css/stylecontact.css">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
    </head>
    <body>
        <%@include file="header.jsp" %>
        <div id="demo" class="carousel slide slide_product" data-ride="carousel" >

		<!-- Indicators -->
		
		<!-- The slideshow -->
		<div class="carousel-inner">
		  <div class="carousel-item active">
			<img src="images/z4741944688434_c3fd8b57b9412dd09bf5fd5302c1af5e.jpg" width="100%" height="335">
		  </div>
		  <div class="carousel-item">
			<img src="images/banh-macaron-nhan-kem-socola-ganache-sieu-de-thuong.jpg"width="100%" height="335">
		  </div>
		  <div class="carousel-item">
			<img src="images/wholegrain-ezekiel-bread-with-seeds-1200x676.jpg" width="100%" height="335">
		  </div>
		</div>
		
		<!-- Left and right controls -->
		<a style="margin: auto 0; height: fit-content;" class="carousel-control-prev" href="#demo" data-slide="prev">
		  <span class="carousel-control-prev-icon"></span>
		</a>
		<a style="margin: auto 0; height: fit-content;" class="carousel-control-next" href="#demo" data-slide="next">
		  <span class="carousel-control-next-icon"></span>
		</a>
	  </div>
	</div>
    <div class="content-lh">
        <h3 style="font-size: 3rem;">CONTACT US</h3>
    </div>
    <div class="content-contact ">
        <div class="col-md-4 content-menu">
            <h6 style="font-size: 2rem;">Menu</h6>
            <a style="font-size:1.5rem;line-height: 3rem;" class="menu" href="index.html">Home</a><br>
            <a style="font-size:1.5rem;line-height: 3rem;" class="menu" href="about.html">About</a><br>
            <a style="font-size:1.5rem;line-height: 3rem;" class="menu" href="#products.html">Products</a><br>
            <a style="font-size:1.5rem;line-height: 3rem;" class="menu" href="#services.html">Services</a>
        </div>
        <div class="col-md-4">
            <h6 style="font-size: 2rem;">HOTLINE</h6>
            <p style="font-size:1.75rem;">0396925536</p>
            <h6 style="font-size:2rem;">ADDRESS</h6>
            <p style="font-size:1.75rem;">FPT University</p>
        </div>
        <div class="col-md-4">
            <h6 style="font-size: 2rem;">FOLLOW US ON</h6>
            <a class="fa fa-facebook menu" href="#facebook"></a>
            <a class="fa fa-instagram menu" href="#instagram"></a>
            <h6 style="font-size: 1.75rem;">© 2023 DotCake Pastry.</h6>
        </div>
    </div>
    <%@include file="footer.html" %>
    </body>
</html>

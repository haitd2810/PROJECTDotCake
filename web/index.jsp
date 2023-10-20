<!--//test pull code part 2
//test push code part 1-->
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>DotCake</title>
        <link href="css/bootstrap.min.css" rel="stylesheet">
	<link rel="stylesheet" href="css/stylemenu.css">
	<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css">
	<script src="https://cdn.jsdelivr.net/npm/jquery@3.6.4/dist/jquery.slim.min.js"></script>
	<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"></script>
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/js/bootstrap.bundle.min.js"></script>
	<!-- Embed css here-->
	<link rel="stylesheet" href="css/styleindex.css">
    </head>
    <body>
        <%@include file="header.jsp" %>
        <!--Slide anh-->
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
	</div> <!--Kết thúc container-fluid-->
   <!--Content About-->
   <div class = "row content_about">
	    <div class="col-md-6 title_about">
		<h3>DeCake Is</h3>
		<h2>Lựa chọn lý tưởng cho bánh ngọt chuẩn Pháp</h2>
		<p class = "description">
		 Dành nhiều tình cảm đặc biệt cho bánh ngọt Pháp, chúng tôi quyết tâm tạo nên thương hiệu DotCake Pastry để mang tới cho mọi người một trải nghiệm thưởng thức bánh thật tinh tế và tận tâm.
		</p>
		<p class = "description">
	    Hãy một lần nếm thử bánh của DotCake để cảm nhận những tình cảm và nỗ lực của chúng tôi, tất cả nằm ở sự hoà quyện của hương vị và kết cấu đặc biệt trong từng chiếc bánh.
		</p>
		<div>
			<button class = "button button_about"><a href="#"><span>About DeCake</span></a></button>
		</div>
		</div>
	    <div class="col-md-6 image_about">
			<img src="images/z4741944688434_c3fd8b57b9412dd09bf5fd5302c1af5e.jpg"></img>
		</div>
   </div>
   <div class = "flex-center flex-col py-16 px-8 text-center">
       <h2 class="font-serif text-[44px] leading-tight 2xl:text-[48px]">Products</h2>
	   <p>Sản phẩm đặc trưng của DotCake Pastry là bánh Entremet – dòng bánh lạnh cao cấp nhất của Pháp, với sự hài hòa của các tầng hương vị và kết cấu đặc biệt trong từng chiếc bánh. </p>
       <button class = "button button_products">Products</button>
	</div>
        <%@include file="footer.html" %>

	<script src="js/Jquery.js"></script>
	<script src="js/bootstrap.min.js"></script>
    </body>
</html>

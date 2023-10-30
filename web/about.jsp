<%-- 
    Document   : about
    Created on : Oct 10, 2023, 3:50:02 PM
    Author     : Duy Hai
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>About</title>
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css">
	<script src="https://cdn.jsdelivr.net/npm/jquery@3.6.4/dist/jquery.slim.min.js"></script>
	<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"></script>
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/js/bootstrap.bundle.min.js"></script>
	<!-- Embed css here-->
    <link rel="stylesheet" href="css/styleabout.css">
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
	 <!--Kết thúc container-fluid-->
    <div class = "row content_about">
	    <div class="col-md-6 title_about">
		<h2>ĐỘNG LỰC CỦA DOTCAKE</h2>
		<h3>Niềm hạnh phúc khi cùng nhau thưởng thức bánh</h3>
		<p class="content_des">
            Sự ra đời của DotCake bắt nguồn từ niềm đam mê bất tận về bánh ngọt của một người đầu bếp và 
            tư duy sáng tạo của một nhà thiết kế. Được định hình là thương hiệu bánh ngọt chuẩn Pháp, DotCake 
            trao tới bạn những chiếc bánh Entremet tinh tế, cùng nhiều loại bánh ngọt cao cấp và trên hết – 
            niềm hạnh phúc khi thưởng thức bánh cùng những người mà bạn yêu thương.
		</p>
		
		</div>
	    <div class="col-md-6 image_about">
			<img src="https://lafuong.com/_next/image?url=%2FLF_Chef_Lafuong_02.webp&w=1080&q=75"></img>
		</div>
   </div>
   <div class="row content-why">
        <div class="title-why">
            <p class="pt-16 why">Tại sao lại chọn DotCake</p>
        </div>
        <div class="col-md-3 quanlity">
            <img class="img-quality" src="https://lafuong.com/_next/image?url=%2FLF_Chat-luong_Illus.jpeg&w=640&q=75" alt="">
            <h3 class="title-quality">Chất lượng</h3>
            <p class="des-quality">Để mang lại trải nghiệm đáng nhớ trong từng chiếc bánh, 
                sản phẩm của DotCake được làm từ những nguyên liệu được chọn lựa cẩn thận và 
                hoàn thiện tỉ mỉ với những tiêu chuẩn cao cấp nhất.</p>
        </div>
        <div class="col-md-3 foreveryone">
            <img class="img-quality" src="https://lafuong.com/_next/image?url=%2FLF_Danh-cho-moi-nguoi_Illus.jpeg&w=640&q=75" alt="">
            <h3 class="title-quality">Cho mọi người</h3>
            <p class="des-quality">Bánh của DotCake được nghiên cứu để phù hợp với khẩu vị của người Việt 
                và luôn được đóng gói chỉn chu để ai cũng có thể nhận về những niềm vui
                 khi bánh được giao tới tận nơi.</p>
        </div>
        <div class="col-md-3 fact">
            <img class="img-quality" src="https://lafuong.com/_next/image?url=%2FLF_Danh-cho-moi-nguoi_Illus.jpeg&w=640&q=75" alt="">
            <h3 class="title-quality">Sự chân thành</h3>
            <p class="des-quality">Đối với DotCake, giá trị lớn nhất mà chúng tôi đề cao là sự chân thành.
                 Niềm vui của mọi nguời khi thưởng thức bánh, chính là nguồn động lực cho chúng tôi làm việc mỗi ngày.</p>
        </div>
    </div>
    <div class = "row content-product">
        <div class="col-md-6 image_product">
			<img src="https://lafuong.com/_next/image?url=%2FLF_Banh-Entremet_02.webp&w=1080&q=75"></img>
		</div>
	    <div class="col-md-6 title_product">
		<h2>SẢN PHẨM CỦA DOTCAKE</h2>
		<p class = "description">
            Là dòng bánh hiện đại và cao cấp nhất của Pháp, Entremet được tạo nên bởi nhiều tầng kết cấu đặc biệt và những kỹ thuật đòi hỏi tay nghề cao của người Chef.
             Mỗi chiếc bánh là sự hoà quyện của những lớp bạt xốp mềm, lớp kem thơm ngậy và hương vị đặc trưng của trái cây tươi.
		</p>
        <p class = "description">
            Bạn sẽ tìm thấy ở DotCake một chiếc bánh Entremet đặc biệt dành cho mọi dịp chúc mừng, 
            hoặc cũng có thể là một nửa chiếc bánh Entremet để thưởng thức mỗi ngày một cách đơn giản, mà không cần đợi đến dịp gì.
		</p>
        <a class="link_to_product" href="product">Xem Sản Phẩm</a>
		</div>
   </div>
        <%@include file="footer.html" %>
    </body>
</html>

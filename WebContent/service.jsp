<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>Our Services</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
</head>
<body>
<jsp:include page="/header.jsp"></jsp:include><br><br><br>
<!-- Sidebar -->
<div class="w3-sidebar w3-light-grey w3-bar-block" style="width:25%;height:75%;">
  <h3 class="w3-bar-item">Menu</h3>
  <a href="service1.jsp" class="w3-bar-item w3-button">General Car Service</a>
  <a href="service2.jsp" class="w3-bar-item w3-button">Battery And Tyre  Service</a>
  <a href="service3.jsp" class="w3-bar-item w3-button">Car Accident Repair Service</a>
<img src="faq.jpg" alt="Car" style="width:100%;">

</div>

<!-- Page Content -->
<div style="margin-left:25%">

<div class="w3-container w3-teal">
  <h1>Car Services</h1>
</div>

<img src="169-1696614_car-mechanic-car-service-hd-png-download.png" alt="Car" style="width:90%">

<!--<div class="w3-container">
<h2>Sidebar Navigation Example</h2>
<p>The sidebar with is set with "style="width:25%".</p>
<p>The left margin of the page content is set to the same value.</p>
</div>-->

</div>
  <jsp:include page="/footer.jsp"></jsp:include>    
</body>
</html>

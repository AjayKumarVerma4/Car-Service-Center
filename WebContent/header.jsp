<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">

  <style>
body {margin:0;}

.navbar {
  overflow: hidden;
  background-color: tomato;
  position: fixed;
  top: 0;
  width: 100%;
}

.navbar a {
  float: right;
  display: block;
  color: #f2f2f2;
  text-align: center;
  padding: 14px 16px;
  text-decoration: none;
  font-size: 17px;
}

.navbar a:hover {
  background: #ddd;
  color: black;
}
.navbar h1 {
  float: left;
  display: block;
  color: black;
  text-align: center;
  padding: 14px 16px;
  text-decoration: none;
  font-size: 13px;
}


</style>
</head>
<body>
 <header>
  <div class="navbar">
  <h1 class=""><i class="fa fa-fw fa-automobile"></i>PROJECT</h1>
  <a href="login.jsp"><i class="fa fa-fw fa-user"></i>Login</a>
  <a href="register.jsp"><i class="fa fa-fw fa-user"></i>Register</a>
  <a href="contact.jsp"><i class="fa fa-fw fa-envelope"></i>Contact-Us</a>
 <a href="service.jsp"><i class="fa fa-fw fa-gears"></i>Service</a>
  <a href="home.jsp"><i class="fa fa-fw fa-home"></i>Home</a>
</div>
</header>
</body>
</html>
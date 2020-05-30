<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<style>
body, html {
  height: 100%;
  font-family: Arial, Helvetica, sans-serif;
}

* {
  box-sizing: border-box;
}

.bg-img {
  /* The image used */
  background-image: url("arteum-ro-TVFx7iFAAdQ-unsplash.jpg");

  min-height: 660px;

  /* Center and scale the image nicely */
  background-position: center;
  background-repeat: no-repeat;
  background-size: cover;
  position: relative;
}

/* Add styles to the form container */
.container {
  position: absolute;
  left: 30%;
  margin: 20px;
  max-width: 425px;
  padding: 16px;
  background-color: white;
}

/* Full-width input fields */
input[type=text], input[type=password], input[type=tel], input[type=email]{
  width: 100%;
  padding: 15px;
  margin: 5px 0 12px 0;
  border: none;
  background: #f1f1f1;
}

input[type=text]:focus, input[type=password]:focus, input[type=tel]:focus, input[type=email]:focus{
  background-color: #ddd;
  outline: none;
}

/* Set a style for the submit button */
.btn {
  background-color: #4CAF50;
  color: white;
  padding: 16px 20px;
  border: none;
  cursor: pointer;
  width: 100%;
  opacity: 0.9;
}

.btn:hover {
  opacity: 1;
}
</style>
</head>
<body>
<jsp:include page="/header.jsp"></jsp:include><br><br><br><br>
<div class="bg-img">
  <form action="register" method="post" class="container">
    <h1 align=center>Register</h1>
    <label for="firstName"><b>First Name</b></label>
    <input type="text" placeholder="Enter First Name" name="firstName" required>

    <label for="lastName"><b>Last Name</b></label>
    <input type="text" placeholder="Enter Last Name" name="lastName" required>

    <label for="email"><b>Email</b></label>
    <input type="email" placeholder="Enter Email" name="email" required>

    <label for="mobileNumber"><b>Mobile Number</b></label>
    <input type="tel" id="phone" pattern="[5-9][0-9]{9}" placeholder="Enter Mobile Number" name="mobileNumber" required>

    <label for="password"><b>Password</b></label>
    <input type="password" placeholder="Enter Password" name="password" required>

    <button type="submit" class="btn">Register</button>
   <p>Already have an account?<a href="login.jsp">Login</a></p>
  </form>
</div><br>
<jsp:include page="/footer.jsp"></jsp:include>
</body>
</html>

    
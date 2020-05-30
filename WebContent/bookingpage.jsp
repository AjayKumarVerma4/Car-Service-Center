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
  background-image: url("keys-workshop-mechanic-tools-162553.jpeg");

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
  left: 28%;
  margin: 20px;
  max-width: 520px;
  padding: 16px;
  background-color: black;
}

/* Full-width input fields */
input[type=text], input[type=password], input[type=tel], input[type=email], select{
  width: 100%;
  padding: 15px;
  margin: 5px 0 12px 0;
  border: none;
  background: #f1f1f1;
}

input[type=text]:focus, input[type=password]:focus, input[type=tel]:focus, input[type=email]:focus, select{
  background-color: #ddd;
  outline: none;
}

/* Set a style for the submit button */
.btn {
  background-color:blue;
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
.column {
  float: left;
  width: 47%;
  margin:4px;
}

/* Clear floats after the columns */
.row:after {
  content: "";
  display: table;
  clear: both;
}
</style>
</head>
<body>
<jsp:include page="/header.jsp"></jsp:include><br><br><br><br>
<div class="bg-img">
  <form action="bookService" method="post" class="container">
    <h1 style="align:center;color:white;">Book Your Service</h1>
   <div class=row>
    <div class="column">
    <select name="location" required>
      <option value="" disabled selected hidden>Location ...</option>
      <option value="bangalore">Bangalore</option>
      <option value="mumbai">Mumbai</option>
      <option value="delhi">Delhi</option>
      <option value="kolkata">Kolkata</option>
    </select>
    </div>
    <div class="column">
    <select name="vehicleType" required>
    <option value="" disabled selected hidden>Vehicle Type...</option>
      <option value="volvo">Volvo</option>
      <option value="saab">Saab</option>
      <option value="mercedes">Mercedes</option>
      <option value="audi">Audi</option>
    </select>
    </div>
    </div>  
    <div class=row>
    <div class="column">
     <input type="text" placeholder="Vehicle Number" name="vehicleNumber" required>
    </div>
     <div class="column">
    <input type="text" placeholder="Model" name="vehicleModel" required>
    </div>
    </div>
    <div class=row>
    <div class="column">
    <select name="serviceType" required>
      <option value="" disabled selected hidden>Choose a Service Type ...</option>
      <option value="generalCar">General Car Service</option>
      <option value="batteryCar">Car Battery And Tyre Replacement Service</option>
      <option value="accidentalCar">Car Accident Repair Service</option>
    </select>
    </div>
    <div class="column">
    <select name="chooseService" required>
    <option value="" disabled selected hidden>Choose Services</option>
      <option value="Engine Oil Top-Up">Engine Oil Top-Up</option>
      <option value="Battery Checkup">Battery Checkup</option>
      <option value="Coolant Check">Coolant Check</option>
      <option value="Oil Leakage Check">Oil Leakage Check</option>
      <option value="Car Exterior & Interior Cleaning">Car Exterior & Interior Cleaning</option>
      <option value="Brake Pads & Shoes Cleaning">Brake Pads & Shoes Cleaning</option>
      <option value="Engine Fine Tuning">Engine Fine Tuning</option>
      <option value="Alternator & Pump Belt Inspection">Alternator & Pump Belt Inspection</option>
      <option value="Air Filter Replacement">Air Filter Replacement</option>
    </select>
    </div>
    </div>
    <input type="text" placeholder="Enter Your Name" name="clientName" required>
    <input type="email" placeholder="Enter Email" name="email" required>
    <input type="tel" id="phone" pattern="[5-9][0-9]{9}" placeholder="Enter Mobile Number" name="mobileNumber" required>

    <button type="submit" class="btn">Book Now</button>
  </form>
</div><br>
<jsp:include page="/footer.jsp"></jsp:include>
</body>
</html>

    
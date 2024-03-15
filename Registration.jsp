<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration Login form</title>
<!-- <link rel="stylesheet" href="formdesign.css"> -->
</head>
<body>
<form action="aaa" method="post">
<div class="design">
<input type="text" name="userName" placeholder="Username">
<br /> <br />
<input type="email" name="email1" placeholder="Email"><br><br />
<input type="password" name="pass1" placeholder="Password">
<br> <br />
<label for="gender">Gender:</label>
<input type="radio" name="gender1" value="male">M
<input type="radio" name="gender1" value="female">F
<br><br />
<label for="city">City:</label>
<select id="city" name="city1">
<option value=" ">---Please choose an option----</option>
<option value="janakpur">Janakpur</option>
<option value="dharan">Dharan</option>
<option value="kathmandu">Kathmandu</option>
<option value="biratnagar">Biratnagar</option>
<option value="pokhara">Pokhara</option>
</select>
<br><br />
<button value="Register">Register</button>
</div>

</form>

</body>
</html>
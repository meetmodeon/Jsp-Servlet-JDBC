<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.5.1/css/all.min.css" integrity="sha512-DTOQO9RWCH3ppGqcWaEA1BIZOC6xxalwEsw9c2QQeAIftl+Vegovlnee1c9QX4TctnWMn13TZye+giMm8e2LwA==" crossorigin="anonymous" referrerpolicy="no-referrer" />
    <link rel="stylesheet" href="login.css">
</head>
<body>
 <form action="login"  class="form" method="post">
        <h1>login</h1>
        <div class="emailacc">
            <input type="email"  name="email1" placeholder="email">
        </div>
        <div class="passwrd">
            <input type="password" name="pass1" placeholder="password">
        </div><br>
        <button>log in</button>
        <p>
            <a href="Registration.jsp">or Sign in with</a>
        </p>
        <div class="icons">
            <a href="#">
                <i class="fa-brands fa-google"></i>
            </a>
            <a href="#">
                <i class="fa-brands fa-twitter"></i>
            </a>
            <a href="#">
                <i class="fa-brands fa-apple"></i>
            </a>
            <a href="#">
                <i class="fa-brands fa-facebook"></i>
            </a>


        </div>

    </form>
</body>
</html>
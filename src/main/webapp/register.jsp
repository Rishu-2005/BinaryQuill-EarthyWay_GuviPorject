<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Register</title>
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.3/css/all.min.css"/>
<link rel="stylesheet" href="css/register.css"/>
<script src="javascript/register.js"></script>
</head>
<body>
 <div class="navbar">
        <h1>EarthyWay</h1>
        <nav>
            <input type="checkbox" id="click">
            <label for="click" class="menubtn">
                <i class="fas fa-bars"></i>
            </label>
            <ul class="nav">
                <li><a href="#">Earth Score</a></li>
                <li><a href="#">Publish Ride</a></li>
                <li><a href="index.jsp">Home</a></li>
                <li><button id="login">Login/SignUp</button></li>
            </ul>

        </nav>
    </div>
    <section>
        <div class="signin">
            <h1>Create Your Account!</h1>
            <h3>Join our community and start sharing or borrowing vehicles today!</h3>
            <form action="#" id="registrationform" novalidate>
                <input type="text" placeholder="Enter your full name">
                <input type="text" placeholder="Enter your email">
                <input type="text" placeholder="Enter your phone number ">
                <input type="password" placeholder="Create a strong password">
                <input type="password" placeholder="Re-enter your password">
                <input type="text" placeholder="Enter your full address (optional)">
            </form>
            <div id="tnc">
                <input type="checkbox" id="terms">
                <span class="checkmark"></span>
                <p>By signing up, you agree to the <a>Terms of Service</a> and <a href="#">Privacy Policy</a>, including <a href="#">Cookie Use</a>.</p>
            </div>
            <button type="submit" class="button">Register Now</button>
            <p>Already have an account? <a href="signin.jsp">Login</a></p>

        </div>

    </section>

</body>
</html>
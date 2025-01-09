<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>EarthyWay</title>

<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.3/css/all.min.css"/>
    <link rel="stylesheet" href="css/style.css"/>
    
    <script src="javascript/script.js"></script>
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
                <li><a href="#">Home</a></li>
                <li><form action="UserServlet" method="post"><button id="login" name="regbt" value="1">Login/SignUp</button></form></li>
            </ul>

        </nav>
    </div>

    <section class="main">
        <div class="drivetxt">
            <h1>DRIVE CHANGE, <br>RIDE GREEN</h1>
            <p>Join our community to reduce emissions<br>
                and save resources by sharing vehicles.</p>
            <div class="btns">
                <button class="btn">List Your Vehicle</button>
                <button class="btn">Explore Vehicles</button>
            </div>
        </div>

        <div class="locationsetter">
            <form action="#">
                <input type="search" placeholder="Pickup Location">
                <input type="search" placeholder="Drop-Off Location">
                <input type="date" name="datetime" id="datetime" placeholder="Date">
                <button class="btn">Search</button>
            </form>
        </div>
    </section>

    <section class="note">
        <div class="links">
            <h1>Ready to get started?</h1>
            <h2>Sign up today to join our growing community of eco-conscious individuals.<br> 
                Share your vehicle, borrow when needed, and make a differenceâone ride at a time!</h2>
            <form action="UserServlet" method="post"><button class="btn" id="registerbt"  name="regbt" value="2">Register Now</button> </form>
            <p><a href="#">Copyright</a> | <a href="#">Privacy Policy</a> | <a href="#">Contact Support</a> | <a href="#">Contact Us</a></p>
        </div>

        <div class="footer">
            <a href="#">Terms & Conditions</a>
            <p>This site is designed by BinaryQuill. All Rights Reserved.</p>
            <h2>EarthyWay Â©</h2>
        </div>

    </section>
</body>
</html>
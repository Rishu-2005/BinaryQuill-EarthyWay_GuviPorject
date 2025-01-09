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
                <li><form action="LogoutServlet" method="get"><button id="logout" name="logoutbt" value="1">Logout <svg xmlns="http://www.w3.org/2000/svg" width="24" height="24" viewBox="0 0 6.35 6.35" id="logout">
  <path fill-rule="evenodd" d="M7.953.998a3.024 3.024 0 0 0-3.006 3.004V20a3.024 3.024 0 0 0 3.006 3.004h3.994A3.022 3.022 0 0 0 14.951 20v-4.002c0-1.334-2-1.334-2 0V20a.983.983 0 0 1-1.004 1.004H7.953A.983.983 0 0 1 6.95 20V4.002a.983.983 0 0 1 1.004-1.004h3.994a.983.983 0 0 1 1.004 1.004v4.002c0 1.334 2 1.334 2 0V4.002A3.022 3.022 0 0 0 11.947.998H7.953zM1.957 4.984a1 1 0 0 0-1.01 1.02v11.994a1 1 0 0 0 2 0V6.004a1 1 0 0 0-.982-1.02 1 1 0 0 0-.008 0zm16.037 2.004a1 1 0 0 0-.096.004 1 1 0 0 0-.6 1.713L19.595 11h-9.588a1.006 1.006 0 0 0-.104 0c-1.333.07-1.23 2.071.104 2.002h9.582l-2.29 2.287a1 1 0 1 0 1.411 1.418l4.002-4.002a1 1 0 0 0 0-1.41l-4.002-4a1 1 0 0 0-.715-.307z" color="#000" font-family="sans-serif" font-weight="400" overflow="visible" paint-order="stroke fill markers" style="line-height:normal;font-variant-ligatures:normal;font-variant-position:normal;font-variant-caps:normal;font-variant-numeric:normal;font-variant-alternates:normal;font-feature-settings:normal;text-indent:0;text-align:start;text-decoration-line:none;text-decoration-style:solid;text-decoration-color:#000;text-transform:none;text-orientation:mixed;shape-padding:0;isolation:auto;mix-blend-mode:normal" transform="scale(.26458)"></path>
</svg>
                
                <!-- <img alt="#" src="icons/logout.gif"></ --></button></form></li>
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
                <input type="number" value="1" name="numpassenger" id="numpass">
                <button class="btn">Search</button>
            </form>
        </div>
    </section>

    <section class="note">
        <div class="links">
            <p><a href="#">Copyright</a> | <a href="#">Privacy Policy</a> | <a href="#">Contact Support</a> | <a href="#">Contact Us</a></p>
        </div>

        <div class="footer">
            <a href="#">Terms & Conditions</a>
            <p>This site is designed by BinaryQuill. All Rights Reserved.</p>
            <h2>EarthyWay ©</h2>
        </div>

    </section>
</body>
</html>
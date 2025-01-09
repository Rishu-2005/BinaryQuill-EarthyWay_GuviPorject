# DOCUMENTATION

EarthyWay: Eco-Friendly Transport Sharing Platform


1.	Introduction

EarthyWay is an innovative transport-sharing platform designed to provide eco-friendly, cost-effective, and sustainable urban mobility solutions. By leveraging technology Earthyway offers a fleet of electric vehicles, including scooters, bikes, and cars, aimed at reducing carbon emissions and traffic congestion.


Key Features:

-	Cost Effciency: Lower transportion costs for users.

-	Convenience: Easy access to various transport options.

2.	Platform Architecture

System Design:

1.	A user-centric interface for route planning, vehicle booking and payments 

2.	Smart ride allocation and optimization to ensure minimal wait times.

3.	High availability and scalability to handle user data and transactions securely.
3.	Features and Functionalities

(a). User Features:

-	User registration, profile customization, and contact information .

-	Real-time vehicle availability and reservation.

 
-	Receives notifications and environmental impact updates.

-	Rides with others to reduce costs and emissions.


(b). Admin Features:

-	Collect Transport information like type, availability and locations.

-	Manage a log transport usage and sharing history for efficient management.

-	Provide an interface for admins to input and review transport details easily.



4.	Technology Stack

Front-End:

-	HTML,CSS and JavaScript.


Back-End:

-	Java Servlet and JDBC


Database:

-	MYSQL

Version Control:

-	Github


5.	Requirements
-	OS: Windows/MacOS/Linux
-	Application Server: Apache Tomcat 10.1 (supports Jakarta EE 10 for web application deployment).
-	Framework: Jakarta EE 6 (for server-side logic, servlets and JSPs).
-	Java Development Kit: JDK 21 (ensures compatibility with Jakarta EE).
-	Database: MySQL 9.1 (backend database for managing transport records and sharing history).

6.	User Journey

1.	Users create an account via the web portal.

2.	Use Location selector to find available vehicles nearby.


7.	FAQs and Troubleshooting

Common Questions:

1.	How can I schedule a ride ?
ans: first select your current location after that select destination location after select date when you want to ride and then no. of passengers  after that click confirm button. 

3.	Are rides insured?
ans: yes, your ride is insured.

Troubleshooting:

1. Error: Port Already in Use
   
-	Description: When starting Tomcat, you may receive an error indicating that the port is already in use.

Solution:

-	Check if another application is using the same port by running netstat -na | find "8080

-	Stop the application using the port or change the port number in the server.xml file located in the conf directory of your Tomcat installation.


2. Error: 404 Not Found

-	Description: After deploying a web application, accessing it via a browser results in a 404 error.

   Solution:

-	Ensure that the application is deployed in the correct webapps directory.

-	Check the URL being accessed and verify that it matches the deployed application's context path.

-	Review the catalina.out log for deployment errors.



8.	Future Roadmap

-	Expansion to new cities and regions.

-	Integration of autonomous electric vehicles.

-	Enhanced AI features for better route planning and fleet optimization.

-	Development of solar-powered charging docks.

9.	Contact Us

Support Email: 
Website: 

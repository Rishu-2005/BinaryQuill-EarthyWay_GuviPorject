//package com.controller;
//
//import java.io.IOException;
//import java.sql.Date;
//import com.database.dao.*;
//import com.database.model.*;
//import jakarta.servlet.ServletException;
//import jakarta.servlet.annotation.WebServlet;
//import jakarta.servlet.http.HttpServlet;
//import jakarta.servlet.http.HttpServletRequest;
//import jakarta.servlet.http.HttpServletResponse;
//
//import java.sql.*;
//
//@WebServlet("/UserRegServlet")
//public class UserRegServlet extends HttpServlet {
//    
//
//    private AccountDAO userDAO;
//
//    public void init() {
//        userDAO = new AccountDAO();
//    }
//    
//    protected void doGet(HttpServlet request, HttpServlet respone) throws ServletException, IOException {
//    	
//		
//	}
//
//    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//    	doGet(request, response);
//    	String fullName = request.getParameter("fullName");
//        String email = request.getParameter("email");
//        long phone = Long.parseLong(request.getParameter("phone"));
//        Date dob = Date.valueOf(request.getParameter("dob"));
//        String passwd = request.getParameter("passwd");
//        String registerbt = request.getParameter("registerbt");
//        
//        String[] nameParts = fullName.split("\\s+"); String firstname = nameParts[0]; String midname = nameParts.length == 3 ? nameParts[1] : ""; String lastname = nameParts.length == 3 ? nameParts[2] : nameParts.length == 2 ? nameParts[1] : "";
//        
//
//        boolean isUserCreated = false;
//		isUserCreated = userDAO.createUser(firstname, midname, lastname, email, phone, dob, passwd);
//
//        if (isUserCreated || registerbt.equals("register")) {
//            response.sendRedirect("signin.jsp");
//        } else {
//            request.setAttribute("errorMessage", "Failed to create account. Please try again.");
//            request.getRequestDispatcher("register.jsp").forward(request, response);
//        }
//    }
//}


package com.controller;

import java.io.IOException;
import java.sql.Date;
import com.database.dao.AccountDAO;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/UserRegServlet")
public class UserRegServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    private AccountDAO userDAO;

    public void init() {
        userDAO = new AccountDAO();
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String fullName = request.getParameter("fullName");
        String email = request.getParameter("email");
        long phone = Long.parseLong(request.getParameter("phone"));
        Date dob = Date.valueOf(request.getParameter("dob"));
        String passwd = request.getParameter("passwd");

        // Split the full name into first name, middle name, and last name
        String[] nameParts = fullName.split("\\s+");
        String firstname = nameParts[0];
        String midname = nameParts.length == 3 ? nameParts[1] : "";
        String lastname = nameParts.length == 3 ? nameParts[2] : nameParts.length == 2 ? nameParts[1] : "";

        System.out.println("Full Name: " + fullName);
        System.out.println("First Name: " + firstname);
        System.out.println("Middle Name: " + midname);
        System.out.println("Last Name: " + lastname);

        boolean isUserCreated = userDAO.createUser(firstname, midname, lastname, email, phone, dob, passwd);

        if (isUserCreated) {
            System.out.println("User created successfully.");
            response.sendRedirect("registerSuccess.jsp");
        } else {
            System.out.println("Failed to create user.");
            request.setAttribute("errorMessage", "Failed to create account. Please try again.");
            request.getRequestDispatcher("register.jsp").forward(request, response);
        }
    }
}


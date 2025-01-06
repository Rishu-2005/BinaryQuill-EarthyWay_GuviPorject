package com.controller;

import java.io.IOException;
import java.sql.Date;
import com.database.dao.*;
import com.database.model.*;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.sql.*;

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
        
        String[] nameParts = fullName.split("\\s+"); String firstname = nameParts[0]; String midname = nameParts.length == 3 ? nameParts[1] : ""; String lastname = nameParts.length == 3 ? nameParts[2] : nameParts.length == 2 ? nameParts[1] : "";
        

        boolean isUserCreated = false;
		isUserCreated = userDAO.createUser(firstname, midname, lastname, email, phone, dob, passwd);

        if (isUserCreated) {
            response.sendRedirect("signin.jsp");
        } else {
            request.setAttribute("errorMessage", "Failed to create account. Please try again.");
            request.getRequestDispatcher("register.jsp").forward(request, response);
        }
    }
}

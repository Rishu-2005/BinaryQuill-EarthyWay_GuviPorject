package com.controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import java.sql.*;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
        String username = request.getParameter("email");
        String password = request.getParameter("password");
        
        try {
        	Class.forName("com.mysql.cj.jdbc.Driver");
        	Connection conn = null;
        }catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

        try (
        		
        		Connection conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/EarthyWay","root","");) {
        	
            String sql = "SELECT * FROM users WHERE email = ? AND passwd = ?";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, username);
            stmt.setString(2, password);

            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                // Login successful
                HttpSession session = request.getSession();
                session.setAttribute("username", username);
                response.sendRedirect("homepage.jsp");
            } else {
                // Login failed
                request.setAttribute("error", "Invalid username or password.");
                request.getRequestDispatcher("signin.jsp").forward(request, response);
            }
        } catch (SQLException e) {
            e.printStackTrace();
            request.setAttribute("error", "Database error occurred.");
            request.getRequestDispatcher("signin.jsp").forward(request, response);
        }
    }
}
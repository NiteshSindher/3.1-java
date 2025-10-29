package com.example;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class LoginServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        // Get user credentials
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        // Simple login validation
        if ("admin".equals(username) && "12345".equals(password)) {
            request.setAttribute("user", username);
            RequestDispatcher rd = request.getRequestDispatcher("welcome.jsp");
            rd.forward(request, response);
        } else {
            out.println("<h3>Invalid username or password!</h3>");
            out.println("<a href='login.html'>Try Again</a>");
        }
    }
}

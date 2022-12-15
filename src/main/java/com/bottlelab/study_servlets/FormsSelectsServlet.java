package com.bottlelab.study_servlets;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/formsSelectsServlet")
public class FormsSelectsServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter printWriter = resp.getWriter();
        printWriter.println("<html lang='en'>");
        printWriter.println("<head>");
        printWriter.println("<title>Document</title>");
        printWriter.println("<link href='https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css' rel='stylesheet' />");
        printWriter.println("<link rel='stylesheet' href='./css/common.css' />");
        printWriter.println("</head>");
        printWriter.println("<body>");
        printWriter.println("<div class='fs-3'>form selects</div>");
        printWriter.println("<div>");
        printWriter.println("<select class='form-select' aria-label=''>");
        printWriter.println("<option selected>Open this select menu</option>");
        printWriter.println("<option value='M01'>One</option>");
        printWriter.println("<option value='M02'>Two</option>");
        printWriter.println("<option value='M03'>Three</option>");
        printWriter.println("</select>");
        printWriter.println("</div>");
        printWriter.println("<script src='https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js'");
        printWriter.println("integrity='sha384-kenU1KFdBIe4zVF0s0G1M5b4hcpxyD9F7jL+jjXkk+Q2h455rYXK/7HAuoJl+0I4'");
        printWriter.println("crossorigin='anonymous'></script>");
        printWriter.println("</body>");
        printWriter.println("</html>");
        printWriter.close();
    }
}

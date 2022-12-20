package com.bottlelab.study_servlets.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/cookies/createSurvlets")
public class CreateCookieSurvlets extends HttpServlet {
     @Override
     protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        resp.setContentType("text/html;charset=UTF-8");
        PrintWriter printWriter = resp.getWriter();
        //Cookie
        Cookie cookie_first = new Cookie("firstName", "Park");
        Cookie cookie_second = new Cookie("secondName", "bottle");
        resp.addCookie(cookie_first);
        resp.addCookie(cookie_second);



        printWriter.println("<div>CreateCokieSurvlets</div>");
        printWriter.close();
     }
}

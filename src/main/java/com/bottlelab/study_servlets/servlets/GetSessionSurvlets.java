package com.bottlelab.study_servlets.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

// /session/getSessionSurvlets?username=bottlepark&password=1234
@WebServlet(urlPatterns = "/session/getSessionSurvlets")
public class GetSessionSurvlets extends HttpServlet {
   @Override
   protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
      //브라우저를 끄기 전까지 세션은 남아있음
        
      
      //display
      resp.setContentType("text/html;charset=UTF-8");
      PrintWriter printWriter = resp.getWriter();
      printWriter.println("<div>GetSessionSurvlets</div>");

      HttpSession httpSession = req.getSession();
      String username = (String)httpSession.getAttribute("username");
      String password = (String)httpSession.getAttribute("password");

      printWriter.println("<div>"+username+", "+password+"</div>");
      printWriter.close();
     }
}

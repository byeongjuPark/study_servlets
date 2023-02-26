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

// /session/createSessionSurvlets?username=bottlepark&password=1234
@WebServlet(urlPatterns = "/session/createSurvlets")
public class CreateSessionSurvlets extends HttpServlet {
   @Override
   protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        
      
      String username = req.getParameter("username");
      String password = req.getParameter("password");
      //display
      resp.setContentType("text/html;charset=UTF-8");
      PrintWriter printWriter = resp.getWriter();
      printWriter.println("<div>CreateSessionSurvlets</div>");


      //login
      if("bottlepark".equals(username) && "1234".equals(password)){
         HttpSession httpSession = req.getSession();
         httpSession.setAttribute("username", username);
         httpSession.setAttribute("password", password);
         printWriter.println("<div>"+username+", "+password+"</div>");
      }else{
         //Login fail
         printWriter.println("<div>Failed</div>");
      }
      printWriter.close();
   }

   @Override
   protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
      // TODO Auto-generated method stub
      this.doGet(req, resp);
   }
}

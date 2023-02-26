package com.bottlelab.study_servlets.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import org.springframework.web.client.HttpServerErrorException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

// /session/createSessionJSPSurvlets?username=bottlepark&password=1234
@WebServlet(urlPatterns = "/session/createSessionJSPSurvlets")
public class CreateSessionJSPSurvlets extends HttpServlet {
   @Override
   protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

      response.setContentType("text/html;charset=UTF-8");
      
      String username = request.getParameter("username");
      String password = request.getParameter("password");
      //display
      String path = null;
      //login
      // HttpSession httpSession_true = request.getSession();
      // HttpSession 
      //
      HttpSession httpSession = null;
      if("bottlepark".equals(username) && "1234".equals(password)){
         // login
         httpSession = request.getSession(false);
         if(httpSession == null){
            httpSession = request.getSession();
            httpSession.setAttribute("username", username);
            httpSession.setAttribute("password", password);
         }

         System.out.println(httpSession.getAttribute("username"));
         System.out.println(httpSession.getId());

         path = "/session/checkLogin.jsp";
         
      }else{
         //Logout
         httpSession = request.getSession(false);
         if(httpSession != null){
            httpSession.invalidate(); //세션값 없앰
         }
         // System.out.println(httpSession.getAttribute("username"));
         // System.out.println(httpSession.getId());
         path = "/session/checkLogout.jsp";
      }
      RequestDispatcher requestDispatcher = request.getRequestDispatcher(path);
      requestDispatcher.forward(request, response);

   }
}

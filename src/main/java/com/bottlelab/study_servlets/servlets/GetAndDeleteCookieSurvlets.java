package com.bottlelab.study_servlets.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/cookies/getAndDeleteSurvlets")
public class GetAndDeleteCookieSurvlets extends HttpServlet {
     @Override
     protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

         resp.setContentType("text/html;charset=UTF-8");
         PrintWriter printWriter = resp.getWriter();
 
         printWriter.println("<div>GetAndDeleteCookieSurvlets</div>");

         //쿠키 조회
         Cookie cookies[] = req.getCookies(); //arraylist 형식으로 들어옴
         for(Cookie cookie : cookies){
            String name = cookie.getName();
            String value = cookie.getValue();
            printWriter.println("<div>Cookie Name ; "+name+", value : "+value+"</div>");

            //쿠키 삭제
            if(name.equals("secondName")){
               cookie.setMaxAge(0);
               resp.addCookie(cookie);
            }
         }
         printWriter.close();
     }
}

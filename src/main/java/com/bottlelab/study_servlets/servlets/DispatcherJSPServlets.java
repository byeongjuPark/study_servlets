package com.bottlelab.study_servlets.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

//파일경로를 가리기 위한 별칭 매칭
@WebServlet(urlPatterns="/dispatcherJSPServlets")
public class DispatcherJSPServlets extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{
        String hiddenmParam = request.getParameter("hiddenParam");

    
            request.setAttribute("firstName", "bottlepark");
            RequestDispatcher reqDispatcher = request.getRequestDispatcher("/search_form.jsp");
            reqDispatcher.forward(request, response);
       
    }
}

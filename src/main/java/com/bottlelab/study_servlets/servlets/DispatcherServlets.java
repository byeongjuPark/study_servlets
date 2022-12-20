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
@WebServlet(urlPatterns="/dispatcherServlets")
public class DispatcherServlets extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{
        String hiddenmParam = request.getParameter("hiddenParam");

        // /dispatcherServlets?hiddenParam=helloWorldServlets
        // /dispatcherServlets?hiddenParam=createSurvlets
        if("helloWorldServlets".equals(hiddenmParam)){
            response.sendRedirect("/helloWorldServlets");
        }else if("createSurvlets".equals(hiddenmParam)){
            //값이 전달되어 경로로 이동한다.
            request.setAttribute("firstName", "bottlepark");
            RequestDispatcher reqDispatcher = request.getRequestDispatcher("/cookies/createSurvlets");
            reqDispatcher.forward(request, response);
            //req.getAttribute("firstName") -> 파라메터가 아님...
        } else {
            // normal display
            PrintWriter printWriter = response.getWriter();
            String message ="DispatcherServlets! with message";

            printWriter.println("<html lang='en'>");
            printWriter.println("<head>");
            printWriter.println("<title>HelloWorldServlets");
            printWriter.println("</title>");
            printWriter.println("</head>");
            printWriter.println("<body>");
            printWriter.println("<botton>call DispatcherServlets</botton>");
            printWriter.println("</div>");
            printWriter.println("</body>");
            printWriter.println("</html>");
            
            printWriter.close();
        }
       
    }
}

package com.bottlelab.study_servlets.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;

import com.bottlelab.beans.MemberBean;
import com.bottlelab.study_servlets.DatasInfor;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/tableBeanListServlet")
public class TableBeanListServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

        // DatasInfor datasInfor = new DatasInfor();

        DatasInfor datasInfo = new DatasInfor();
        MemberBean memberBean = datasInfo.getDataToMemberBean();
        ArrayList<String> tableListWithString = datasInfo.getTableListWithString();
        HashMap<String, Object> bundleData = datasInfo.getBundleData();

        PrintWriter printWriter = response.getWriter();

        HashMap<String, String> searchForm = datasInfo.getSearchFormData();
        printWriter.println("<html lang='en'>");
        printWriter.println("<head>");
        printWriter.println("<title>"+searchForm.get("search_key")+"</title>");
        printWriter.println("<link href='https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css' rel='stylesheet' />");
        printWriter.println("<link rel='stylesheet' href='./css/common.css' />");
        printWriter.println("</head>");
        printWriter.println("<body>");
        printWriter.println("<div class='fs-4'>"+memberBean.getFirstName() 
        + " " + memberBean.getSecondName()
        + " " + memberBean.getHandleName()+"</div>");
        printWriter.println("<table>");

        for(int i = 0; i<tableListWithString.size();i++){
            printWriter.println("<tr>");
            printWriter.println("<th>"+(i+1)+"</th>");
            String handle = tableListWithString.get(i);
            printWriter.println("<th>"+handle+"</th>");
            printWriter.println("<tr>");
        }
        printWriter.println("</table>");


        printWriter.println("<script src='https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js'");
        printWriter.println("integrity='sha384-kenU1KFdBIe4zVF0s0G1M5b4hcpxyD9F7jL+jjXkk+Q2h455rYXK/7HAuoJl+0I4'");
        printWriter.println("crossorigin='anonymous'></script>");
        printWriter.println("</body>");
        printWriter.println("</html>");

        printWriter.close();
    }
    
}

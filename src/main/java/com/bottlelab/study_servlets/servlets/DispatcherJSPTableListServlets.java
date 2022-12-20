package com.bottlelab.study_servlets.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;

import com.bottlelab.study_servlets.DatasInfor;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

//파일경로를 가리기 위한 별칭 매칭
@WebServlet(urlPatterns="/dispatcherJSPTableListServlets")
public class DispatcherJSPTableListServlets extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{
        response.setContentType("text/html;charset=UTF-8");
        DatasInfor dataInfo = new DatasInfor();
        ArrayList<String> tablesListWithString = dataInfo.getTableListWithString();
        HashMap<String, String> searchForm = dataInfo.getSearchFormData();
        request.setAttribute("tablesListWithString", tablesListWithString);
        request.setAttribute("searchForm", searchForm);

        RequestDispatcher reqDispatcher = request.getRequestDispatcher("/tables_list.jsp");
        reqDispatcher.forward(request, response);
        
       
    }
}

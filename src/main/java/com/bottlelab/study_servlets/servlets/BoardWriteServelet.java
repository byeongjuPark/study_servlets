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
@WebServlet(urlPatterns = "/boardWriteServelet")
public class BoardWriteServelet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        resp.setContentType("text/html;charset=UTF-8");
        PrintWriter pw = resp.getWriter();
      
        pw.println("<form action='<%= request.getContextPath() %>/board/boardInsert' method='post'>");
        pw.println("<table>");
        pw.println("<tr><td>제목</td>");
        pw.println("<td><input type='text' name='boardTitle​​'></td></tr>");
        pw.println("<tr><td>작성자</td>");
        pw.println("<td><input type='text' name='boardWriter​'></td></tr>");
        pw.println("<tr><td>내용</td>");
        pw.println("<td><textarea cols='50' rows='7' name='boardContent​'></textarea></td></tr>");
        pw.println("<tr><td colspan='2'>");
        pw.println("<input type='submit' value='등록하기'>");
        pw.println("<a href='/board/boardList'>목록으로</a></td></tr>");
        pw.println("</table>");
        pw.println("</form>");
   }
}

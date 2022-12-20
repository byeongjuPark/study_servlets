package com.bottlelab.study_servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/pollListServlet")
public class PollListServlet extends HttpServlet{
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=UTF-8");
        Data data = new Data();
        HashMap<String, String> userInfo = data.getUserInfo();
        HashMap<String, String> questionsData = data.getQuestions();
        HashMap<String, String> AnswersData = data.getAnswers();
        HashMap<String, ArrayList> setQuestion = data.getSettingQuestion();
        PrintWriter printWriter = resp.getWriter();


        printWriter.println("<html lang='en'>");
        printWriter.println("<head>");
        printWriter.println("<title>title</title>");
        printWriter.println("<link href='https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css' rel='stylesheet' />");
        printWriter.println("<link rel='stylesheet' href='./css/common.css' />");
        printWriter.println("</head>");
        printWriter.println("<body>");
        printWriter.println("<div class='container'>");
        printWriter.println("<div class='fs-4'>"+
                            "이름 : "+
                            userInfo.get("name")+"    "+
                            "소속 : "+
                            userInfo.get("belong")+
                            "</div>");

        // todo
        for(int i=0; i<questionsData.size();i++){
            printWriter.println("<div class=''>"+(i+1)+". "+ questionsData.get("Q"+(i+1)) +"</div>");
            ArrayList<String> tempArray = setQuestion.get("Q"+(i+1));
            for(int k=0; k<tempArray.size();k++){
                printWriter.println("<div class='form-check'><input name='Q+"+(i+1)+"' type='radio'>"+AnswersData.get(tempArray.get(k))+"</div>");
            }
        }

        printWriter.println("</div>");
        printWriter.println("<script src='https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js'");
        printWriter.println("integrity='sha384-kenU1KFdBIe4zVF0s0G1M5b4hcpxyD9F7jL+jjXkk+Q2h455rYXK/7HAuoJl+0I4'");
        printWriter.println("crossorigin='anonymous'></script>");
        printWriter.println("</body>");
        printWriter.println("</html>");

        printWriter.close();
    }
}

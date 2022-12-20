package com.bottlelab.study_servlets;

import java.util.ArrayList;
import java.util.HashMap;

public class Data {

    public HashMap<String, String> getUserInfo(){
        HashMap<String, String> user = new HashMap<>();
        user.put("name","박병주");
        user.put("belong","kh.");
        
        return user;
    }
    public HashMap<String, String> getQuestions(){
        HashMap<String, String> questionsData = new HashMap<>();
        questionsData.put("Q1","해당 매장을 방문시 매장은 청결 하였습니까?");
        questionsData.put("Q2","주문시 직원은 고객님께 친절 하였습니까?");
        questionsData.put("Q3","주문하신 음료가 나오기까지 시간이 적당하였습니까?");
        questionsData.put("Q4","해당 매장을 다음에도 재방문 하실 의향이 있으십니까?");
        questionsData.put("Q5","직원이 제조한 음료에 대해 맛은 좋았습니까?");
        return questionsData;
    }

    public HashMap<String, String> getAnswers(){
        HashMap<String, String> AnswersData = new HashMap<>();
        AnswersData.put("E1","전혀 아니다.");
        AnswersData.put("E2","아니다.");
        AnswersData.put("E3","보통이다.");
        AnswersData.put("E4","그렇다.");
        AnswersData.put("E5","매우 그렇다.");
        return AnswersData;
    }
    //hashmap은 키값의 중복이 불가...
    //HashMap <String, ArrayList> 으로 바꿔 
    //한개의 키값에 여러값을 묶어주자...

    public HashMap<String, ArrayList> getSettingQuestion(){
        HashMap<String, ArrayList> setQuestion = new HashMap<>();
        ArrayList<String> answer1 = new ArrayList<>();
        ArrayList<String> answer2 = new ArrayList<>();
        ArrayList<String> answer3 = new ArrayList<>();
        ArrayList<String> answer4 = new ArrayList<>();
        ArrayList<String> answer5 = new ArrayList<>();

        answer1.add("E1");
        answer2.add("E1");
        answer2.add("E2");
        answer3.add("E1");
        answer3.add("E2");
        answer3.add("E3");
        answer4.add("E1");
        answer4.add("E2");
        answer4.add("E3");
        answer4.add("E4");
        answer5.add("E1");
        answer5.add("E2");
        answer5.add("E3");
        answer5.add("E4");
        answer5.add("E5");

        setQuestion.put("Q1",answer2);
        setQuestion.put("Q2",answer3);
        setQuestion.put("Q3",answer2);
        setQuestion.put("Q4",answer5);
        setQuestion.put("Q5",answer3);
        return setQuestion;
    }
    
}

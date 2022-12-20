package com.bottlelab.study_servlets;

import java.util.ArrayList;
import java.util.HashMap;

import com.bottlelab.beans.MemberBean;


public class DatasInfor {
    public HashMap<String, String> getSearchFormData(){
        HashMap<String, String> searchForm = new HashMap<String, String>();
        searchForm.put("search_key", "Search Title");
        searchForm.put("name", "박병주");
        searchForm.put("id", "ID0001");
        return searchForm;
    }

    public ArrayList<String> getTableListWithString(){
        ArrayList<String> tableListWithString = new ArrayList<String>();
        tableListWithString.add("@mdo");
        tableListWithString.add("@fat");
        tableListWithString.add("@twitter");


        return tableListWithString;
    }

    public HashMap<String, Object> getBundleData(){
        DatasInfor datasInfor = new DatasInfor();
        HashMap<String, String> searchForm = new DatasInfor().getSearchFormData();
        ArrayList<String> tableListWithString = new DatasInfor().getTableListWithString();
        

        HashMap<String, Object> bundlesData = new HashMap<>();
        bundlesData.put("searchForm", searchForm);
        bundlesData.put("tableListWithString", tableListWithString);
        
        bundlesData.put("dataWithMemberBean", datasInfor.getDataListWithMemberBean());
        bundlesData.put("dataListWithMemberBean", datasInfor.getDataListWithMemberBean());


        return bundlesData;
    }

    public MemberBean getDataToMemberBean(){
        MemberBean memberBean = new MemberBean();
        memberBean.setFirstName("Mark");
        memberBean.setSecondName("Otto");
        memberBean.setHandleName("@mdo");

        return memberBean;
    }

    public ArrayList<MemberBean> getDataListWithMemberBean(){
        ArrayList<MemberBean>  membersList = new ArrayList<>();
        MemberBean memberBean = new MemberBean();
        memberBean.setFirstName("Mark");
        memberBean.setSecondName("Otto");
        memberBean.setHandleName("@mdo");
        membersList.add(memberBean);

        MemberBean memberBean02 = new MemberBean();
        memberBean02.setFirstName("Jacob");
        memberBean02.setSecondName("Thornton");
        memberBean02.setHandleName("@fat");
        membersList.add(memberBean02);
        return membersList;
}
} 
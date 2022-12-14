package com.bottlelab.study_servlets;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@ServletComponentScan
@SpringBootApplication
public class StudyServletsApplication {

	public static void main(String[] args) {
		System.out.println("메인 언제 실행 되는지 보자");

		SpringApplication.run(StudyServletsApplication.class, args);
	}

}

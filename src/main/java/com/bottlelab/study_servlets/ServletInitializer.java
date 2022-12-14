package com.bottlelab.study_servlets;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

public class ServletInitializer extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		System.out.println(" 언제 실행 되는지 보자");
		return application.sources(StudyServletsApplication.class);
	}

}

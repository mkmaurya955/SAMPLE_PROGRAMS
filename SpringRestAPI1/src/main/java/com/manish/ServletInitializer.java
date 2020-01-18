package com.manish;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

//import com.manish.config.HttpSessionConfig;

public class ServletInitializer extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(SpringRestApi1Application.class);
	}
	
//	protected Class<?>[] getRootConfigClasses() {
//		return new Class[] { config.class, HttpSessionConfig.class };
//	}

}

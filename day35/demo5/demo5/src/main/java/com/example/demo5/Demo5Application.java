package com.example.demo5;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Demo5Application {

	public static void main(String[] args) {
//		SpringApplication.run(Demo5Application.class, args);
		ApplicationContext context;
		context = SpringApplication.run(Demo5Application.class, args);
		
		StudentDetails st;
		st=context.getBean(StudentDetails.class);
		st.setdata();
		st.shodata();
	}

}

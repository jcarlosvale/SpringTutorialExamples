package com.in28minutes.spring.basics.springin5steps;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringIn5StepsApplication {

	public static void main(String[] args) {
//		BinarySeachImpl binarySeachImpl = new BinarySeachImpl(new QuickSortAlgorithm());
		
		//Application Context
		ApplicationContext applicationContext = SpringApplication.run(SpringIn5StepsApplication.class, args);
		BinarySeachImpl binarySeach = applicationContext.getBean(BinarySeachImpl.class);
		int result = binarySeach.binarySearch(new int[] {12, 4,6}, 3);
		System.out.println(result);

	}
}

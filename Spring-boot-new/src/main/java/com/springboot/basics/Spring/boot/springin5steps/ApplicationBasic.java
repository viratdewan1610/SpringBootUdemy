package com.springboot.basics.Spring.boot.springin5steps;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.springboot.basics.Spring.boot.springin5steps.basic.BinarySearchImpl;

@SpringBootApplication
public class ApplicationBasic {

	public static void main(String[] args) {
		//BinarySearchImpl binarySearch = new BinarySearchImpl(new QuickSort());
		
		
		ConfigurableApplicationContext applicationContext = SpringApplication.run(ApplicationBasic.class, args);
		
		BinarySearchImpl binarySearch = applicationContext.getBean(BinarySearchImpl.class);
		BinarySearchImpl binarySearch1 = applicationContext.getBean(BinarySearchImpl.class);
		
		System.out.println(binarySearch);
		System.out.println(binarySearch1);
		
		int result = binarySearch.binarySearch(new int [] {12, 4, 6}, 3);
		System.out.println(result);
		//com.springboot.basics.Spring.boot.BubbleSort@7db534f2
	}

}

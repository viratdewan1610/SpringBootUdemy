package com.springboot.basics.Spring.boot.springin5steps;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.springboot.basics.Spring.boot.springin5steps.cdi.SomeCDIBusiness;
import com.springboot.basics.Spring.boot.springin5steps.scope.PersonDAO;

@SpringBootApplication
public class ApplicationCDI {
	private static Logger LOGGER = LoggerFactory.getLogger(ApplicationCDI.class);

	public static void main(String[] args) {
		//BinarySearchImpl binarySearch = new BinarySearchImpl(new QuickSort());
		
		
		
		ConfigurableApplicationContext applicationContext = SpringApplication.run(ApplicationCDI.class, args);
		
		SomeCDIBusiness business = applicationContext.getBean(SomeCDIBusiness.class);
		
		LOGGER.info("{}", business);
		
	}

}

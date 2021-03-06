package com.springboot.basics.Spring.boot.springin5steps;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.springboot.basics.Spring.boot.componentScan.ComponentDAO;
import com.springboot.basics.Spring.boot.springin5steps.scope.PersonDAO;

@SpringBootApplication
@ComponentScan("com.springboot.basics.Spring.boot.componentScan")
public class ApplicationComponentScan {
	private static Logger LOGGER = LoggerFactory.getLogger(ApplicationComponentScan.class);

	public static void main(String[] args) {
		//BinarySearchImpl binarySearch = new BinarySearchImpl(new QuickSort());
		
		
		
		ConfigurableApplicationContext applicationContext = SpringApplication.run(ApplicationComponentScan.class, args);
		
		ComponentDAO componentDAO = applicationContext.getBean(ComponentDAO.class);
		
		
		LOGGER.info("{}", componentDAO);
		LOGGER.info("{}", componentDAO.getComponentJdbcConnection());
		
	}

}

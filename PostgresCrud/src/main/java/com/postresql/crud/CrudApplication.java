package com.postresql.crud;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CrudApplication {
	static Logger logger = LoggerFactory.getLogger(CrudApplication.class);	
	public static void main(String[] args) {
		System.out.println("System out ");
		logger.info("Logger started {}","Now");
		SpringApplication.run(CrudApplication.class, args);
	}

}

package com.sagar.vogaldas.java.practice;

import ch.qos.logback.core.net.SyslogOutputStream;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PracticeApplication {

	public static void main(String[] args) {
		System.out.println("Starting up practice application...");
		SpringApplication.run(PracticeApplication.class, args);
	}

}

package com.alinesno.student.learn.demo.alinesnostudentdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class AlinesnoStudentDemoApplication {

	@GetMapping("/hello")
	public String hello(String name){
		return "hello , " + name ; 
	}

	public static void main(String[] args) {
		SpringApplication.run(AlinesnoStudentDemoApplication.class, args);
	}

}

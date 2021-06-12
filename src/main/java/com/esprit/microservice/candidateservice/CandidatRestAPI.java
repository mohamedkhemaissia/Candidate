package com.esprit.microservice.candidateservice;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CandidatRestAPI {
	private String title="Hello,Im the candidate Microservice";
	
	 @RequestMapping("/hello")
	 public String sayHello() {
		 System.out.println(title);
		 return title;
	 }

}

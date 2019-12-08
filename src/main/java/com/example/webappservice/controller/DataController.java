package com.example.webappservice.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DataController {
	
	@GetMapping("/data")
	public Student getData()
	{
		Student s =new Student("harsh");
	 System.out.println("in the API call is succesful");	
	 return s;
	}

}

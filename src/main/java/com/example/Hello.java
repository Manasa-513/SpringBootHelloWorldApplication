package com.example;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello 
{
	@GetMapping("/msg")
public String helloworld()
{
	return "hello spring boot";
}
	@GetMapping("/date")
	public LocalDate displayDate()
	{
		LocalDate d=LocalDate.now();
		return d;
	}
	@GetMapping("/dformat")
	public String display()
	{
		LocalDate d1=LocalDate.now();
		DateTimeFormatter d2=DateTimeFormatter.ofPattern("dd-MM-yyyy");
		String s=d1.format(d2);
		return s;
	}
	
}

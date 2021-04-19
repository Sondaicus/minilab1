package com.example.minilab1;



import controllers.MainController;
import models.Kompis;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



@SpringBootApplication
public class Minilab1Application
{
	public static void main(String[] args)
	{
		SpringApplication.run(Minilab1Application.class, args);
	//	aaa();
		
		
	}
	
	
	public static void aaa()
	{
		String
		name = "a1" ,
		email = "a1@a1.a1";
		
		Long
		telephoneNumber = 11111L;
		
		
		
		Kompis a1 = new Kompis(name, email, telephoneNumber);
		MainController n = new MainController();
		
		
		n.addNewKompis(name, email, telephoneNumber);
		
	}
	

	
}
package com.in28minutes.learnspringframework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
// record features:
//Eliminate Verbosity in creating Java Beans
// Public accessor methods , constructor , 
// equals , hascode and toString are automatically created.
// Release in JDK 16;
record Person(String name , int age , Address address) {};
record Address(String firstLine , String city) {};

@Configuration
public class HelloWorldconfiguration {
	@Bean
	public String name () {
		return "Uvesh Ahmad";
	}
	@Bean
	public int age () {
		return 23;
	}
	
	 
	@Bean
	public Person  person () {
		 var person= new Person("Ashab" , 14 , new Address(" Rawli" , "Road"));
		 // person.name  also available getter setter method through record
		 //person.age    also available getter setter method through record
		 return person;
	}
	
	@Bean  // 1st method
	public Person Person2MethodCall() {  // relate the independent Beans into a single Beans
		return new Person (name() , age() , address()); // name , age 
	}
	
	@Bean // 2nd Method
	public Person Person3Parameters(String name , int age , Address address2) {
		// name , age , address2;
	return new Person(name , age , address2);
	}
	
	
	@Bean(name="address2")
	public Address address () {
		  return new Address("Aryanagar" , "Muradnagar");
	}
	
 
	


}

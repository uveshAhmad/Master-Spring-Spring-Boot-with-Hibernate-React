package com.in28minutes.learnspringframework;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class App02HelloWorldSpring {
	public static void main(String[] args) {
  
		//1: launch a spring Context(application)
	var context = 
			new AnnotationConfigApplicationContext(HelloWorldconfiguration.class);
		
	    //2: configure the things that we want to Spring manage - @Configuration
	   //helloWorldConfiguration -@Configuration
	   //name -@Bean
	
	  // 3: Retrieving Beans managed by Spring 
	  System.out.println(context.getBean("name"));
	  System.out.println(context.getBean("age"));
	  System.out.println(context.getBean("person"));
	  // automatically give output toString :-> Person[name=Ashab, age=14]
	  
	  System.out.println(context.getBean("Person2MethodCall"));
	  System.out.println(context.getBean("Person3Parameters"));
	  System.out.println(context.getBean("address2"));
	  
	  System.out.println(context.getBean(Address.class)); //alternate
	  
//		How can I list all beans managed by
//		Spring Framework?
	  Arrays.stream(context.getBeanDefinitionNames());
		 
	  
	  
        
	}

}

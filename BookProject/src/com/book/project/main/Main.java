package com.book.project.main;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.book.project.Student;

public class Main{
public static void main(String[] args) {
	String config_location="/com/book/resource/applicationContext.xml";
	ApplicationContext context=new ClassPathXmlApplicationContext(config_location);
	Student std=(Student) context.getBean("stdId");
	std.display();
	
}
}

package newproject.SpringCore.standalone;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("/newproject/SpringCore/standalone/standaloneconfig.xml");
		Person person1=context.getBean("p1",Person.class);
		System.out.println(person1);
		System.out.println(person1.getFriend().getClass().getName());
		System.out.println("------------------------------------------");
		System.out.println(person1.getCoursesfess());
		System.out.println(person1.getCoursesfess().getClass().getName());
		
	}
}

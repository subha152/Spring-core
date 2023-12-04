package newproject.SpringCore.Autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("/newproject/SpringCore/Autowire/autoconfig.xml");
		Emp p1 =(Emp) context.getBean("Emp1");
		System.out.println(p1);
	}

}

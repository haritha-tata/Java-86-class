package co.edureka.spring.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		//initialize spring container (IoC)
		ApplicationContext context = new ClassPathXmlApplicationContext("user-beans.xml");
		
		System.out.println("----------------------------------------------------------");
		System.out.println("No of beans configured = " + context.getBeanDefinitionCount());
		System.out.println("----------------------------------------------------------");
		
		System.out.println("BEAN NAMES =>");
		String[] beanNames = context.getBeanDefinitionNames();
		for(String beanName : beanNames) {
			System.out.println("----> " + beanName);
		}
	}
}



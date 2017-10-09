package io.javabrains.learningspringcore.chapters12;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingApp {
	
	public static void main(String[] args) {
		try (ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("chapters12/spring.xml")) {
			Triangle triangle = (Triangle) context.getBean("triangle");
			System.out.println("Drawing traingle with triangle instance at "+ triangle);
			triangle.draw();
			
			Triangle triangle2 = (Triangle) context.getBean("triangle");
			System.out.println("Drawing traingle with triangle2 but same instance at "+ triangle2+"(Singleton Scope)");
			triangle2.draw();
		}
	}
}

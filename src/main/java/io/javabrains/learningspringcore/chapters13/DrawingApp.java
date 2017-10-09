package io.javabrains.learningspringcore.chapters13;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingApp {
	
	public static void main(String[] args) {
		try (ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("chapters13/spring.xml")) {
			Triangle triangle = (Triangle) context.getBean("triangle1");
			System.out.println("Drawing traingle with triangle1 instance.");
			triangle.draw();
		}
	}
}

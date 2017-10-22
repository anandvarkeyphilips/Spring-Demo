package io.javabrains.learningspringcore.chapters20;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingApp {

	public static void main(String[] args) {
		try (ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("chapters20/spring.xml")) {
			context.registerShutdownHook();
			
			Shape shape = (Shape) context.getBean("circle");
			shape.draw();
		}
	}
}

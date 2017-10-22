package io.javabrains.learningspringcore.chapters21_22;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingApp {

	public static void main(String[] args) {
		try (ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("chapters21_22/spring.xml")) {
			context.registerShutdownHook();
			
			Shape shape = (Shape) context.getBean("circle");
			shape.draw();
			//System.out.println(context.getMessage("greeting", null, "Default greeting", null));
		}
	}
}

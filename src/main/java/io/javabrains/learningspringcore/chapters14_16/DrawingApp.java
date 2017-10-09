package io.javabrains.learningspringcore.chapters14_16;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingApp {
	
	public static void main(String[] args) {
		try (AbstractApplicationContext context = new ClassPathXmlApplicationContext("chapters14_16/spring.xml")) {
			context.registerShutdownHook();
			Triangle triangle = (Triangle) context.getBean("triangle");
			triangle.draw();
		}
	}
}

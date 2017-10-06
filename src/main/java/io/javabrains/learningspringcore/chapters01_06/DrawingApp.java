package io.javabrains.learningspringcore.chapters01_06;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingApp {
	public static void main(String[] args) {
		// BeanFactory factory = new XmlBeanFactory(new
		// FileSystemResource("src/main/resources/spring.xml")); is deprecated

		try (ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("chapters01_06/spring.xml")) {
			Triangle triangle = (Triangle) context.getBean("triangle");
			triangle.draw();
		}
	}
}

package io.javabrains.learningspringcore.chapters08;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingApp {
	public static void main(String[] args) {
		// BeanFactory factory = new XmlBeanFactory(new FileSystemResource(
		// "src/main/resources/spring.xml")); is deprecated

		try (ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("chapters08/spring.xml")) {
			Triangle triangle = (Triangle) context.getBean("triangle-alias");
			triangle.draw();
		}
	}
}

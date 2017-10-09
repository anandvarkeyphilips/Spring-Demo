package io.javabrains.learningspringcore.chapters12;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Triangle implements ApplicationContextAware,BeanNameAware{

	private Point pointA;
	private Point pointB=null;
	private Point pointC;
	
	private ApplicationContext context;

	public Point getPointA() {
		return pointA;
	}

	public void setPointA(Point pointA) {
		this.pointA = pointA;
	}

	public Point getPointB() {
		return pointB;
	}

	public void setPointB(Point pointB) {
		this.pointB = pointB;
		System.out.println("Point b= (" + getPointB().getX() + "," + getPointB().getY() + ")");
	}

	public Point getPointC() {
		return pointC;
	}

	public void setPointC(Point pointC) {
		this.pointC = pointC;
	}

	public void draw() {

		System.out.println("Point a= (" + getPointA().getX() + "," + getPointA().getY() + ") Initialized from spring.xml");
		getPointA().setX(99);
		System.out.println("Point a= (" + getPointA().getX() + "," + getPointA().getY() + ") Made some changes to differentiate");
		this.pointA = (Point) context.getBean("pointA");
		System.out.println("Point a= (" + getPointA().getX() + "," + getPointA().getY() + ") Returned same instance from spring container(Singleton Scope)");
		
		System.out.println("Point b= (" + getPointB().getX() + "," + getPointB().getY() + ") Initialized from spring.xml");
		getPointB().setX(99);
		System.out.println("Point b= (" + getPointB().getX() + "," + getPointB().getY() + ") Made some changes to differentiate");
		this.pointB = (Point) context.getBean("pointB");
		System.out.println("Point b= (" + getPointB().getX() + "," + getPointB().getY() + ") Returned new instance from spring.xml(Prototype Scope)");
		
		System.out.println("Point c= (" + getPointC().getX() + "," + getPointC().getY() + ")");
	}

	@Override
	public void setApplicationContext(ApplicationContext context) throws BeansException {
		System.out.println("Setting Context!");
		this.context = context;
	}

	@Override
	public void setBeanName(String beanName) {
		System.out.println("Bean Name is: "+ beanName);
	}

}

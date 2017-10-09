package io.javabrains.learningspringcore.chapters17_19;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Circle implements Shape {

	@Autowired
	@Qualifier("circleRelated")
	private Point center;

	public Point getCenter() {
		return center;
	}

	//@Required 
	//Commented as Property 'center' is required for bean 'circle' 
	//for initialization which happens later only(wiring with Qualified).
	public void setCenter(Point center) {
		this.center = center;
	}

	@Override
	public void draw() {
		System.out.println("Drawing Circle.");
		System.out.println("Circle: Point is " + getCenter().getX() + "," + getCenter().getY() + ")");
	}

}

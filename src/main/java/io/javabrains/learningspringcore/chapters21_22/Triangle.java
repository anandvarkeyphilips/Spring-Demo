package io.javabrains.learningspringcore.chapters21_22;

public class Triangle implements Shape{

	private Point pointA;
	private Point pointB = null;
	private Point pointC;

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
	}

	public Point getPointC() {
		return pointC;
	}

	public void setPointC(Point pointC) {
		this.pointC = pointC;
	}

	public void draw() {
		System.out.println("Drawing traingle.");
		System.out.println("Point a= (" + getPointA().getX() + "," + getPointA().getY() + ")");
		System.out.println("Point b= (" + getPointB().getX() + "," + getPointB().getY() + ")");
		System.out.println("Point c= (" + getPointC().getX() + "," + getPointC().getY() + ")");
	}

}

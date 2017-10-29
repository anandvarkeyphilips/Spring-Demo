package io.javabrains.learningspringcore.chapters23;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.stereotype.Component;

@Component
public class Circle implements Shape,ApplicationEventPublisherAware {

	private Point center;
	private ApplicationEventPublisher applicationEventPublisher;
	
	public Point getCenter() {
		return center;
	}

	@Resource(name="pointC")
	public void setCenter(Point center) {
		this.center = center;
	}

	@Override
	public void draw() {
		System.out.println("Drawing Circle.");
		System.out.println("Circle: Point is " + getCenter().getX() + "," + getCenter().getY() + ")");
		DrawEvent drawEvent = new DrawEvent(this);
		applicationEventPublisher.publishEvent(drawEvent);
	}

	@PostConstruct
	public void initializeCircle() {
		System.out.println("Init of Circle.");
	}

	@PreDestroy
	public void destroyCircle() {
		System.out.println("Destroy of Circle.");
	}

	@Override
	public void setApplicationEventPublisher(ApplicationEventPublisher publisher) {
		this.applicationEventPublisher = publisher;
	}

}

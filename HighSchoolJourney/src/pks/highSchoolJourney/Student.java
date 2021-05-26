package pks.highSchoolJourney;
import java.awt.*;
import java.awt.geom.Rectangle2D;
import java.util.*;

import processing.core.PApplet;

//Author: Kevin

public class Student extends MovingImage {

	private double xVelocity, yVelocity;
	private double friction;
	
	public Student(int x, int y) {
		super(x,y);
		xVelocity = 0;
		yVelocity = 0;
		friction = 0.85;
	}
	
	public void walk(int change) {
		if (xVelocity <= 10 && xVelocity >= -10)
			xVelocity += change;
	}
	
	public void jump(int change) {
		if (yVelocity <= 10 && xVelocity >= -10)
			yVelocity += change;
	}
	
	public void act() {
		double x1 = getX();
		double y1= getY();
		double width = getWidth();
		double height = getHeight();
		double x2 = x1 + xVelocity;
		double y2 = y1 + yVelocity;
		if (Math.abs(xVelocity) < .1)
			xVelocity = 0;
		xVelocity *= friction;
		if (Math.abs(yVelocity) < .1)
			yVelocity = 0;
		yVelocity *= friction;
		moveToLocation(x2,y2);
	}
	
}

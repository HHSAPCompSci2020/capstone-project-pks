package pks.highSchoolJourney;
import java.awt.*;
import java.awt.geom.Rectangle2D;
import java.util.*;

import processing.core.PApplet;


/**
 * Student class representing game character. Has xVelocity, yVelocity
 * and friction
 * @author Kevin
 *
 */
public class Student extends MovingImage {

	private double xVelocity, yVelocity;
	private double friction;
	
	/**
	 * Constructs a student by assigning values to fields and 
	 * calling on a sr
	 * @param x x-coord of the student
	 * @param y y-coord of the student
	 */
	public Student(int x, int y) {
		super(x,y);
		xVelocity = 0;
		yVelocity = 0;
		friction = 0.85;
	}
	
	/**
	 * Walk method controlling the movements covered by 
	 * wasd
	 * @param change determines how fast or slow student walks
	 */
	public void walk(int change) {
		if (xVelocity <= 20 && xVelocity >= -20)
			xVelocity += change;
	}
	
	
	public void jump(int change) {
		if (yVelocity <= 10 && xVelocity >= -10)
			yVelocity += change;
	}
	
	/**
	 * Student constantly has x and y velocity tinkered
	 */
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

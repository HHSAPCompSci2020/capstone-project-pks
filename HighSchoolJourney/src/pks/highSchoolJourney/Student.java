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
	private int lives = 1;
	private int intersect = 0;
	private int year = 1;
	private Rectangle winRect;
	
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
		winRect = new Rectangle(1800, 500, 30, 30);
	}
	
	/**
	 * Sets intersections point at given x integer
	 * @param x integer of intersection
	 */
	public void setIntersect(int x) {
		intersect = x;
	}
	/**
	 * Returns the year field value
	 * @return integer value of year
	 */
	public int getYear() {
		return year;
	}
	/**
	 * returns the integer of intersection
	 * @return integer value intersection
	 */
	public int getIntersect() {
		return intersect;
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
	/**
	 * Checks if conditions to win are met
	 * @return true if conditions are met to win
	 */
	public boolean checkWin() {
		double x1 = getX();
		double y1= getY();
		double x2 = x1 + xVelocity;
		double y2 = y1 + yVelocity;
		Rectangle2D.Double checkY = new Rectangle2D.Double(x1,Math.min(y1,y2),50,50+Math.abs(yVelocity));
		Rectangle2D.Double checkX = new Rectangle2D.Double(Math.min(x1,x2),y2,width+Math.abs(xVelocity),50);
		return (winRect.intersects(checkX) || winRect.intersects(checkY));
	}
	
	public void jump(int change) {
		if (yVelocity <= 10 && xVelocity >= -10)
			yVelocity += change;
	}
	
	/**
	 * Student constantly has x and y velocity tinkered
	 */
	public void act(ArrayList<Shape> obstacles) {
		double x1 = getX();
		double y1= getY();
		double x2 = x1 + xVelocity;
		double y2 = y1 + yVelocity;
		Rectangle2D.Double checkY = new Rectangle2D.Double(x1,Math.min(y1,y2),50,50+Math.abs(yVelocity));
		Rectangle2D.Double checkX = new Rectangle2D.Double(Math.min(x1,x2),y2,width+Math.abs(xVelocity),50);
		if (xVelocity > 0) {
			for (Shape ob : obstacles) {
				if (ob.intersects(checkX)) {
					intersect = intersect + 1;
					lives = lives + 1;
				}
			}
		}
		if (yVelocity > 0) {
			for (Shape ob : obstacles) {
				if (ob.intersects(checkY)) {
					intersect = intersect + 1;
					lives = lives + 1;	
				}
			}
		}
		if (Math.abs(xVelocity) < .1)
			xVelocity = 0;
		xVelocity *= friction;
		if (Math.abs(yVelocity) < .1)
			yVelocity = 0;
		yVelocity *= friction;
		moveToLocation(x2,y2);
	}
	
}

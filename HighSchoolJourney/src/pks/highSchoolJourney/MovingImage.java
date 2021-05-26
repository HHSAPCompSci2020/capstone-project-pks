package pks.highSchoolJourney;
import java.awt.Rectangle;
import java.awt.geom.Rectangle2D;
import processing.core.PApplet;
import processing.core.PImage;

/**
 * Represents a moving image on display and is a
 * Rectangle2D.Double
 * @author Kevin, Pranav, Sachin
 *
 */
public class MovingImage extends Rectangle2D.Double {

	/**
	 * Construct a moving image with given x and y integers coordinates
	 * @param x x coordinate of rectangle
	 * @param y y coordinate of rectangle
	 */
	public MovingImage(int x, int y) {
		super(x,y,20,20);
		this.x = x;
		this.y = y;
	}
	
	/**
	 * Move image to given location
	 * @param x x coordinate of location to move to
	 * @param y y coordinate of location to move to
	 */
	public void moveToLocation(double x, double y) {
		super.x = x;
		super.y = y;
	}
	
	/**
	 * move image by given amount
	 * @param x amount to move x value of image's coordinate
	 * @param y amount to move y value of image's coordinate
	 */
	public void moveByAmount(double x, double y) {
		super.x += x;
		super.y += y;
	}
	
	/**
	 * Move image to x and y coordinate 
	 * @param x x coordinate to move to
	 * @param y y coordinate to move to
	 */
	public void move(int x, int y)
	{
		this.x = x;
		this.y = y;
	}
	
	/**
	 * draw image using PApplet
	 * @param marker used to draw image
	 */
	public void draw(PApplet marker)
	{
		marker.rect((float)x,(float)y, 50, 50);
		marker.rect(1800,500,30,30);
	}
	
}

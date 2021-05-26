package pks.highSchoolJourney;
import java.awt.Rectangle;
import java.awt.geom.Rectangle2D;
import processing.core.PApplet;
import processing.core.PImage;

public class MovingImage extends Rectangle2D.Double {

	public MovingImage(int x, int y) {
		super(x,y,20,20);
		this.x = x;
		this.y = y;
	}
	
	public void moveToLocation(double x, double y) {
		super.x = x;
		super.y = y;
	}
	
	public void moveByAmount(double x, double y) {
		super.x += x;
		super.y += y;
	}
	
	public void draw(PApplet marker)
	{
		marker.rect((float)x,(float)y, 50, 50);
		marker.rect(1800,500,30,30);
	}
	
}

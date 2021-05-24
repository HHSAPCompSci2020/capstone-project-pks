package pks.highSchoolJourney;
import java.awt.*;
import java.awt.geom.Rectangle2D;
import java.util.*;

import processing.core.PApplet;

public class Student {

	private double xVelocity, yVelocity;
	
	public Student(int x, int y) {
		xVelocity = 0;
		yVelocity = 0;
	}
	
	public void walk(int change) {
		if (xVelocity <= 10 && xVelocity >= -10)
			xVelocity += change;
	}
	
	public void draw(PApplet marker)
	{
		marker.rect(20,20,20,20);
	}
	
}

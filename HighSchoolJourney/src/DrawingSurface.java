
import java.awt.Rectangle;
import java.awt.Shape;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import processing.core.PApplet;

public class DrawingSurface extends PApplet {

	// FIELDS


	// CONSTRUCTOR - Initialize any added fields here.
	public DrawingSurface() {

	}


	// METHODS
	// Add processing methods here. See the documentation at processing.org for reference.
	public void setup() {

	}

	public void draw() {
		background(255);
		pushStyle();
		fill(0);
		textSize(10);
		popStyle();
	}
	
	public void mousePressed() {
	//	h.move(mouseX, mouseY);
	}
	
	public void keyPressed()
	{
/*		if (keyCode == KeyEvent.VK_UP)
		{
			h.changeScale(2f);
		}
		if (keyCode == KeyEvent.VK_DOWN)
		{
			h.changeScale(0.5f);
		}
		if (keyCode == KeyEvent.VK_LEFT)
		{
			p.changeSide(-25f);
		}
		if (keyCode == KeyEvent.VK_RIGHT)
		{
			p.changeSide(25f);
		}*/
	}

	// Add methods for user interaction. Check the processing reference for info on this (http://processing.org).
	// We'll also review how to get mouse/keys working in class.




}

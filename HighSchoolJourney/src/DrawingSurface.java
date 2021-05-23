
import java.awt.Rectangle;
import java.awt.Shape;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import processing.core.PApplet;

public class DrawingSurface extends PApplet {

	// FIELDS
	public static final int screenWidth = 1000;
	public static final int screenHeight = 1000;
	private Rectangle screen;
	private ArrayList<Shape> obstacles;
	//private Student player;

	// CONSTRUCTOR - Initialize any added fields here.
	/**
	 * Constructor for game screen with screen height, width, student, and obstacles
	 * Size 1000 x 1000 for height and width
	 */
	public DrawingSurface() {
		super();
		screen = new Rectangle(0,0,screenWidth,screenHeight);
	}


	// METHODS
	// Add processing methods here. See the documentation at processing.org for reference.
	public void setup() {

	}

	/**
	 * draws the game screen and keeps updating the screen as needed
	 */
	public void draw() {
		background(255);
		pushStyle();
		fill(0);
		textSize(10);
		popStyle();
	}
	
	/**
	 * Interacts with screen as mouse is pressed
	 */
	public void mousePressed() {
	//	h.move(mouseX, mouseY);
	}
	
	/**
	 * Moves student as keys are pressed 
	 */
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

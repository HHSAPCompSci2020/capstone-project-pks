package pks.highSchoolJourney;

import java.awt.Rectangle;
import java.awt.Shape;
import java.awt.event.KeyEvent;
import java.awt.geom.Line2D;
import java.util.ArrayList;
import processing.core.PApplet;

/**
 * drawingSurface of game. Contains screenWidth, screenHeight, a student player and
 * an arraylist of integers for keys.
 * @author Pranav, Sachin, Kevin 
 *
 */
public class DrawingSurface extends PApplet {

	// FIELDS
	public static final int screenWidth = 1920;
	public static final int screenHeight = 1080;
	private LevelFreshman freshmanLevel = new LevelFreshman();
	private LevelSophomore sophomoreLevel = new LevelSophomore();
	private ArrayList<Shape> tempArray;
	private Student player;
	private ArrayList<Integer> keys;


	// CONSTRUCTOR - Initialize any added fields here.
	/**
	 * Constructor for game screen with screen height, width, student, and obstacles
	 * Size 1000 x 1000 for height and width
	 */
	public DrawingSurface() {
		super();
		keys = new ArrayList<Integer>();
		tempArray = new ArrayList<Shape>();
		tempArray.add(new Line2D.Double(0, 490, 1920, 490));
		tempArray.add(new Line2D.Double(0, 590, 1920, 590));
		spawnStudent();
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
		player.draw(this);
		if (player.getYear() == 2)
		{
			player.act(sophomoreLevel.getLevel());
			for(Shape s : sophomoreLevel.getLevel())
			{
				if(s instanceof Line2D)
				{
					Line2D l = (Line2D)s;
					line((float)l.getX1(), (float)l.getY1(), (float)l.getX2(), (float)l.getY2());
				}
				if (player.getIntersect() >= 1) {
					spawnStudent();
					player.setIntersect(0);
				}
			}
		}
		if (isPressed(KeyEvent.VK_A))
			player.walk(-1);
		if (isPressed(KeyEvent.VK_D))
			player.walk(1);
		if (isPressed(KeyEvent.VK_W))
			player.jump(-1);
		if (isPressed(KeyEvent.VK_S))
			player.jump(1);
	}
	public void spawnStudent() {
		player = new Student(10, 515);
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

	public void keyPressed() {
		keys.add(keyCode);
	}

	/**
	 * Detects when keys are released
	 */
	public void keyReleased() {
		while(keys.contains(keyCode))
			keys.remove(new Integer(keyCode));
	}

	/**
	 * Checks whether input key is curently pressed or not
	 * @param code of type Integer to provide a proper search on the desired key
	 * @return booleans testing whether or not the integer code representing 
	 * a key was pressed or not.
	 */
	public boolean isPressed(Integer code) {
		return keys.contains(code);
	}


	// Add methods for user interaction. Check the processing reference for info on this (http://processing.org).
	// We'll also review how to get mouse/keys working in class.




}

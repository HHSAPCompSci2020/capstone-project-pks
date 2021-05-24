package pks.highSchoolJourney;

import java.awt.Rectangle;
import java.awt.Shape;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import processing.core.PApplet;

/**
 * drawingSurface of game
 * @author Pranav, Sachin, Kevin
 *
 */
public class DrawingSurface extends PApplet {

	// FIELDS
	public static final int screenWidth = 1920;
	public static final int screenHeight = 1080;
	private Student player;
	private ArrayList<Shape> obstacles;
	private ArrayList<Integer> keys;
	private ArrayList<Shape> freshmanLevel;
	private ArrayList<Shape> sophomoreLevel;
	private ArrayList<Shape> juniorLevel;
	private ArrayList<Shape> seniorLevel;

	// CONSTRUCTOR - Initialize any added fields here.
	/**
	 * Constructor for game screen with screen height, width, student, and obstacles
	 * Size 1000 x 1000 for height and width
	 */
	public DrawingSurface() {
		super();
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
		pushMatrix();
		pushStyle();
		fill(0);
		textSize(10);
		popStyle();
		player.draw(this);
		if (isPressed(KeyEvent.VK_A))
			player.walk(-1);
		if (isPressed(KeyEvent.VK_D))
			player.walk(1);
	//	if (isPressed(KeyEvent.VK_W))
	//		player.jump();
	}
	public void spawnStudent() {
		player = new Student(600,200);
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

	public void keyReleased() {
		while(keys.contains(keyCode))
			keys.remove(new Integer(keyCode));
	}

	public boolean isPressed(Integer code) {
		return keys.contains(code);
	}


	// Add methods for user interaction. Check the processing reference for info on this (http://processing.org).
	// We'll also review how to get mouse/keys working in class.




}

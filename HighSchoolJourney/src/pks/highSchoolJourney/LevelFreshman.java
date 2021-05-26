package pks.highSchoolJourney;

import java.awt.Rectangle;
import java.awt.Shape;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import processing.core.PApplet;

/**
 * Level 1, freshman year of High School, easy difficulty. Contains an array list of shapes that represent
 * obstacles in the level.
 * @author Pman
 *
 */
public class LevelFreshman extends PApplet {
	
	private ArrayList<Shape> freshmanLevel;
	
	/**
	 * Constructs the level by giving life to the array list of shapes and adding 
	 * shapes to the list.
	 */
	public LevelFreshman() {
		freshmanLevel = new ArrayList<Shape>(); 
		
//		freshmanLevel.add(new Line(0,0, 3, 3));
	}
	
	/**
	 * A get method in order to get obstacles of a level from outside the class. 
	 * @return an arraylist of shapes containing the obstacles of the level
	 */
	public ArrayList<Shape> getLevel() {
		return freshmanLevel;
	}
}

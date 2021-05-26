package pks.highSchoolJourney;

import java.awt.Rectangle;
import java.awt.Shape;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import processing.core.PApplet;

/**
 * Level 4, senior year of High School, hard difficulty. Contains an array list of shapes that represent
 * obstacles in the level.
 * @author Pman
 *
 */
public class LevelSenior extends PApplet{
	
	private ArrayList<Shape> seniorLevel;
	
	/**
	 * Constructs the level by giving life to the array list of shapes and adding 
	 * shapes to the list.
	 */
	public LevelSenior() {
		
		seniorLevel = new ArrayList<Shape>();
		
	}
	
	/**
	 * A get method in order to get obstacles of a level from outside the class. 
	 * @return an arraylist of shapes containing the obstacles of the level
	 */
	public ArrayList<Shape> getLevel() {
		return seniorLevel;
	}
}

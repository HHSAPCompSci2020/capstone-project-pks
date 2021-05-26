package pks.highSchoolJourney;

import java.awt.Rectangle;
import java.awt.Shape;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import processing.core.PApplet;

/**
 * Level 2, sophomore year of High School, intermediate difficulty. Contains an array list of shapes that represent
 * obstacles in the level.
 * @author Sachin
 *
 */
public class LevelSophomore extends PApplet {

	private ArrayList<Shape> sophmoreLevel;
	
	/**
	 * Constructs the level by giving life to the array list of shapes and adding 
	 * shapes to the list.
	 */
	public LevelSophomore() {
		
		sophmoreLevel = new ArrayList<Shape>();
		
		
	}
	
	/**
	 * A get method in order to get obstacles of a level from outside the class. 
	 * @return an arraylist of shapes containing the obstacles of the level
	 */
	public ArrayList<Shape> getLevel() {
		return sophmoreLevel;
	}
	
}
 
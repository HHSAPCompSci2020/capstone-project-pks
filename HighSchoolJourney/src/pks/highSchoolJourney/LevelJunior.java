package pks.highSchoolJourney;

import java.awt.Rectangle;
import java.awt.Shape;
import java.awt.geom.Line2D;
import java.awt.geom.Line2D.Double;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import processing.core.PApplet;

/**
 * Level 3, junior year of Highschool, moderate difficulty. Contains an array list of shapes that represent
 * obstacles in the level.
 * @author Sachin
 *
 */
public class LevelJunior extends PApplet{

	private ArrayList<Shape> juniorLevel;
	
	/**
	 * Constructs the level by giving life to the array list of shapes and adding 
	 * shapes to the list.
	 */
	public LevelJunior() {
		
		juniorLevel = new ArrayList<Shape>();
		
	}
	
	/**
	 * A get method in order to get obstacles of a level from outside the class. 
	 * @return an arraylist of shapes containing the obstacles of the level
	 */
	public ArrayList<Shape> getLevel() {
		return juniorLevel;
	}
	
}

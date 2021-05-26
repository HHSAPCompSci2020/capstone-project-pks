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
		
		juniorLevel.add(new Line2D.Double(0, 490, 1920, 490));
		juniorLevel.add(new Line2D.Double(0, 590, 1920, 590));
		juniorLevel.add(new Line2D.Double(420, 590, 450, 560));
		juniorLevel.add(new Line2D.Double(450, 560, 480, 590));
		juniorLevel.add(new Line2D.Double(1120, 490, 1150, 520));
		juniorLevel.add(new Line2D.Double(1150, 520, 1180, 490));
		juniorLevel.add(new Line2D.Double(600, 580, 680, 580));
		
	}
	
	/**
	 * A get method in order to get obstacles of a level from outside the class. 
	 * @return an arraylist of shapes containing the obstacles of the level
	 */
	public ArrayList<Shape> getLevel() {
		return juniorLevel;
	}
	
}

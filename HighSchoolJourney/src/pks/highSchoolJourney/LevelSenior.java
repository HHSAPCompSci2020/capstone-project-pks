package pks.highSchoolJourney;

import java.awt.Rectangle;
import java.awt.Shape;
import java.awt.event.KeyEvent;
import java.awt.geom.Line2D;
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
		
		seniorLevel.add(new Line2D.Double(0, 490, 420, 490));
		seniorLevel.add(new Line2D.Double(0, 590, 520, 590));
		seniorLevel.add(new Line2D.Double(420, 490, 420, 290));
		seniorLevel.add(new Line2D.Double(520, 590, 520, 390));
		seniorLevel.add(new Line2D.Double(420, 290, 720, 290));
		seniorLevel.add(new Line2D.Double(520, 390, 620, 390));
		seniorLevel.add(new Line2D.Double(720, 290, 720, 650));
		seniorLevel.add(new Line2D.Double(620, 390, 620, 750));
		seniorLevel.add(new Line2D.Double(720, 650, 920, 650));
		seniorLevel.add(new Line2D.Double(620, 750, 1020, 750));
		seniorLevel.add(new Line2D.Double(920, 650, 920, 490));
		seniorLevel.add(new Line2D.Double(1020, 750, 1020, 590));
		seniorLevel.add(new Line2D.Double(920, 490, 1920, 490));
		seniorLevel.add(new Line2D.Double(1020, 590, 1920, 590));
		
	}
	
	/**
	 * A get method in order to get obstacles of a level from outside the class. 
	 * @return an arraylist of shapes containing the obstacles of the level
	 */
	public ArrayList<Shape> getLevel() {
		return seniorLevel;
	}
}

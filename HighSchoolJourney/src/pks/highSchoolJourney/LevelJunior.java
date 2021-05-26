package pks.highSchoolJourney;

import java.awt.Rectangle;
import java.awt.Shape;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import processing.core.PApplet;

public class LevelJunior extends PApplet{

	private ArrayList<Shape> juniorLevel;
	
	public LevelJunior() {
		
		juniorLevel = new ArrayList<Shape>();
		
	}
	
	public ArrayList<Shape> getLevel() {
		return juniorLevel;
	}
	
}

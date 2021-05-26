package pks.highSchoolJourney;

import java.awt.Rectangle;
import java.awt.Shape;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import processing.core.PApplet;

public class LevelFreshman extends PApplet {
	
	private ArrayList<Shape> freshmanLevel;
	
	public LevelFreshman() {
		freshmanLevel = new ArrayList<Shape>(); 
		
		freshmanLevel.add(new Rectangle(0,0,0,0));
	}
	
	public ArrayList<Shape> getLevel() {
		return freshmanLevel;
	}
}

package pks.highSchoolJourney;
import java.awt.CardLayout;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JPanel;

import processing.awt.PSurfaceAWT;
import processing.core.PApplet;

/**
 * Executes main method to run program
 * @author Kevin, Pranav, Sachin
 *
 */
public class Main {

	private JPanel cardPanel;
	
	//private MainMenu panel1;    
	private DrawingSurface panel2;
	
	/**
	 * Main method that runs program
	 * @param args methods take in arguments 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DrawingSurface drawing = new DrawingSurface();
		PApplet.runSketch(new String[]{""}, drawing);
		PSurfaceAWT surf = (PSurfaceAWT) drawing.getSurface();
		PSurfaceAWT.SmoothCanvas canvas = (PSurfaceAWT.SmoothCanvas) surf.getNative();
		JFrame window = (JFrame)canvas.getFrame();
		window.setSize(1920, 1080);
		window.setMinimumSize(new Dimension(500,500));
		window.setLocationRelativeTo(null);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setResizable(true);
		window.setVisible(true);
		canvas.requestFocus();
	}

	public void changePanel() {
		((CardLayout)cardPanel.getLayout()).next(cardPanel);
		//panel2.requestFocus();
	}
}

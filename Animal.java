import java.awt.Graphics;
import java.util.*;
import javax.swing.JApplet;
import java.awt.Color;
import javax.swing.JOptionPane;

/**
 * Animal Class to be extended to represent an animal figure
 *
 * @author Class_Slides
 * @version 1.0
 */
public abstract class Animal {
        private int x;      // x position
        private int y;      // y position
        private String ID;  // animal ID

	/**
 	 * Constructor for Class Animal
 	 *
 	 */
        public Animal( )  { ID = ""; }

	/**
 	 * Overloaded Constructor for Class Animal
 	 *
  	 * @param rID Animal ID
	 * @param rX X Coordinate
	 * @param rY Y Coordinate
 	 */
        public Animal( String rID, int rX, int rY )
        	{ ID = rID; x = rX; y = rY;  }

	/**
 	 * Method to Get Animal ID
 	 *
  	 * @return Animal ID
 	 */
        public String getID( ) { return ID; }

	/**
 	 * Method to Get X Coordinate
 	 *
  	 * @return X Coordinate
 	 */
        public int getX( ) { return x; }

	/**
 	 * Method to Get y coordinate
 	 *
  	 * @return y coordinate
 	 */
        public int getY( ) { return y; }

	/**
 	 * Method to Set X coordinate
 	 *
  	 * @param newX coordinate
 	 */
        public void setX( int newX ) { x = newX; }

	/**
 	 * Method to Set y coordinate
 	 *
  	 * @param newY coordinate
 	 */
        public void setY( int newY ) { y = newY; }

	/**
 	 * Method to draw an animal figure
 	 *
  	 * @param g Instance of Graphics class to be drawn
 	 */
        public abstract void draw( Graphics g );
}


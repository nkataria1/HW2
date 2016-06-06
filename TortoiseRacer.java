import java.awt.Graphics;
import java.util.*;
import javax.swing.JApplet;
import java.awt.Color;
import javax.swing.JOptionPane;

/**
 * Moveable interface to move an Animal 
 * 
 * @author Class_Slides
 * @version 1.0
 */
interface Moveable
{
        int FAST = 5; // static constant
        int SLOW = 1; // static constant

	/**
 	 * Abstract method to move a figure
 	 *
 	 */
        void move( ); // abstract method
}

/**
 * Class to draw/move a tortoise
 * 
 * @author Class_Slides
 * @version 1.0
 */
public class TortoiseRacer extends Animal implements Moveable  {

	/**
 	 * Constructor for Class TortoiseRacer
 	 *
 	 */
        public TortoiseRacer( ) { super( ); }

        private ArrayList<Color> turtleColors;
        private static int i = 0;
	
	
	/**
 	 * Overloaded Constructor for Class TortoiseRacer
 	 *
  	 * @param rID Tortoise ID
	 * @param rX X Coordinate 
	 * @param rY Y Coordinate 
 	 */
        public TortoiseRacer( String rID, int rX, int rY ) {
                super( rID, rX, rY );

		// Initialize colors for turtle
                turtleColors = new ArrayList<Color>();
                turtleColors.add(Color.black);
                turtleColors.add(Color.gray);
                turtleColors.add(Color.yellow);
                turtleColors.add(Color.orange);
                turtleColors.add(Color.pink);
                turtleColors.add(Color.green);
                turtleColors.add(Color.white);
                turtleColors.add(Color.magenta);
        }

	/**
 	 * Method to draw a Tortoise
 	 *
  	 * @param g Instance of Graphics class to be drawn
 	 */
        public void draw( Graphics g) {
                int startX = getX( );
                int startY = getY( );

                g.setColor(turtleColors.get(i%7));
                //body
                g.fillOval( startX, startY, 25, 15 );
                //head
                g.fillOval( startX + 20, startY + 5,  15, 10 );
                //flatten bottom
                g.clearRect( startX, startY + 11, 35, 4 );
                //feet
                g.setColor( new Color( 34, 139, 34 ) );  // brown
                g.fillOval( startX + 3, startY + 10,  5, 5 );
                g.fillOval( startX + 17, startY + 10, 5, 5 );
                i++;
        }

	/**
 	 * Method to move the Tortoise
 	 *
 	 */
        public void move( ) { setX( getX( ) + SLOW ); }
}

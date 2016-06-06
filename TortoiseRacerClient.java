import java.awt.Graphics;
import javax.swing.JApplet;

/**
 * Client Class to test TortoiseRacer and implement in an Applet
 *
 * @author Class_Slides
 * @version 1.0
 */
public class TortoiseRacerClient extends JApplet {
	private TortoiseRacer t;

	// Init the Client for Applet
	public void init( ) {
		t = new TortoiseRacer( "Tortoise", 50, 50 );
	}

        /**
         * Method to Trigger Drawing and Moving of Tortoise
         * @param g Instance of Graphics d
         */
	public void paint( Graphics g) {
		// getWidth and sleep for 1 second before moving
		for ( int i = 0; i < getWidth( ); i++ )
		{
			t.move( );
			t.draw( g );

			try {
				Thread.sleep(100);
			} 
			catch(InterruptedException ie){
				System.out.println("Thread interrupted !" + ie);
			}
			//JOptionPane.showMessageDialog(null,Color.pink,"TITLE",JOptionPane.WARNING_MESSAGE);
			g.clearRect( 0, 0, getWidth( ), getHeight( ) );
		}
	}
}


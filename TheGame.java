//Name -
//Date -
//Class -
//Lab  - 

import javax.swing.JFrame;
import java.awt.Component;

public class TheGame extends JFrame
{
	private static final int WIDTH = 800;
	private static final int HEIGHT = 600;

	public TheGame()
	{
		super("AIRHOCKEY");
		setSize(WIDTH,HEIGHT);

		Airhockey game = new Airhockey();

		((Component)game).setFocusable(true);
		getContentPane().add(game);

		setVisible(true);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

	public static void main( String args[] )
	{
		TheGame run = new TheGame();
	}
}
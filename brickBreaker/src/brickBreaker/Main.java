package brickBreaker;

import javax.swing.JFrame;

public class Main {

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		graphic g = new graphic();
		Gameplay gamePlay = new Gameplay();
		frame.setResizable(false);
	    frame.setBounds(0,0,800,640);
	    frame.setTitle("Game");
	    frame.add(g);
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    frame.setVisible(true);

	}

}

import java.awt.HeadlessException;
import java.awt.Rectangle;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;

import javax.swing.JFrame;

public class Painter extends JFrame {

	public void paintAll() {

		JFrame window = new JFrame();
		window.setTitle("FLAG OF BANGLADESH");
		//window.setSize(1240, 1240);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setExtendedState(JFrame.MAXIMIZED_BOTH); 
	//	window.setUndecorated(true);
		window.setVisible(true);
		
		GUI g = new GUI(window.getWidth(), window.getHeight());
		window.add(g);
		
		//System.out.println("YYY");

	}

}

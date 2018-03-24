import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;

public class GUI extends JPanel {
	private int height, width;
	
	public GUI(int width, int height) {
		super();
		this.height = height;
		this.width = width;
	}

	public void paint(Graphics g) {
		Graphics2D g2 = (Graphics2D) g;
		
		Rectangle background = new Rectangle(0, 0, 5000, 5000, Color.cyan);
		background.draw(g2);
		
		g2.setColor(new Color(200, 60, 0));
		g2.fillOval(0, 0, width, 2 * height);
		
		g2.setColor(new Color(0, 0, 0));
		g2.setFont(new Font("Courier", Font.BOLD, 60));
		g2.drawString("Independence Day, 26 March, 1971", 90, 600);
		//Composite Pattern has been used here
		//Flag consists of two Rectangles (body and mast) and Circle.
		// Rectangle consists of four lines. (it is unnecessary but our teacher forced it -_- )  
		//If you comment out the color and fill out (fillOval, fill3DRect), you can see the borders.
		Flag flag = new Flag();
		flag.draw(g2);
		
		Rectangle ground = new Rectangle(0, 700, 5000, 900, new Color(0, 255, 0));
		ground.draw(g2);

	}

}

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JFrame;

public class Rectangle implements IShape {
	private int x1, x2, y1, y2;
	private Color color;
	private Line[] lines = new Line[4];

	public Rectangle(int x1, int y1, int x2, int y2, Color color) {
		this.x1 = x1;
		this.y1 = y1;
		this.x2 = x2;
		this.y2 = y2;
		this.color = color;
		lines[0] = new Line(x1, y1, x1 + x2, y1);
		lines[1] = new Line(x1 + x2, y1, x1 + x2, y1 + y2);
		lines[2] = new Line(x1 + x2, y1 + y2, x1, y1 + y2);
		lines[3] = new Line(x1, y1 + y2, x1, y1);
	}

	@Override
	public void draw(Graphics2D g) {
		
		buildShape(g);
		g.setColor(color);
		//g.fillRect(x1, y1, x2, y2);
		g.fill3DRect(x1, y1, x2, y2, false);

	}
	
	public void buildShape(Graphics2D g) {
		for(int i = 0; i < 4; i++) {
			lines[i].draw(g);
		}
	}

}

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

public class Circle implements IShape{

	private int x1, y1, r;
	private Color color;
	
	public Circle(int x1, int y1, int r, Color color) {
		this.x1 = x1;
		this.y1 = y1;
		this.r = r;
		this.color = color;
	}


	@Override
	public void draw(Graphics2D g) {
		// TODO Auto-generated method stub
		
		//g.drawOval(x1, y1, r, r);
		g.setColor(color);
		g.fillOval(x1, y1, r, r);
	}	

}
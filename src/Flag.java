import java.awt.Color;
import java.awt.Graphics2D;
import java.util.ArrayList;

public class Flag implements IShape{

	
	private ArrayList<IShape> shapes = new ArrayList();
	@Override
	
	public void draw(Graphics2D g) {
		// TODO Auto-generated method stub
		buildShape();
		for(int i = 0; i < shapes.size(); i++) {
			shapes.get(i).draw(g);
			//System.out.println(i);
		}
		
	}
	

	public void buildRectangle(int x1, int y1, int x2, int y2, Color color) {
		shapes.add(new Rectangle(x1, y1, x2, y2, color));
		
	}
	
	public void buildCircle(int x, int y, int r, Color color) {
		shapes.add(new Circle(x, y, r, color));
	}
	
	public void buildShape() {

		buildRectangle(450, 10, 600, 300, new Color(0, 100, 0)); //BODY
		buildCircle(680, 100, 150, new Color(255, 0, 0)); //CIRCLE
		buildRectangle(440, 10, 10, 900, Color.darkGray); //MAST
		
	}

	
	

}
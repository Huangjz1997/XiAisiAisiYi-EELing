import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;

import javax.swing.JComponent;

public class SceneComponent extends JComponent {

	@Override
	protected void paintComponent(Graphics graphics) {
		// TODO Auto-generated method stub.
		super.paintComponent(graphics);
		Graphics2D g = (Graphics2D) graphics;
		// set up the backgroud of scene
		Rectangle2D sky = new Rectangle2D.Double(0, 0, 750, 375);
		g.setColor(Color.blue);
		g.fill(sky);

		Rectangle2D groud = new Rectangle2D.Double(0, 375, 750, 225);
		g.setColor(Color.green);
		g.fill(groud);
		// build and draw a object form Sun class with default constructor
		Sun scenesun = new Sun();
		scenesun.drawOn(g);
		// biuld and draw a object form Face class
		Face sceneface = new Face(450, 350, 30, Color.yellow, Color.black, Color.blue, Color.red);
		sceneface.drawOn(g);
	}
}
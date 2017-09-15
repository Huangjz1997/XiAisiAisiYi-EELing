import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;

public class Sun {
	// set all the parameter will used in Sun class
	private static final Color BORDER_COLOR = Color.BLACK;
	private static final int NUMBER_OF_RAYS = 8;
	private static final double RAY_LENGTH_SCALE = 0.5;
	private static final double RAY_WIDTH_SCALE = 0.1;
	private static final double RAY_DISTANCE_FROM_SUN_SCALE = 0.2;
	private static final double DEFAULT_SUN_DIAMETER = 100.0;
	private static final double DEFAULT_SUN_X = 100.0;
	private static final double DEFAULT_SUN_Y = 100.0;
	private static final Color DEFAULT_SUN_COLOR = Color.YELLOW;
	// set up all fields of Sun class
	private double x;
	private double y;
	private double circleDiameter;
	private double rayLength;
	private double rayWidth;
	private double rayDistanceFromSun;
	private Color color;

	// default constructor
	public Sun() {
		this.x = DEFAULT_SUN_X;
		this.y = DEFAULT_SUN_Y;
		this.circleDiameter = DEFAULT_SUN_DIAMETER;
		this.rayLength = DEFAULT_SUN_DIAMETER * RAY_LENGTH_SCALE;
		this.rayWidth = DEFAULT_SUN_DIAMETER * RAY_WIDTH_SCALE;
		this.rayDistanceFromSun = DEFAULT_SUN_DIAMETER * RAY_DISTANCE_FROM_SUN_SCALE;
		color = DEFAULT_SUN_COLOR;
	}

	// constructor with parameters
	public Sun(double x, double y, double diameter, Color color) {
		this.x = x;
		this.y = y;
		this.circleDiameter = diameter;
		this.color = color;
		this.rayLength = diameter * RAY_LENGTH_SCALE;
		this.rayWidth = diameter * RAY_WIDTH_SCALE;
		this.rayDistanceFromSun = diameter * RAY_DISTANCE_FROM_SUN_SCALE;

	}

	// drawOn function
	// this function is a helper function to build a sun in Components class
	public void drawOn(Graphics2D graphics) {
		Ellipse2D cir = new Ellipse2D.Double(this.x, this.y, this.circleDiameter, this.circleDiameter);
		graphics.setColor(this.color);
		graphics.fill(cir);
		graphics.setColor(this.BORDER_COLOR);
		graphics.setStroke(new BasicStroke(1.0f));
		graphics.draw(cir);
		// use a for loop to draw rays one by one
		for (int i = 0; i < NUMBER_OF_RAYS; i++) {
			graphics.translate(this.x + this.circleDiameter / 2, this.y + this.circleDiameter / 2);
			// call drawRay function to draw rays
			drawRay(graphics);
			graphics.rotate(2 * Math.PI / NUMBER_OF_RAYS);
			graphics.translate(-this.x - this.circleDiameter / 2, -this.y - this.circleDiameter / 2);
		}

	}

	// helper function to draw one piece of ray
	public void drawRay(Graphics2D graphics) {
		Rectangle2D ray = new Rectangle2D.Double(-this.rayWidth / 2, this.circleDiameter / 2 + this.rayDistanceFromSun,
				this.rayWidth, this.rayLength);
		graphics.setColor(this.color);
		graphics.fill(ray);
		graphics.setColor(this.BORDER_COLOR);
		graphics.setStroke(new BasicStroke(1.0f));
		graphics.draw(ray);
	}

}

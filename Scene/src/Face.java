import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.Arc2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Point2D;

public class Face {
	// set the field for whole class
	private int centerx;
	private int centery;
	private int rad;
	private Color face_color;
	private Color face_out_color;
	private Color eye_color;
	private Color mouth_color;

	// constructor with parameters
	public Face(int x, int y, int d, Color fc, Color foc, Color ec, Color mc) {
		this.centerx = x;
		this.centery = y;
		this.rad = d;
		this.face_color = fc;
		this.face_out_color = foc;
		this.eye_color = ec;
		this.mouth_color = mc;

	}

	// default constructor
	public Face() {
		this.centerx = 50;
		this.centery = 100;
		this.rad = 50;
		this.face_color = Color.yellow;
		this.face_out_color = Color.blue;
		this.eye_color = Color.black;
		this.mouth_color = Color.red;

	}

	public void drawOn(Graphics2D graphics) {
		// TODO: Add the code for drawing a Face
		graphics.translate(this.centerx, this.centery);
		Ellipse2D f = new Ellipse2D.Double(-this.rad, -this.rad, (double) this.rad * 2, (double) this.rad * 2);

		graphics.setColor(this.face_color);
		graphics.fill(f);
		graphics.setColor(this.face_out_color);
		graphics.setStroke(new BasicStroke(3.0f));
		graphics.draw(f);

		// start draw eyes
		Point2D eyeloc;
		double eyerad;
		eyeloc = getEyeUpperLeftLocationFromCenterOfFace(true, this.rad);
		eyerad = getEyeRadius(this.rad);
		Draweye(graphics, eyeloc, eyerad);
		eyeloc = getEyeUpperLeftLocationFromCenterOfFace(false, this.rad);
		eyerad = getEyeRadius(this.rad);
		Draweye(graphics, eyeloc, eyerad);
		Drawmouth(graphics);
		graphics.translate(-this.centerx, -this.centery);
		Drawmouth(graphics);
	}

	public void Draweye(Graphics2D graphics, Point2D cent, double rad) {
		double pointx = cent.getX();
		double pointy = cent.getY();
		Ellipse2D.Double eye = new Ellipse2D.Double(pointx, pointy, rad * 2, rad * 2);

		graphics.setColor(this.eye_color);
		graphics.fill(eye);
		graphics.draw(eye);
	}

	public void Drawmouth(Graphics2D graphics) {
		Arc2D.Double mou = new Arc2D.Double(-this.rad * 0.7, -this.rad * 0.7, 2 * this.rad * 0.7, this.rad * 0.7 * 2,
				-15, -150, 1);
		graphics.setColor(this.mouth_color);
		graphics.setStroke(new BasicStroke(1.0f));
		graphics.draw(mou);

	}

	/**
	 * Returns the upper left location of an eye based on the center of the face
	 * and whether or not it's the left or right eye.
	 * 
	 * @param isLeftEye
	 *            - true if it's the left eye, false if it's the
	 * @param faceRadius
	 *            - The radius of the eye
	 * @return a point representing the upper left location of an eye relative
	 *         to the center of a face
	 */
	private static Point2D.Double getEyeUpperLeftLocationFromCenterOfFace(boolean isLeftEye, double faceRadius) {
		int multiplier = isLeftEye ? -1 : 1;
		double eyeCenterX = ((faceRadius * .5) * Math.cos(Math.toRadians(45))) * multiplier;
		double eyeCenterY = -((faceRadius * .5) * Math.sin(Math.toRadians(45)));
		return new Point2D.Double(eyeCenterX - getEyeRadius(faceRadius), eyeCenterY - getEyeRadius(faceRadius));
	}

	/**
	 * Returns the radius of an eye based on the radius of a face.
	 * 
	 * @param faceRadius
	 *            - the radius of the face
	 * @return
	 */
	private static double getEyeRadius(double faceRadius) {
		return 0.28 * faceRadius;
	}

}

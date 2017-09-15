import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JComponent;

public class SunComponent extends JComponent {

	private static final double LITTLE_SUN_SIZE = 30.0;
	private static final double LITTLE_SUN_SEPARATION = 100.0;
	private static final int NUM_LITTLE_SUNS = 5;
	private static final double LITTLE_SUNS_Y = 400.0;
	private static final Color LITTLE_SUN_COLOR = Color.RED;
	private static final double LITTLE_SUNS_X_OFFSET = 50;

	@Override
	protected void paintComponent(Graphics graphics) {
		// TODO Auto-generated method stub.
		super.paintComponent(graphics);
		Graphics2D sung = (Graphics2D) graphics;
		Sun suntest = new Sun();
		suntest.drawOn(sung);
		// draws a rectangle around the default sun
		graphics.drawRect(30, 30, 240, 240);

		// draws a rectangle around a new sun in a particular position
		Sun s = new Sun(550, 100, 50, Color.BLUE);
		s.drawOn(sung);
		graphics.drawRect(515, 65, 120, 120);

		// draw little suns
		for (int i = 0; i < SunComponent.NUM_LITTLE_SUNS; i++) {
			Sun little = new Sun(SunComponent.LITTLE_SUNS_X_OFFSET + SunComponent.LITTLE_SUN_SEPARATION * i,
					SunComponent.LITTLE_SUNS_Y, SunComponent.LITTLE_SUN_SIZE, SunComponent.LITTLE_SUN_COLOR);
			little.drawOn(sung);
		}

	}

}

import java.awt.Dimension;

import javax.swing.JFrame;

public class SunViewer {
	// set up the dinmension of the frame of sun viewer
	private static final Dimension FRAME_SIZE = new Dimension(600, 400);

	/**
	 * Starts the viewer.
	 *
	 * @param args
	 *            ignored
	 */
	public static void main(String[] args) {
		JFrame SceneFrame = new JFrame();
		// set up the title and size of frame
		SceneFrame.setTitle("Suns!");
		SceneFrame.setSize(FRAME_SIZE);
		// add the graphs in SunCompnent class to frame
		SceneFrame.add(new SunComponent());

		SceneFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		SceneFrame.setVisible(true);
	}

}

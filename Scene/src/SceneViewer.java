import java.awt.Dimension;

import javax.swing.JFrame;

public class SceneViewer {
	// set up the length and width of frame
	private static final Dimension FRAME_SIZE = new Dimension(750, 600);

	/**
	 * Starts the viewer.
	 *
	 * @param args
	 *            ignored
	 */
	public static void main(String[] args) {
		JFrame Frame = new JFrame();
		// set up the title and size
		Frame.setTitle("Suns!");
		Frame.setSize(FRAME_SIZE);
		// add the graph from SceneComponent
		Frame.add(new SceneComponent());

		Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Frame.setVisible(true);
	}

}
import org.junit.Test;

public class SceneTest {

	@Test
	public void testSceneDrawing() {
		/*
		 * File temp = new File("src\\comparisonResult-scene.png"); if
		 * (temp.exists()) { temp.delete(); } JFrame frame = new JFrame();
		 * 
		 * SceneComponent component = new SceneComponent();
		 * component.setSize(750,600); frame.pack(); frame.validate();
		 * frame.setVisible(true);
		 * 
		 * BufferedImage actual = getScreenShot(component);
		 * 
		 * BufferedImage expected = null; try { expected = ImageIO.read(new
		 * File("src/expected-scene.png")); } catch (IOException e1) { // TODO
		 * Auto-generated catch block e1.printStackTrace(); }
		 * 
		 * 
		 * BufferedImage comparisonImage = new
		 * BufferedImage(expected.getWidth(), expected.getHeight(),
		 * expected.getType());
		 * 
		 * boolean failed = false; assertNotNull(expected);
		 * assertEquals(expected.getHeight(), actual.getHeight());
		 * assertEquals(expected.getWidth(), actual.getWidth()); for (int
		 * i=0;i<expected.getWidth();i++) { for (int
		 * j=0;j<expected.getHeight();j++) { int rgb = expected.getRGB(i, j);
		 * comparisonImage.setRGB(i, j, rgb); if (rgb != actual.getRGB(i, j)) {
		 * comparisonImage.setRGB(i, j, Color.red.getRGB()); failed = true; } }
		 * } if (failed) { try { ImageIO.write(comparisonImage, "png", new
		 * File("src\\comparisonResult-scene.png")); System.out.println(
		 * "Comparison failed, see src\\comparisonImage-scene.png for more details. "
		 * + "This can be found by refreshing the src folder in your code." +
		 * "Red was not used in the test case, anything in red represents items that do not match."
		 * ); } catch (IOException e) { System.out.println(
		 * "Comparison image could not be saved."); }
		 * 
		 * } assertFalse(failed);
		 * 
		 * 
		 * } public static BufferedImage getScreenShot( Component component) {
		 * 
		 * BufferedImage image = new BufferedImage( component.getWidth(),
		 * component.getHeight(), BufferedImage.TYPE_INT_RGB ); // call the
		 * Component's paint method, using // the Graphics object of the image.
		 * component.paint( image.getGraphics() ); // alternately use
		 * .printAll(..) return image; }
		 * 
		 * private class TestComponent extends JComponent {
		 * 
		 * public TestComponent(int width, int height) { this.setSize(new
		 * Dimension(width, height)); this.setMinimumSize(new Dimension(width,
		 * height)); }
		 * 
		 * public void paintComponent(Graphics g) { Graphics2D g2 =
		 * (Graphics2D)g; Sun s = new Sun(); s.drawOn(g2);
		 * 
		 * s = new Sun(550, 100, 50, Color.BLUE); s.drawOn(g2);
		 * 
		 * 
		 * //draws a rectangle around the default sun g2.setColor(Color.cyan);
		 * g2.drawRect(30, 30, 240, 240); //draws a rectangle around the new sun
		 * in a particular position g2.drawRect(515, 65, 120, 120);
		 * 
		 * }
		 */
	}
}

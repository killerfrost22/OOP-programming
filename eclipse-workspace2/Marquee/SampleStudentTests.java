import java.awt.Color;
import cmscMarqueeLib.*;
import junit.framework.TestCase;

public class SampleStudentTests extends TestCase {

	/*
	 * You can use this method to see what your two-dimensional array of Cells[][]
	 * looks like. Once you run the method you might need to increase the window
	 * size otherwise you might not see the image. There is number of seconds the
	 * image will be displayed (you can change that value). You don't need to use
	 * this method, but it can help you debug your code.
	 */
	public static void displayMessageInWindow(Cell[][] toDisplay, int secondsToDisplayImage)
			throws InterruptedException {
		new MarqueeDisplay(toDisplay[0].length, toDisplay.length).displayMessage(toDisplay);
		Thread.sleep(secondsToDisplayImage * 1000);
	}

	public void test1() throws InterruptedException {
		int secondsToDisplayImage = 5;
		Cell[][] toDisplay = createImage(10, 20);

		displayMessageInWindow(toDisplay, secondsToDisplayImage);
	}

	public void test2() throws InterruptedException {
		int secondsToDisplayImage = 5;
		Cell[][] toDisplay = createImage(20, 30);

		displayMessageInWindow(toDisplay, secondsToDisplayImage);
	}

	/* Creates a test image; you can ignore this code */
	private static Cell[][] createImage(int maxRow, int maxCol) {
		Cell[][] toDisplay = new Cell[maxRow][maxCol];

		for (int row = 0; row < toDisplay.length; row++) {
			for (int col = 0; col < toDisplay[row].length; col++) {
				toDisplay[row][col] = new Cell(Color.BLUE);
			}
		}
		int targetRowIndex = 2;
		for (int col = 0; col < toDisplay[targetRowIndex].length; col++) {
			toDisplay[targetRowIndex][col] = new Cell(Color.YELLOW);
		}

		return toDisplay;
	}
}

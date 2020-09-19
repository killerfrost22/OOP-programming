package studentCode;
import java.awt.Color;

import cmsc131_GridTools.Grid_3x5;

public class test {
	private static Color AZURE = new Color(0,127,255);
	private static Color OLIVE = new Color(169, 208, 70);


	private static void helperField(Grid_3x5 grid, Color theColor) {
		//We want to paint the whole flag this one color.  To do
		//  this we can iterate through each row, and within that
		//  row iterate through each column.  At each position, 
		//  we'll set the color there to the one passed in.
		//The background color of a flag is known as the field 
		//  in the world of vexillology.
		for (int row=0; row<grid.getHt(); row++) {
			for (int col=0; col<grid.getWd(); col++) {
				grid.setColor(row, col, theColor);
			}
		}
	}

	private static void drawSillyExample(Grid_3x5 grid) {
		grid.setColor(3, 3, Color.RED);
		grid.setColor(0, 2, Color.BLUE);

		grid.setColor(grid.getHt()-1, grid.getWd()-1, Color.CYAN);
		grid.setColor(grid.getHt()-2, grid.getWd()-2, Color.CYAN);
		grid.setColor(grid.getHt()-3, grid.getWd()-3, Color.CYAN);
		grid.setColor(grid.getHt()-4, grid.getWd()-4, Color.CYAN);
		//HINT: Think about how these last four instructions 
		//      could have been done utilizing a for loop.
	}
}

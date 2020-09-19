package studentCode;
import java.awt.Color;
import GridTools.MyGrid;


public class FlagMaker {

	static int maxRow;
	static int maxCol;
	/* Draws a single flag as indicated by the second parameter */
	/* into the grid passed as the first parameter */
	public static void drawFlag(MyGrid grid, int countryCode) {
		
		// STUDENT CODE GOES HERE
		switch(countryCode) {
		case 1 :
			//Indonesia
			maxRow = grid.getHt() - 1;
			maxCol = grid.getWd() - 1;
			
			//test the height
			boolean even = (grid.getHt() % 2 == 0);
			
			//draw flag
			if(even == true) {
				//correct flag
				for(int row = 0; row < grid.getHt() / 2; row++) {
					for(int col = 0; col <= maxCol; col ++) {
						grid.setColor(row,col,Color.RED);
					}
				}
				
				for(int row = grid.getHt() / 2; row <= maxRow; row++) {
					for(int col = 0; col <= maxCol; col ++) {
						grid.setColor(row,col,Color.WHITE);
					}
				}
					
			}else {
				//false flag
				for(int row = 0; row <= maxRow; row++) {
					for(int col = 0; col <= maxCol; col++) {
						grid.setColor(row, col, Color.WHITE);
					}
				}
				grid.setColor(0, 0, Color.RED);
				grid.setColor(0, maxCol, Color.YELLOW);
				grid.setColor(maxRow, 0, Color.BLUE);
				grid.setColor(maxRow, maxCol, Color.GREEN);
			}
			
			break;
		
		case 2 : 
			//Lithuania
			maxRow = grid.getHt() - 1;
			maxCol = grid.getWd() - 1;
					
			//draw flag
			if(grid.getHt() % 3 == 0) { //test the height
				//correct flag
				int changeColor = grid.getHt() / 3;
				int colorYellow = changeColor - 1;
				int colorGreen = (changeColor * 2) - 1;
				
				for(int row = 0; row <= colorYellow; row++) {
					for(int col = 0; col <= maxCol; col ++) {
						grid.setColor(row,col,Color.YELLOW);
					}
				}
				
				for(int row = colorYellow + 1; row <= colorGreen; row++) {
					for(int col = 0; col <= maxCol; col ++) {
						grid.setColor(row,col,Color.GREEN);
					}
				}
				
				for(int row = colorGreen + 1; row <= maxRow; row++) {
					for(int col = 0; col <= maxCol; col ++) {
						grid.setColor(row,col,Color.RED);
					}
				}
				
			}else {
				//false flag
				for(int row = 0; row <= maxRow; row++) {
					for(int col = 0; col <= maxCol; col++) {
						grid.setColor(row, col, Color.WHITE);
					}
				}
				grid.setColor(0, 0, Color.RED);
				grid.setColor(0, maxCol, Color.YELLOW);
				grid.setColor(maxRow, 0, Color.BLUE);
				grid.setColor(maxRow, maxCol, Color.GREEN);
			}
			
			break;
		
		case 3 : 
			//Rwanda
			maxRow = grid.getHt() - 1;
			maxCol = grid.getWd() - 1;
			
			//draw flag
			if(grid.getHt() % 4 == 0) {	//test the height
				//correct flag
				int changeColor = grid.getHt() / 4;
				int colorBlue = (changeColor * 2) - 1;
				int colorYellow = (changeColor * 3) - 1;
				
				for(int row = 0; row <= colorBlue; row++) {
					for(int col = 0; col <= maxCol; col ++) {
						grid.setColor(row,col,Color.BLUE);
					}
				}
				
				for(int row = colorBlue + 1; row <= colorYellow; row++) {
					for(int col = 0; col <= maxCol; col ++) {
						grid.setColor(row,col,Color.YELLOW);
					}
				}
				
				for(int row = colorYellow + 1; row <= maxRow; row++) {
					for(int col = 0; col <= maxCol; col ++) {
						grid.setColor(row,col,Color.GREEN);
					}
				}
				
			}else {
				//false flag
				for(int row = 0; row <= maxRow; row++) {
					for(int col = 0; col <= maxCol; col++) {
						grid.setColor(row, col, Color.WHITE);
					}
				}
				grid.setColor(0, 0, Color.RED);
				grid.setColor(0, maxCol, Color.YELLOW);
				grid.setColor(maxRow, 0, Color.BLUE);
				grid.setColor(maxRow, maxCol, Color.GREEN);
			}
			
			break;
		case 4 : 
			//Malta
			maxRow = grid.getHt() - 1;
			maxCol = grid.getWd() - 1;
	
			//draw flag
			if(grid.getWd() % 2 == 0) {	//test the width
				//correct flag
				for(int col = grid.getHt(); col <= maxCol; col++) {
					for(int row = 0; row <= maxRow; row++) {
						grid.setColor(row, col, Color.RED);
					}
				}
				
				for(int col = 0; col < grid.getHt(); col++) {
					for(int row = 0; row <= maxRow; row++) {
						grid.setColor(row, col, Color.WHITE);
					}
				}
				
			}else {
				//false flag
				for(int row = 0; row <= maxRow; row++) {
					for(int col = 0; col <= maxCol; col++) {
						grid.setColor(row, col, Color.WHITE);
					}
				}
				grid.setColor(0, 0, Color.RED);
				grid.setColor(0, maxCol, Color.YELLOW);
				grid.setColor(maxRow, 0, Color.BLUE);
				grid.setColor(maxRow, maxCol, Color.GREEN);
			}
			
			break;
		case 5 : 
			//Afghanistan
			maxRow = grid.getHt() - 1;
			maxCol = grid.getWd() - 1;
			
			//draw flag
			if(grid.getWd() % 3 == 0) {	//check the width
				
				int changeColor = grid.getWd() / 3;
				int colorBlack = changeColor - 1;
				int colorRed = (changeColor * 2) - 1;
				
				for(int col = 0; col <= colorBlack; col++) {
					for(int row = 0; row <= maxRow; row++) {
						grid.setColor(row, col, Color.BLACK);
					}
				}
				
				for(int col = colorBlack + 1; col <= colorRed; col++) {
					for(int row = 0; row <= maxRow; row++) {
						grid.setColor(row, col, Color.RED);
					}
				}
				
				for(int col = colorRed + 1; col <= maxCol; col++)  {
					for(int row = 0; row <= maxRow; row++) {
						grid.setColor(row, col, Color.GREEN);
					}
				}
				
			}else {
				//false flag
				for(int row = 0; row <= maxRow; row++) {
					for(int col = 0; col <= maxCol; col++) {
						grid.setColor(row, col, Color.WHITE);
					}
				}
				grid.setColor(0, 0, Color.RED);
				grid.setColor(0, maxCol, Color.YELLOW);
				grid.setColor(maxRow, 0, Color.BLUE);
				grid.setColor(maxRow, maxCol, Color.GREEN);
			}
			
	
			break;
		case 6 :
			//Eritrea
			maxRow = grid.getHt() - 1;
			maxCol = grid.getWd() - 1;
			
			//set flag to red
			for(int row = 0; row <= maxRow; row++) {
				for(int col = 0; col <= maxCol; col++) {
					grid.setColor(row, col, Color.RED);
				}
			}
			
			//add color to flag
			//red
			for(int count = 1; grid.getWd() - (4 * count) >= 0; count++) {	
				//count is the row number
				System.out.println(maxCol - (4 * count));
				for(int col = 4 * count; col <= maxCol; col++) {
					grid.setColor(count - 1, col, Color.GREEN);
				}
			}
			
			//blue
			for(int count = 1; grid.getWd() - (4 * count) >= 0; count++) {	
				//count is the row number
				System.out.println(maxCol - (4 * count));
				for(int col = 4 * count; col <= maxCol; col++) {
					grid.setColor(maxRow - count + 1, col, Color.BLUE);
				}
			}
	
			break;
		case 7 : 
			//Macedonia
			maxRow = grid.getHt() - 1;
			maxCol = grid.getWd() - 1;
			
			//check valid
			if(grid.getHt() % 2 == 1 || grid.getHt() < 8) {
				//false flag
				for(int row = 0; row <= maxRow; row++) {
					for(int col = 0; col <= maxCol; col++) {
						grid.setColor(row, col, Color.WHITE);
					}
				}
				grid.setColor(0, 0, Color.RED);
				grid.setColor(0, maxCol, Color.YELLOW);
				grid.setColor(maxRow, 0, Color.BLUE);
				grid.setColor(maxRow, maxCol, Color.GREEN);
			} else {
				//draw flag
				
				//set flag to red
				for(int row = 0; row <= maxRow; row++) {
					for(int col = 0; col <= maxCol; col++) {
						grid.setColor(row, col, Color.RED);
					}
				}
				
				//draw two row in the middle
				for(int row = (grid.getHt() / 2) - 1; row <= (grid.getHt() /2 ); row++) {
					for (int col = 0; col <= maxCol; col++ ) {
						grid.setColor(row, col, Color.YELLOW);
					}
				}
				//draw two column in the middle
				for(int col = (grid.getWd() / 2) - 1; col <= (grid.getWd() / 2); col++) {
					for(int row = 0; row <= maxRow; row++) {
						grid.setColor(row, col, Color.YELLOW);
					}
				}
				//draw the central part
				for(int row = (grid.getHt() / 2) - 2; row <= (grid.getHt() / 2) + 1; row++) {
					for (int col = (grid.getWd() / 2) - 4; col <= (grid.getWd() / 2) + 3; col++) {
						grid.setColor(row, col, Color.YELLOW);
					}
				}
				
				//draw the "X" in the flag
				int row = 0;
				for(int space = 0; space <= maxCol - 1; space = space + 2) {
					int col1 = 0 + space;
					grid.setColor(row, col1, Color.YELLOW);
					grid.setColor(row, col1 + 1, Color.YELLOW);
					
					int col2 = maxCol - 1 - space;
					grid.setColor(row, col2, Color.YELLOW);
					grid.setColor(row, col2 + 1, Color.YELLOW);
					row = row + 1;
					
				}
				
								
			}
			
			break;
		case 8 : 
			//The Bahamas
			maxRow = grid.getHt() - 1;
			maxCol = grid.getWd() - 1;
			
			//check valid
			if(grid.getHt() % 3 == 0 && grid.getHt() % 6 != 0) {				
				//draw flag
				
				//paint the flag to black
				for(int row = 0; row <= maxRow; row++) {
					for(int col = 0; col <= maxCol; col++) {
						grid.setColor(row, col, Color.BLACK);
					}
				}
				
				//paint the blue part
				int count = 0;
				for(int space = 1; space <= grid.getHt() / 3; space++) {					
					for(int col = space; col <= maxCol; col++) {
						//paint the upper blue part
						grid.setColor(space - 1, col, Color.BLUE);
						//paint the lower blue part
						grid.setColor(maxRow + 1 - space, col, Color.BLUE);
					}
					count = space;
				}
				
				//paint the yellow part
				for(int row =  count; row <= (grid.getHt() + 1) / 2; row++) {
					for(int col = row + 1; col <= maxCol; col++) {
						grid.setColor(row, col, Color.YELLOW);
						grid.setColor(maxRow - row, col, Color.YELLOW);
					}
				}
								
			} else {

				//false flag
				for(int row = 0; row <= maxRow; row++) {
					for(int col = 0; col <= maxCol; col++) {
						grid.setColor(row, col, Color.WHITE);
					}
				}
				grid.setColor(0, 0, Color.RED);
				grid.setColor(0, maxCol, Color.YELLOW);
				grid.setColor(maxRow, 0, Color.BLUE);
				grid.setColor(maxRow, maxCol, Color.GREEN);
				
			}
			
			break;
			
		case 9 : 
			//Zimbabwe
			maxRow = grid.getHt() - 1;
			maxCol = grid.getWd() - 1;
			//init boundary
			int chageColor = grid.getHt() / 7;
			int green = chageColor -1;
			int yellow = chageColor * 2 - 1;
			int red = chageColor * 3 - 1;
			int black = chageColor * 4 - 1;
			//init space
			int space = 1;
			
			//check valid
			if(grid.getHt() % 7 == 0) {
				//draw flag
				
				//paint the flag to white
				for(int row = 0; row <= maxRow; row++) {
					for(int col = 0; col <= maxCol; col++) {
						grid.setColor(row, col, Color.WHITE);
					}
				}
				
				//paint the green part
				for(int rowGreen = 0; rowGreen <= green; rowGreen++) {					
					for(int colGreen = space; colGreen <=maxCol; colGreen++) {
						//paint the upper
						grid.setColor(rowGreen, colGreen, Color.GREEN);
						//paint the lower
						grid.setColor(maxRow - rowGreen, colGreen, Color.GREEN);
					}
										
					//increase space
					space = space + 1;
				}
				
				//paint the yellow part
				for(int rowYellow = green + 1; rowYellow <= yellow; rowYellow++) {
					for(int colYellow = space; colYellow <= maxCol; colYellow++) {
						//paint the upper
						grid.setColor(rowYellow, colYellow, Color.YELLOW);
						//paint the lower
						grid.setColor(maxRow - rowYellow, colYellow, Color.YELLOW);
					}
					
					//increase space
					space = space + 1;
				}
				
				//paint the red part
				for(int rowRed = yellow + 1; rowRed <= red; rowRed++) {
					for(int colRed = space; colRed <= maxCol; colRed++) {
						//paint the upper
						grid.setColor(rowRed, colRed, Color.RED);
						//paint the lower
						grid.setColor(maxRow - rowRed, colRed, Color.RED);
					}
					
					//increase space
					space = space + 1;
				}
				
				//paint the black part
				for(int rowBlack = red + 1; rowBlack <= black; rowBlack++) {
					for(int colBlack = space; colBlack <= maxCol; colBlack++) {
						//paint the upper
						grid.setColor(rowBlack, colBlack, Color.BLACK);
						//paint the lower
						grid.setColor(maxRow - rowBlack, colBlack, Color.BLACK);
					}
					
					//increase space
					space = space + 1;
				}
			}else {

				//false flag
				for(int row = 0; row <= maxRow; row++) {
					for(int col = 0; col <= maxCol; col++) {
						grid.setColor(row, col, Color.WHITE);
					}
				}
				grid.setColor(0, 0, Color.RED);
				grid.setColor(0, maxCol, Color.YELLOW);
				grid.setColor(maxRow, 0, Color.BLUE);
				grid.setColor(maxRow, maxCol, Color.GREEN);
				
			} 
			
			break;
					
		case 10 : 
	
			break;
			
		case 99 :
			//error flag(Incorrect size)
			maxRow = grid.getHt() - 1;
			maxCol = grid.getWd() - 1;
			for(int row = 0; row <= maxRow; row++) {
				for(int col = 0; col <= maxCol; col++) {
					grid.setColor(row, col, Color.WHITE);
				}
			}
			grid.setColor(0, 0, Color.RED);
			grid.setColor(0, maxCol, Color.YELLOW);
			grid.setColor(maxRow, 0, Color.BLUE);
			grid.setColor(maxRow, maxCol, Color.GREEN);
			break;
		
		default : 
			//error flag(Invalid code)
			maxRow = grid.getHt() - 1;
			maxCol = grid.getWd() - 1;
			for(int row = 0; row <= maxRow; row++) {
				for(int col = 0; col <= maxCol; col++) {
					grid.setColor(row, col, Color.WHITE);
				}
			}
			grid.setColor(0, 0, Color.RED);
			grid.setColor(0, maxCol, Color.YELLOW);
			grid.setColor(maxRow, 0, Color.BLUE);
			grid.setColor(maxRow, maxCol, Color.GREEN);
			break;

		}
	} 
}
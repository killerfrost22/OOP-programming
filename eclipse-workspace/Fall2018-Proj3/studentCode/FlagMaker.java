package studentCode;
import java.awt.Color;

import cmsc131_GridTools.Grid_3x5;


public class FlagMaker {
	private static Color AZURE = new Color(0,127,255);
	private static Color OLIVE = new Color(169, 208, 70);

	//You should read and get comfortable with these provided methodS
	//  as your first step - understand what they do and why.

	//Think about how you can write your "draw" methods and some other 
	//  helper methods as you work on the remaining flags.




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

	private static void drawSultanateOfMuscat(Grid_3x5 grid) {
		//Since this is just a solid red flag, we'll call the
		//  helper we have to do the work.
		helperField(grid, Color.RED);
	}





	//This is a more complex helper method that we provide
	//  it draws a diamond in the center of a grid that is 
	//  sent to it, using the specified color.
	//You might find it interesting to read the code, but
	//  you can use this helper without doing that since 
	//  you do know what it does at the abstract level.
	private static void helperCenterDiamond(Grid_3x5 grid, Color theColor) {
		//The diamond will be 2/3rds the height of the flag and centered.

		int anchorRow = grid.getHt()/3 * 3/2;
		int anchorCol = grid.getWd()/2;

		int totalRadius=grid.getHt()/3;

		for (int currRadius=0; currRadius<totalRadius; currRadius++) {
			int sizeOfSegment = totalRadius-currRadius;
			for (int distFromAnchor=0; distFromAnchor<sizeOfSegment; distFromAnchor++) {
				grid.setColor(anchorRow-currRadius, anchorCol-distFromAnchor, theColor);
				grid.setColor(anchorRow-currRadius, anchorCol+distFromAnchor, theColor);
				grid.setColor(anchorRow+currRadius, anchorCol-distFromAnchor, theColor);
				grid.setColor(anchorRow+currRadius, anchorCol+distFromAnchor, theColor);
			}
		}
	}




	/* Draws a single flag as indicated by the second parameter
	 * into the grid passed as the first parameter.  We provide 
	 * the starter code here that will correctly call the helper
	 * to draw the silly example flag and the flag of the Sultanate 
	 * Of Muscat.  
	 * 
	 * As you work on the flag for each task, you'll need to 
	 * (a) modify this method to add the option, and 
	 * (b) write the helper method(s) that it calls.
	 */
	public static void drawFlag(Grid_3x5 grid, int flagCode) {
		//Our silly example flag just needs to have flagCode as 0
		if (flagCode==0) {
			drawSillyExample(grid);	
		}

		//Our next flag is that of the Sultanate of Muscat
		//so our condition has:
		//   - a check for that flag's code, 1
		//   - a check to make sure the height of the grid
		//      passed in is odd
		//   - a check to make sure the height of the grid
		//      passed in is at least 7
		else if (flagCode==1   &&   grid.getHt()%2==1   &&   grid.getHt()>=7) {
			drawSultanateOfMuscat(grid);
		}
		else if (flagCode==2  && grid.getHt()%2==1 && grid.getHt()>=7) {
			Rif(grid);
		}
		else if (flagCode==3  && grid.getHt()%2==0 && grid.getHt()>=4) {
			Canton(grid);	
		}
		else if (flagCode==4  && grid.getHt()%2==0 && grid.getHt()>=4) {
			Prague(grid);	
		}
		else if (flagCode==5  && grid.getHt()%2==1 && grid.getWd()%2==1) {
			SantaCatarina(grid);
		}
		else if (flagCode==6  && grid.getHt()%2==0 && grid.getHt()>=4) {
			Norfolk(grid);
		}
		else if (flagCode==7  && grid.getHt()%2==0 && grid.getWd()%10==0) {
			Vincent(grid);
		}
		else if (flagCode==8  && grid.getHt()%2==1 && grid.getHt()>=7) {
			HourGlassville(grid);
		}
		else if (flagCode==9  && grid.getHt()%2==1 && grid.getHt()>=7) {
			Sheltopia(grid);
		}
		else if (flagCode==10  && grid.getHt()%2==1 && grid.getHt()>=7) {
			Youville(grid);
		}
		
		
		
		
		//ADD THE TESTS/FILTERS FOR EACH ADDITIONAL FLAG HERE
		//  AS YOU IMPLEMENT THE TASKS







		//THE LAST "ELSE" IN THE CHAIN SHOULD CALL THE ERROR FLAG
		else{
			drawError(grid);
		}
	}



	//YOUR FIRST TASK'S DRAW METHOD GOES HERE - WE'VE PROVIDED THE
	//  SIGNATURE TO HELP POINT YOU IN THE RIGHT DIRECTION FOR THIS
	//  AND FUTURE FLAG DRAWING METHODS
	private static void drawError(Grid_3x5 grid){
		//YOUR CODE HERE
		
		//test the scale 
		
		int maxRow = grid.getHt()-1;
		int maxCol = grid.getWd()-1;
		
		for(int row =0; row< grid.getHt(); row++)
			for(int col = 0; col < grid.getWd(); col++) {
				grid.setColor(row, col, Color.WHITE);				
		}
		grid.setColor(0, maxCol, Color.GREEN);
		grid.setColor(maxRow, 0, Color.BLUE);
		grid.setColor(0, 0, Color.RED);
		grid.setColor(maxRow, maxCol, Color.ORANGE);
		
	
		
			for(int row =0; row< grid.getHt(); row++)
				for(int col = 0; col < grid.getWd(); col++) {
					grid.setColor(row, col, Color.WHITE);				
			}
			grid.setColor(0, maxCol, Color.GREEN);
			grid.setColor(maxRow, 0, Color.BLUE);
			grid.setColor(0, 0, Color.RED);
			grid.setColor(maxRow, maxCol, Color.ORANGE);
			
		}
		
		//draw error finished!!!
	
	
		private static void Rif(Grid_3x5 grid){
			for(int row =0; row< grid.getHt(); row++)
				for(int col = 0; col < grid.getWd(); col++) {
					grid.setColor(row, col, Color.RED);
			}//make a red background
			
			//now find the white area
			int row = grid.getHt()/3 * 3/2;
			int col = grid.getWd()/2;

			int totalRadius=grid.getHt()/3;

			for (int currRadius=0; currRadius<totalRadius; currRadius++) {
				int sizeOfSegment = totalRadius-currRadius;
				for (int distFromAnchor=0; distFromAnchor<sizeOfSegment; distFromAnchor++) {
					grid.setColor(row-currRadius, col-distFromAnchor, Color.WHITE);
					grid.setColor(row-currRadius, col+distFromAnchor, Color.WHITE);
					grid.setColor(row+currRadius, col-distFromAnchor, Color.WHITE);
					grid.setColor(row+currRadius, col+distFromAnchor, Color.WHITE);
				}}
		}
		
		private static void Canton(Grid_3x5 grid){
		// fill in the row Function 
		// fill in the column
			
			//draw flag		
			
				//correct flag
				for(int row =0; row< grid.getHt() / 2; row++)
					for(int col = 0; col < grid.getWd(); col++) {
					grid.setColor(row, col, Color.PINK);
					}
				for(int row = grid.getHt() / 2; row <grid.getHt(); row++)
					for(int col = 0; col < grid.getWd(); col++) {
						grid.setColor(row, col, Color.CYAN);
						}
			
		}
			
					
		private static void Prague(Grid_3x5 grid){
			for(int row =0; row< grid.getHt() / 2; row++)
				for(int col = 0; col < grid.getWd(); col++) {
				grid.setColor(row, col, Color.YELLOW);
				}
			for(int row = grid.getHt() / 2; row <grid.getHt(); row++)
				for(int col = 0; col < grid.getWd(); col++) {
					grid.setColor(row, col, Color.RED);
				}
		}
		private static void SantaCatarina(Grid_3x5 grid){
		
			//I will make the background color here
			//the top color red
			for(int row =0; row< grid.getHt()/3; row++)
				for(int col = 0; col < grid.getWd(); col++) {
					grid.setColor(row, col, Color.RED);			
				}
			//the mid color white 
			for(int row =grid.getHt()/3; row< (2*grid.getHt())/3; row++)
				for(int col = 0; col < grid.getWd(); col++) {
					grid.setColor(row, col, Color.WHITE);				
				}
			//the bottom color white 
			for(int row =(2*grid.getHt())/3; row< (3*grid.getHt())/3; row++)
				for(int col = 0; col < grid.getWd(); col++) {
					grid.setColor(row, col, Color.RED);						
					
				}
			helperCenterDiamond(grid,OLIVE);
		}
		private static void Norfolk(Grid_3x5 grid){
		//The left part 
			for(int row =0; row<grid.getHt(); row++)
				for(int col = 0; col < (0.3*grid.getWd()); col++) {
					grid.setColor(row, col, Color.GREEN);	
			}
		//The mid part which is white
			for(int row =0; row<grid.getHt(); row++)
				for(int col = (int) (0.3*grid.getWd()); col < (0.7*grid.getWd()); col++) {
					grid.setColor(row, col, Color.WHITE);	
			}
		//The right part which is green
			for(int row =0; row<grid.getHt(); row++)
				for(int col = (int)(0.7*grid.getWd()); col < grid.getWd(); col++) {
					grid.setColor(row, col, Color.GREEN);	
			}
		}
		
		private static void Vincent(Grid_3x5 grid){
			//The left part
			for(int row =0; row<grid.getHt(); row++)
				for(int col = 0; col < (0.3*grid.getWd()); col++) {
					grid.setColor(row, col, Color.BLUE);	
			}
		//The mid part which is white
			for(int row =0; row<grid.getHt(); row++)
				for(int col = (int) (0.3*grid.getWd()); col < (0.7*grid.getWd()); col++) {
					grid.setColor(row, col, Color.YELLOW);	
			}
		//The right part which is green
			for(int row =0; row<grid.getHt(); row++)
				for(int col = (int)(0.7*grid.getWd()); col < grid.getWd(); col++) {
					grid.setColor(row, col, Color.GREEN);	
			}
		//If a non-multiple of ten is given, the error flag must be drawn instead.
			//what does this mean??
		}
		private static void HourGlassville(Grid_3x5 grid){
			//Background
			for(int row =0; row< grid.getHt(); row++)
				for(int col = 0; col < grid.getWd(); col++) {
					grid.setColor(row, col, Color.GREEN);
				}
			//The glass now 
			int radius = grid.getHt()/2;
			
			for(int row =0; row <= radius; row++) {
				for(int col = 0; col <= row; col++) {
					grid.setColor(row, col, Color.BLACK);
				}
			}
			for(int row =radius; row <= grid.getHt(); row++) {
				for(int col = 0; col <= grid.getHt()-row-1; col++) {
					grid.setColor(row, col, Color.BLACK);
				}
			}
			for(int row = 0; row <= radius ; row++) {
				for(int col = grid.getWd()-1; col >= grid.getWd()-row-1; col--) {
					grid.setColor(row, col, Color.BLACK);
					}
			}
			for(int row = radius; row <= grid.getHt(); row++) {
				for(int col = grid.getWd()-1; col >= grid.getWd()-grid.getHt()+row; col--) {
						grid.setColor(row, col, Color.BLACK);					
						}
					}
				}
			

		

		
		private static void Sheltopia(Grid_3x5 grid){
		
		
		}
		private static void Youville(Grid_3x5 grid){
		}
}
	//Your individual drawing methods for the flags, 
	//  and any helpers that you write for the tasks 
	//  should be added by you down here as you go...



	
	
	
	
	





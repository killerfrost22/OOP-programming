import java.awt.Color;

import cmscMarqueeLib.Alphabet;
import cmscMarqueeLib.Cell;
import cmscMarqueeLib.ConfigValues;
import cmscMarqueeLib.DataManager;

public class MarqueeDataManager implements DataManager{
	private String message;
	private int animaPattern;
	private int count=0;
	private Cell [] [] shifting;
	private int height = ConfigValues.MARQUEE_HEIGHT;
	private int width = ConfigValues.MARQUEE_WIDTH;
	private Color original= ConfigValues.BACKGROUND_COLOR;
	private int emptyCol= ConfigValues.EMPTY_COLUMNS_BETWEEN_CHARS;
	
	//
	public MarqueeDataManager(String message, int animaPatern) {
		this.message = message.trim();
		this.animaPattern = animaPattern;
		Cell[][] spacing = new Cell[height][emptyCol];
		for(int i = 0;i < height; i++) {
			spacing[i][0] =  new Cell(original);
		}
		shifting = generatingEmptyCellArray()
	}
	
	
	//Once you have created the padded array, each call to step() returns a 2-dimensional subarray of this array called the "window". 
	//Each window is exactly the same in size as the marquee. 
	//The window starts at the left end of the padded array and each call to step() causes it to slide one column to the right. 
	//Copy the contents to a 2-dimensional array, which is then returned as the result of step().
	public Cell [] [] step(){
		Cell[] [] view = new Cell [height][width];
			for(int i = 0; i < view.length; i++) {
				for(int j = 0; j < view[0].length; j++) {
					view[i][j] = shifting[i][j+count];
				}
			}
				count++;
				if(count == shifting[0].length- width) {
					count =0;
				}
			
			return view;
	}
	/*Adds new letter to original array which is whole marquee
	  returns an array w all the rows of the first appended to the second.
	  adds empty column between letters*/
	public Cell[][] appendArrays(Cell[][] first, Cell[][]second){
		Cell[][] appendedArr;
		if(first[0][0] != null){
			appendedArr = new Cell[height][first[0].length+ConfigValues.CHARACTER_WIDTH+1];
		} else {
			appendedArr = new Cell[height][ConfigValues.CHARACTER_WIDTH];
		}

		if(first[0][0] !=null){
			for(int row = 0; row < first.length; row++){
				for(int col = 0; col < first[row].length; col++){
					appendedArr[row][col] = first[row][col];

				}
				
				for(int whiteCol = 0; whiteCol < 1; whiteCol++){
					appendedArr[row][first[0].length] = new Cell(Color.WHITE);
				}//adds white column between the letters
				
				for(int k = 0; k < second[row].length; k++){
					appendedArr[row][first[0].length+k+1] = second[row][k];
				}
			}

		} else {
			for(int row = 0; row < second.length; row++){
				for(int col = 0; col < second[row].length; col++){
					appendedArr[row][col] = second[row][col];
				}

			}

		}/*adds letter to the array if the's empty, otherwise adds original array
			a space and new letter*/
		
		return appendedArr;
	}
	public Cell[] [] appendCell(Cell[] [] pre, Cell [] [] after ){
		Cell[][] result = new Cell[pre.length][pre[0].length + after[0].length];
		for(int x = 0; x< pre.length; x++) {
			for(int y = 0; y <pre.length;y++) {
				result[x][y] = pre[x][y];
			}
		}
		
		for(int x = 0; x< pre.length; x++) {
			for(int y = 0; y < after[0].length;y++) {
				result[x][y+pre.length] = after[x][y];
			}
		}
		return result;
	}
	public Cell[] [] generatingEmptyCellArray(int x, int y) {
		Cell[][] empty= new Cell[x][y];
		for(int i = 0; i < empty.length; i++) {
			for(int j = 0; j<empty[0].length;j++) {
				empty[i][j] = new Cell(original);
			}
		}
		return empty;
	}
}


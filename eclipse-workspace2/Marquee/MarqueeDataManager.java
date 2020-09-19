import java.awt.Color;

import cmscMarqueeLib.Alphabet;
import cmscMarqueeLib.Cell;
import cmscMarqueeLib.ConfigValues;
import cmscMarqueeLib.DataManager;

public class MarqueeDataManager implements DataManager {
	 
	private String message;
	private int animaPattern;
	private final int height = ConfigValues.MARQUEE_HEIGHT;
	private final int width = ConfigValues.MARQUEE_WIDTH;
	private Cell[][] shiftingArray;
	private Color original= ConfigValues.BACKGROUND_COLOR;
	private Color red = ConfigValues.FOREGROUND_COLOR;
	private static int count;
	private int trimWidth = ConfigValues.CHARACTER_WIDTH;
	//constructor
	
	public MarqueeDataManager(String message, int animaPattern){
		this.message = message.trim();
		this.animaPattern = animaPattern;
		
		Cell[][] letter; 
		shiftingArray = new Cell[height][width*message.length()];
		int i = 0;
		while(i < message.length()) {
			int[][] test = Alphabet.toIntArray(message.charAt(i));
	System.out.println(i);
			letter = MessageToCell(test);
			shiftingArray = appendArrays(shiftingArray, letter);
			//System.out.println(letter);
			i++;
		}
		shiftingArray = generatingEmptyCellArray(shiftingArray);
	}
	
	public Cell[][] MessageToCell(int[][] letter){
		Cell[][] result = new Cell[letter.length][letter[0].length];
		
		for(int i = 0 ; i < letter.length; i++){
			int g =0;
			while(g < letter[i].length) {
				if(letter[i][g]==0){
					result[i][g] = new Cell(original);
					g++;
				} else {
					result[i][g] = new Cell(red);
					g++;
				}
			}
		}
		return result;
	}	
	
	public Cell[][] step(){
		Cell[][] View = new Cell[height][width];
		for (int i = 0; i < View.length; i++) {
			for (int j = 0; j < View[0].length; j++) {
				View[i][j] = shiftingArray[i][j + count];
			}
		}
		count++;
		if (count == shiftingArray[0].length - width) {
			count = 0;
		}
		System.out.println(count);
		return View;
	}

	public Cell[][] appendArrays(Cell[][] shiftingArray, Cell[][]letter){
		Cell[][] result;
		Cell xx= shiftingArray[0][0];
		if(xx != null){
			result = new Cell[height][shiftingArray[0].length+trimWidth+1];
			for(int i = 0; i < shiftingArray.length; i++){
				int x =0;
				while(x < shiftingArray[i].length) {
				result[i][x] = shiftingArray[i][x];
				x++;
				}
				int k =0;
				while(k<letter[i].length) {
					result[i][shiftingArray[0].length+k+1] = letter[i][k];
					k++;
				}
				int whiteC =0;
				while(whiteC < 1) {
					result[i][shiftingArray[0].length] = new Cell(original);
				whiteC++;
				}
			}
		} else {
			result = new Cell[height][trimWidth];
			for(int i = 0; i < letter.length; i++){
				for(int x = 0; x < letter[x].length; x++){
					result[i][x] = letter[i][x];
				}
			}
		}
		return result;
	}
	
	public Cell[][] generatingEmptyCellArray(Cell[][] input){
		Cell[][] paddedArr = new Cell[input.length][2*width+input[0].length];
		//int daa = 0； 
		for(int i = 0; i < paddedArr.length; i++){
			for(int j = 0; j < width; j++){
				paddedArr [i][j] = new Cell(original);
			}
			//daa++；
			for(int k = width; k < width + input[0].length; k++){
				paddedArr[i][k] = input[i][k-width];
			}
			for(int l = width + input[0].length;l < paddedArr[i].length; l++){
				paddedArr [i][l] = new Cell(original);
			}
		}
		return paddedArr;
	}
}
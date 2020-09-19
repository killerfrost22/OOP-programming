package p4_student;

import cmsc131PhotoLibrary.Photograph;
import cmsc131PhotoLibrary.Pixel;

/**
 * The methods in this class are to be implemented by you.  
 * This class starter file provides various static methods that take 
 * a photograph and produce a new one based on it, but with various 
 * modifications.
 * 
 * See the project description for details of method implementations.
 * 
 * @author PUT YOUR NAME HERE
 *
 */
public class PhotoTools {


	//This method is provided as a starting point.  Please read through
	//  it and think about what it does and why - if you aren't sure of
	//  something, ask us in office hours.  
	//Do not alter this code.  It is used by the GUI.
	public static Photograph copy(Photograph photo) {
		Photograph newPhoto = new Photograph(photo.getWd(), photo.getHt());
		for (int x=0; x<photo.getWd(); x++) {
			for (int y=0; y<photo.getHt(); y++) {
				newPhoto.setPixel(x, y, photo.getPixel(x, y));
			}
		}
		return newPhoto;
	}






	public static Photograph isolateColor(Photograph photo, int type) {
//This method will return a new Photograph that is a copy of the parameter, 
//but with only one of the three primary colors visible; specifically either the red or the blue 
//In other words, for each pixel in the new photo, one of the primary colors will remain unchanged, but the other two will be set to zero. 
//The second parameter, type, will be used to specify which color will remain; it will be:   0 for red or 1 for blue. 
//For example, if the type is 1 (blue), then each pixel in the new photo will preserve the original blue value,
//but will have the red and green values set to 0.As you design this, think about how you can avoid redundant code. 
		
		//the copy of the parameter
		if (type == 1 ) {
			Photograph BlueOnly = new Photograph (photo.getWd(), photo.getHt());
				for(int row =0; row<photo.getHt();row++) {
					for(int col = 0; col < photo.getWd(); col++) {
						Pixel originalPix = photo.getPixel(col, row);
						int blue = originalPix.getBlue();
						BlueOnly.setPixel(col,row,new Pixel(0,0,blue));
					}
				}
				return BlueOnly;
		}

		else {
			Photograph RedOnly = new Photograph (photo.getWd(), photo.getHt());
			for(int row =0; row<photo.getHt();row++) {
				for(int col = 0; col< photo.getWd(); col++) {
					Pixel originalPix = photo.getPixel(col, row);
					int red = originalPix.getRed();
					RedOnly.setPixel(col,row,new Pixel(red,0,0));
		
				}
				
			}		return RedOnly;
		}
	}




	public static Photograph makeGrayscale(Photograph photo) {
		
		Photograph makethegrey = new Photograph (photo.getWd(), photo.getHt());
		for(int col =0; col<photo.getWd();col++) {
			for(int row = 0; row< photo.getHt(); row++) {
				Pixel originalPix = photo.getPixel(col, row);
				int red = originalPix.getRed();
				int green = originalPix.getGreen();
				int blue = originalPix.getBlue();
				int grayValue = (int)(red * 0.1) + (int)(green * 0.1) + (int)(blue * 0.8);				
				makethegrey.setPixel(col,row,new Pixel(grayValue, grayValue,grayValue));
	
			}
			
		}		return makethegrey;
	}






	public static Photograph makeArtistic(Photograph photo) {
		Photograph makeArtistic = new Photograph (photo.getWd(), photo.getHt());
		for(int col =0; col<photo.getWd();col++) {
			for(int row = 0; row< photo.getHt(); row++) {
		Pixel originalPix = photo.getPixel(col, row);
		int red = originalPix.getRed();
		int green = originalPix.getGreen();
		int blue = originalPix.getBlue();
		int addup = red + green + blue;
		if (addup <= 191 ) {
			makeArtistic.setPixel(col,row,new Pixel(0, 0, 0));
				}
		else if (addup <= 343) {
			makeArtistic.setPixel(col,row,new Pixel(63, 63, 63));
		}
		else if (addup <= 575) {
			makeArtistic.setPixel(col,row,new Pixel(127, 127, 127));
		}
		else if (addup <= 765) {
			makeArtistic.setPixel(col,row,new Pixel(255, 255, 255));
			}
	}
}
		return makeArtistic;	
	}


	public static Photograph censorIt(Photograph photo) {
		Photograph censorIt = new Photograph (photo.getWd(),photo.getHt());
		Pixel newPixel = new Pixel (0,0,0);
		int colTotal=photo.getWd()/10;
		int rowTotal=photo.getHt()/10;
		int colLeft=photo.getWd()%10;
		int rowLeft=photo.getHt()%10;
		int rowBoundry=0;
		int colBoundry=0;
		int pixelNum=0;
		int rowPixNum=0;
		int colPixNum=0;
		
		for(int colNum =0; colNum<=colTotal;colNum++) {
			for(int rowNum = 0; rowNum< rowTotal; rowNum++) {
		
				colBoundry = colNum*10 + 10;
				rowBoundry = rowNum*10 + 10;
				rowPixNum=10;
				colPixNum=10;
				if(colNum==colTotal) {
					colBoundry=photo.getWd();
					colPixNum=rowLeft;
				}
				
				if(rowNum==rowTotal) {
					rowBoundry=photo.getHt();
					rowPixNum=rowLeft;
				}
				pixelNum = colPixNum*rowPixNum;
				int redaddup=0;
				int greenaddup=0;
				int blueaddup=0;
				int reda=0;
				int greena=0;
				int bluea=0;
				if ((colLeft==0 && colNum==colTotal) || (rowLeft==0 && rowNum == rowTotal)) {
					
				}else {
					for (int x = colNum*10;x<colBoundry;x++) {
						for(int y = rowNum*10; y< rowBoundry; y++) {
							
							redaddup+=photo.getPixel(x,y).getRed();
							greenaddup+=photo.getPixel(x,y).getGreen();
							blueaddup+=photo.getPixel(x,y).getBlue();
							
						if((x==(colBoundry-1) && y==(rowBoundry-1))) {
							reda= redaddup/pixelNum;
							greena= greenaddup/pixelNum;
							bluea = blueaddup/pixelNum;
							
							for (int m = colNum*10;m<colBoundry;m++) {
								for(int n = rowNum*10; n< rowBoundry; n++) {
									newPixel= new Pixel(reda,greena,bluea);
									censorIt.setPixel(m,n,newPixel);
								}
						
						
						}
						}
						}
					}
				}
			}
		}
		return censorIt;
				}
					
					
			
						
						
						
					
		
        // - we will process things in 10x10 sections
        // - within each 10x10 section what we will do is:
        //    - take the average of all the red channels of the
        //        pixels in that section of the original and use 
        //        that as the red channel for all of the pixels in 
        //        that section in the new image
        //    - we'll use the same approach for the green and 
        //        blue channels
        // - if a section is not 10x10 (think about the edges)
        //    then we'll just take the average of the pixels that
        //    are in those edge sections
            

		
		
		
		
		//HINT: To deal with the edge cases, you'll want to 
		//      check you aren't going out of bounds in the
		//      middle of your nested nesting of loops...


	

	public static Photograph stretched(Photograph photo, int type) {
		
		if (type == 0 ) {		
			Photograph stretched = new Photograph (2*photo.getWd(),photo.getHt());
			for(int col =0; col<photo.getWd();col++) {
				for(int row = 0; row<photo.getHt(); row++) {					
					stretched.setPixel(2*col,row,photo.getPixel(col,row));
					stretched.setPixel(2*col+1,row,photo.getPixel(col,row));
	
				}
			}		
			return stretched;
			
		}
		else  {		
			Photograph stretched = new Photograph (photo.getWd(),2*photo.getHt());
			for(int col1 =0; col1<photo.getWd();col1++) {
				for(int row1 = 0; row1<photo.getHt(); row1++) {
					Pixel originalPix = photo.getPixel(col1, row1);
					stretched.setPixel(col1,2*row1,originalPix);
					stretched.setPixel(col1,2*row1+1,originalPix);
					
				
				}
			}
			return stretched;
		
		}
	
		
	}



	public static Photograph mirrorIt(Photograph photo) {
		Photograph mirrorIt = new Photograph (photo.getWd(),photo.getHt());
		for (int x=0; x<photo.getWd(); x++) {
			for (int y=0; y<photo.getHt(); y++) {
				mirrorIt.setPixel(photo.getWd()-1-x, y, photo.getPixel(x, y));
	
		
		
			}	
	}
		return mirrorIt;
	}

	public static Photograph makeDoubleWithMirror(Photograph photo) {
		Photograph doublemirror = new Photograph (photo.getWd()*2,photo.getHt());
		for (int x=0; x<photo.getWd(); x++) {
			for (int y=0; y<photo.getHt(); y++) {
				doublemirror.setPixel(photo.getWd()-1-x, y, photo.getPixel(x, y));
				doublemirror.setPixel(photo.getWd()+x, y, photo.getPixel(x, y));
		
		
			}	
	}
		return doublemirror;
	}



	//Challenges down here.

	public static Photograph rotated(Photograph photo) {		
		Photograph newphoto = new Photograph (photo.getHt(),photo.getWd());
		for (int x=0; x<photo.getWd(); x++) {
			for (int y=0; y<photo.getHt(); y++) {
				Pixel originalPix = photo.getPixel(x, y);
				photo.setPixel(photo.getWd()-y, x,originalPix);
			}
		}
		return newphoto;
	}

	public static Photograph upsideDown(Photograph photo) {
		throw new RuntimeException("You might implement this...");

		//DON'T FORGET - THIS ONE SHOULD BE ONE LINE OF CODE!
		//  THIS CHALLENGE INVOLVES MORE THINKING THAN CODING!
	}
	
	
	

	public static Photograph wacky(Photograph photo) {
		throw new RuntimeException("You might implement this...");

		//This one is just a place for you to explore ideas if you want to...
	}



}

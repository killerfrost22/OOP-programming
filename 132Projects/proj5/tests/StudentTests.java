package tests;

import org.junit.*;

import picture.Picture;
import picture.Shape;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Iterator;

public class StudentTests {
  
	 @Test public void testPublic11() {
		    Picture picture= TestData.examplePicture();
		    Iterator<Shape> iter= picture.iterator();
		    Shape[] expectedShapes= Arrays.copyOf(TestData.shapeArr,
		                                          TestData.shapeArr.length);
		    int i;
//		    System.out.print(iter.next());
		    iter.next();
		    iter.remove();

		    // check the remaining four elements (findShape() is calling the Shape
		    // equals() method)
		    for (i= 1; i <= 9; i++)
//		    	System.out.println(iter.next());
		      assertTrue(TestData.findShape(expectedShapes, iter.next()));
		  
} 
	 @Test public void testPublic12() {
		    Picture picture= TestData.examplePicture();
		    Iterator<Shape> iter= picture.iterator();
		    Shape[] expectedShapes= Arrays.copyOf(TestData.shapeArr,
		                                          TestData.shapeArr.length);
		    Shape shapeToRemove;

		    iter.next();
		    // save the shape that's going to be removed from the picture
		    shapeToRemove= iter.next();
		    iter.remove();

		    // now remove the shape that was removed from the picture from
		    // expectedShapes, by calling findShape(), then iterate over the picture
		    // again, making sure that all of the remaining shapes are present in it
		    // (meaning that the right one was removed)
		    TestData.findShape(expectedShapes, shapeToRemove);

		    // check the elements remaining, using the iterator
		    iter= picture.iterator();
		    while (iter.hasNext())
		      assertTrue(TestData.findShape(expectedShapes, iter.next()));
		    	System.out.println(iter.next());
//		    	System.out.print(expectedShapes.toString());
		  }
}

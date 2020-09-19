import java.util.Scanner;

public class SimpleInput {
  public static void main(String[] args) {
     Scanner myScanner = new Scanner(System.in);
     
     int i;
     String s;
     
     	i = myScanner.nextInt(); //Note: This will crash if not given a number.
     	System.out.println("The integer was a " + i);
     	
     	s = myScanner.next();
     	System.out.println("The next \'word\' was " + s);
     	
     	s = myScanner.nextLine();
     	System.out.println("The rest of the line was " + s);

     	
     	try {
           myScanner.close();
        }
        catch (Exception e) {}

  }
}

//Copyright 2010-2012 : Evan Golub 

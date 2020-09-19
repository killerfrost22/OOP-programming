package CMSC131labs;
import java.util.Scanner;
public class lab0211TimeClassExample {

	public static void main(String[] args) {
		System.out.println("Do ya want to use the regular time or military time?");
		System.out.println(" If you want to translate from regular time to military time press 1");
		System.out.println(" If you want to translate from military time to regular time press 2");
	
		Scanner type= new Scanner(System.in);
		int whichTime = type.nextInt();
		
		if (whichTime == 1) {
			System.out.println("Am or PM press 1 Am, press 2 pm");
			int choice = type.nextInt();
			if (choice == 1) {
				System.out.println("Alright fella you are in the morening");
				System.out.println("What's the time in morning regular human");
				System.out.println("First the hour");
				int hour = type.nextInt();
				System.out.println("Then do the minutes thing");
				int minutes = type.nextInt();
				System.out.println("So ur time is" +hour+ minutes);
				System.out.println("Mil time is");
			}else if(choice == 2){
				System.out.println("Noon time");
				System.out.println("First the hour");
				int hour = type.nextInt();
				System.out.println("Then do the minutes thing");
				int minutes = type.nextInt();
				int afhour =hour+12;
				System.out.println("So ur time is " + afhour + minutes+" in mil time");
				
			}
			//			
		}else if (whichTime == 2) {
			System.out.println("Alright fellow, this is Mil time to Reg time, so what time is it in mil time ");
			String rightNowTime = type.next();
			
			int trans = Integer.parseInt(rightNowTime);
			String hourTime = rightNowTime.substring(0,2);
			String minuteTime = rightNowTime.substring(2,4);
			
			
			if (rightNowTime.equals("0000")) {
				System.out.println("Midnight");
				
			}else if (trans >= 0100 && trans <= 1159) {
				System.out.println( hourTime + ":" + minuteTime + "a.m.");
			}else if(trans == 1200) {
				System.out.println("Noon");
			}else if (trans >= 1300 && trans <= 2359) {
				System.out.println((Integer.parseInt(hourTime)-12)  + ":" + minuteTime + " a.m.");
			}else {
				System.out.println("Wrong time");
			}
			
		}else {
			System.out.println("Invalid option type again");
			
		}
		type.close();
	}

}

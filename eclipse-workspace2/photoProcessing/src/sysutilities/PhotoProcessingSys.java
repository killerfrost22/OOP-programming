package sysutilities;

import javax.swing.JOptionPane;

public class PhotoProcessingSys{
		private String name ;
		private Address address;
		private String street;
		private String city;
		private String state;
		private String zipCode;
		double balance = 0.0;
		int count = 1;
		
	    private  StringBuffer transaction = new StringBuffer("Image Transactions"+"\n");
		
		public PhotoProcessingSys(String name, String street, String city, String state, String zipCode) {
			this.name = name;
			try {
				address = new Address( street, city, state, zipCode);
			}catch(IllegalArgumentException e) {
				address = new Address();
			}
		}
	
		//Default 
		public PhotoProcessingSys() {
			this.name = "NONAME";
			address = new Address();
		}
		//Tostring 
		public String toString() {
			String output = "";
			output = "Customer Name: " +name + "\n" + "Customer Address: " + address + "\n"+ "Balance: " + balance;
			return output;
			
		}
		//ImageTransaction
		public String imageTransaction(String name, String task, String taskOptions, boolean graphicalModeFlag) {
			//return initial value 
			String result = "";
			this.transaction.append("Transaction #");
			this.transaction.append(count+": ");
			//Transanctionlogs
			//Switch case 
			//test if it is true for the Pic
			if(graphicalModeFlag == true) {
				PictureManager.graphicalModeOn();
			}else {
				PictureManager.graphicalModeOff();	
			}
			switch(task) {
			//display 1
			case "display":
				result= PictureManager.displayPicture(name);
				balance = balance + 1.00;
				count++;
				break;
			//clear screen2
			case "clear":
				result=PictureManager.clearScreen();
				balance = balance + 1.00;
				count++;
				break;
			//displaylast3
			case "displaylast":
				result=PictureManager.displayLastPicture();
				balance = balance + 1.00;
				count++;
				break;
			// blackandhite4
			case "blackandwhite":
				result=PictureManager.displayPictureBlackWhitePosterize(name, true, false);
				balance = balance + 1.00;
				count++;
				break;
			// posterize5
			case "posterize":
				result=PictureManager.displayPictureBlackWhitePosterize(name, false, true);
				balance = balance + 1.00;
				count++;
				break;
			// have both6
			case "blackandwhiteposterize":
				result=PictureManager.displayPictureBlackWhitePosterize(name, true, true);
				balance = balance + 1.00;
				count++;
				break;
			// select colors 7
			case "selectcolors":
				String test = taskOptions.toUpperCase();
				boolean red = false;
				boolean green = false;
				boolean blue = false;
				for(int i = 0; i < test.length(); i++) {
					if(test.charAt(i) == 'R') {
						red = true;
					}else if(test.charAt(i) == 'G') {
						green = true;
					}else if(test.charAt(i) == 'B') {
						blue = true;
					}
				}
				result =PictureManager.displayPictureSelectRedGreenBlue(name, red, green, blue);
				balance = balance + 2.00;
				count++;
				break;
				//invalid option
			  default:
				  this.transaction.append("Invalid photoProcessing option");
				count++;
				break;
			}
		//showMessageDialog message-
			if(graphicalModeFlag == true) {
				JOptionPane.showMessageDialog(null, "Continue");
			}
			//String work = new String(result);
			//this.transaction.append(work);
			//this.transaction.append("\n");
			this.transaction.append(result);
			return result ;
			
			
			
	
		}
		public double getBalance() {
			
			return balance;
		}
		public String getTransactions() {
			String result = new String(transaction);
			
			return result;	
		}
		
	}
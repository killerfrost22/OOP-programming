package p6Coding;

import java.util.ArrayList;

public class HandEvaluatorPatrickjack {
	
	static int value;
	//Each of these is passed a reference to an ArrayList<Card> object 
	//  with "UNKNOWN" length (so you'll need to "ask" it).

	public static int eval(ArrayList<Card> hand) {
		int sum = 0;
		for (int i = 0; i<hand.size(); i++) {
			
			sum += hand.get(i).getValue();
			if (hand.get(i).getValue() == 5) {
				sum = sum+10;
			}
			if (sum > 21 && hand.get(i).getValue() == 5) {
				sum = sum - 10;
			}else if (hand.size()== 2 && hand.get(0).getValue()==2 && hand.get(1).getValue()==4) {
				sum = 22;
			}else if (hand.size()== 2 && hand.get(0).getValue()==4 && hand.get(1).getValue()==2) {
				sum = 22;
			}else if (hand.size()== 2 && hand.get(0).getValue()==6 && hand.get(1).getValue()==9) {
				sum = 21;
			}else if (hand.size()== 2 && hand.get(0).getValue()==9 && hand.get(1).getValue()==6) {
				sum = 21;
			}else if (sum > 21) {
				sum = 0;
			}
		}
		return sum;
	}


	public static boolean houseWins(ArrayList<Card> player, ArrayList<Card> dealer) {
		if (eval(player) > eval(dealer)) {
			return false;
		} else if(eval(player) < eval(dealer)) {
			return true;
		} else {
			return false;
		}
			
		}
}
	
	
	
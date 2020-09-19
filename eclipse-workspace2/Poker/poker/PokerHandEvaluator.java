package poker;

public class PokerHandEvaluator {
	
	public static boolean hasPair(Card[] cards) {
		//init
		boolean answer = false;
		int value;
		//compare
		for(int i = 0; i < cards.length; i++) {
			value = cards[i].getValue();
			for(int number = i + 1; number < cards.length; number++) {
				if(value == cards[number].getValue()) {
					answer = true;
				}
			}
		}
		return answer;
	}
	
	public static boolean hasTwoPair(Card[] cards) {
		boolean result = false;
		int pair= 0;
		int value = 0;
		
		//compare
		for(int i = 1; i <= 13; i++) {
			//loop through value
			for(int x = 0; x < cards.length; x++) {
				//loop through cards
				if(i == cards[x].getValue()) {
					
					value++;
				//value+ make other the same 
				}
			
			}
			if(value >= 2) {
				pair++;
			}
			value = 0;
		}
		if(pair >= 2) {
			result = true;
		}
		return result;
	}
	
	public static boolean hasThreeOfAKind(Card[] cards) {
		// init
		boolean threeOfAKind=false;
		int[] value=new int[5];
		for(int i=0; i<5; i++) {
			value[i]=cards[i].getValue();
		}
	
		for(int m=0; m<3; m++) {
			for(int n=m+1; n<4; n++) {
				for(int l=n+1; l<5; l++) {
					if(value[m]==value[n] && value[n]==value[l]) {
						threeOfAKind=true;
					}
				}
			}
			
		}
		
		return threeOfAKind;
	}
	
	public static boolean hasStraight(Card [] cards) {
			boolean straight=false;
			boolean sumtest =false;
			boolean oneByOne = true;
			boolean ace = false;
			int[] value=new int[5];
			int sum=0;
			int greaterByOne=0;
			int newsum = 0;
			int newsumtest = 0;
					
			if(hasPair(cards) != true) {
				for(int i=0; i<5; i++) {
				value[i]=cards[i].getValue();
				sum=sum+value[i];
			}
			
			if(sum%5 != 0) {
				for(int x=0; x<5; x++) {	
					value[x]=cards[x].getValue();
						if(value[x]==1) {
							value[x]=14;
						}						
				newsum = newsum+value[x];
				}
			}else {
				sumtest = true;
			}
			newsumtest = newsum % 5;	
			if(newsumtest !=0) {
				sumtest = false;
			}else if(newsumtest == 0) {	
				sumtest = true;
			}	
			
			if(newsum ==60) {
				ace = true;
			}
			
			for(int m=0; m<5; m++) {
				for(int n=0; n<5; n++) {
					if(cards[m].getValue()-cards[n].getValue()==1) {
						greaterByOne=greaterByOne+1; 
						
					}
				}
			}
			
			if(greaterByOne==4) {
				oneByOne=true;
			}else {
				oneByOne = false;
			}
		
			if((sumtest == true && oneByOne == true)||(sumtest == true&& oneByOne == false && ace == true )) {
				straight=true;
			}else {
				return false;
			}
			return straight;	  
	}else {
		return false;
	}
}
	
	public static boolean hasFlush(Card[] cards) {
		int club=0;
		int spade=0;
		int diamond=0;
		int heart=0;
		int star=0;
		int[] suit=new int[5];
		boolean flush=false;
		
		for(int i=0; i<5; i++) {
			suit[i]=cards[i].getSuit();
			if(suit[i]==0) {
				spade=spade+1;
			}
			if(suit[i]==1) {
				heart=heart+1;
			}
			if(suit[i]==2) {
				club=club+1;
			}
			if(suit[i]==3) {
				diamond=diamond+1;
			}
			if(suit[i]==4) {
				star=star+1;
			}
		}
		
		if(club==5 || spade==5 || heart==5 || diamond==5 || star==5) {
			flush=true;
		}
		
		return flush;
	}
	
	public static boolean hasFullHouse(Card[] cards) {
		int first = 0;
		int numberOfValue = -1;
		int second =0;
		
		for(int i=0; i<cards.length; i++) {
			if(cards[i].getValue() != cards[0].getValue() && second==0) {
				numberOfValue =cards[i].getValue();
			}if(cards[i].getValue() == cards[0].getValue()){
				first++;
				
			}else if(cards[i].getValue()==numberOfValue){
				second++;
			}
		}
		
		if(first==2 && second ==3 ||first==3 && second == 2 ) {
			return true;
		}
		return false;
	}

	
	public static boolean hasFourOfAKind(Card[] cards) {
		// init
		int valueCount = 0;

		// compare
		for (int i = 1; i <= 13; i++) {
			// loop through value
			for (int num = 0; num < cards.length; num++) {
				// loop through cards
				if (i == cards[num].getValue()) {
					valueCount++;
				}
			}
			if (valueCount == 4) {
				return true;
			}
			valueCount = 0;
		}

		return false;
	}

	public static boolean hasStraightFlush(Card[] cards) {
		if(hasStraight(cards) && hasFlush(cards)) {	
			return true;
		}else {
			return false;
		}
	}
}


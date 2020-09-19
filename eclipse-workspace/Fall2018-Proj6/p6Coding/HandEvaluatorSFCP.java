package p6Coding;

public class HandEvaluatorSFCP {
	//ALL OF THESE ARE PASSED AN ARRAY OF LENGTH 5

	
	
	//Cluster 1: Think about how a helper might be useful for these...
	public static boolean hasPair(Card[] cards) {
		boolean pair=false;
		int[] value=new int[5];
		for(int i=0; i<5; i++) {
			value[i]=cards[i].getValue();
		}
	
		for(int m=0; m<4; m++) {
			for(int n=m+1; n<5; n++) {
				if(value[m]==value[n]) {
					pair=true;
				}
			}
			
		}
		
		return pair;
	}

	public static boolean hasThreeOfAKind(Card[] cards) {
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

	public static boolean hasFourOfAKind(Card[] cards) {
		boolean fourOfAKind=false;
		int[] value=new int[5];
		for(int i=0; i<5; i++) {
			value[i]=cards[i].getValue();
		}
	
		for(int m=0; m<2; m++) {
			for(int n=m+1; n<3; n++) {
				for(int l=n+1; l<4; l++) {
					for(int o=l+1; o<5; o++ )
					if(value[m]==value[n] && value[n]==value[l] && value[l]==value[o]) {
						fourOfAKind=true;
					}
				}
			}
			
		}
		
		return fourOfAKind;
	}

	public static boolean hasFiveOfAKind(Card[] cards) {
		boolean fiveOfAKind=false;
		int[] value=new int[5];
		for(int i=0; i<5; i++) {
			value[i]=cards[i].getValue();
		}
		
		if(value[0]==value[1] && value[1]==value[2] && value[2]==value[3] 
				&& value[3]==value[4]) {
			fiveOfAKind=true;
		}
	
		return fiveOfAKind;
	}



	//Cluster 2
	public static boolean hasRainbow(Card[] cards) {
		int club=0;
		int spade=0;
		int diamond=0;
		int heart=0;
		int star=0;
		int[] suit=new int[5];
		boolean rainbow=false;
		
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
		if(club==1 && spade==1 && heart==1 && diamond==1 && star==1) {
			rainbow=true;
			
		}
		
		return rainbow;
	}

	public static boolean hasStraight(Card [] cards) {
		boolean straight=false;
		
		if(hasPair(cards)!=true) {
			int sum=0;
			int[] value=new int[5];
			int greaterByOne=0;
			
			for(int i=0; i<5; i++) {
				value[i]=cards[i].getValue();
				if(value[i]==1) {
					value[i]=10;
				}
				sum=sum+value[i];
			}
			
			if(sum==40) {
				straight=true;
			}
			else {
				for(int m=0; m<5; m++) {
					for(int n=0; n<5; n++) {
						if(cards[m].getValue()-cards[n].getValue()==1) {
							greaterByOne=greaterByOne+1;
						}
					}
				}
				if(greaterByOne==4) {
					straight=true;
				}	
			}
		}
		
		return straight;
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
	




	//Cluster 3: Think about how to make use of existing methods to
	//           make the following ones easier to write...
	public static boolean hasStraightRainbow(Card[] cards) {
		boolean straightRainbow=false;
		if(hasStraight(cards)==true && hasRainbow(cards)==true) {
			straightRainbow=true;
		}
		
		return straightRainbow;
	}

	public static boolean hasStraightFlush(Card[] cards) {
		boolean straightFlush=false;
		if(hasStraight(cards)==true && hasFlush(cards)==true) {
			straightFlush=true;
		}
		
		return straightFlush;
	}

	public static boolean hasTwoPair(Card[] cards) {
		boolean twoPair=false;
		if(hasPair(cards)==true){
			int[] value=new int[5];
			int valueOfAPair=0;
			
			for(int m=0; m<4; m++) {
				for(int n=m+1; n<5; n++) {
					value[m]=cards[m].getValue();
					value[n]=cards[n].getValue();
					if(value[m]==value[n]) {
						valueOfAPair=value[m];
					}
				}
			}
			
			for(int x=0; x<4; x++) {
				for(int y=x+1; y<5; y++) {
					value[x]=cards[x].getValue();
					value[y]=cards[y].getValue();
					if(value[x]!=valueOfAPair && value[x]==value[y]) {
						twoPair=true;
					}
				}
			}
		}
		
		return twoPair;
	}




	//Challenge
	public static boolean hasFullHouse(Card[] cards) {
		boolean fullHouse=false;
		int[] value=new int[5];
		value[0]=cards[0].getValue();
		int numberOfValue=1;
		
		for(int i=1; i<5; i++) {
			if(cards[i].getValue()!=value[0]) {
				value[i]=cards[i].getValue();
			}
		}
		
		for(int x=1; x<5; x++) {
			if(value[x]!=0) {
				numberOfValue=numberOfValue+1;
			}
		}
		
		if(numberOfValue==2 && hasTwoPair(cards)==true && hasThreeOfAKind(cards)==true) {
			fullHouse=true;
		}
		return fullHouse;
	}




}
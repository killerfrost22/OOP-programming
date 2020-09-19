package poker;

import java.util.Arrays;

public class Deck {

	private Card[] cards;

	public Deck() {
		cards = new Card [52];
		
			//52 cards in the poker
			for(int suit = 0; suit <= 3; suit++) {
				//four different sets of cards
				for(int value = 1; value <=13; value++) {
					//for each set of cards there are 13 cards
					cards[13*suit+value-1] = new Card(value,suit);
					// for each card assign a value to it 
				}
			}
		}	
	
	public Deck(Deck other) {
		this.cards = new Card [other.cards.length];
		// array assign
		for(int i = 0; i < cards.length; i++) {
			//deep copy dont use shallow copy
			this.cards[i] = other.cards[i]; 
		}
	}

	public Card getCardAt(int position) {
		return this.cards[position];		
	}

	public int getNumCards() {
		return this.cards.length;
	}

	public void shuffle() {
		
//		Arraylist Method
		//ArrayList<Card> shuffleCards = new ArrayList<Card>();
//				if (cards.size()%2==0) {
//					for(int i=0; i<cards.size()/2;i++) {
//						shuffleCards.add(cards.get(i));
//						shuffleCards.add(cards.get(cards.size()/2+i));
//					}
//				}else {
//					for(int i=0; i<cards.size()/2;i++) {
//						shuffleCards.add(cards.get(i));
//						shuffleCards.add(cards.get(cards.size()/2+1+i));
//					}
//					shuffleCards.add(cards.get((cards.size())/2));
//				}
//			}	
//		}
		
		int length;
		
		if(cards.length%2 == 0) {
			length = cards.length/2;
		}else {
			//odd
			length = (cards.length+1)/2;
		}
		
		Card [] temp = new Card [this.cards.length];
		//create a new set of cards
		for(int i = 0; i <this.cards.length; i ++) {
			temp [i] = this.cards[i];
		}
		for(int i = 0; i <cards.length; i ++) {
			if(i%2==0) {
				this.cards[i] = temp[i/2];
			}else {
				this.cards[i] = temp[length+(i-1)/2];
			}
		}
		}
	

	public void cut(int position) {
		Card [] temp = new Card [cards.length];
		
		int count = 0;
		for(int i = cards.length - position ; i < cards.length; i++) {
			temp[i] = cards[count];
			count++;
		}
		for (int i = 0; i < cards.length-position; i++) {
			temp[i]= cards[i+position];
		}
		cards = temp;
	}

	public Card[] deal(int numCards) {
		//descriptions
		//Make a new array (call it "smaller") that is the same size as the current deck of cards minus the number of cards being dealt.
		//Copy the cards that are not being dealt from the original array into the new one.
		//Assign the instance variable "cards" so that it refers to the new array.
		Card[] deal = new Card[numCards];
		Card[] smaller = new Card[this.cards.length-numCards];
		//remove
		int dealN = 0;
		int smallerN = 0;
		for(int i =0; i <cards.length; i++) {	
			if(i<numCards) {
				deal[dealN] = cards [i] ;
				
				dealN++;
			}else {
				smaller[smallerN]=this.cards[i];
				smallerN++;
			}
		}
			cards=smaller;
		return deal;
		}
	public String toString() {
		return "Deck [cards=" + Arrays.toString(cards) + "]";
	}
	}

		


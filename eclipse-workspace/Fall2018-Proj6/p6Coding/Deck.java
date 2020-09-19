package p6Coding;

import java.util.ArrayList;

public class Deck {

	//You need to use this ArrayList<Card> structure to hold the deck
	//  
	//Your cannot use regular arrays in this class other than in the
	//  deal method, which needs to return an array
	private ArrayList<Card> cards;
	
	
	public Deck() {
		cards = new ArrayList<Card>();
		for (int suit = 0; suit < 5; suit++) {
			for (int value = 1; value < 10; value++) {
				cards.add(new Card(value, suit));
			}
		}
	}

	public Deck(Deck other) {
		cards = new ArrayList<Card>();
		for(int i = 0; i < other.cards.size(); i++) {
			cards.add(other.cards.get(i));
		} 
	}

	public Card getCardAt(int position) {
		return cards.get(position);
	}

	public int getNumCards() {
		return cards.size();
	}


	public Card[] deal(int numCards) {
		//throw new RuntimeException("You need to implement this...");
		
		Card[] result = new Card[numCards];
		
		for(int i = 0; i < numCards; i++) {
			result[i] = cards.get(0);
			cards.remove(0);
		}
		/*Card[] temp = new Card[cards.size()];
		for(int i = 0 ; i < temp.length; i++) {
			temp[i] = cards.get(i);
		}
		*/
		return result;
	}


	public void cut(int position) throws StarDeckException {
		//throw new RuntimeException("You need to implement this...");
		ArrayList<Card> newcards = new ArrayList<Card>();
		if((position<3) ||(cards.size()-position<3) ) {
			throw new StarDeckException("Too few parts wre cut");
		}
		else{
			for(int i = position ; i<cards.size(); i++){
			newcards.add(cards.get(i));
		}
		for(int i = 0; i < position; i++){
			newcards.add(cards.get(i));
		}
		}
		cards = newcards; 
	}
	
	public void shuffle() {
		//throw new RuntimeException("Challenge problem...");
		ArrayList<Card> shuffleCards = new ArrayList<Card>();
		if (cards.size()%2==0) {
			for(int i=0; i<cards.size()/2;i++) {
				shuffleCards.add(cards.get(i));
				shuffleCards.add(cards.get(cards.size()/2+i));
			}
		}else {
			for(int i=0; i<cards.size()/2;i++) {
				shuffleCards.add(cards.get(i));
				shuffleCards.add(cards.get(cards.size()/2+1+i));
			}
			shuffleCards.add(cards.get((cards.size())/2));
		}
	}

}
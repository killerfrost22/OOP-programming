package blackjack;
import java.util.*;

public class bj4 implements BlackjackEngine {
	
	/**
	 * Constructor you must provide.  Initializes the player's account 
	 * to 200 and the initial bet to 5.  Feel free to initialize any other
	 * fields. Keep in mind that the constructor does not define the 
	 * deck(s) of cards.
	 * @param randomGenerator
	 * @param numberOfDecks
	 */
	private int account=0;
	private int iniBetAmount;
	

	private ArrayList<Card> cardDeck;
	private ArrayList<Card> playerCards;
	private ArrayList<Card> dealerCards;
	private Random randomGenerator;
	private int numberOfDecks;
	private int status = GAME_IN_PROGRESS;
	
	public bj4(Random randomGenerator, int numberOfDecks) {
		//You must use the shuffle method of the java.util.Collections class to perform the data shuffling. 
		//You must use the shuffle method that takes a list followed by a Random object.  
		//Notice that the list parameter is defined as List<?>.  The method will work with ArrayList objects.
	    this.randomGenerator = randomGenerator;
	    this.numberOfDecks = numberOfDecks;
	    account = 200;
	    iniBetAmount = 5;  
	}
	
	public int getNumberOfDecks() {
		return this.numberOfDecks;
		
	}
	
	public void createAndShuffleGameDeck() {
		
		//Collections class to perform the data shuffling. 
		//You must use the shuffle method that takes a list followed by a Random object.  
		//Notice that the list parameter is defined as List<?>.  
		//You can ignore that definition.  
		//The method will work with ArrayList objects.
		
		cardDeck = new ArrayList<Card>();
		for (int i = 0; i < numberOfDecks; i++) {
			for (CardSuit suit:CardSuit.values()) {
				for (CardValue value:CardValue.values()) {
					cardDeck.add(new Card(value, suit));
				}
			}
		}
		Collections.shuffle(cardDeck, randomGenerator);//You must use the shuffle method of the java.util.
	}
	
	public Card[] getGameDeck() {
		return cardDeck.toArray(new Card[cardDeck.size()]);
	}
	
	public void deal() {	
		playerCards = new ArrayList<Card>();
		dealerCards = new ArrayList<Card>();
		status = BlackjackEngine.GAME_IN_PROGRESS;
		
		createAndShuffleGameDeck();							
		
		playerCards.add(cardDeck.remove(0));
		
		dealerCards.add(cardDeck.remove(0));				
		
		dealerCards.get(0).setFaceDown();

		playerCards.add(cardDeck.remove(0));		

		dealerCards.add(cardDeck.remove(0));					
	
		account -= iniBetAmount;
	}
		
	public Card[] getDealerCards() {
		Card[] Deck = new Card[dealerCards.size()];
		for (int i = 0; i < dealerCards.size(); i++) {
			Deck[i] = dealerCards.get(i);
		}
		return Deck;
	}

	public int[] getDealerCardsTotal() {  // need triple check bc not considering the bj situation
		int total = getCardTotal(dealerCards);	
		boolean hasAce = findAce(playerCards);
		if(total>21) {								
			return null;
		}
		else if(hasAce && total+10<=21) {	
			return new int[] {total,total+10};
		} else {				
			return new int[] {
				total
			};
		}
	}
	
	public int getDealerCardsEvaluation() {
		int[] dealersTotal = getDealerCardsTotal();
		
		if(dealersTotal == null)			//if they have over 21
			return BlackjackEngine.BUST;
		else if(dealerCards.size() == 2 )  //&& findAce(dealerCards) && dealersTotal[1] == 21
			return BlackjackEngine.BLACKJACK;
		else if(dealersTotal[0] == 21)	//test for having 21 next
			return BlackjackEngine.HAS_21;
		else							//test for less than 21
			return BlackjackEngine.LESS_THAN_21;
	}
	
	

	public Card[] getPlayerCards() {
		return playerCards.toArray(new Card[playerCards.size()]);
	}
	
	public int[] getPlayerCardsTotal() { // triple chek here not considering the bj situation
		int total = getCardTotal(playerCards);			//finds the total of the cards
		
		
		if(total>21) {								
			return null;
//		else if(hasAce && total+10<=21) {			//if theres an ace and less than 21
//			return new int[] {total,total+10};
		} else {									//even if there is an ace, returns totals less than 21
			return new int[] {total};	
		}	
	
	}
		// how to get total number of cards
	
	public int getPlayerCardsEvaluation() {
		int[] playersTotal = getPlayerCardsTotal();
		
		if(playersTotal == null)			//if they have over 21
			return BlackjackEngine.BUST;
		//TODO//test for blackjack next
		else if(playerCards.size() == 2 ) //&& findAce(playerCards) && playersTotal[1] == 21
			return BlackjackEngine.BLACKJACK;
		else if(playersTotal[0] == 21)	//test for having 21 next
			return BlackjackEngine.HAS_21;
		else							//test for less than 21
			return BlackjackEngine.LESS_THAN_21;	
		}
	
	
	public void playerHit() {
		playerCards.add(cardDeck.get(0));
		cardDeck.remove(0);

		if (getPlayerCardsEvaluation() == BUST) {
			this.status = DEALER_WON;
		}
	}

	
	
	public void playerStand() {
		dealerCards.get(0).setFaceUp();
        int[] dealerValues;
        
        while(true) {
            dealerValues = getDealerCardsTotal();
            // value of the hand greater than or equal to 16
            if(dealerValues == null || dealerValues[dealerValues.length - 1] >= 16) {
                break;
                
            } else {
                dealerCards.add(cardDeck.remove(0));
                
            }
        }
        int[] playerValues = getPlayerCardsTotal();
        if(dealerValues == null) {
            status = PLAYER_WON;
            
        } else if(playerValues == null) {  
            status = DEALER_WON;
          
        // if the hands are the same size and the value of the dealer is greater
        // the dealer wins
        } else if(dealerValues.length == 2 && playerValues.length == 2) {
            if(dealerValues[1] > playerValues[1]) {
                status = DEALER_WON;
             // player wins with larger values   
            } else if(dealerValues[1] < playerValues[1]) {
                status = PLAYER_WON;
                account += (getBetAmount() * 2);
                
            } else {
                status = DRAW;
                account += getBetAmount();
                
            }
            
            // the size is the same compare the only card
        } else if(dealerValues.length == 1 && playerValues.length == 1) {
        		if(dealerValues[0] > playerValues[0]) {
                status = DEALER_WON;
                
            } else if(dealerValues[0] < playerValues[0]) {
                status = PLAYER_WON;
                account += (getBetAmount() * 2);
                
            } else {
                status = DRAW;
                account += getBetAmount();
                
            }
            //player size more than dealer size, compare player first card
        } else if(dealerValues.length == 1 && playerValues.length == 2) {
        	//dealer wins with the larger value
            if(dealerValues[0] > playerValues[1]) {
                status = DEALER_WON;
                
            } else if(dealerValues[0] < playerValues[1]) {
                status = PLAYER_WON;
                account += (getBetAmount() * 2);
                
            } else {
                status = DRAW;
                account += getBetAmount();
                
            }
            // if the dealer has more cards, compare the first values of the 
            // deck
        } else if(dealerValues.length == 2 && playerValues.length == 1) {
          //dealer value more than player value, dealer wins
            if(dealerValues[1] > playerValues[0]) {
                status = DEALER_WON;
             // player wins with a greater value   
            } else if(dealerValues[1] < playerValues[0]) {
                status = PLAYER_WON;
                account += (getBetAmount() * 2);
                
            } else {
                status = DRAW;
                account += getBetAmount();
                
            }
        }
	}
	
	public int getGameStatus() {
		return this.status;
	}
		
	public void setBetAmount(int amount) {
		this.iniBetAmount = amount;
	}
	
	public int getBetAmount() {
		return this.iniBetAmount;
	}
	
	public void setAccountAmount(int amount) {	
		account = amount;
	}
	
	public int getAccountAmount() {
		return this.account;
	}
	
	
	public int getCardTotal(ArrayList<Card> cards) {
		int total =0;
		for(int i = 0; i< cards.size();i++) {
			total += cards.get(i).getValue().getIntValue();
		}
		return total;
	}
	
	private boolean findAce(ArrayList<Card> cards) {
		for(int i = 0; i<cards.size(); i++) {			//loops through cards for an ace
			if(cards.get(i).getValue().equals(CardValue.Ace)) {
				return true;
			}
		}
		return false;
	}
	
}
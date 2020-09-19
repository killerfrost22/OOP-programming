package blackjack;
import java.util.*;

public class bj3 implements BlackjackEngine {
	
	
	private int numberOfDecks;			//number of decks in play
	private int playerAccount;			//Players account
	private int betAmount;				//Initial bet of the player
	private Random randomGenerator;		//Random seed to generate decks
	private ArrayList<Card> deck,		//the deck of cards
	playerCards,						//Player cards
	dealerCards;						//Dealers Cards
	private int gameStatus;				//status of the game
	
	/**
	 * Constructor you must provide.  Initializes the player's account 
	 * to 200 and the initial bet to 5.  Feel free to initialize any other
	 * fields. Keep in mind that the constructor does not define the 
	 * deck(s) of cards.
	 * @param randomGenerator to generate the random seeds
	 * @param numberOfDecks to create
	 */
	public bj3(Random randomGenerator, int numberOfDecks) {
		playerAccount = 200;					//initializes player account
		betAmount = 5;							//initializes bet amount
		this.numberOfDecks = numberOfDecks;		//initializes number of decks
		this.randomGenerator = randomGenerator;	//initializes the random generator
		deck = new ArrayList<Card>();			//initializes the deck
		playerCards = new ArrayList<Card>();	//initializes the player cards
		dealerCards = new ArrayList<Card>();	//initializes the dealer cards
	}
	
	/**
	 * Returns the number of decks being used. 
	 * @return number of decks
	 */
	public int getNumberOfDecks() {
		return this.numberOfDecks;				//sets the number of decks
	}
	
	/**
	 * Creates and shuffles the card deck(s) using a random number generator.
	 */
	public void createAndShuffleGameDeck() {
		CardValue[] cardValues = CardValue.values();		//gets ordinal values of cards
		CardSuit[] cardSuits = CardSuit.values();			//gets ordinal values of card suits
		for(int i = 0; i<numberOfDecks;i++) {				//iterates for how many decks
			for(int j = 0; j<4; j++) {						//iterates for the 4 suits
				for(int k = 0; k<13;k++) {					//iterates for all the values
					deck.add(new Card(cardValues[k],cardSuits[j]));	//adds card
				}
			}
		}
		Collections.shuffle(deck,randomGenerator);			//shiuffles with random seed
	}
	
	/**
	 * Returns the current deck of cards.
	 * @return Card array representing deck of cards.
	 */
	public Card[] getGameDeck() {
		return deck.toArray(new Card[deck.size()]);		//returns a new array
	}
	
	/**
	 * Creates a new deck of cards, and assigns cards to the dealer and player.
	 * A total of four cards are dealt in the following order:
	 * Player (face up), Dealer (face down), Player (face up), Dealer (face  up).
	 * Once the cards have been dealt, the game's status will be GAME_IN_PROGRESS.
	 * Delete the bet amount from the account.
	 */
	public void deal() {	
		deck = new ArrayList<Card>();			//creates a new array list for the deck of cards
		playerCards = new ArrayList<Card>();	//creates a new array list for player cards
		dealerCards = new ArrayList<Card>();	//creates new array list for dealer cards
		
		createAndShuffleGameDeck();			//creates the game deck
		
		playerCards.add(deck.remove(0));	//deals players first card, face up
		
		
		dealerCards.add(deck.remove(0));	//deals dealer card,face down
		dealerCards.get(dealerCards.size()-1).setFaceDown();
		
		playerCards.add(deck.remove(0));	//deals player card 2, face up
		
		dealerCards.add(deck.remove(0));	//deals dealer card 2, face up
		
		gameStatus = BlackjackEngine.GAME_IN_PROGRESS;	//sets the game to in progress
		
		playerAccount-=betAmount;			//reduces the bet amount from player account
	}
	
	/**
	 * Returns dealer's cards.
	 * @return Card array representing the dealer's cards.
	 */
	public Card[] getDealerCards() {
		return dealerCards.toArray(new Card[dealerCards.size()]);
	}

	/**
	 * Returns an array representing the possible value(s) associated with the 
	 * dealer's cards if the cards represent a value less than or equal to 21.
	 * @return Integer array representing the possible value(s) or null if cards
	 * represent a value higher than 21.  The array will have a size of 1 if only
	 * one value is associated with the set of cards, and a size of two if two
	 * values are possible.  For the case of an array of size two, the smaller value
	 * must appear in the first array entry.
	 */
	public int[] getDealerCardsTotal() {
		int total = getTotal(dealerCards);			//finds the total of the cards
		boolean hasAce = findAce(dealerCards);		//determines if theres an ace
		
		if(total>21)								//if over 21
			return null;
		else if(hasAce && total+10<=21) {			//if theres an ace and less than 21
			return new int[] {total,total+10};
		} else {				//even if there is an ace, returns totals less than 21
			return new int[] {total};
		}
	}
	/**
	 * Method to determine if there is an ace within a deck of cards.
	 * Takes in a deck of cards so it can be used for both dealer and player
	 * @param cards array list of cards which will be iterated through to check for ace
	 * @return true if there is an ace in the deck, false otherwise
	 */
	private boolean findAce(ArrayList<Card> cards) {
		for(int i = 0; i<cards.size(); i++) {			//loops through cards for an ace
			if(cards.get(i).getValue().equals(CardValue.Ace)) {
				return true;
			}
		}
		return false;
	}
	
	/**
	 * Gets the total card amount of a deck. If the deck contains an ace,
	 * it will contain the total amount if the ace was regarded as a soft ace
	 * @param cards the arraylist of cards that are in use. This can be either
	 * the dealers or the players
	 * @return the integer total of the cards
	 */
	private int getTotal(ArrayList<Card> cards) {
		int total = 0;
		
		for(int i = 0; i<cards.size(); i++) {		//loops through and adds cards to total
			total+=cards.get(i).getValue().getIntValue();
		}
		return total;
	}
	
	/**
	 * Returns an integer value that can assume the values
	 * LESS_THAN_21 if the dealer's cards have a value less than 21,
	 * BUST if the dealer's cards have a value greater than 21, and
	 * BLACKJACK if the dealer has an Ace along with a "10", Jack, Queen, or King.
	 * If the dealer's cards have a value equivalent to 21 and the hand does
	 * not correspond to a blackjack, HAS_21 will be returned.
	 * @return Integer value that corresponds to one of the following: 
	 * LESS_THAN_21, BUST, BLACKJACK, HAS_21
	 */
	public int getDealerCardsEvaluation() {
		int[] dealersTotal = getDealerCardsTotal();
		
		if(dealersTotal == null)			//if they have over 21
			return BlackjackEngine.BUST;
		else if(dealerCards.size() == 2 && findAce(dealerCards) && dealersTotal[1] == 21)
			return BlackjackEngine.BLACKJACK;
		else if(dealersTotal[0] == 21)	//test for having 21 next
			return BlackjackEngine.HAS_21;
		else							//test for less than 21
			return BlackjackEngine.LESS_THAN_21;
	}
	
	
	/**
	 * Returns player's cards.
	 * @return Card array representing the player's cards.
	 */
	public Card[] getPlayerCards() {
		return playerCards.toArray(new Card[playerCards.size()]);
	}
	
	/**
	 * Returns an array representing the possible value(s) associated with the 
	 * player's cards if the cards represent a value less than or equal to 21.
	 * @return integer array representing the possible value(s) or null if cards
	 * represent a value higher than 21.  The array will have a size of 1 if only
	 * one value is associated with the set of cards, and a size of two if two
	 * values are possible.  For the case of an array of size two, the smaller value
	 * must appear in the first array entry.
	 */
	public int[] getPlayerCardsTotal() {
		int total = getTotal(playerCards);			//finds the total of the cards
		boolean hasAce = findAce(playerCards);		//determines if theres an ace
		
		if(total>21)								//if its a bust
			return null;
		else if(hasAce && total+10<=21) {			//if theres an ace and less than 21
			return new int[] {total,total+10};
		} else {									//even if there is an ace, returns totals less than 21
			return new int[] {total};	
		}	
	}
		
	/**
	 * Returns an integer value that can assume the values
	 * LESS_THAN_21 if the player's cards have a value less than 21,
	 * BUST if the players's cards have a value greater than 21, and
	 * BLACKJACK if the player has an Ace along with a "10", Jack, Queen, or King.
	 * If the players' cards have a value equivalent to 21 and the hand does
	 * not correspond to a blackjack, HAS_21 will be returned.
	 * @return Integer value that corresponds to one of the following: 
	 * LESS_THAN_21, BUST, BLACKJACK, HAS_21
	 */
	public int getPlayerCardsEvaluation() {
		int[] playersTotal = getPlayerCardsTotal();
		
		if(playersTotal == null)			//if they have over 21
			return BlackjackEngine.BUST;
		//TODO//test for blackjack next
		else if(playerCards.size() == 2 && findAce(playerCards) && playersTotal[1] == 21)
			return BlackjackEngine.BLACKJACK;
		else if(playersTotal[0] == 21)	//test for having 21 next
			return BlackjackEngine.HAS_21;
		else							//test for less than 21
			return BlackjackEngine.LESS_THAN_21;	
		}
	
	/**
	 * Retrieves a card from the deck and assigns the card to the player.
	 * The new sets of cards will be evaluated.  If the player busts, the game
	 * is over and the games's status will be updated to DEALER_WON.  Otherwise
	 * the game's status is GAME_IN_PROGRESS.
	 */
	public void playerHit() {
		playerCards.add(deck.remove(0));				//adds a card
		int playerStatus = getPlayerCardsEvaluation();	//gets the evaluation
		if (playerStatus == BlackjackEngine.BUST)		//if a bust, end game
			gameStatus = BlackjackEngine.DEALER_WON;
	}
	
	/**
	 * Flips the dealer's card that is currently face down 
	 * and assigns cards to the dealer as long as the dealer 
	 * doesn't bust and the cards have a value less than 16.  Once the dealer
	 * has a hand with a value greater than or equal to 16, and less than or equal to 21, 
	 * the hand will be compared against the player's hand and whoever has the
	 * hand with a highest value will win the game. If both have the same value 
	 * we have a draw.  The game's status will be updated to one of
	 * the following values: DEALER_WON, PLAYER_WON, or DRAW.  The player's
	 * account will be updated with a value corresponding to twice the bet amount if 
	 * the player wins.  If there is a draw the player's account will be updated
	 * with the only the bet amount. 
	 *
	 */
	public void playerStand() {
		dealerCards.get(0).setFaceUp();					//shows dealer cards
		dealerHit();									//dealer hits til he cant anymore
		
		int dealerStatus = getDealerCardsEvaluation();	//gets dealer status first
		
		if(getDealerCardsTotal() == null) {				//if dealer busted
			if(getPlayerCardsTotal() == null) {			//if player busts draw
				gameStatus = BlackjackEngine.DRAW;
			} else {
				gameStatus = BlackjackEngine.PLAYER_WON;//otherwise player wins
			}
			return;
		} else if(getPlayerCardsTotal() == null) {		//if player busts
			gameStatus = BlackjackEngine.DEALER_WON;	//dealer wins
			return;
		}
		
		switch(getPlayerCardsEvaluation()) {			//switch on player evaluation
		case BlackjackEngine.LESS_THAN_21:				//player has less than 21
			if(getHighestValue(getDealerCardsTotal()) > 	//dealer has more than player
			   getHighestValue(getPlayerCardsTotal())) {	//dealer wins
				gameStatus = BlackjackEngine.DEALER_WON;
			} else if(getHighestValue(getDealerCardsTotal()) < 
					  getHighestValue(getPlayerCardsTotal())){	//player has more
				gameStatus = BlackjackEngine.PLAYER_WON;		//player wins
				playerAccount+=2*betAmount;						//gets the money
			} else {
				gameStatus = BlackjackEngine.DRAW;				//if they have the same
				playerAccount+=betAmount;						//money back
			}
			break;
		case BlackjackEngine.BLACKJACK:
			if(dealerStatus == BlackjackEngine.BLACKJACK) {		//if player has black jack
				gameStatus = BlackjackEngine.DRAW;				//and dealer does, tie
				playerAccount+=betAmount;						//money back
			} else {
				gameStatus = BlackjackEngine.PLAYER_WON;		//else player wins
				playerAccount+=2*betAmount;						//double bet amount
			}
			break;
		case BlackjackEngine.HAS_21:							//if player has 21
			if(dealerStatus == BlackjackEngine.HAS_21) {		//dealer has 21
				gameStatus = BlackjackEngine.DRAW;				//its a tie
				playerAccount+=betAmount;
			} else if(dealerStatus == BlackjackEngine.BLACKJACK){	//dealer still wins
				gameStatus = BlackjackEngine.DEALER_WON;
			} else {
				gameStatus = BlackjackEngine.PLAYER_WON;		//if the player wins
				playerAccount+=2*betAmount;
			}
			break;
		}
	}
	/**
	 * Simple method to return the highest value in the card array
	 * This basically just converts the 
	 * @param cardsValueTotal
	 * @return
	 */
	private int getHighestValue(int[] cardsValueTotal) {
		int max = 0;
		for(int i = 0; i<cardsValueTotal.length; i++) {	//gets the highest value
			if(cardsValueTotal[i] > max)
				max = cardsValueTotal[i];
		}
		return max;
	}
	
	
	/**
	 * Method to recursively hit for the dealer until they are at the right amount.
	 * This method gets the dealer count and then hits and flips the card.
	 */
	private void dealerHit() {
		if(getDealerCardsTotal() == null) {		//if dealer busted
			return;		
		}
		if(getHighestValue(getDealerCardsTotal()) < 16) {	//while dealer needs to hit
			dealerCards.add(deck.remove(0));				//adds the card to dealer
			dealerCards.get(dealerCards.size()-1).setFaceUp();	//flips it up
			dealerHit();		//recures the mthod
		}
	}
	
	/**
	 * Returns an integer representing the game status.   
	 * @return DRAW, PLAYER_WON, DEALER_WON OR GAME_IN_PROGRESS
	 */
	public int getGameStatus() {
		return gameStatus;
	}
		
	/** 
	 * Updates the bet amount to the provided value 
	 */
	public void setBetAmount(int amount) {
		betAmount = amount;
	}
	
	/**
	 * Returns an integer representing the bet amount.
	 * @return bet amount.
	 */
	public int getBetAmount() {
		return betAmount;
	}
	
	/**
	 * Updates the player's account with the parameter value.
	 * @param amount 
	 */
	public void setAccountAmount(int amount) {	
		playerAccount = amount;
	}
	
	/**
	 * Returns the player's account amount
	 * @return account amount
	 */
	public int getAccountAmount() {
		return playerAccount;
	}
	
	/* Feel Free to add any private methods you might need */
}
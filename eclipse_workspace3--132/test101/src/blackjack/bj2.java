package blackjack;

import java.util.*;

public class bj2 implements BlackjackEngine {
	private int numOfDecks, account, bet, gameStatus, gameStatus2;
	private ArrayList<Card> deck, playerCards, playerCards2, dealerCards;
	private boolean split, boolHit, boolHit2;
	private Random ranGenerator;

	/**
	 * Constructor you must provide. Initializes the player's account to 200 and the
	 * initial bet to 5. Feel free to initialize any other fields. Keep in mind that
	 * the constructor does not define the deck(s) of cards.
	 * 
	 * @param randomGenerator
	 * @param numberOfDecks
	 */
	public bj2(Random randomGenerator, int numberOfDecks) {
		this.numOfDecks = numberOfDecks;
		this.ranGenerator = randomGenerator;
		this.account = 200;
		this.bet = 5;
		this.split = false;
		this.boolHit = false;
		this.boolHit2 = false;
	}

	public int getNumberOfDecks() {
		return numOfDecks;
	}

	public void createAndShuffleGameDeck() {
		deck = new ArrayList<Card>();
		for (int i = 0; i < numOfDecks; i++) {
			for (CardSuit suit : CardSuit.values()) {
				for (CardValue value : CardValue.values()) {
					deck.add(new Card(value, suit));
				}
			}
		}

		Collections.shuffle(deck, ranGenerator);
	}

	public Card[] getGameDeck() {
		Card[] arrayDeck = new Card[this.deck.size()];
		for (int i = 0; i < this.deck.size(); i++) {
			arrayDeck[i] = this.deck.get(i);
		}
		return arrayDeck;
	}

	public void deal() {

		gameStatus = BlackjackEngine.GAME_IN_PROGRESS;
		createAndShuffleGameDeck();

		playerCards = new ArrayList<Card>();
		dealerCards = new ArrayList<Card>();
		playerCards2 = new ArrayList<Card>();

		playerCards.add(deck.remove(0));
		
		dealerCards.add(deck.remove(0));

		dealerCards.get(0).setFaceDown();

		playerCards.add(deck.remove(0));
		
		dealerCards.add(deck.remove(0));
		
		account -= bet;
	}
	
	public void split() {
		if (playerCards.get(0).getValue().getIntValue() == playerCards.get(1).getValue().getIntValue()) {
			split = true;
			gameStatus2 = BlackjackEngine.GAME_IN_PROGRESS;
			account -= bet;
			playerCards2.add(playerCards.remove(1));
		}
	}

	public Card[] getDealerCards() {
		Card[] arrayDeck = new Card[dealerCards.size()];
		for (int i = 0; i < dealerCards.size(); i++) {
			arrayDeck[i] = dealerCards.get(i);
		}
		return arrayDeck;
	}

	public int[] getDealerCardsTotal() {
		int[] dealerCardsTotal;
		int possibleValues = 1;
		int totalValue = 0;
		for (int i = 0; i < dealerCards.size(); i++) {
			totalValue += dealerCards.get(i).getValue().getIntValue();
		}
		if (totalValue > 21) {
			return null;
		} else {
			for (int i = 0; i < dealerCards.size(); i++) {
				if (dealerCards.get(i).getValue().getIntValue() == 1) {
					if (totalValue < 12) {
						possibleValues += 1;
					}
				}
			}

			dealerCardsTotal = new int[possibleValues];

			for (int i = 0; i < possibleValues; i++) {
				dealerCardsTotal[i] = totalValue + i * 10;
			}
		}
		return (dealerCardsTotal);
	}

	public int getDealerCardsEvaluation() {
		boolean hasAce = false;
		boolean hasTen = false;
		for (Card c : getDealerCards()) {
			if (c.getValue().getIntValue() == 1) {
				hasAce = true;
			}
			if (c.getValue().getIntValue() == 10) {
				hasTen = true;
			}
		}
		if (hasAce && hasTen && getDealerCards().length == 2) {
			return BlackjackEngine.BLACKJACK;
		}

		if (getDealerCardsTotal() == null) {
			return BlackjackEngine.BUST;
		}

		for (int i : getDealerCardsTotal()) {
			if (i == 21) {
				return BlackjackEngine.HAS_21;
			}
		}

		boolean lessThan = false;
		for (int i : getDealerCardsTotal()) {
			if (i < 21) {
				lessThan = true;
			}
		}
		if (lessThan == true) {
			return BlackjackEngine.LESS_THAN_21;
		}

		return BlackjackEngine.BUST;

	}

	public Card[] getPlayerCards() {
		Card[] arrayDeck = new Card[playerCards.size()];
		for (int i = 0; i < playerCards.size(); i++) {
			arrayDeck[i] = playerCards.get(i);
		}
		return arrayDeck;
	}
	
	public Card[] getPlayerCards2(){
		Card[] arrayDeck = new Card[playerCards2.size()];
		for (int i = 0; i < playerCards2.size(); i++) {
			arrayDeck[i] = playerCards2.get(i);
		}
		return arrayDeck;
	}

	public int[] getPlayerCardsTotal() {
		int[] playerCardsTotal;
		int possibleValues = 1;
		int totalValue = 0;
		for (int i = 0; i < playerCards.size(); i++) {
			totalValue += playerCards.get(i).getValue().getIntValue();
		}
		if (totalValue > 21) {
			return null;
		} else {
			for (int i = 0; i < playerCards.size(); i++) {
				if (playerCards.get(i).getValue().getIntValue() == 1) {
					if (totalValue + i * 10 < 12) {
						possibleValues += 1;
					}
				}
			}

			playerCardsTotal = new int[possibleValues];

			for (int i = 0; i < possibleValues; i++) {
				playerCardsTotal[i] = totalValue + i * 10;
			}

		}
		return (playerCardsTotal);
	}
	
	public int[] getPlayerCardsTotal2() {
		int[] playerCardsTotal;
		int possibleValues = 1;
		int totalValue = 0;
		for (int i = 0; i < playerCards2.size(); i++) {
			totalValue += playerCards2.get(i).getValue().getIntValue();
		}
		if (totalValue > 21) {
			return null;
		} else {
			for (int i = 0; i < playerCards2.size(); i++) {
				if (playerCards2.get(i).getValue().getIntValue() == 1) {
					if (totalValue + i * 10 < 12) {
						possibleValues += 1;
					}
				}
			}

			playerCardsTotal = new int[possibleValues];

			for (int i = 0; i < possibleValues; i++) {
				playerCardsTotal[i] = totalValue + i * 10;
			}

		}
		return (playerCardsTotal);
	}

	public int getPlayerCardsEvaluation() {
		boolean hasAce = false;
		boolean hasTen = false;
		for (Card c : getPlayerCards()) {
			if (c.getValue().getIntValue() == 1) {
				hasAce = true;
			}
			if (c.getValue().getIntValue() == 10) {
				hasTen = true;
			}
		}
		if (hasAce && hasTen && getPlayerCards().length == 2) {
			return BlackjackEngine.BLACKJACK;
		}

		if (getPlayerCardsTotal() == null) {
			return BlackjackEngine.BUST;
		}

		for (int i : getPlayerCardsTotal()) {
			if (i == 21) {
				return BlackjackEngine.HAS_21;
			}
		}

		boolean lessThan = false;
		for (int i : getPlayerCardsTotal()) {
			if (i < 21) {
				lessThan = true;
			}
		}
		if (lessThan == true) {
			return BlackjackEngine.LESS_THAN_21;
		}

		return BlackjackEngine.BUST;

	}
	
	public int getPlayerCardsEvaluation2() {
		boolean hasAce = false;
		boolean hasTen = false;
		for (Card c : getPlayerCards2()) {
			if (c.getValue().getIntValue() == 1) {
				hasAce = true;
			}
			if (c.getValue().getIntValue() == 10) {
				hasTen = true;
			}
		}
		if (hasAce && hasTen && getPlayerCards2().length == 2) {
			return BlackjackEngine.BLACKJACK;
		}

		if (getPlayerCardsTotal2() == null) {
			return BlackjackEngine.BUST;
		}

		for (int i : getPlayerCardsTotal2()) {
			if (i == 21) {
				return BlackjackEngine.HAS_21;
			}
		}

		boolean lessThan = false;
		for (int i : getPlayerCardsTotal2()) {
			if (i < 21) {
				lessThan = true;
			}
		}
		if (lessThan == true) {
			return BlackjackEngine.LESS_THAN_21;
		}

		return BlackjackEngine.BUST;

	}

	public void playerHit() {
		playerCards.add(deck.remove(0));
		
		if (getPlayerCardsEvaluation() == BlackjackEngine.BUST) {
			gameStatus = BlackjackEngine.DEALER_WON;
		} else {
			gameStatus = BlackjackEngine.GAME_IN_PROGRESS;
		}
		
		boolHit = true;
	}
	
	public void playerHit2() {
		playerCards2.add(deck.remove(0));

		if (getPlayerCardsEvaluation2() == BlackjackEngine.BUST) {
			gameStatus2 = BlackjackEngine.DEALER_WON;
		} else {
			gameStatus2 = BlackjackEngine.GAME_IN_PROGRESS;
		}
		
		boolHit2 = true;
	}
	
	public void playerStand() {
		dealerCards.get(0).setFaceUp();
		
		boolean atLeastSixteen = false;

		for (int i = 0; i < getDealerCardsTotal().length; i++) {
			if (getDealerCardsTotal()[i] >= 16) {
				atLeastSixteen = true;
			}
		}

		while (atLeastSixteen == false) {
			dealerCards.add(deck.remove(0));
			
			if (getDealerCardsTotal() != null) {
				for (int i = 0; i < getDealerCardsTotal().length; i++) {
					if (getDealerCardsTotal()[i] >= 16) {
						atLeastSixteen = true;
					}
				}
			} else {
				atLeastSixteen = true;
				gameStatus = BlackjackEngine.PLAYER_WON;
				if (split) {
					gameStatus2 = BlackjackEngine.PLAYER_WON;
				}
			}
		}
		
		if (split) {
			if (!boolHit2) {
				if (getPlayerCardsEvaluation2() == BlackjackEngine.BLACKJACK) {
					if (getDealerCardsEvaluation() != BlackjackEngine.BLACKJACK) {
						gameStatus2 = BlackjackEngine.PLAYER_WON;
						account += 2 * bet;
					} else {
						gameStatus2 = BlackjackEngine.DRAW;
						account += bet;
					}
				} else if (getPlayerCardsEvaluation2() == BlackjackEngine.HAS_21) {
					if (getDealerCardsEvaluation() == BlackjackEngine.HAS_21) {
						gameStatus2 = BlackjackEngine.DRAW;
						account += bet;
					} else if (getDealerCardsEvaluation() == BlackjackEngine.BLACKJACK) {
						gameStatus2 = BlackjackEngine.DEALER_WON;
					} else {
						gameStatus2 = BlackjackEngine.PLAYER_WON;
						account += 2 * bet;
					}
				} else if (getDealerCardsEvaluation() == BlackjackEngine.BUST) {
					gameStatus2 = BlackjackEngine.PLAYER_WON;
					account += 2 * bet;
				} else {
					int playerIdeal = 0;
					int dealerIdeal = 0;

					for (int i = 0; i < getPlayerCardsTotal2().length; i++) {
						int j = getPlayerCardsTotal2()[i];
						if (j > playerIdeal && j <= 21) {
							playerIdeal = j;
						}
					}

					for (int i = 0; i < getDealerCardsTotal().length; i++) {
						int j = getDealerCardsTotal()[i];
						if (j > dealerIdeal && j <= 21) {
							dealerIdeal = j;
						}
					}

					if (playerIdeal > dealerIdeal) {
						gameStatus2 = BlackjackEngine.PLAYER_WON;
						account += 2 * bet;
					} else if (playerIdeal < dealerIdeal) {
						gameStatus2 = BlackjackEngine.DEALER_WON;
					} else if (playerIdeal == dealerIdeal) {
						gameStatus2 = BlackjackEngine.DRAW;
						account += bet;
					}

				}
			}
			if (!boolHit) {
				if (getPlayerCardsEvaluation() == BlackjackEngine.BLACKJACK) {
					if (getDealerCardsEvaluation() != BlackjackEngine.BLACKJACK) {
						gameStatus = BlackjackEngine.PLAYER_WON;
						account += 2 * bet;
					} else {
						gameStatus = BlackjackEngine.DRAW;
						account += bet;
					}
				} else if (getPlayerCardsEvaluation() == BlackjackEngine.HAS_21) {
					if (getDealerCardsEvaluation() == BlackjackEngine.HAS_21) {
						gameStatus = BlackjackEngine.DRAW;
						account += bet;
					} else if (getDealerCardsEvaluation() == BlackjackEngine.BLACKJACK) {
						gameStatus = BlackjackEngine.DEALER_WON;
					} else {
						gameStatus = BlackjackEngine.PLAYER_WON;
						account += 2 * bet;
					}
				} else if (getDealerCardsEvaluation() == BlackjackEngine.BUST) {
					gameStatus = BlackjackEngine.PLAYER_WON;
					account += 2 * bet;
				} else {
					int playerIdeal = 0;
					int dealerIdeal = 0;

					for (int i = 0; i < getPlayerCardsTotal().length; i++) {
						int j = getPlayerCardsTotal()[i];
						if (j > playerIdeal && j <= 21) {
							playerIdeal = j;
						}
					}

					for (int i = 0; i < getDealerCardsTotal().length; i++) {
						int j = getDealerCardsTotal()[i];
						if (j > dealerIdeal && j <= 21) {
							dealerIdeal = j;
						}
					}

					if (playerIdeal > dealerIdeal) {
						gameStatus = BlackjackEngine.PLAYER_WON;
						account += 2 * bet;
					} else if (playerIdeal < dealerIdeal) {
						gameStatus = BlackjackEngine.DEALER_WON;
					} else if (playerIdeal == dealerIdeal) {
						gameStatus = BlackjackEngine.DRAW;
						account += bet;
					}

				}
			}
			
			
		} else {

			if (getPlayerCardsEvaluation() == BlackjackEngine.BLACKJACK) {
				if (getDealerCardsEvaluation() != BlackjackEngine.BLACKJACK) {
					gameStatus = BlackjackEngine.PLAYER_WON;
					account += 2 * bet;
				} else {
					gameStatus = BlackjackEngine.DRAW;
					account += bet;
				}
			} else if (getPlayerCardsEvaluation() == BlackjackEngine.HAS_21) {
				if (getDealerCardsEvaluation() == BlackjackEngine.HAS_21) {
					gameStatus = BlackjackEngine.DRAW;
					account += bet;
				} else if (getDealerCardsEvaluation() == BlackjackEngine.BLACKJACK) {
					gameStatus = BlackjackEngine.DEALER_WON;
				} else {
					gameStatus = BlackjackEngine.PLAYER_WON;
					account += 2 * bet;
				}
			} else if (getDealerCardsEvaluation() == BlackjackEngine.BUST) {
				gameStatus = BlackjackEngine.PLAYER_WON;
				account += 2 * bet;
			} else {
				int playerIdeal = 0;
				int dealerIdeal = 0;

				for (int i = 0; i < getPlayerCardsTotal().length; i++) {
					int j = getPlayerCardsTotal()[i];
					if (j > playerIdeal && j <= 21) {
						playerIdeal = j;
					}
				}

				for (int i = 0; i < getDealerCardsTotal().length; i++) {
					int j = getDealerCardsTotal()[i];
					if (j > dealerIdeal && j <= 21) {
						dealerIdeal = j;
					}
				}

				if (playerIdeal > dealerIdeal) {
					gameStatus = BlackjackEngine.PLAYER_WON;
					account += 2 * bet;
				} else if (playerIdeal < dealerIdeal) {
					gameStatus = BlackjackEngine.DEALER_WON;
				} else if (playerIdeal == dealerIdeal) {
					gameStatus = BlackjackEngine.DRAW;
					account += bet;
				}

			}
		}
		
		boolHit = false;
		
		boolHit2 = false;

	}

	public int getGameStatus() {
		return gameStatus;
	}
	
	public int getGameStatus2() {
		return gameStatus2;
	}
	
	public boolean getSplitStatus() {
		return split;
	}

	public void setBetAmount(int amount) {
		bet = amount;
	}

	public int getBetAmount() {
		return bet;
	}

	public void setAccountAmount(int amount) {
		account = amount;
	}

	public int getAccountAmount() {
		return account;
	}

}
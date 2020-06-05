package blackjack;

import java.util.ArrayList;

//hand of either the player or the dealer. We will subclass them later and implement dealer logic.
//For now there is no dealer AI.
public class Hand {
	//An ArrayList is like an array with a flexible size.
	ArrayList<Card> hand;
	int total;

	/*
	Aces can count as 1 or 11. Initially we count them as 11. If the hand is over 21,
	we reduce any aces to 1 so that the player does not bust.
	 */
	int totalAces;
	
	public Hand() {
		hand = new ArrayList<>();
		total = 0;
		totalAces = 0;
	}
	
	public void newHand() {
		hand.clear();
		total = 0;
		totalAces = 0;
	}

	/*
	We add this card to the player's hand and update the value.
	 */
	public int dealCard(Card card) {
		hand.add(card);
		if (card.getCardValue() == 1) {
			totalAces ++;
			total += 11;
		} else {
			total += card.getCardValue();
		}
		//if we busted, but there are aces, we make those aces worth 1 instead of 11
		while(total >21) {
			if (totalAces <1) {
				break;
			}
			totalAces --;
			total -= 10;
		}
		return total;
	}
	
	public boolean busted() {
		return total > 21;
	}
	
	public int getTotal() {
		return total;
	}

	/*
	Output the hand as a String (that could go into a TextField, for instance).
	 */
	public String toString() {
		StringBuilder str = new StringBuilder();
		for (Card card: hand) {
			str.append(card);
			str.append(", ");
		}
		if (str.length()>3) {
			str.delete(str.length()-1, str.length());
		}
		return str.toString();
	}
}

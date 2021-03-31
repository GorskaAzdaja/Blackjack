package blackjack;

import java.util.ArrayList;
import java.util.List;

public class Deck {
	
	protected static List<String> deck = new ArrayList<String>();
	
	public static void createDeck() {
		
		for(int i = 0; i < Card.ranks.size(); i++) {
			for(int j = 0; j < Card.suits.size(); j++) {
				deck.add(Card.ranks.get(i) + " of " + Card.suits.get(j));
			}
			
		}
		
	}

}

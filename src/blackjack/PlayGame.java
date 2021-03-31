package blackjack;

public class PlayGame {

	public static void main(String[] args) {
		
		Card.defineCard();
		Deck.createDeck();
		
//		for(String rank : Card.ranks) {
//			System.out.println(rank);
//		}
//		
//		System.out.println("\n===============================================\n");
//		
//		for(String suit : Card.suits) {
//			System.out.println(suit);
//		}
		
		for(String deck : Deck.deck) {
			System.out.println(deck);
		}
		
	}

}

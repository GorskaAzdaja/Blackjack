package blackjack;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;

public class Card {
	
	protected static List<String> suits = new ArrayList<String>();
	protected static List<String> ranks = new ArrayList<String>();
	protected static Hashtable<String, Integer> values = new Hashtable<String, Integer>();
	
	public static void defineCard() {
		
		suits.add("Hearts");
		suits.add("Diamonds");
		suits.add("Spades");
		suits.add("Clubs");
		
		ranks.add("2");
		ranks.add("3");
		ranks.add("4");
		ranks.add("5");
		ranks.add("6");
		ranks.add("7");
		ranks.add("8");
		ranks.add("9");
		ranks.add("10");
		ranks.add("Jack");
		ranks.add("Queen");
		ranks.add("King");
		ranks.add("Ace");
		
		values.put("2", 2);
		values.put("3", 3);
		values.put("4", 4);
		values.put("5", 5);
		values.put("6", 6);
		values.put("7", 7);
		values.put("8", 8);
		values.put("9", 9);
		values.put("10", 10);
		values.put("Jack", 10);
		values.put("Queen", 10);
		values.put("King", 10);
		values.put("Ace", 10);
		
	}

}

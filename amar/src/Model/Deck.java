package Model;

import java.util.ArrayList;

public class Deck {

	private ArrayList<String> deck = new ArrayList<String>();
	private ArrayList<Integer> helpDeck = new ArrayList<Integer>();

	public Deck() {
		int i;
		int j=1;;
		for (i = 0; i < 13; ++i) {
			this.deck.add(i, j + "H");
			j++;
		}
		j = 1;
		for (i = 13; i < 26; ++i) {
			this.deck.add(i, j + "C");
			j++;
		}
		j = 1;
		for (i = 26; i < 39; ++i) {
			this.deck.add(i, j + "D");
			j++;
		}
		j = 1;
		for (i = 39; i < 52; ++i) {
			this.deck.add(i, j + "S");
			j++;
		}

		for (i = 0; i < 52; ++i) {
			helpDeck.add(i, 0);
		}
	}

	public ArrayList<String> getDeck() {
		return deck;
	}

	public void setDeck(int index,String card) {
		this.deck.set(index, card);
	}

	public ArrayList<Integer> getHelpDeck() {
		return helpDeck;
	}

	public void setHelpDeck(int index) {
		this.helpDeck.set(index, 1);
	}
}

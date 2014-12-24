package Model;

import java.util.ArrayList;
import java.util.List;

public class Hand {

	private  int sum;
	private List<String> cards;
    public Hand() {
     this.sum = 0;
     this.cards = new ArrayList<String>() ;
    }
	public int getSum() {
		return sum;
	}


	public void setSum(int sum) {
		 this.sum+=sum;
	}

	public List<String> getCards() {
		return cards;
	}

	public void setCards(String cards) {
		this.cards.add(cards);
	}
}

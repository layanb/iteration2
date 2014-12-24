package Tests;
import java.util.List;

import org.junit.Test;

import Model.Deck;
import Model.Game;


public class tests {

	Game game = new Game();
	@Test
	public void testShuffle() {
		Deck deck1 = new Deck();
	    Deck deck2 = new Deck();
	    game.shuffle(deck2);
	   
	    assert false == deck1.equals(deck2);
	}

	@Test
	public void testUpdateHandPlayer() {
		int sum = game.getPlayerHand().getSum();
		game.updateHandPlayer(5);
		int updatedSum = game.getPlayerHand().getSum();
		int diff = updatedSum - sum;
		
		assert true == (sum == (diff));
	}

	@Test
	public void testUpdateHandDealer() {
		int sum = game.getDealerHand().getSum();
		game.updateHandDealer(5);
		int updatedSum = game.getDealerHand().getSum();
		int diff = updatedSum - sum;
		
		assert true == (sum == (diff));
	}

	@Test
	public void testCreateHitLogic() {
		List<String> cards = game.getPlayerHand().getCards();
		String card = game.createHitLogic();
		List<String> updatedCards = game.getPlayerHand().getCards();
		
		assert true == (!cards.contains(card) && updatedCards.contains(card));
	}
}

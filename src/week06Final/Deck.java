package week06Final;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck { // This is what happens when you create this object.
	List<Card> cards = new ArrayList<Card>(); // Create an array of cards using our Card command.
	
	Deck() { //Start the deck command. We don't pass any data into it, it's just for holding the deck. 
		String[] suits = {"Clubs", "Diamonds", "Hearts", "Spades"}; //Here's our suits.
		String[] numbers = {"Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King", "Ace"}; //here's our cards.
		
		for (String suit : suits) { // For every suit in suits...
			int i = 2; // Start at card 2, since there are no ones
			for (String number : numbers) { // But then also for every number in numbers...
				Card card = new Card(number, suit, i); // Create a new card based on where we are in the nested loop.
				this.cards.add(card); // Then add that card to the array.
				i++; //Increment. I guess we do it like this instead of iterating up to 52, since this could iterate to whatever we needed.
			}
		}
	}

	public List<Card> getCards() { // Getters and setters
		return cards;
	}

	public void setCards(List<Card> cards) {
		this.cards = cards;
	}
	
	public void describe() { // Describe every card in the deck...
		for (Card card : this.cards) { // Iterate through every card in our deck array
			card.describe(); // And use our previously created card class/command
		}
	}
	
	public void shuffle() { // Shuffle the deck
		Collections.shuffle(this.cards); // There is a conveniently available shuffle command already usable and here. You could roll your own if you wanted a specific algo.
	}
	
	public Card draw() { //Draw a card out of the deck
		Card card = this.cards.remove(0); //We remove the top card and put it into the card variable that uses our Card class
		return card; // This is not a void, so we return a value of Card. 
	}

}

package week06Final;

import java.util.ArrayList;
import java.util.List;

public class Player {
	List<Card> hand = new ArrayList<Card>(); // Create an array of cards using our Card command.
	int score = 0; // This is the player's score
	String name; // This is the player's name
	Card card; //If we're passing a card in to add it to the hand.
	
	Player() { // Hm. I don't think we necessarily pass data into this, we just return data, right?
	}

	public Card getCard() {
		return card;
	}

	public void setCard(Card card) {
		this.card = card;
	}

	public List<Card> getHand() {
		return hand;
	}

	public void setHand(List<Card> hand) {
		this.hand = hand;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public Card flip() { //Draw a card out of the deck
		Card topCard = this.hand.remove(0); // We remove the top card and put it into the card variable that uses our Card class
		return topCard; // This is not a void, so we return a value of topCard. 
	}
	
	public void incrementScore(int amount) {
		for (int i = 0; i < amount; i++) {
			this.score++;
		}
	}
	
	public void describe() {
		System.out.println("PLAYER: " + this.name + "\tSCORE: " + this.score + "\tHAND: ");
		for (Card hand : this.hand) { // Iterate through every card in our deck array
			hand.describe(); // And use our previously created card class/command
		}
	}
	
	public void addCard(Card card) {
		this.hand.add(card); // Add a card to the player's hand.
	}
	
	public int handSize() {
		return this.hand.size();
	}
	
}

//
// Copyright (c) 2023 Promineo Tech
// Author:  Promineo Tech Academic Team
// Subject:  Object Oriented Programming
// Java Week 05 Lab  
//
package Week05OOPLab;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class week05OOP {

	// This Lab will give you a basic look at creating an Object Oriented Card Game.  
	//		The idea here is to prepare you for your Week 6 Unit Final Project.
	//		There are many ways to implement this Lab, please use the tools that you know,
	//		and go from there.
	// These exercises are intended to be coded in order 1 through 5.
		
	
	public static void main(String[] args) {
	
		
		// A standard deck of playing cards has 52 cards as specified below 
		//		i. There are 4 suits:  Clubs, Diamonds, Hearts, & Spades
		//				
		//	   ii. Each suit has 13 cards:  Two, Three, Four, Five, Six, Seven, 
		//									 Eight, Nine, Ten, Jack, Queen, King & Ace
		//
		//	  iii. Comparing Cards:  When comparing two cards, Ace is high and Two is low.
		//							 to make this easy, a Two will have a value of 2, a
		//							 Three will have a value of 3, ... and an Ace will have
		//							 a value of 14.
		//
	
		
		// 1. Card Class:
		//		Create a class called Card to represent a standard playing card. 
		//		Fields:   The Card class should have the following fields:
		// 			a. name field
		//			b. suit field
		//			c. value field for comparing against other cards.
		//
		//		Methods:  This class can have any useful method.
		//			a. describe() to display the card information to the Console.
		//			b. Getters & Setters 
		//
		System.out.println("\nQuestion 1: Card Class");
		// Add your code here to instantiate a Card
		Card testCard = new Card("Two", "Hearts", 2);

		
		
		// Call the describe method on the newly instantiated card.
		testCard.describe();
		
		
		

		// 2. Deck Class:
		//		Create a class called Deck.
		//		Fields:  This class should have a list of Card field called cards 
		//				 that will hold all the cards in the deck. 
		//			List<Card> cards = new ArrayList<Card>(); 
		//
		//		Constructor: The constructor for the Deck Class should
		// 			instantiate all 52 standard playing cards and add them to the cards list.
		//
		//		Methods:  
		//			a.  describe() to describe the deck to the Console -- 
		//					print out all of the cards in the deck.
		//
		System.out.println("\nQuestion 2: Deck Class");
	    // Add your code here to instantiate a Deck	
		Deck deck = new Deck();
	    
	    
	    // Call the describe method on the newly instantiated deck.
		deck.describe();
	    
	    
	    
	    
		
		
		// 3. Deck shuffle() Method:
		//		Add a shuffle method within the Deck Class
		System.out.println("\nQuestion 3: Deck shuffle() method");
		// Test your method here
		deck.shuffle();
		
		
		
		// Call the describe method on the newly shuffled deck.
		deck.describe();

		
		
		
		// 4. Deck draw() Method:
		//		Add a draw method within the Deck Class
		System.out.println("\nQuestion 4: Deck draw() method");
		// Test your method here
		Card drawnCard = deck.draw();
		drawnCard.describe();
		
		
		
		
		
		// 5. Create Game Board:
		//		Create and test a method that takes an int as a parameter (representing the
		// 			number of players for a game) and returns a Map<String, List<Card>>
		// 			that represents each player (i.e. "Player 1", "Player 2", etc..) 
		//			and their cards.
		//
		// 			The method should create a new instance of Deck, shuffle it,
		// 			and deal the cards out to the "players" in the Map.
		System.out.println("\nQuestion 5: Create Game");
		// Call your method here
		Map<String, List<Card>> gameBoard = new HashMap<>();
		int gamePlayers = 5;
		gameBoard = createGame(gamePlayers);
		
		System.out.println("-----------------------------------------------------------------\r");
		for (int i = 1; i < gamePlayers; i++) { // Increment through every player in the game
			String playerName = "Player " + i; // Get each player name so we can pull it out of the map
			System.out.println(playerName + "\n-------------");
			List<Card> hand = gameBoard.get(playerName); // Grab a list of cards as it relates to a player and put it into the hand.
			for (Card currentCard : hand) { // For every card in the hand list...
				currentCard.describe(); // Describe it.
			}
			System.out.println("-----------------------------------------------------------------\r");
		}

		
		
		
		
		
		
		
	} 
	
	// Method 5:
	public static Map<String, List<Card>> createGame(int numPlayers) { // Call this to create the game
		Map<String, List<Card>> finalGameBoard = new HashMap<>(); // So now we have a map. Keys (strings) lead to lists of cards.
		Deck gameDeck = new Deck(); // Generate a fresh deck
		gameDeck.shuffle(); // Shuffle it
		System.out.println("Deck has " + gameDeck.getCards().size() + " cards, divided by " + numPlayers + " players."); // Explain the deck and players.
		
		for (int i = 1; i <= numPlayers; i++) { // Go through every player, and...
			List<Card> hand = new ArrayList<Card>(); // Create a new list of cards
			String playerName = "Player " + i; //Generate a player name
			finalGameBoard.put(playerName, hand); // Enter the player name and start the hand
		}
		
		int currentDeck = gameDeck.getCards().size(); // How many cards do we have left to deal?
		for (int i = 0; i < currentDeck/numPlayers; i++) { // Loop through every card in the deck
			for (int h = 1; h <= numPlayers; h++) { //Loop through every player in the game
				String playerName = "Player " + h; // Generate a player name
				List<Card> playerHand = finalGameBoard.get(playerName); // Create a list of cards called "hand" and attach it to our finalGameBoard
				playerHand.add(gameDeck.draw()); // Add cards to the hand
				finalGameBoard.put(playerName, playerHand); // Put cards on the game board
			}
		}
		
		if (currentDeck % numPlayers != 0) { // If deck and number of players does not divide evenly, point that out.
			System.out.println("After dealing, there will be " + currentDeck % numPlayers + " cards left over.");
		}
		
		return finalGameBoard;
	}
	
	
	

}
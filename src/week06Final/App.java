package week06Final;

import java.util.Scanner;

public class App {

// Steps this application must take
	// 1. Create a new deck, shuffle the deck, and setup two players.
	//		a. Players should probably have an array list for their hand as well as another array for each player's discard pile. 
	// 2. In an iterative for loop, alternate back and forth giving each of the two players one card until the deck is empty. (26 cards per player)
	// 3. Go through each player's hand, comparing the first card in their array. Whoever has the higher number adds both cards to their discard pile.
	// 4. I've never played WAR! before, but looking up the rules, if both players compare a card of the same value, there's a special condition for that.
	//	  They must draw three more cards and compare the third card like they did with the first. That's NOT part of the instructions, but if we're doing
	//	  the game properly, we should probably try to simulate that as well. Whoever wins on the third card draw gets ALL the cards for that round.
	//	  If the third card also matches, it keeps going until a player either runs out of cards or wins the stack.
	// 5. Finally, compare who captured the most cards in their discard pile and declare a winner based on the largest number. 
	
// Things I need to keep in mind
	// Card.java and Deck.java seem like I can reuse them mostly wholesale from Week 5. 
	// Player.java needs to be written to include fields for hand, score, and name. 
	// Player methods need to be describe (prints out information about the player; name and score, plus every card in the hand.)
	// Flip (returns the card at the top of the hand; look at the Deck class and its draw method)
	// Increment Score (I guess we don't have a discard pile, just this)
	
	public static void main(String[] args) {
		
		// Introduce the game
		System.out.println("********\tWAR!\t********");
		System.out.println("A card game for two players.\n");
	
		// Let's start by setting up our players and their names
		Player player1 = new Player();
		Player player2 = new Player();
		
		// Let's prompt for player names instead of hard coding them.
		Scanner userEntry = new Scanner(System.in);  // Create a Scanner object
		System.out.print("Please enter a name for Player 1: ");
		String enter = userEntry.nextLine(); // Get input
		player1.setName(enter); // Set player 1's name
		System.out.print("Please enter a name for Player 2: ");
		enter = userEntry.nextLine(); // Get input
		player2.setName(enter); // Set player 2's name
		
		// Let's get a deck ready.
		Deck deck = new Deck();
		deck.shuffle();
		
		
		for (int i = 0; i < 52; i++) { // Let's divide the cards up between the two players.
			Card drawnCard = deck.draw();
			if (i % 2 == 0) {
				player1.addCard(drawnCard); // If mod is zero, add to player 1's hand
			} else {
				player2.addCard(drawnCard); // Else, add to player 2's hand
			}
		}
		
		// For the sake of argument, let's describe our players.
		System.out.println("---");
		player1.describe();
		System.out.println("---");
		player2.describe();
		System.out.println("---");
		
		System.out.print("Are you ready to begin? Type Y/N: ");
		String choice = userEntry.nextLine().toLowerCase(); // Get input. This could probably be a char, but I think a string is fine because...
		System.out.println(choice);
		if (choice.equals("n") || choice.equals("no")) { // We can check for people who type the full word out.
			System.out.print("Bummer, dude. Run the program again to play the game.");
		} else if (choice.equals("y") || choice.equals("yes")) { 
		
			int pointsToScore = 0; // Since we can give more points than just one, we need this.
			
		// Now, let's play.
			while (player1.handSize() > 0 || player2.handSize() > 0) { // While the players have cards, loop through the game logic.
	
				if (pointsToScore == 0) { // If this is not a battle, then we state the rules for the round.
					System.out.println("Each player takes the first card from their hand and flips it face up.");
				} else { // If it IS a battle, remind us of the stakes.
					System.out.println("The winner of this battle gets " + (pointsToScore + 2) + " points! Here we go...");
					wait(500);
				}
				
				Card p1Card = player1.flip(); // Get a card from player 1.
				Card p2Card = player2.flip(); // Get a card from player 2.
				System.out.println(player1.getName() + "'s card:");
				p1Card.describe(); // Tell us which card they got.
				System.out.println("Versus " + player2.getName() + "'s card:");
				p2Card.describe(); // Tell us which card they got.
				wait(500);
				
				if (p1Card.getValue() > p2Card.getValue()) {
					pointsToScore += 2; // Winner gets two points (one for each card).
					player1.incrementScore(pointsToScore);
					System.out.println(player1.getName() + " wins this one! " + player1.getName() + "'s score is now: " + player1.getScore());
					pointsToScore = 0; // Reset how many points are available to score.
					wait(500);
				} else if (p1Card.getValue() < p2Card.getValue()) {
					pointsToScore += 2;  // Winner gets two points (one for each card).
					player2.incrementScore(pointsToScore); 
					System.out.println(player2.getName() + " wins this one! " + player2.getName() + "'s score is now: " + player2.getScore());
					pointsToScore = 0;  // Reset how many points are available to score.
					wait(500);
				} else {
					System.out.println("Both cards are equal! " + player1.getName() + " and " + player2.getName() + " must BATTLE!");
					wait(500);
					System.out.println("Both players will flip three cards. The third card will be compared. \nWhoever wins on the third card gets a point for each total card!");
					wait(1500);
					
					for (int i = 0; i < 2; i++) { // We only do this twice because we're going to loop back for the card that matters.
						
						if (player1.handSize() > 0 && player2.handSize() > 0) { // Only if the players actually have cards for this...
							
							p1Card = player1.flip(); // Get a card from player 1.
							p2Card = player2.flip(); // Get a card from player 2.
							System.out.println(player1.getName() + "'s card:");
							p1Card.describe(); // Tell us which card they got.
							System.out.println(player2.getName() + "'s card:");
							p2Card.describe(); // Tell us which card they got.
							pointsToScore += 2; // Increase the pot for each card.
							wait(500);
							
							// If they've run out of cards, then...
						} else if (player1.handSize() == 0 && player2.handSize() > 0) { // Player 1 runs out of cards
							System.out.println(player1.getName() + " has run out of cards! Their score is forfeit!");
							player1.setScore(0); // set their score to 0
						} else if (player1.handSize() > 0 && player2.handSize() == 0) { // Player 1 runs out of cards
							System.out.println(player2.getName() + " has run out of cards! Their score is forfeit!");
							player2.setScore(0); // set their score to 0
						}
					}
				}
			}
			
			// It's time to declare our winner.
			System.out.println("***\tTHE WAR IS OVER\t\t***");
			if (player1.getScore() > player2.getScore()) {
				System.out.println("Congratulations to " + player1.getName() + ", you won the war with " + player1.getScore() + " points! " + player2.getName() + " only had " + player2.getScore() + "...");
			} else if (player1.getScore() < player2.getScore()) {
				System.out.println("Congratulations to " + player2.getName() + ", you won the war with " + player2.getScore() + " points! " + player1.getName() + " only had " + player1.getScore() + "...");
			} else {
				System.out.println("It's a draw! Nobody wins! Or everybody wins! You decide! (" + player1.getName() + " (" + player1.getScore() + " points) vs. " + player2.getName() + " (" + player2.getScore() + " points))");
			}
			
		} else {
			System.out.print("You did not make a valid Y/N choice. Exiting game. Run the program again to play."); // What's your problem?
		}
		userEntry.close(); // Close the scanner, since it makes Eclipse nervous.
	}
	
	// StackOverflow told me this. A wait method to make execution pause briefly so we can watch the game play and not instantly. 
	public static void wait(int ms)
	{
	    try
	    {
	        Thread.sleep(ms);
	    }
	    catch(InterruptedException ex)
	    {
	        Thread.currentThread().interrupt();
	    }
	}
}

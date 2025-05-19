//
// Copyright (c) 2023 Promineo Tech
// Author:  Promineo Tech Academic Team
// Subject:  Variables & Operations Lab
// Java Week 01 Lab  
//
package Week01VariablesAndOperationsLab;

public class variablesAndOperationsLab {

	public static void main(String[] args) {

		// 1. Create a variable to hold the quantity of 
		//		available plane seats left on a flight		
		int availablePlaneSeats = 100;
		
		// 2. Create a variable to hold the cost of groceries at checkout
		double potatoesCost = 2.80;
		double bananasCost = 3.50;
		double breadCost = 1.29;
		double totalGroceries = potatoesCost + bananasCost + breadCost;
		
		// 3. Create a variable to hold a person's middle initial
		char middleInitial = 'G';
	
		// 4. Create a variable to hold true if it's hot outside 
		//		and false if it's cold outside
		boolean isHot = true;
		
		// 5. Create a variable to hold a customer's first name
		String customerName = "Mario";
		
		// 6. Create a variable to hold a street address
		String streetAddress = "1234 Victory Lane, Anytown USA 87690";

		// 7. Print all variables to the console
		String prettyPotatoCost = String.format("%.2f", potatoesCost);
		String prettyBananasCost = String.format("%.2f", bananasCost);
		String prettyBreadCost = String.format("%.2f", breadCost);
		String prettyTotalGroceries = String.format("%.2f", totalGroceries);
		System.out.println("Available Plane Seats: " + availablePlaneSeats); 
		System.out.println("Cost of Potatoes: $" + prettyPotatoCost);
		System.out.println("Cost of Bananas: $" + prettyBananasCost);
		System.out.println("Cost of Bread: $" + prettyBreadCost);
		System.out.println("Total Cost of All Groceries: $" + prettyTotalGroceries);
		System.out.println("Middle Initial: " + middleInitial);
		System.out.println("Is it Hot Outside? " + isHot);
		System.out.println("Customer's First Name: " + customerName);
		System.out.println("Street Address: " + streetAddress);

		// 8. A customer booked 2 plane seats, 
		//		remove 2 seats from the available seats variable
		availablePlaneSeats -= 2;
	
		// 9. Impulse candy bar purchase, add 2.15 to the grocery total
		// 		costOfGroceries = costOfGroceries + 2.15;\
		totalGroceries += 2.15;

		// 10.  The birth certificate was printed incorrectly, 
		//		change the middle initial to something else
		middleInitial = 'D';
		
		// 11.  The season has changed, update the hot outside 
		//			variable to be opposite of what it was
		isHot = !isHot;

		// 12.  Create a new variable called full name using the customer's first name, 
		//			the middle initial, and a last name of your choice
		String customerFullName = customerName + " " + middleInitial + ". Luigi";

		// 13.  Print a line to the console that introduces the customer and says they live
		// 			at the address variable
		System.out.println("This is " + customerFullName + ", and they live at " + streetAddress +".");

		
		
	}
}
//
// Copyright (c) 2023 Promineo Tech
// Author:  Promineo Tech Academic Team
// Subject:  StringBuilders, Lists, Sets, & Maps
// Java Week 04 Lab  
//
package Week04StringBuilderListSetMapLab;

public class week04Project {
	
	public static void main(String[] args) {
	
	// 1. Create an array of int called ages that contains the following values: 3, 9, 23, 64, 2, 8, 28, 93.
		
		int[] ages = {3, 9, 23, 64, 2, 8, 28, 93};
		//ages[0] = 3;
		//ages[1] = 9;
		//ages[2] = 23;
		//ages[3] = 64;
		//ages[4] = 2;
		//ages[5] = 8;
		//ages[6] = 28;
		//ages[7] = 93;
	
		// a. Programmatically subtract the value of the first element in the array from the value in the last 
		// element of the array (i.e. do not use ages[7] in your code). Print the result to the console.  
		
		System.out.println(ages[ages.length - 1] - ages[0]); // I misread this at first because of reasons but I got there in the end
	
		// b. Create a new array of int called ages2 with 9 elements (ages2 will be longer than the ages array, and have more elements).  
		// i. Make sure that there are 9 elements of type int in this new array.  
		// ii. Repeat the subtraction from Step 1.a. (Programmatically subtract the value of the first element in the new array ages2 from the last element of ages2). 
		// iii. Show that using the index values for the elements is dynamic (works for arrays of different lengths).
		
		int[] ages2 = {3, 9, 23, 64, 2, 8, 28, 93, 104, 110};
		System.out.println(ages2[ages2.length - 1] - ages2[0]); // Works with any length of array
	
		// c. Use a loop to iterate through the array and calculate the average age. Print the result to the console.
		
		int agesSum = 0; //New int for the total sum
		for (int i = 0; i < ages2.length; i++) { //Iterate through every age in the array
			agesSum += ages2[i]; //Add every age to the sum
		}
		System.out.println(agesSum / ages2.length); // the sum of all numbers divided by the amount of numbers is the average
	
	// 2. Create an array of String called names that contains the following values: “Sam”, “Tommy”, “Tim”, “Sally”, “Buck”, “Bob”.
		
		String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
	
		// a. Use a loop to iterate through the array and calculate the average number of letters per name. Print the result to the console.
		
		int nameLengths = 0; //The sum of all name lengths
		for (int i = 0; i < names.length - 1; i++) {
			nameLengths += names[i].length(); // get the length of each string in the array
		}
		System.out.println(nameLengths / names.length); // and then sum + amount of numbers for the average
	
		// b. Use a loop to iterate through the array again and concatenate all the names together, separated by spaces, and print the result to the console.
		
		StringBuilder glue = new StringBuilder(); // I will use a string builder since I am modifying this string a lot
		
		for (int i = 0; i <= names.length - 1; i++) { // iterate through every element of the array, with a number attached
			glue.append(names[i]); // stick all the names together
			if (i < names.length - 1) {
				glue.append(' '); // put a space between them for every entry except the last one
			}
		}
		System.out.println(glue); // print everything out
	
	// 3. How do you access the last element of any array?
		System.out.println(ages2[ages2.length - 1]); // the length of the array minus one, since it's a zero base system
	
	// 4. How do you access the first element of any array?
		System.out.println(ages2[0]); // zero is always the start
	
	// 5. Create a new array of int called nameLengths. Write a loop to iterate over the previously created names
	// array and add the length of each name to the nameLengths array.
		
		int nameLengths2[] = new int[names.length]; // programmatically create an array the same length as names[]
		for (int i = 0; i <= names.length - 1; i++) { // less than or equal to because we also need the final value of the array
			nameLengths2[i] += names[i].length();
		}
		for (int i : nameLengths2) {
			System.out.println(i); // I got caught up on having to display all the arrays like this, instead of like a list
		}
		
	
	// 6. Write a loop to iterate over the nameLengths array and calculate the sum of all the elements in the array. Print the result to the console.
		
		int nameLengths3 = 0;	// temporary int to store the sum
		for (int i : nameLengths2) { // iterate through the entire array
			nameLengths3 += i; // add each i to our temporary sum integer
		}
		System.out.println(nameLengths3); // print the sum integer
		
	
	// 7. Write a method that takes a String, word, and an int, n, as arguments and returns the word concatenated to itself n number of times. 
	// (i.e. if I pass in “Hello” and 3, I expect the method to return “HelloHelloHello”).
		
		System.out.println(repeatWord("Buffalo", 8));
	
	// 8. Write a method that takes two Strings, firstName and lastName, and returns a full name 
	// (the full name should be the first and the last name as a String separated by a space).
		
		System.out.println(makeName("Bob", "Johnson"));
	
	// 9. Write a method that takes an array of int and returns true if the sum of all the ints in the array is greater than 100.
		
		int[] ages3 = {1, 2, 3, 4};
		System.out.println(greaterHundo(ages3));
	
	// 10. Write a method that takes an array of double and returns the average of all the elements in the array.
		
		double[] decimals = {1.2, 20.3, 3.04, 40.5};
		System.out.println(doubleAvg(decimals));
	
	// 11. Write a method that takes two arrays of double and returns true if the average of the elements in 
	// the first array is greater than the average of the elements in the second array.
		
		double[] decimals2 = {10.2, 2.33, 32.04, 41.5};
		System.out.println(greaterDouble(decimals, decimals2));
	
	// 12. Write a method called willBuyDrink that takes a boolean isHotOutside, and a double moneyInPocket, 
	// and returns true if it is hot outside and if moneyInPocket is greater than 10.50.
		boolean isHotOutside = true;
		double moneyInPocket = 50.25;
		System.out.println(willBuyDrink(isHotOutside, moneyInPocket));
	
	// 13. Create a method of your own that solves a problem. In comments, write what the method does and why you created it. 
		System.out.println("Did I Make Rent This Month? " + didIMakeRent(121.50, 170.20, 52.40));
	}
	
	// Method 7
	public static String repeatWord(String word, int n) { // our method goes outside the main method, so its down here. We return a string, and take a string plus an int
		String cat = ""; // we start an empty string
		for (int i = 0; i < n; i++) { // we start a for loop based on the integer provided
			cat = cat + word; // we add the word to the word over the course of the loop
		}
		return cat; //and then we return the final concat result
	}
	
	// Method 8
	public static String makeName(String firstName, String lastName) { // Take two strings, return one string
		String fullName = firstName + " " + lastName;
		return fullName;
	}
	
	// Method 9
	public static boolean greaterHundo(int[] input) { // Input an integer, output a boolean
		int sum = 0; // this will be what we add to
		for (int num : input) { // iterate through the array
			sum += num; // add it all up
		}
		
		if (sum > 100) {
			return true; // if greater than 100, true
		}
		return false; // otherwise, false
	}
	
	
	// Method 10
	public static double doubleAvg(double[] input) { // Input a double array, output a single double
		double sum = 0.0; // we establish a new variable as a double
		for (double add : input) { // we iterate through the array
			sum += add; // add it all to the sum
		}
		return sum / input.length; // and then calculate the average
	}
	
	// Method 11
	public static boolean greaterDouble(double[] array1, double[] array2) { // input two double arrays, give back a boolean
		double sum1 = 0.0; //The first sum
		double sum2 = 0.0; //The second sum
		
		for (double add : array1) {
			sum1 += add; //Find the first sum
		}
		
		for (double add : array2) {
			sum2 += add; //Find the second sum
		}
		
		double sum1Avg = sum1 / array1.length; //Find the first average
		double sum2Avg = sum2 / array2.length; //Find the second average
		
		if (sum1Avg > sum2Avg) {
			return true; //Average 1 is greater than Average 2, true
		}
		return false; //Otherwise false
	}
	
	// Method 12
	
	public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) { //return a boolean based on how hot and wealthy I am
		if (isHotOutside == true && moneyInPocket >= 10.50) { //if it's hot and I can spare the change...
			return true; //then yes, I will buy a drink
		}
		return false; //Otherwise, no
	}
	
	// Method 13
	public static boolean didIMakeRent(double patreonEarnings, double youtubeEarnings, double twitchEarnings) { //This will calculate my content earnings for the month
		double sumTotal = patreonEarnings + youtubeEarnings + twitchEarnings; //Add all my earnings sources together
		
		if (sumTotal > 700) {
			return true; //If I made my share of the rent, return true
		}
		return false; //Otherwise return false
	}
}
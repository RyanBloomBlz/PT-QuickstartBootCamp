//
// Copyright (c) 2023 Promineo Tech
// Author:  Promineo Tech Academic Team
// Subject: Arrays & Methods
// Java Week 03 Lab
//
package Week03SourceControlArraysAndMethods;

public class sourceControlArraysAndMethods {

	public static void main(String[] args) {
			
		//
		// Arrays:
		//
		
		// 1. Create an array with the following values 1, 5, 2, 8, 13, 6
		int[] dinosaur = { 1, 5, 2, 8, 13, 6 };
		
		// 2. Print out the first element in the array
		System.out.println(dinosaur[0]);
		
		// 3. Print out the last element in the array without using the number 5
		System.out.println(dinosaur[dinosaur.length - 1]);
		
		
		// 4. Print out the element in the array at position 6, what happens?
		// System.out.println(dinosaur[6]);
		// It crashes. We defined 6 slots, but it starts at 0, so it goes up to 5.
		
		// 5. Print out the element in the array at position -1, what happens?
		// System.out.println(dinosaur[-1]);
		// It crashes because this is out of range. Arrays start at zero.
			
		// 6. Write a traditional for loop that prints out each element in the array
		for (int i = 0; i < dinosaur.length; i++) {
			System.out.println(dinosaur[i]);
		}
	
			
		// 7. Write an enhanced for loop that prints out each element in the array
		for (int output : dinosaur) {
			System.out.println(output);
		}
		
		// 8. Create a new variable called sum, write a loop that adds 
		//			each element in the array to the sum
		int sum = 0;
		for (int output : dinosaur) {
			sum = sum + output;
		}
		System.out.println(sum);
			
		// 9. Create a new variable called average and assign the average value of the array to it
		int average = 0;
		for (int output : dinosaur) {
			average = average + output;
		}
		average = average / dinosaur.length;
		System.out.println(average);
		
		
		// 10. Write an enhanced for loop that prints out each number in the array 
		//			only if the number is odd
		for (int output : dinosaur ) {
			if (output % 2 != 0) {
				System.out.println(output);
			}
		}
		
		// 11. Create an array that contains the values "Sam", "Sally", "Thomas", and "Robert"
		String[] names = {"Sam", "Sally", "Thomas", "Robert"};
		
		// 12. Calculate the sum of all the letters in the new array
		int namesSum = 0;
		for (int i = 0; i < names.length; i++) {
			namesSum += names[i].length();
		}
		System.out.println(namesSum);
		

		//
		// Methods:
		//
		
		// 13. Write and test a method that takes a String name and prints out a greeting. 
		//			This method returns nothing.
		greet("Spider-man");
		
		// 14. Write and test a method that takes a String name and  
		//			returns a greeting.  Do not print in the method.
		System.out.println(greet2("Frodo"));
		
		// Compare method 13 and method 14:  
		//		a. Analyze the difference between these two methods.
		//		b. What do you find? 
		//		c. How are they different?
		// My Answer: It's basically the difference between doing a full reusable command versus a reusable algorithm.
		
		// 15. Write and test a method that takes a String and an int and 
		//			returns true if the number of letters in the string is greater than the int
		System.out.println(stringCheck("goblin", 20));
		
		// 16. Write and test a method that takes an array of string and a string and 
		//			returns true if the string passed in exists in the array
		String[] hotdogs = {"Bun-length", "Ballpark", "Sausage", "Fat", "Cheap"};
		System.out.println(findWithin(hotdogs, "Fat"));
		
		// 17. Write and test a method that takes an array of int and 
		//			returns the smallest number in the array
		int[] tinyBoys = {7, 3, 8, 24, 301, 2048};
		System.out.println("Who's a tiny boy? Why it's " + almightySmallest(tinyBoys));
		
		// 18. Write and test a method that takes an array of double and 
		//			returns the average
		double[] soManyNumbers = {18, 24, 75, 86, 122, 248, 6921};
		System.out.println("The average of soManyNumbers is " + makeAverage(soManyNumbers));

		// 19. Write and test a method that takes an array of Strings and 
		//			returns an array of int where each element
		//			matches the length of the string at that position
		int[] arrayCheck = complexArray(hotdogs);
		for (int i = 0; i < arrayCheck.length; i++) {
			System.out.println("The length of " + hotdogs[i] + " is " + arrayCheck[i] );
		}
				
		// 20. Write and test a method that takes an array of strings and 
		//			returns true if the sum of letters for all strings with an even amount of letters
		//			is greater than the sum of those with an odd amount of letters.
		System.out.println("Evens vs. odds in hotdogs comes out to: " + moreEven(hotdogs));
	
		// 21. Write and test a method that takes a string and 
		//			returns true if the string is a palindrome
		String palindrome = "spider";
		System.out.println("Racecar is a palindrome: " + isPalindrome(palindrome));
		
		
	}
	

	
	// Method 13:
	public static void greet(String name) {
		System.out.println("Hello, " + name + "!");
	}

	// Method 14:
	public static String greet2(String name) {
		return "Hail and well met, " + name + "!";
	}
	
	// Method 15:
	public static boolean stringCheck(String string, int number) {
		if (string.length() > number) {
			return true;
		}
		return false;
	}
	
	// Method 16:
	public static boolean findWithin(String[] array, String searching) {
		for (int i = 0; i < array.length; i++) {
			if (array[i].equals(searching)) {
				return true;
			}
		}
		return false;
	}
	
	// Method 17:
	public static int almightySmallest(int[] number) {
		int currentSmallest = number[0];
		for (int i : number) {
			if (i < currentSmallest) {
				currentSmallest = i;
			}
		}
		return currentSmallest;
	}
	
	// Method 18:
	public static double makeAverage(double[] number) {
		double sum = 0.0;
		for (int i = 0; i < number.length; i++) {
			sum += number[i];
		}
		return sum / number.length;
	}
	
	// Method 19:
	public static int[] complexArray(String[] strings) {
		int[] array = new int [strings.length];
			for (int i = 0; i < array.length; i++) {
				array[i] = strings[i].length();
		}
			return array;
	}
	
	// Method 20:
	public static boolean moreEven(String[] strings) {
		int evens = 0;
		int odds = 0;
		for (int i = 0; i < strings.length; i++) {
			if (strings[i].length() % 2 != 0) {
				odds += strings[i].length();
			} else {
				evens += strings[i].length();
			}
		}
		if (evens > odds) {
			return true;
		}
		return false;
	}
	
	// Method 21:
	public static boolean isPalindrome(String string) {
		string = string.toLowerCase();
		for (int i = 0; i < string.length(); i++) {
			if (string.charAt(i) != string.charAt(string.length() - i - 1) ) {
				return false;
			}
		}
		return true;
	}

}
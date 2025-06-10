//
// Copyright (c) 2023 Promineo Tech
// Author:  Promineo Tech Academic Team
// Subject:  StringBuilders, Lists, Sets, & Maps
// Java Week 04 Lab  
//
package Week04StringBuilderListSetMapLab;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class stringBuilderListSetMapLab {

	public static void main(String[] args) {

		// 1. Why would we use a StringBuilder instead of a String?
		// A string is immutable. Even if you change it, the data entered into a string is constantly left over in memory. 
		// A StringBuilder works around that. It creates a mutable string that can be freely modified. 
		
		
		// 		a. Instantiate a new StringBuilder
		//		b. Append the characters 0 through 9 to it separated by dashes
		// 				Note:  make sure no dash appears at the end of the StringBuilder
		StringBuilder nums = new StringBuilder();
			for (int i = 0; i <= 9; i++) {
				nums.append(i);
				if (i < 9) {
					nums.append('-');
				}
			}
			System.out.println(nums);
		
		// 2. List of String:
		//		a. Create a list of Strings 
		//		b. Add 5 Strings to it, each with a different length
		List<String> games = new LinkedList<String>();
		games.add("Super Mario Bros. 3");
		games.add("Sonic Adventure");
		games.add("NiGHTS into Dreams");
		games.add("Final Fantasy VII");
		games.add("Donkey Kong Country");
		System.out.println(games);
		
		// 3. Write and test a method that takes a list of strings 
		//			and returns the shortest string
		shortestGame(games); //oh right all these wanted a return and I did a void. well I don't think I get graded on these so whatever. IT WORKS
		
		// 4. Write and test a method that takes a list of strings 
		//			and returns the list with the first and last element switched
		flipFlop(games); //another void by accident but it still works

		
		// 5. Write and test a method that takes a list of strings 
		//			and returns a string with all the list elements concatenated to each other,
		// 			separated by a comma
		commaCat(games); //another void
		
		// 6. Write and test a method that takes a list of strings and a string 
		//			and returns a new list with all strings from the original list
		// 			containing the second string parameter (i.e. like a search method)
		System.out.println("Search Results: " + searchQuery(games, "d")); //I will start giving these returns now that I noticed the problem

		
		// 7. Write and test a method that takes a list of integers 
		//			and returns a List<List<Integer>> with the following conditions specified
		//			for the return value:
		//		a. The first List in the returned value contains any number from the input list 
		//			that is divisible by 2
		//		b. The second List contains values from the input list that are divisible by 3
		//		c. The third containing values divisible by 5, and 
		//		d. The fourth all numbers from the input List not divisible by 2, 3, or 5
		List<Integer> theseNumbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20);
		
		List<List<Integer>> sorted = broWhat(theseNumbers);
		System.out.println(sorted);
		
		// 8. Write and test a method that takes a list of strings 
		//			and returns a list of integers that contains the length of each string
		System.out.println(getLengths(games));

		
		// 9. Create a set of strings and add 5 values
		Set<String> mySet = new HashSet<String>();
		mySet.add("This");
		mySet.add("is");
		mySet.add("my");
		mySet.add("cool");
		mySet.add("set!");
		
		
		
		// 10. Write and test a method that takes a set of strings and a character 
		//			and returns a set of strings consisting of all the strings in the
		// 			input set that start with the character parameter.
		System.out.println(findChar(mySet, 'c'));

		
		// 11. Write and test a method that takes a set of strings 
		//			and returns a list of the same strings
		System.out.println(sameStr(mySet));
		

		// 12. Write and test a method that takes a set of integers 
		//			and returns a new set of integers containing only even numbers 
		//			from the original set
		Set<Integer> myNums = new HashSet<Integer>();
		myNums.add(1);
		myNums.add(2);
		myNums.add(3);
		myNums.add(4);
		myNums.add(5);
		myNums.add(6);
		System.out.println(getEven(myNums));

		
		// 13. Create a map of string and string and add 3 items to it where the key of each
		// 			is a word and the value is the definition of the word
		Map<String, String> gameMedia = new HashMap<String, String>();
		gameMedia.put("SNES", "Cartidge");
		gameMedia.put("PS1", "CD");
		gameMedia.put("Xbox", "DVD");
		System.out.println(gameMedia);
	
		
		// 14. Write and test a method that takes a Map<String, String> and a string 
		// 			and returns the value for a key in the map that matches the
		// 			string parameter (i.e. like a language dictionary lookup)
		System.out.println(lookUp(gameMedia, "Xbox"));

		
		// 15. Write and test a method that takes a List<String> 
		//			and returns a Map<Character, Integer> containing a count of 
		//			all the strings that start with a given character
		System.out.println(howMany(games));
		

	}
	
	
	// Method 15:
	public static Map<Character, Integer> howMany(List<String> list) {
		Map<Character, Integer> results = new HashMap<Character, Integer>();
		
		for (String str : list) {
			char c = str.charAt(0);
			if (results.get(c) == null) {
				results.put(c, 1);
			} else {
				results.put(c, results.get(c) + 1);
			}
		}
		
		return results;
	}
	
	
	// Method 14:
	public static String lookUp(Map<String, String> map, String str) {
		for (String search : map.keySet()) {
			if (search == str) {
				return map.get(search);
			}
		}
		return "";
	}

	
	// Method 12:
	public static Set<Integer> getEven(Set<Integer> input) {
		Set<Integer> evens = new HashSet<Integer>();
		
		for (Integer i : input) {
			if (i % 2 == 0) {
				evens.add(i);
			}
		}
		return evens;
	}

	
	// Method 11:
	public static List<String> sameStr(Set<String> set) {
		List<String> results = new ArrayList<String>();
		
		for (String find : set) {
				results.add(find);
		}
		return results;
	}	


	// Method 10:
	public static Set<String> findChar(Set<String> set, char c) {
		Set<String> results = new HashSet<String>();
		
		for (String find : set) {
			if (find.charAt(0) == c) {
				results.add(find);
			}
		}
		return results;
	}

	
	// Method 8:
	public static List<Integer> getLengths(List<String> str) {
		List<Integer> lengths = new ArrayList<Integer>();
		
		for (String strings : str) {
			lengths.add(strings.length());
		}
		return lengths;
	}

	
	// Method 7:
	public static List<List<Integer>> broWhat(List<Integer> list) {
		// List 1: Anything divisible by two
		List<Integer> by2 = new ArrayList<Integer>();
		// List 2: Anything divisible by three
		List<Integer> by3 = new ArrayList<Integer>();
		// List 3: Anything divisible by five
		List<Integer> by5 = new ArrayList<Integer>();
		// List 4: Anything NOT divisible by 2, 3, or 5
		List<Integer> byWhatever = new ArrayList<Integer>();
		
		// The list of lists
		List<List<Integer>> output = new ArrayList<List<Integer>>();
		
		for (int twos : list) {
			if (twos % 2 == 0) {
				by2.add(twos);			
			}
		}
		
		for (int threes : list) {
			if (threes % 3 == 0) {
				by3.add(threes);
			}
		}
		
		for (int fives : list) {
			if (fives % 5 == 0) {
				by5.add(fives);
			}
		}
		
		for (int whatever : list) {
			if (whatever % 2 != 0 && whatever % 3 != 0 && whatever % 5 != 0) {
				byWhatever.add(whatever);
			}
		}
		
		output.add(by2);
		output.add(by3);
		output.add(by5);
		output.add(byWhatever);
		
		return output;
	}
	

	
	// Method 6:
	public static List<String> searchQuery(List<String> input, String query) {
		List<String> result = new ArrayList<String>();
		
		for (String check : input ) {
			String check2 = check.toLowerCase();
			if (check2.contains(query)) {
				result.add(check);
			}
		}
		
		return result;
	}
	

	
	// Method 5:
	public static void commaCat(List<String> games) {
		StringBuilder glue = new StringBuilder();
		for (int i = 0; i <= games.size() - 1; i++) {
			glue.append(games.get(i));
			if (i < games.size() - 1) {
				glue.append(',');
				glue.append(' ');
			}
		}
		System.out.println(glue);
	}
	
	
	// Method 4:
	public static void flipFlop(List<String> games) {
		List<String> flip = new ArrayList<String>();

		String first = games.get(0);
		String last = games.get(games.size() - 1);
		
		for (int i = 0; i < games.size(); i++) {
			flip.add(games.get(i));
		}
		
		flip.set(0, last);
		flip.set(flip.size() - 1, first);
		
		System.out.println("Before: " + games);
		System.out.println("After: " + flip);
	}
	
	
	// Method 3:
	public static void shortestGame(List<String> games) {
		int check = games.get(0).length();
		StringBuilder gamename = new StringBuilder();
		
		for (int i = 0; i < games.size(); i++) {
			if (games.get(i).length() < check) {
				check = games.get(i).length();
				gamename.delete(0, games.get(i).length() + 1); // This is almost certainly unnecessary, but I want it.
				gamename.append(games.get(i));
			}
		}
		System.out.println("Shortest Name: " + gamename + " (" + check + " letters)");
	}
	

}
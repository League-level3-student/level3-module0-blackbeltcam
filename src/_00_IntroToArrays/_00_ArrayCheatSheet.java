package _00_IntroToArrays;

import java.util.Random;

public class _00_ArrayCheatSheet {
	static int lowestnumber = 999999;
	static int largestnumber = 0;

	public static void main(String[] args) {
		// 1. make an array of 5 Strings
		String[] thestring;
		thestring = new String[5];
		// 2. print the third element in the array
		// System.out.println(thestring[2]);
		// 3. set the third element to a different value
		thestring[2] = "fish";
		// 4. print the third element again
		// System.out.println(thestring[2]);
		// 5. use a for loop to set all the elements in the array to a string of your
		// choice
		for (int x = 0; x <= 4; x++) {
			thestring[x] = Integer.toString(x);
		}
		// 6. use a for loop to print all the values in the array
		// BE SURE TO USE THE ARRAY'S length VARIABLE
		for (int y = 0; y < thestring.length; y++) {
			// System.out.println(thestring[y]);
		}
		// 7. make an array of 50 integers
		int[] theint;
		theint = new int[50];
		// 8. use a for loop to make every value of the integer array a random number
		for (int z = 0; z < theint.length; z++) {
			theint[z] = new Random().nextInt(300);
		}
		// 9. without printing the entire array, print only the smallest number on the
		// array
		for (int b = 0; b < theint.length; b++) {
			if (b == theint.length - 1) {
				// System.out.println("the lowest number " + lowestnumber);
			} else if (theint[b] < lowestnumber) {
				lowestnumber = (theint[b]);
			}

		}
		// 10 print the entire array to see if step 8 was correct
		java.util.Arrays.sort(theint);
		for (int a = 0; a < theint.length; a++) {
			System.out.println(theint[a]);
		}

		// 11. print the largest number in the array.
		for (int u = 0; u < theint.length; u++) {
			if (u == theint.length - 1) {
				System.out.println("the largest number " + largestnumber);
			} else if (theint[u] > largestnumber) {
				largestnumber = (theint[u]);
			}
			// 12. print only the last element in the array

		}
	}
}

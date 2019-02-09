package _03_More_Array_Fun;

import java.util.Random;

public class MoreArrayFun {
	//1. Create a main method to test the other methods you write.
	public static void main(String[] args) {
		String[] yo = {"happy", "sad", "somewhat angry"};
		revertaker(yo);
	}
	
	
	//2. Write a method that takes an array of Strings and prints all the Strings in the array.
	public static void arraytaker(String[] thing) {
		for (int whowho=0;whowho<thing.length;whowho++) {
		System.out.println(thing[whowho]);
		}
	}
	
	
	//3. Write a method that takes an array of Strings and prints all the Strings in the array
	//   in reverse order.
	public static void revertaker(String[] thing2) {
		for (int owo=thing2.length;owo>thing2.length;owo--) {
			System.out.println(thing2[owo]);	
		}
	}
	
	
	//4. Write a method that takes an array of Strings and prints every other String in the array.
	
	
	//5. Write a method that takes an array of Strings and prints all the Strings in the array
	//   in a completely random order. Almost every run of the program should result in a different order.
	
	
}

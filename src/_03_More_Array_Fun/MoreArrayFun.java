package _03_More_Array_Fun;

import java.util.Random;

public class MoreArrayFun {
	//1. Create a main method to test the other methods you write.
	public static void main(String[] args) {
		String[] yo = {"happy", "sad", "somewhat angry", "unable to can", "a win win", "a lose lose"};
		//arraytaker(yo);
		//revertaker(yo);
		//everyother(yo);
		randomtaker(yo);
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
		for (int owo=thing2.length-1;owo>=0;owo--) {
			System.out.println(thing2[owo]);	
		}
	}
	
	
	//4. Write a method that takes an array of Strings and prints every other String in the array.
	public static void everyother(String[] thing3) {
		for (int watch=0;watch<thing3.length;watch+=2) {
			System.out.println(thing3[watch]);
		}
	}
	
	//5. Write a method that takes an array of Strings and prints all the Strings in the array
	//   in a completely random order. Almost every run of the program should result in a different order.
	public static void randomtaker(String[] thing4) {
		String[] alreadyDisplayed = new String[thing4.length];
		for(int z=0; z<alreadyDisplayed.length;z++) {
			alreadyDisplayed[z]="";
		}
		int totalDisplayed=0;
		
		while(totalDisplayed<thing4.length) {
			String x=thing4[new Random().nextInt(thing4.length)];
			boolean ifDisplay=true;
			for (int i=0; i<totalDisplayed; i++) {
				if(alreadyDisplayed[i].equals(x)) {
					ifDisplay = false;
					break;
				}
			}
			if(ifDisplay==true) {
				System.out.println(x);
				totalDisplayed++;
			}
		}
	}
	
}

package JavaCodingPractice;

import java.util.Scanner;

public class FindLongestNameFromArray {
	void displayLongestNameFromArray(String[] input) {
		String longestName = input[0];
		int maxLength = longestName.length();
		for(int index = 1; index < input.length; index++) {
			if(maxLength < input[index].length()) {
				maxLength = input[index].length();
				longestName = input[index];
			}
		}
		System.out.println("The longest name is : " + longestName);
	}
	
	void displayLongestNameFromArraMultiple(String[] input) {
		int maxLength = input[0].length();
		for(int index = 1; index < input.length; index++) {
			if(maxLength < input[index].length()) {
				maxLength = input[index].length();
			}
		}
		for(int index = 0; index < input.length; index++) {
			if(input[index].length() == maxLength)
				System.out.println("The longest name is : " + input[index]);
		}
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String status = "y";
		do {
			System.out.print("Enter the size of array: ");
			int size = scanner.nextInt();
			String[] names = new String[size];
			for(int index = 0; index < size; index++) {
				System.out.print("Enter num at index : "+ index +" -> ");
				names[index] = scanner.next();
			}
			new FindLongestNameFromArray().displayLongestNameFromArray(names);
			System.out.println("if there are multiple names with same length\n");
			new FindLongestNameFromArray().displayLongestNameFromArraMultiple(names);
			System.out.println("Press y to continue");
			status = scanner.next();
		}while(status.equals("y"));
		scanner.close();
	}
}

package JavaCodingPractice;

import java.util.Arrays;

/*Program 1: Find the missing number in integer array of 1 to 10?
Hint: You have given an integer array which contains numbers from 1 to 10 but one number is missing, 
you need to write a Java program to find that missing number in an array.*/

public class FindMissingNumberArrayOf1To10 {
	void displayMissingNumberArrayOf1To10(int[] input) {
		int actualSum = (10 * (10 + 1)) / 2;
		int differedSum = 0;
		for (int index = 0; index < input.length; index++) {
			differedSum += input[index];
		}
		System.out.println("Missing no. is : " + (actualSum - differedSum));
	}
	
	void sorting(int[] input) {
		Arrays.sort(input);
		System.out.println(Arrays.toString(input));
		int count = 1;
		for (int index = 0; index < input.length; index++) {
			 if(count != input[index])
				 break;
			 count++;
		}
		System.out.println(count);
	}

	public static void main(String[] args) {
		int[] input = { 10, 2, 4, 3, 7, 9, 8, 5, 6 };
		//new FindMissingNumberArrayOf1To10().displayMissingNumberArrayOf1To10(input);
		new FindMissingNumberArrayOf1To10().sorting(input);
	}
}

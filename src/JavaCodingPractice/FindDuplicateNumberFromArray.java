package JavaCodingPractice;

import java.util.Arrays;

/*Program 2: Find duplicate number on Integer array in Java?
Hint: There is exactly one number is repeated in the array. You need to write a program to
find that duplicate number. For example, if an array with length 6 contains numbers {0, 3,
1, 2, 3}, then duplicated number is 3.*/

public class FindDuplicateNumberFromArray {
	void displayDuplicateNumberFromArray(int[] input) {
		System.out.println(Arrays.toString(input));
		for (int index = 0; index < input.length; index++) {
			for(int innerIndex = index+1; innerIndex < input.length; innerIndex++) {
				if(input[index] == input[innerIndex]) {
					System.out.println(input[index]);
					return;
				}
			}
		}
	}

	public static void main(String[] args) {
		int[] input = { 0, 3, 1, 2, 3 };
		new FindDuplicateNumberFromArray().displayDuplicateNumberFromArray(input);
	}
}

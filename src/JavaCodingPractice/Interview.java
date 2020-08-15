package JavaCodingPractice;

import java.util.Arrays;

class Interview {
	void displayLetters(String input) {
		String output = "";
		for (int index = 0; index < input.length(); index++) {
			if ((input.charAt(index) >= 65 && input.charAt(index) <= 90)
					|| (input.charAt(index) >= 97 && input.charAt(index) <= 122))
				output += String.valueOf(input.charAt(index));
		}
		System.out.println(output);
	}

	void sortArray(int[] input) {
		System.out.println(Arrays.toString(input));
		int max = input[0];
		for (int index = 0; index < input.length; index++) {
			for (int innerIndex = index + 1; innerIndex < input.length; innerIndex++) {
				if (input[index] > input[innerIndex]) {
					max = input[index];
					input[index] = input[innerIndex];
					input[innerIndex] = max;
				}
			}
		}
		System.out.println(Arrays.toString(input));
	}

	public static void main(String[] args) {
		new Interview().displayLetters("aBcQ7pR80");
		int[] input = { 0, 2, 1, 3, 6, 9, 1, 2 };
		new Interview().sortArray(input);
	}
}

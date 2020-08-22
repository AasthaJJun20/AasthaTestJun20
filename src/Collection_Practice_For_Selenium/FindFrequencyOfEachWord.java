package Collection_Practice_For_Selenium;

import java.util.HashMap;

/*
 * Find freq of each word 
 * String input = "Hi Hello GM GM Hello Hi Hi Hello Hi"
 * */
public class FindFrequencyOfEachWord {
	void findFreq(String input) {
		String[] arr = input.split(" ");
		HashMap<String, Integer> output = new HashMap<String, Integer>();
		for (String currentWord : arr) {
			if (output.containsKey(currentWord)) {
				output.put(currentWord, output.get(currentWord) + 1);
			} else
				output.put(currentWord, 1);
		}
		System.out.println(output);
	}

	public static void main(String[] args) {
		String input = "Hi Hello GM GM Hello Hi Hi Hello Hi";
		new FindFrequencyOfEachWord().findFreq(input);
	}
}

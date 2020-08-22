package Collection_Practice_For_Selenium;

import java.util.HashMap;

/*Find freq of each character
String input = "Hi Hello GM GM Hello Hi Hi Hello Hi"*/

public class FindFreqOfEachChar {
	void findFreq(String input) {
		char[] arr = input.toCharArray();
		HashMap<Character,Integer> output = new HashMap<Character,Integer>();
		for(char currentLetter : arr) {
			if(output.containsKey(currentLetter)) {
				output.put(currentLetter, output.get(currentLetter)+1);
			}else
				output.put(currentLetter, 1);
		}
		System.out.println(output);
	}
	
	public static void main(String[] args) {
		new FindFreqOfEachChar().findFreq("Hi Hello GM GM Hello Hi Hi Hello Hi");
	}
}

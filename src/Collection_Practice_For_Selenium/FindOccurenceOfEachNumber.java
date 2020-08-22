package Collection_Practice_For_Selenium;

import java.util.HashMap;

/*Find occurrence of each number.
int[] arr = {1,4,3,4,3,2,4,1,4};*/

public class FindOccurenceOfEachNumber {
	void findOccurence(int[] input) {
		HashMap<Integer,Integer> output = new HashMap<Integer,Integer>();
		for(int num : input) {
			if(output.containsKey(num))
				output.put(num, output.get(num)+1);
			else
				output.put(num, 1);
		}
		System.out.println(output);
	}
	
	public static void main(String[] args) {
		int[] arr = {1,4,3,4,3,2,4,1,4};
		new FindOccurenceOfEachNumber().findOccurence(arr);
	}
}

package Collection_Practice_For_Selenium;

import java.util.Arrays;
import java.util.TreeSet;

/*
Remove duplicates.
int[] arr = {1,4,3,4,3,2,4,1,4};
*/
public class RemoveDuplicateFromIntArray {
	void removeDuplicates(Integer[] arr) {
		TreeSet<Integer> set = new TreeSet<Integer>(Arrays.asList(arr));
		System.out.println(set);
	}
	void removeDuplicatess(Integer[] arr) {
		TreeSet<Integer> set = new TreeSet<Integer>(Arrays.asList(arr));
		System.out.println(set);
	}
	
	public static void main(String[] args) {
		Integer[] arr1 = {1,4,3,4,3,2,4,1,4};
		new RemoveDuplicateFromIntArray().removeDuplicates(arr1);
		int[] arr2 = {1,4,3,4,3,2,4,1,4,5};
		Integer[] arr3 = new Integer[arr2.length];
		for(int i = 0; i < arr2.length; i++) {
			arr3[i] = arr2[i];
		}
		new RemoveDuplicateFromIntArray().removeDuplicatess(arr3);
	}
}

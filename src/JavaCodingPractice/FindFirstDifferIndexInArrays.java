package JavaCodingPractice;

/*1) Find first differ index from given arrays. 
                   i/p :- arr1: {10,2,9,14,3}
                          arr2: {10,2,18,14,3}

                   o/p :- Values are not matching at index -> 2
                   
2) Find all differ index from given arrays. 
                 i/p:- arr1: {10,2,9,14,3}
                       arr2: {10,2,18,14,13}

                o/p:- Values are not matching at index -> 2
                      Values are not matching at index -> 4
Find max value at differed index.
              i/p:- arr1: {10,2,9,14,3}
                    arr2: {10,2,18,14,3}

              o/p :-Values are not matching at index -> 2, From (9,18) max value is 18*/

public class FindFirstDifferIndexInArrays {
	void displayFirstDifferIndex(int[] input1, int[] input2) {
		int index = 0;
		for (; index < input1.length; index++) {
			if (input1[index] != input2[index])
				break;
		}
		System.out.println("Values are not matching at index -> " + index);
	}

	void displayAllDifferIndex(int[] input1, int[] input2) {
		for (int index = 0; index < input1.length; index++) {
			if (input1[index] != input2[index]) {
				int max = 0;
				if (input1[index] > input2[index])
					max = input1[index];
				else
					max = input2[index];
				System.out.println("Values are not matching at index -> " + index + ", From (" + input1[index] + ","
						+ input2[index] + ") max value is " + max);
			}
		}
	}

	public static void main(String[] args) {
		int[] input1 = { 10, 2, 9, 14, 3, 25 };
		int[] input2 = { 10, 2, 18, 14, 3, 12 };
		new FindFirstDifferIndexInArrays().displayFirstDifferIndex(input1, input2);
		new FindFirstDifferIndexInArrays().displayAllDifferIndex(input1, input2);
	}
}

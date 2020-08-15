package JavaCodingPractice;

import java.util.Scanner;

/*
Program 1 :
A) Find maximum number from user given array [use scanner class to take numbers and size of an array]
B) Find minimum number from user given array [use scanner class to take numbers and size of an array]
C) Find second Maximum number
*/
public class FindMaxMinSecMaxNumFromArray {
	void displayMaxNumberFromArray(int[] input) {
		int max = input[0];
		int secondMax = input[1];
		int min = input[2];
		for(int index = 1; index < input.length; index++) {
			if(input[index] > max) {
				secondMax = max;
				max = input[index];
			}
			else if(input[index] > secondMax && input[index] != max)
				secondMax = input[index];
			else if(input[index] < min)
				min = input[index];
		}
		System.out.println("The max number is : " + max);
		System.out.println("The second max number is : " + secondMax);
		System.out.println("The min number is : " + min);
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String status = "y";
		do {
			System.out.print("Enter the size of array: ");
			int size = scanner.nextInt();
			int[] input = new int[size];
			for(int index = 0; index < size; index++) {
				System.out.print("Enter num at index : "+ index +" -> ");
				input[index] = scanner.nextInt();
			}
			new FindMaxMinSecMaxNumFromArray().displayMaxNumberFromArray(input);
			System.out.println("Press y to continue");
			status = scanner.next();
		}while(status.equals("y"));
		scanner.close();
	}
}

package JavaCodingPractice;
/*1) WAP to sum all the numbers in given string.
Input: J7yu9y8h1h8j4b7j3jjb6
Ouput: Sum of all numbers in String is: 53*/

/*2) Input: P71Rr29T2E
Ouput: Sum of all numbers in String is: 102

*Input: P6Rr29T2E3
Ouput: Sum of all numbers in String is: 40

/*3) WAP to sum all the numbers in given string, without using Character class method. 
(Note : Use Ascii value concept) .

Input: J7u9y8h1h8j4b7j3j6
Ouput: Sum of all numbers in String is - 54.
*/

public class SumAllNumbersFromString {
	void displaySumAllNumbersFromString(String input) {
		int sum = 0;
		for(int index = 0; index < input.length(); index++) {
			if(Character.isDigit(input.charAt(index)))
				sum += Integer.valueOf(String.valueOf(input.charAt(index)));
		}
		System.out.println(sum);
	}
	
	void displaySumAll2DigitNumbersFromString(String input) {
		String temp = "";
		int sum = 0;
		for(int index = 0; index < input.length(); index++) {
			if(Character.isDigit(input.charAt(index)))
				temp += String.valueOf(input.charAt(index));
			else {
				if(!temp.equals("")) {
					sum += Integer.parseInt(temp);
					temp = "";
				}
			}
		}
		if(!temp.equals("")) 
			sum += Integer.parseInt(temp);
		System.out.println(sum);
	}
	
	void displaySumAllNumbersFromStringUsingAscii(String input) {
		int sum = 0;
		for(int index = 0; index < input.length(); index++) {
			if(input.charAt(index) >= '0' && input.charAt(index) <= '9')
				sum += Integer.valueOf(String.valueOf(input.charAt(index)));
		}
		System.out.println(sum);
	}
	
	public static void main(String[] args) {
		new SumAllNumbersFromString().displaySumAllNumbersFromString("J7yu9y8h1h8j4b7j3jjb6");
		new SumAllNumbersFromString().displaySumAll2DigitNumbersFromString("P71Rr29T2E");
		new SumAllNumbersFromString().displaySumAll2DigitNumbersFromString("P6Rr29T2E3");
		new SumAllNumbersFromString().displaySumAllNumbersFromStringUsingAscii("J7u9y8h1h8j4b7j3j6");
	}
}
